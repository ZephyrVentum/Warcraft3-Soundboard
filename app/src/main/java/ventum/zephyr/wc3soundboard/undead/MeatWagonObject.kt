package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object MeatWagonObject {

    val drawables = intArrayOf(
        R.drawable.meat_wagon,
        R.drawable.meat_wagon2
    )

    fun createMeatWagon() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagondeath1, R.string.meatwagondeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonmissilehit1, R.string.meatwagonmissilehit1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonready1, R.string.meatwagonready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonwhat1, R.string.meatwagonwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonwhat2, R.string.meatwagonwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonwhat3, R.string.meatwagonwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonyes1, R.string.meatwagonyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonyes2, R.string.meatwagonyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonyes3, R.string.meatwagonyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonyesattack1, R.string.meatwagonyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonyesattack2, R.string.meatwagonyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.meatwagonyesattack3, R.string.meatwagonyesattack3))
    }
}