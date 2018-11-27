package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object BansheeObject {

    val drawables = intArrayOf(
        R.drawable.banshee,
        R.drawable.banshee2,
        R.drawable.banshee3
    )

    fun createBanshee() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheedeath, R.string.bansheedeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeghostdeath1, R.string.bansheeghostdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeghostwhat1, R.string.bansheeghostwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeghostyes1, R.string.bansheeghostyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeghostyes2, R.string.bansheeghostyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeghostyesattack1, R.string.bansheeghostyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeghostyesattack2, R.string.bansheeghostyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheepissed1, R.string.bansheepissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheepissed2, R.string.bansheepissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheepissed3, R.string.bansheepissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheepissed4, R.string.bansheepissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheepissed5, R.string.bansheepissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeready1, R.string.bansheeready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheewarcry1, R.string.bansheewarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheewhat1, R.string.bansheewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheewhat2, R.string.bansheewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheewhat3, R.string.bansheewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheewhat4, R.string.bansheewhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheewhat5, R.string.bansheewhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeyes1, R.string.bansheeyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeyes2, R.string.bansheeyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeyes3, R.string.bansheeyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeyes4, R.string.bansheeyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeyes5, R.string.bansheeyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeyesattack1, R.string.bansheeyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeyesattack2, R.string.bansheeyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bansheeyesattack3, R.string.bansheeyesattack3))
    }
}