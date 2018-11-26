package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object PriestObject {

    val drawables = intArrayOf(
        R.drawable.priest,
        R.drawable.priest2,
        R.drawable.priest3
    )

    fun createPriest() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestdeath, R.string.priestdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestpissed1, R.string.priestpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestpissed2, R.string.priestpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestpissed3, R.string.priestpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestpissed4, R.string.priestpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestpissed5, R.string.priestpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestpissed6, R.string.priestpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestready1, R.string.priestready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestwarcry1, R.string.priestwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestwhat1, R.string.priestwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestwhat2, R.string.priestwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestwhat3, R.string.priestwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestwhat4, R.string.priestwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestyes1, R.string.priestyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestyes2, R.string.priestyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestyes3, R.string.priestyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestyes4, R.string.priestyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestyesattack1, R.string.priestyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestyesattack2, R.string.priestyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.priestyesattack3, R.string.priestyesattack3))
    }
}