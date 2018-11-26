package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object GyrocopterObject {

    private val drawables = intArrayOf(
        R.drawable.gyrocopter,
        R.drawable.gyrocopter2,
        R.drawable.gyrocopter3
    )

    fun createGyrocopter() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterdeath1, R.string.gyrocopterdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterimpacthit1, R.string.gyrocopterimpacthit1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterpissed1, R.string.gyrocopterpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterpissed2, R.string.gyrocopterpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterpissed3, R.string.gyrocopterpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterpissed4, R.string.gyrocopterpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterpissed5, R.string.gyrocopterpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterpissed6, R.string.gyrocopterpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterpissed7, R.string.gyrocopterpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterpissed8, R.string.gyrocopterpissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterready1, R.string.gyrocopterready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterwarcry1, R.string.gyrocopterwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterwhat1, R.string.gyrocopterwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterwhat2, R.string.gyrocopterwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterwhat3, R.string.gyrocopterwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterwhat4, R.string.gyrocopterwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopterwhat5, R.string.gyrocopterwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopteryes1, R.string.gyrocopteryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopteryes2, R.string.gyrocopteryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopteryes3, R.string.gyrocopteryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopteryes4, R.string.gyrocopteryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopteryes5, R.string.gyrocopteryes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopteryesattack1, R.string.gyrocopteryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopteryesattack2, R.string.gyrocopteryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopteryesattack3, R.string.gyrocopteryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gyrocopteryesattack4, R.string.gyrocopteryesattack4))
    }
}