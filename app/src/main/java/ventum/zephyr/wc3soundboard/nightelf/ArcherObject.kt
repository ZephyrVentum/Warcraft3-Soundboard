package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ArcherObject {

    val drawables = intArrayOf(
        R.drawable.archer,
        R.drawable.archer2
    )

    fun createArcher() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerdeath1, R.string.archerdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerpissed1, R.string.archerpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerpissed2, R.string.archerpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerpissed3, R.string.archerpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerpissed4, R.string.archerpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerpissed5, R.string.archerpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerpissed6, R.string.archerpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerpissed7, R.string.archerpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerpissed8, R.string.archerpissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerready1, R.string.archerready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerwarcry1, R.string.archerwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerwhat1, R.string.archerwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerwhat2, R.string.archerwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerwhat3, R.string.archerwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archerwhat4, R.string.archerwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archeryes1, R.string.archeryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archeryes2, R.string.archeryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archeryes3, R.string.archeryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archeryes4, R.string.archeryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archeryesattack1, R.string.archeryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archeryesattack2, R.string.archeryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archeryesattack3, R.string.archeryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.archeryesattack4, R.string.archeryesattack4))
    }
}