package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object TaurenObject {

    val drawables = intArrayOf(
        R.drawable.minotaur,
        R.drawable.minotaur2
    )

    fun createTauren() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurendeath1, R.string.taurendeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenpissed1, R.string.taurenpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenpissed2, R.string.taurenpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenpissed3, R.string.taurenpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenpissed4, R.string.taurenpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenpissed5, R.string.taurenpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenpissed6, R.string.taurenpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenpissed7, R.string.taurenpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenready1, R.string.taurenready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurentotemwhat1, R.string.taurentotemwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenwarcry1, R.string.taurenwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenwhat1, R.string.taurenwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenwhat2, R.string.taurenwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenwhat3, R.string.taurenwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenyes1, R.string.taurenyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenyes2, R.string.taurenyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenyes3, R.string.taurenyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenyesattack1, R.string.taurenyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenyesattack2, R.string.taurenyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.taurenyesattack3, R.string.taurenyesattack3))
    }
}