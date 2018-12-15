package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object FurbolgObject {

    val drawables = intArrayOf(
        R.drawable.furbolg,
        R.drawable.furbolg2
    )

    fun createFurbolg() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgdeath1, R.string.furbolgdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgpissed1, R.string.furbolgpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgpissed2, R.string.furbolgpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgpissed3, R.string.furbolgpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgwhat1, R.string.furbolgwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgwhat2, R.string.furbolgwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgwhat3, R.string.furbolgwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgyes1, R.string.furbolgyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgyes2, R.string.furbolgyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgyes3, R.string.furbolgyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgyesattack1, R.string.furbolgyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgyesattack2, R.string.furbolgyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.furbolgyesattack3, R.string.furbolgyesattack3))
    }
}