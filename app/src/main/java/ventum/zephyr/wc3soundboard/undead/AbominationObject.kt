package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object AbominationObject {

    val drawables = intArrayOf(
        R.drawable.abomination,
        R.drawable.abomination2,
        R.drawable.abomination3
    )

    fun createAbomination() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationdeath1, R.string.abominationdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationpissed1, R.string.abominationpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationpissed2, R.string.abominationpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationpissed3, R.string.abominationpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationpissed4, R.string.abominationpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationpissed5, R.string.abominationpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationpissed6, R.string.abominationpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationready1, R.string.abominationready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationwarcry1, R.string.abominationwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationwhat1, R.string.abominationwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationwhat2, R.string.abominationwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationwhat3, R.string.abominationwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationwhat4, R.string.abominationwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationyes1, R.string.abominationyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationyes2, R.string.abominationyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationyes3, R.string.abominationyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationyes4, R.string.abominationyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationyes5, R.string.abominationyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationyesattack1, R.string.abominationyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationyesattack2, R.string.abominationyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationyesattack3, R.string.abominationyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.abominationyesattack4, R.string.abominationyesattack4))
    }
}