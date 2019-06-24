package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object PandaObject {

    val drawables = intArrayOf(
        R.drawable.panda,
        R.drawable.panda2,
        R.drawable.panda3
    )

    fun createPanda() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.brewmasterdeath1, R.string.brewmasterdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterpissed1, R.string.pandarenbrewmasterpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterpissed2, R.string.pandarenbrewmasterpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterpissed3, R.string.pandarenbrewmasterpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterpissed4, R.string.pandarenbrewmasterpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterpissed5, R.string.pandarenbrewmasterpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterpissed6, R.string.pandarenbrewmasterpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterpissed7, R.string.pandarenbrewmasterpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterpissed8, R.string.pandarenbrewmasterpissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterready1, R.string.pandarenbrewmasterready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterwarcry1, R.string.pandarenbrewmasterwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterwhat1, R.string.pandarenbrewmasterwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterwhat2, R.string.pandarenbrewmasterwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterwhat3, R.string.pandarenbrewmasterwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasterwhat4, R.string.pandarenbrewmasterwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasteryes1, R.string.pandarenbrewmasteryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasteryes2, R.string.pandarenbrewmasteryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasteryes3, R.string.pandarenbrewmasteryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasteryes4, R.string.pandarenbrewmasteryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasteryesattack1, R.string.pandarenbrewmasteryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasteryesattack2, R.string.pandarenbrewmasteryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasteryesattack3, R.string.pandarenbrewmasteryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.pandarenbrewmasteryesattack4, R.string.pandarenbrewmasteryesattack4))
    }
}