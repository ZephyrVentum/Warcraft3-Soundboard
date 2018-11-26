package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object GruntObject {

    val drawables = intArrayOf(
        R.drawable.grunt,
        R.drawable.grunt2,
        R.drawable.grunt3
    )

    fun createGrunt() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntdeath, R.string.gruntdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntpissed1, R.string.gruntpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntpissed2, R.string.gruntpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntpissed3, R.string.gruntpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntpissed4, R.string.gruntpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntpissed5, R.string.gruntpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntpissed6, R.string.gruntpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntpissed7, R.string.gruntpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntready1, R.string.gruntready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntwarcry1, R.string.gruntwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntwhat1, R.string.gruntwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntwhat2, R.string.gruntwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntwhat3, R.string.gruntwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntwhat4, R.string.gruntwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntyes1, R.string.gruntyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntyes2, R.string.gruntyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntyes3, R.string.gruntyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntyes4, R.string.gruntyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntyesattack1, R.string.gruntyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntyesattack2, R.string.gruntyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntyesattack3, R.string.gruntyesattack3))
    }
}