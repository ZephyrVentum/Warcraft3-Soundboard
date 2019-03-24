package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object TraxesObject {

    val drawables = intArrayOf(
        R.drawable.evil_sylvanas,
        R.drawable.evil_sylvanas2
    )

    fun createTraxes() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerdeath1, R.string.darkrangerdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerpissed1, R.string.darkrangerpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerpissed2, R.string.darkrangerpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerpissed3, R.string.darkrangerpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerpissed4, R.string.darkrangerpissed4, true))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerready1, R.string.darkrangerready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerwarcry1, R.string.darkrangerwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerwhat1, R.string.darkrangerwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerwhat2, R.string.darkrangerwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerwhat3, R.string.darkrangerwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerwhat4, R.string.darkrangerwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangerwhat5, R.string.darkrangerwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangeryes1, R.string.darkrangeryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangeryes2, R.string.darkrangeryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangeryes3, R.string.darkrangeryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangeryes4, R.string.darkrangeryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangeryesattack1, R.string.darkrangeryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangeryesattack2, R.string.darkrangeryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.darkrangeryesattack3, R.string.darkrangeryesattack3))
    }
}