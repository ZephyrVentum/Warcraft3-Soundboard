for file in wc3test/*; do
	TEMP_NAME=${file} 
	TEMP_TEMP=$(echo $TEMP_NAME | tr '[:upper:]' '[:lower:]')
	mv $TEMP_NAME $TEMP_TEMP
done
for file in wc3test/*; do
	TEMP_NAME=${file} 
  	FILENAME=$(basename $TEMP_NAME '.'"${TEMP_NAME##*.}")
   echo "<string name=\"$FILENAME\">$FILENAME</string>"
done
echo "var i = 1"
for file in wc3test/*; do
	TEMP_NAME=${file} 
  	FILENAME=$(basename $TEMP_NAME '.'"${TEMP_NAME##*.}")
   	echo "add(SoundItem(drawables[i++ % drawables.size], R.raw.$FILENAME, R.string.$FILENAME))"
done
