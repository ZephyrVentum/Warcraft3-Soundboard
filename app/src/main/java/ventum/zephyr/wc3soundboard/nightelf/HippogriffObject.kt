package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object HippogriffObject {

    val drawables = intArrayOf(
        R.drawable.hippogriff,
        R.drawable.hippogriff2,
        R.drawable.hippogriff3
    )

    fun createHippogriff() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphdeath1, R.string.hippogryphdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphpissed1, R.string.hippogryphpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphpissed2, R.string.hippogryphpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphpissed3, R.string.hippogryphpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphready1, R.string.hippogryphready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwhat1, R.string.hippogryphwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwhat2, R.string.hippogryphwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwhat3, R.string.hippogryphwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithriderpissed1, R.string.hippogryphwithriderpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithriderpissed2, R.string.hippogryphwithriderpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithriderpissed3, R.string.hippogryphwithriderpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithriderpissed4, R.string.hippogryphwithriderpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithriderready1, R.string.hippogryphwithriderready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithriderwarcry1, R.string.hippogryphwithriderwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithriderwhat1, R.string.hippogryphwithriderwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithriderwhat2, R.string.hippogryphwithriderwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithriderwhat3, R.string.hippogryphwithriderwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithrideryes1, R.string.hippogryphwithrideryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithrideryes2, R.string.hippogryphwithrideryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithrideryes3, R.string.hippogryphwithrideryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithrideryes4, R.string.hippogryphwithrideryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithrideryesattack1, R.string.hippogryphwithrideryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithrideryesattack2, R.string.hippogryphwithrideryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphwithrideryesattack3, R.string.hippogryphwithrideryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphyes1, R.string.hippogryphyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphyes2, R.string.hippogryphyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphyes3, R.string.hippogryphyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphyesattack1, R.string.hippogryphyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphyesattack2, R.string.hippogryphyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hippogryphyesattack3, R.string.hippogryphyesattack3))
    }
}