package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object FaerieDragonObject {

    val drawables = intArrayOf(
        R.drawable.faerie,
        R.drawable.faerie2
    )

    fun createFaerieDragon() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.faeriedragondeath1, R.string.faeriedragondeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.faeriedragonpissed1, R.string.faeriedragonpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.faeriedragonready1, R.string.faeriedragonready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.faeriedragonwhat1, R.string.faeriedragonwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.faeriedragonwhat2, R.string.faeriedragonwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.faeriedragonyes1, R.string.faeriedragonyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.faeriedragonyes2, R.string.faeriedragonyes2))
    }
}