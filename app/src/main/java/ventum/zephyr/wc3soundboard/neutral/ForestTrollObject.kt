package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ForestTrollObject {

    val drawables = intArrayOf(
        R.drawable.forest_troll,
                R.drawable.forest_troll2
    )

    fun createForestTroll() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrolldeath, R.string.foresttrolldeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollpissed1, R.string.foresttrollpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollpissed2, R.string.foresttrollpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollpissed3, R.string.foresttrollpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollpissed4, R.string.foresttrollpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollpissed5, R.string.foresttrollpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollpissed6, R.string.foresttrollpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollready1, R.string.foresttrollready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollshadowpriestdeath1, R.string.foresttrollshadowpriestdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollwarcry1, R.string.foresttrollwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollwhat1, R.string.foresttrollwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollwhat2, R.string.foresttrollwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollwhat3, R.string.foresttrollwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollwhat4, R.string.foresttrollwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollyes1, R.string.foresttrollyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollyes2, R.string.foresttrollyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollyes3, R.string.foresttrollyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollyes4, R.string.foresttrollyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollyesattack1, R.string.foresttrollyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollyesattack2, R.string.foresttrollyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollyesattack3, R.string.foresttrollyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.foresttrollyesattack4, R.string.foresttrollyesattack4))
    }
}