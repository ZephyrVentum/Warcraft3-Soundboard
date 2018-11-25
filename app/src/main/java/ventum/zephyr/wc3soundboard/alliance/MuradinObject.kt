package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object MuradinObject {

    private val drawables = intArrayOf(
        R.drawable.muradin,
        R.drawable.muradin2,
        R.drawable.muradin3,
        R.drawable.muradin4
    )

    fun createMuradin() = SoundItems().apply {
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinpissed1, R.string.muradinpissed1))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinpissed2, R.string.muradinpissed2))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinpissed3, R.string.muradinpissed3))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinpissed4, R.string.muradinpissed4))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinpissed5, R.string.muradinpissed5))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinpissed6, R.string.muradinpissed6))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinpissed7, R.string.muradinpissed7))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinpissed8, R.string.muradinpissed8))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinwarcry1, R.string.muradinwarcry1))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinwhat1, R.string.muradinwhat1))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinwhat2, R.string.muradinwhat2))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinwhat3, R.string.muradinwhat3))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinwhat4, R.string.muradinwhat4))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinyes1, R.string.muradinyes1))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinyes2, R.string.muradinyes2))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinyes3, R.string.muradinyes3))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinyes4, R.string.muradinyes4))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinyesattack1, R.string.muradinyesattack1))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinyesattack2, R.string.muradinyesattack2))
        add(SoundItem(getRandomFrom(drawables), R.raw.muradinyesattack3, R.string.muradinyesattack3))
        add(SoundItem(getRandomFrom(drawables), R.raw.avatar, R.string.avatar))
    }
}