package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object GarithosObject {

    private val drawables = intArrayOf(
        R.drawable.garithos,
        R.drawable.garithos2
    )

    fun createGarithos() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithospissed1, R.string.garithospissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithospissed2, R.string.garithospissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithospissed3, R.string.garithospissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithospissed4, R.string.garithospissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithospissed5, R.string.garithospissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithosready1, R.string.garithosready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithoswarcry1, R.string.garithoswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithoswhat1, R.string.garithoswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithoswhat2, R.string.garithoswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithoswhat3, R.string.garithoswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithoswhat4, R.string.garithoswhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithosyes1, R.string.garithosyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithosyes2, R.string.garithosyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithosyes3, R.string.garithosyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithosyes4, R.string.garithosyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithosyes5, R.string.garithosyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithosyesattack1, R.string.garithosyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithosyesattack2, R.string.garithosyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.garithosyesattack3, R.string.garithosyesattack3))
    }
}