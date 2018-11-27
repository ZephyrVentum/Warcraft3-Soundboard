package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object AcolyteObject {

    val drawables = intArrayOf(
        R.drawable.acolyte,
        R.drawable.acolyte2
    )

    fun createAcolyte() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytecannotbuildthere1, R.string.acolytecannotbuildthere1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytedeath1, R.string.acolytedeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytemining, R.string.acolytemining))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytepissed1, R.string.acolytepissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytepissed2, R.string.acolytepissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytepissed3, R.string.acolytepissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytepissed4, R.string.acolytepissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytepissed5, R.string.acolytepissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytepissed6, R.string.acolytepissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytepissed7, R.string.acolytepissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytepissed8, R.string.acolytepissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolyteready1, R.string.acolyteready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytewarcry1, R.string.acolytewarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytewhat1, R.string.acolytewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytewhat2, R.string.acolytewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytewhat3, R.string.acolytewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytewhat4, R.string.acolytewhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytewhat5, R.string.acolytewhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolyteyes1, R.string.acolyteyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolyteyes2, R.string.acolyteyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolyteyes3, R.string.acolyteyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolyteyes4, R.string.acolyteyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolyteyesattack1, R.string.acolyteyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolyteyesattack2, R.string.acolyteyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolyteyesattack3, R.string.acolyteyesattack3))
    }
}