package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ShandrisObject {

    val drawables = intArrayOf(
        R.drawable.shandris,
        R.drawable.shandris2
    )

    fun createShandris() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrispissed1, R.string.shandrispissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrispissed2, R.string.shandrispissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrispissed3, R.string.shandrispissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrispissed4, R.string.shandrispissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandriswarcry1, R.string.shandriswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandriswhat1, R.string.shandriswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandriswhat2, R.string.shandriswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandriswhat3, R.string.shandriswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrisyes1, R.string.shandrisyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrisyes2, R.string.shandrisyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrisyes3, R.string.shandrisyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrisyesattack1, R.string.shandrisyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrisyesattack2, R.string.shandrisyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shandrisyesattack3, R.string.shandrisyesattack3))
    }
}