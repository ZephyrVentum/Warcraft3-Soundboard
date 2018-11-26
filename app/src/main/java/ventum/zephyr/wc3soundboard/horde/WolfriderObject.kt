package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object WolfriderObject {

    val drawables = intArrayOf(
        R.drawable.wolfrider,
        R.drawable.wolfrider2
    )

    fun createWolfrider() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderpissed1, R.string.wolfriderpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderpissed2, R.string.wolfriderpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderpissed3, R.string.wolfriderpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderpissed4, R.string.wolfriderpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderready1, R.string.wolfriderready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderwarcry1, R.string.wolfriderwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderwhat1, R.string.wolfriderwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderwhat2, R.string.wolfriderwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderwhat3, R.string.wolfriderwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfriderwhat4, R.string.wolfriderwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfrideryes1, R.string.wolfrideryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfrideryes2, R.string.wolfrideryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfrideryes3, R.string.wolfrideryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfrideryes4, R.string.wolfrideryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfrideryesattack1, R.string.wolfrideryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfrideryesattack2, R.string.wolfrideryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wolfrideryesattack3, R.string.wolfrideryesattack3))
    }
}