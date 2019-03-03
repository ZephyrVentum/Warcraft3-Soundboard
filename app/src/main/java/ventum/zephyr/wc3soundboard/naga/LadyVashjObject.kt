package ventum.zephyr.wc3soundboard.naga

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object LadyVashjObject {

    val drawables = intArrayOf(
        R.drawable.lady_vashj,
        R.drawable.lady_vashj2
    )

    fun createLadyVashj() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjpissed1, R.string.ladyvashjpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjpissed2, R.string.ladyvashjpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjpissed3, R.string.ladyvashjpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjpissed4, R.string.ladyvashjpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjpissed5, R.string.ladyvashjpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjready1, R.string.ladyvashjready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjwarcry1, R.string.ladyvashjwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjwhat1, R.string.ladyvashjwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjwhat2, R.string.ladyvashjwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjwhat3, R.string.ladyvashjwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjwhat4, R.string.ladyvashjwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjwhat5, R.string.ladyvashjwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjyes1, R.string.ladyvashjyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjyes2, R.string.ladyvashjyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjyes3, R.string.ladyvashjyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjyes4, R.string.ladyvashjyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjyes5, R.string.ladyvashjyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjyes6, R.string.ladyvashjyes6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjyesattack1, R.string.ladyvashjyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjyesattack2, R.string.ladyvashjyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ladyvashjyesattack3, R.string.ladyvashjyesattack3))
    }
}