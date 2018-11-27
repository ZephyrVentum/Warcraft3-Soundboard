package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object CryptFiendObject {

    val drawables = intArrayOf(
        R.drawable.crypt_fiend,
        R.drawable.crypt_fiend2
    )

    fun createCryptFiend() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendpissed1, R.string.cryptfiendpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendpissed2, R.string.cryptfiendpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendpissed3, R.string.cryptfiendpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendpissed4, R.string.cryptfiendpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendpissed5, R.string.cryptfiendpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendpissed6, R.string.cryptfiendpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendpissed7, R.string.cryptfiendpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendready1, R.string.cryptfiendready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendwarcry1, R.string.cryptfiendwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendwhat1, R.string.cryptfiendwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendwhat2, R.string.cryptfiendwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendwhat3, R.string.cryptfiendwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendwhat4, R.string.cryptfiendwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendyes1, R.string.cryptfiendyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendyes2, R.string.cryptfiendyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendyes3, R.string.cryptfiendyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendyes4, R.string.cryptfiendyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendyesattack1, R.string.cryptfiendyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendyesattack2, R.string.cryptfiendyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cryptfiendyesattack3, R.string.cryptfiendyesattack3))
    }
}