package ventum.zephyr.wc3soundboard.naga

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object SirenObject {

    val drawables = intArrayOf(
        R.drawable.siren,
        R.drawable.siren2
    )

    fun createSiren() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenpissed1, R.string.nagasirenpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenpissed2, R.string.nagasirenpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenpissed3, R.string.nagasirenpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenpissed4, R.string.nagasirenpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenpissed5, R.string.nagasirenpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenpissed6, R.string.nagasirenpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenready1, R.string.nagasirenready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenwarcry1, R.string.nagasirenwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenwhat1, R.string.nagasirenwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenwhat2, R.string.nagasirenwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenwhat3, R.string.nagasirenwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenwhat4, R.string.nagasirenwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenyes1, R.string.nagasirenyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenyes2, R.string.nagasirenyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenyes3, R.string.nagasirenyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenyes4, R.string.nagasirenyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenyes5, R.string.nagasirenyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenyesattack1, R.string.nagasirenyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenyesattack2, R.string.nagasirenyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagasirenyesattack3, R.string.nagasirenyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sirendeath1, R.string.sirendeath1))
    }
}