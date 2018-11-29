package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object FurionObject {

    val drawables = intArrayOf(
        R.drawable.furion,
        R.drawable.furion2
    )

    fun createFurion() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionpissed1, R.string.furionpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionpissed2, R.string.furionpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionpissed3, R.string.furionpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionpissed4, R.string.furionpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionpissed5, R.string.furionpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionwarcry1, R.string.furionwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionwhat1, R.string.furionwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionwhat2, R.string.furionwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionwhat3, R.string.furionwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionwhat4, R.string.furionwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionyes1, R.string.furionyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionyes2, R.string.furionyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionyes3, R.string.furionyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionyes4, R.string.furionyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionyesattack1, R.string.furionyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionyesattack2, R.string.furionyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionyesattack3, R.string.furionyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furionyesattack4, R.string.furionyesattack4))
    }
}