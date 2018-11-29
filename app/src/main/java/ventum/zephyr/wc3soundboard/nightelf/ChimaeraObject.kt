package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ChimaeraObject {

    val drawables = intArrayOf(
        R.drawable.chimera,
        R.drawable.chimera2
    )

    fun createChimaera() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerapissed1, R.string.chimaerapissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerapissed2, R.string.chimaerapissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerapissed3, R.string.chimaerapissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaeraready1, R.string.chimaeraready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerawhat1, R.string.chimaerawhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerawhat2, R.string.chimaerawhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerawhat3, R.string.chimaerawhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerayes1, R.string.chimaerayes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerayes2, R.string.chimaerayes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerayes3, R.string.chimaerayes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerayesattack1, R.string.chimaerayesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerayesattack2, R.string.chimaerayesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.chimaerayesattack3, R.string.chimaerayesattack3))
    }
}