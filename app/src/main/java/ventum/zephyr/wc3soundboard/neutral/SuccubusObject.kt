package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R

object SuccubusObject {

    val drawables = intArrayOf(
        R.drawable.succubus,
        R.drawable.succubus2
    )

    fun createSuccubus() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubusdeath1, R.string.succubusdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuspissed1, R.string.succubuspissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuspissed2, R.string.succubuspissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuspissed3, R.string.succubuspissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuspissed4, R.string.succubuspissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuspissed5, R.string.succubuspissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuspissed6, R.string.succubuspissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubusready1, R.string.succubusready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuswarcry1, R.string.succubuswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuswhat1, R.string.succubuswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuswhat2, R.string.succubuswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuswhat3, R.string.succubuswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubuswhat4, R.string.succubuswhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubusyes1, R.string.succubusyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubusyes2, R.string.succubusyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubusyes3, R.string.succubusyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubusyes4, R.string.succubusyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubusyesattack1, R.string.succubusyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.succubusyesattack2, R.string.succubusyesattack2))
    }
}