package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object EvilSylvanasObject {

    val drawables = intArrayOf(
        R.drawable.evil_sylvanas,
        R.drawable.evil_sylvanas2
    )

    fun createEvilSylvanas() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanaspissed1, R.string.evilsylvanaspissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanaspissed2, R.string.evilsylvanaspissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanaspissed3, R.string.evilsylvanaspissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanaspissed4, R.string.evilsylvanaspissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasready1, R.string.evilsylvanasready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanaswarcry1, R.string.evilsylvanaswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanaswhat1, R.string.evilsylvanaswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanaswhat2, R.string.evilsylvanaswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanaswhat3, R.string.evilsylvanaswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanaswhat4, R.string.evilsylvanaswhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasyes1, R.string.evilsylvanasyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasyes2, R.string.evilsylvanasyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasyes3, R.string.evilsylvanasyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasyes4, R.string.evilsylvanasyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasyes5, R.string.evilsylvanasyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasyesattack1, R.string.evilsylvanasyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasyesattack2, R.string.evilsylvanasyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasyesattack3, R.string.evilsylvanasyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilsylvanasyesattack4, R.string.evilsylvanasyesattack4))
    }
}