package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object SpiritWalkerObject {

    val drawables = intArrayOf(
        R.drawable.spiritwalker,
        R.drawable.spiritwalker2
    )

    fun createSpiritWalker() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenpissed1, R.string.whitetaurenpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenpissed2, R.string.whitetaurenpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenpissed3, R.string.whitetaurenpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenpissed4, R.string.whitetaurenpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenpissed5, R.string.whitetaurenpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenpissed6, R.string.whitetaurenpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenready1, R.string.whitetaurenready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenwarcry1, R.string.whitetaurenwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenwhat1, R.string.whitetaurenwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenwhat2, R.string.whitetaurenwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenwhat3, R.string.whitetaurenwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenwhat4, R.string.whitetaurenwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenwhat5, R.string.whitetaurenwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenyes1, R.string.whitetaurenyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenyes2, R.string.whitetaurenyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenyes3, R.string.whitetaurenyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenyes4, R.string.whitetaurenyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenyes5, R.string.whitetaurenyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenyesattack1, R.string.whitetaurenyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenyesattack2, R.string.whitetaurenyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.whitetaurenyesattack3, R.string.whitetaurenyesattack3))
    }
}