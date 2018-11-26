package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object PeonObject {

    val drawables = intArrayOf(
        R.drawable.peon,
        R.drawable.peon2,
        R.drawable.peon3
    )

    fun createPeon() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peoncannotbuildthere1, R.string.peoncannotbuildthere1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peondeath, R.string.peondeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonjobdone, R.string.peonjobdone))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonpissed1, R.string.peonpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonpissed2, R.string.peonpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonpissed3, R.string.peonpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonpissed4, R.string.peonpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonready1, R.string.peonready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonrepair1, R.string.peonrepair1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonrepair2, R.string.peonrepair2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonrepair3, R.string.peonrepair3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonwarcry1, R.string.peonwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonwhat1, R.string.peonwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonwhat2, R.string.peonwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonwhat3, R.string.peonwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonwhat4, R.string.peonwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonyes1, R.string.peonyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonyes2, R.string.peonyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonyes3, R.string.peonyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonyes4, R.string.peonyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonyesattack1, R.string.peonyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonyesattack2, R.string.peonyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peonyesattack3, R.string.peonyesattack3))
    }
}