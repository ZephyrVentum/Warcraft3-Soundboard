package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R

object GargoyleObject {

    val drawables = intArrayOf(
        R.drawable.gargoyle,
        R.drawable.gargoyle2
    )

    fun createGargoyle() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoyledeath1, R.string.gargoyledeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoyleready1, R.string.gargoyleready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoylespirewhat1, R.string.gargoylespirewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoylewhat1, R.string.gargoylewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoylewhat2, R.string.gargoylewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoylewhat3, R.string.gargoylewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoyleyes1, R.string.gargoyleyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoyleyes2, R.string.gargoyleyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoyleyes3, R.string.gargoyleyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoyleyesattack1, R.string.gargoyleyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoyleyesattack2, R.string.gargoyleyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gargoyleyesattack3, R.string.gargoyleyesattack3))
    }
}