package ventum.zephyr.wc3soundboard.naga

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object RoyalGuardObject {

    val drawables = intArrayOf(
        R.drawable.myrmidon_royal,
        R.drawable.myrmidon_royal2
    )

    fun createRoyalGuard() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardpissed1, R.string.nagaroyalguardpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardpissed2, R.string.nagaroyalguardpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardpissed3, R.string.nagaroyalguardpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardpissed4, R.string.nagaroyalguardpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardpissed5, R.string.nagaroyalguardpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardpissed6, R.string.nagaroyalguardpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardpissed7, R.string.nagaroyalguardpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardready1, R.string.nagaroyalguardready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardwarcry1, R.string.nagaroyalguardwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardwhat1, R.string.nagaroyalguardwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardwhat2, R.string.nagaroyalguardwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardwhat3, R.string.nagaroyalguardwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardwhat4, R.string.nagaroyalguardwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardwhat5, R.string.nagaroyalguardwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardyes1, R.string.nagaroyalguardyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardyes2, R.string.nagaroyalguardyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardyes3, R.string.nagaroyalguardyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardyes4, R.string.nagaroyalguardyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardyesattack1, R.string.nagaroyalguardyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardyesattack2, R.string.nagaroyalguardyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaroyalguardyesattack3, R.string.nagaroyalguardyesattack3))
    }
}