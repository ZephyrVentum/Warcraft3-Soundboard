package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R

object AnimalObject {

    val drawables = intArrayOf(
        R.drawable.rat,
        R.drawable.skink
    )

    fun createAnimal() = SoundItems().apply {
        add(SoundItem(drawables[0], R.raw.ratwhat1, R.string.ratwhat1))
        add(SoundItem(drawables[0], R.raw.ratwhat2, R.string.ratwhat2))
        add(SoundItem(drawables[1], R.raw.skinkdeath1, R.string.skinkdeath1))
        add(SoundItem(drawables[1], R.raw.skinkwhat1, R.string.skinkwhat1))
        add(SoundItem(drawables[1], R.raw.skinkwhat2, R.string.skinkwhat2))
    }
}