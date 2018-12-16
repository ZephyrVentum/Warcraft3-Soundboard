package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object SapperObject {

    val drawables = intArrayOf(
        R.drawable.sapper,
        R.drawable.sapper2,
        R.drawable.sapper3
    )

    fun createSapper() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperdeath1, R.string.goblinsapperdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperpissed1, R.string.goblinsapperpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperpissed2, R.string.goblinsapperpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperpissed3, R.string.goblinsapperpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperpissed4, R.string.goblinsapperpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperpissed5, R.string.goblinsapperpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperpissed6, R.string.goblinsapperpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperpissed7, R.string.goblinsapperpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperready1, R.string.goblinsapperready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperwarcry1, R.string.goblinsapperwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperwhat1, R.string.goblinsapperwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperwhat2, R.string.goblinsapperwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperwhat3, R.string.goblinsapperwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperwhat4, R.string.goblinsapperwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperwhat5, R.string.goblinsapperwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyes1, R.string.goblinsapperyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyes2, R.string.goblinsapperyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyes3, R.string.goblinsapperyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyes4, R.string.goblinsapperyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyes5, R.string.goblinsapperyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyesattack1, R.string.goblinsapperyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyesattack2, R.string.goblinsapperyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyesattack3, R.string.goblinsapperyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyesattack4, R.string.goblinsapperyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinsapperyesattack5, R.string.goblinsapperyesattack5))
    }
}