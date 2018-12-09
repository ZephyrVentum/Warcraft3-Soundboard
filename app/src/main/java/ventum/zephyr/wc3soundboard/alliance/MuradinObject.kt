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
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinpissed1, R.string.muradinpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinpissed2, R.string.muradinpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinpissed3, R.string.muradinpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinpissed4, R.string.muradinpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinpissed5, R.string.muradinpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinpissed6, R.string.muradinpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinpissed7, R.string.muradinpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinpissed8, R.string.muradinpissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinwarcry1, R.string.muradinwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinwhat1, R.string.muradinwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinwhat2, R.string.muradinwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinwhat3, R.string.muradinwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinwhat4, R.string.muradinwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinyes1, R.string.muradinyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinyes2, R.string.muradinyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinyes3, R.string.muradinyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinyes4, R.string.muradinyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinyesattack1, R.string.muradinyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinyesattack2, R.string.muradinyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.muradinyesattack3, R.string.muradinyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingdeath, R.string.heromountainkingdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingpissed1, R.string.heromountainkingpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingpissed2, R.string.heromountainkingpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingpissed3, R.string.heromountainkingpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingpissed4, R.string.heromountainkingpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingpissed5, R.string.heromountainkingpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingpissed6, R.string.heromountainkingpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingpissed7, R.string.heromountainkingpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingready1, R.string.heromountainkingready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingwarcry1, R.string.heromountainkingwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingwhat1, R.string.heromountainkingwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingwhat2, R.string.heromountainkingwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingwhat3, R.string.heromountainkingwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingwhat4, R.string.heromountainkingwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingyes1, R.string.heromountainkingyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingyes2, R.string.heromountainkingyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingyes3, R.string.heromountainkingyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingyes4, R.string.heromountainkingyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingyesattack1, R.string.heromountainkingyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingyesattack2, R.string.heromountainkingyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingyesattack3, R.string.heromountainkingyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromountainkingyesattack4, R.string.heromountainkingyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.avatar, R.string.avatar))
    }
}