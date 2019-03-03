package ventum.zephyr.wc3soundboard.naga

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object WindSerpentObject {

    val drawables = intArrayOf(
        R.drawable.wind_serpent
    )

    fun createWindSerpent() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wingedserpentdeath, R.string.wingedserpentdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wingedserpentready1, R.string.wingedserpentready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wingedserpentwhat1, R.string.wingedserpentwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wingedserpentwhat2, R.string.wingedserpentwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wingedserpentyes1, R.string.wingedserpentyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wingedserpentyes2, R.string.wingedserpentyes2))
    }
}