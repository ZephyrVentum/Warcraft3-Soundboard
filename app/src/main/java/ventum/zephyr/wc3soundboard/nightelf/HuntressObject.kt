package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R

object HuntressObject {

    val drawables = intArrayOf(
        R.drawable.huntress,
        R.drawable.huntress2
    )

    fun createHuntress() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentineldeath1, R.string.sentineldeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresspissed1, R.string.huntresspissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresspissed2, R.string.huntresspissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresspissed3, R.string.huntresspissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresspissed4, R.string.huntresspissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresspissed5, R.string.huntresspissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresspissed6, R.string.huntresspissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresspissed7, R.string.huntresspissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresspissed8, R.string.huntresspissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressready1, R.string.huntressready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresswarcry1, R.string.huntresswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresswhat1, R.string.huntresswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresswhat2, R.string.huntresswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresswhat3, R.string.huntresswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresswhat4, R.string.huntresswhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresswhat5, R.string.huntresswhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyes1, R.string.huntressyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyes2, R.string.huntressyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyes3, R.string.huntressyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyes4, R.string.huntressyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyes5, R.string.huntressyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyesattack1, R.string.huntressyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyesattack2, R.string.huntressyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyesattack3, R.string.huntressyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyesattack4, R.string.huntressyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressyesattack5, R.string.huntressyesattack5))
    }
}