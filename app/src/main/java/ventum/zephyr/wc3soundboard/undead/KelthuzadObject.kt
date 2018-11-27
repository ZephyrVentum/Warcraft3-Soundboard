package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object KelthuzadObject {

    val drawables = intArrayOf(
        R.drawable.kelthuzad,
        R.drawable.kelthuzad2
    )

    fun createKelthuzad() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadpissed1, R.string.kelthuzadpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadpissed2, R.string.kelthuzadpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadpissed3, R.string.kelthuzadpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadpissed4, R.string.kelthuzadpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadpissed5, R.string.kelthuzadpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadwarcry1, R.string.kelthuzadwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadwhat1, R.string.kelthuzadwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadwhat2, R.string.kelthuzadwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadwhat3, R.string.kelthuzadwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadwhat4, R.string.kelthuzadwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadyes1, R.string.kelthuzadyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadyes2, R.string.kelthuzadyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadyes3, R.string.kelthuzadyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadyes4, R.string.kelthuzadyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadyesattack1, R.string.kelthuzadyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadyesattack2, R.string.kelthuzadyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kelthuzadyesattack3, R.string.kelthuzadyesattack3))
    }
}