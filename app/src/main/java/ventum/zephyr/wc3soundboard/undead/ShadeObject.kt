package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ShadeObject {

    val drawables = intArrayOf(
        R.drawable.shade,
        R.drawable.shade2
    )

    fun createShade() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadedeath1, R.string.shadedeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadepissed1, R.string.shadepissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadepissed2, R.string.shadepissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadepissed3, R.string.shadepissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadepissed4, R.string.shadepissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadepissed5, R.string.shadepissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadepissed6, R.string.shadepissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeready1, R.string.shadeready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadewarcry1, R.string.shadewarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadewhat1, R.string.shadewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadewhat2, R.string.shadewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadewhat3, R.string.shadewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeyes1, R.string.shadeyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeyes2, R.string.shadeyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeyes3, R.string.shadeyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeyes4, R.string.shadeyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeyesattack1, R.string.shadeyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeyesattack2, R.string.shadeyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeyesattack3, R.string.shadeyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeyesattack4, R.string.shadeyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadeyesattack5, R.string.shadeyesattack5))
    }
}