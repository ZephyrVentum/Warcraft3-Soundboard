package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object VarimathrasObject {

    val drawables = intArrayOf(
        R.drawable.varimathras,
        R.drawable.varimathras2
    )

    fun createVarimathras() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraspissed1, R.string.varimathraspissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraspissed2, R.string.varimathraspissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraspissed3, R.string.varimathraspissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraspissed4, R.string.varimathraspissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraspissed5, R.string.varimathraspissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraspissed6, R.string.varimathraspissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraspissed7, R.string.varimathraspissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraspissed8, R.string.varimathraspissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasready1, R.string.varimathrasready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraswarcry1, R.string.varimathraswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraswhat1, R.string.varimathraswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraswhat2, R.string.varimathraswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraswhat3, R.string.varimathraswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraswhat4, R.string.varimathraswhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathraswhat5, R.string.varimathraswhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasyes1, R.string.varimathrasyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasyes2, R.string.varimathrasyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasyes3, R.string.varimathrasyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasyes4, R.string.varimathrasyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasyes5, R.string.varimathrasyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasyesattack1, R.string.varimathrasyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasyesattack2, R.string.varimathrasyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasyesattack3, R.string.varimathrasyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.varimathrasyesattack4, R.string.varimathrasyesattack4))
    }
}