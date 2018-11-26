package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object WyvernObject {

    val drawables = intArrayOf(
        R.drawable.wyvern,
        R.drawable.wyvern2,
        R.drawable.wyvern3
    )

    fun createWyvern() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderdeath, R.string.wyvernriderdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderpissed1, R.string.wyvernriderpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderpissed2, R.string.wyvernriderpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderpissed3, R.string.wyvernriderpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderpissed4, R.string.wyvernriderpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderpissed5, R.string.wyvernriderpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderpissed6, R.string.wyvernriderpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderpissed7, R.string.wyvernriderpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderready1, R.string.wyvernriderready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderwarcry1, R.string.wyvernriderwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderwhat1, R.string.wyvernriderwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderwhat2, R.string.wyvernriderwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderwhat3, R.string.wyvernriderwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernriderwhat4, R.string.wyvernriderwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernrideryes1, R.string.wyvernrideryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernrideryes2, R.string.wyvernrideryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernrideryes3, R.string.wyvernrideryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernrideryes4, R.string.wyvernrideryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernrideryesattack1, R.string.wyvernrideryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernrideryesattack2, R.string.wyvernrideryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernrideryesattack3, R.string.wyvernrideryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wyvernrideryesattack4, R.string.wyvernrideryesattack4))
    }
}