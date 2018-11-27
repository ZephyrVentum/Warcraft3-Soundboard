package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object LichObject {

    val drawables = intArrayOf(
        R.drawable.lich,
        R.drawable.lich2
    )

    fun createLich() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichdeath1, R.string.herolichdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichpissed1, R.string.herolichpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichpissed2, R.string.herolichpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichpissed3, R.string.herolichpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichpissed4, R.string.herolichpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichpissed5, R.string.herolichpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichpissed6, R.string.herolichpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichpissed7, R.string.herolichpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichpissed8, R.string.herolichpissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichready1, R.string.herolichready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichwarcry1, R.string.herolichwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichwhat1, R.string.herolichwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichwhat2, R.string.herolichwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichwhat3, R.string.herolichwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichwhat4, R.string.herolichwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichyes1, R.string.herolichyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichyes2, R.string.herolichyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichyes3, R.string.herolichyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichyes4, R.string.herolichyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichyes5, R.string.herolichyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichyesattack1, R.string.herolichyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichyesattack2, R.string.herolichyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herolichyesattack3, R.string.herolichyesattack3))
    }
}