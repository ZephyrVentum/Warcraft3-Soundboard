package ventum.zephyr.wc3soundboard.naga

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object SnapdragonObject {

    val drawables = intArrayOf(
        R.drawable.snapdragon,
        R.drawable.snapdragon2
    )

    fun createSnapdragon() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.snapdragondeath, R.string.snapdragondeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.snapdragonready1, R.string.snapdragonready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.snapdragonwhat1, R.string.snapdragonwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.snapdragonwhat2, R.string.snapdragonwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.snapdragonyes1, R.string.snapdragonyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.snapdragonyes2, R.string.snapdragonyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.snapdragonyesattack1, R.string.snapdragonyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.snapdragonyesattack2, R.string.snapdragonyesattack2))
    }
}