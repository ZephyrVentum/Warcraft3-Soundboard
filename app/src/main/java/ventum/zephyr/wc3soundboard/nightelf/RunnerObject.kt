package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object RunnerObject {

    val drawables = intArrayOf(
        R.drawable.runner,
        R.drawable.runner2
    )

    fun createRunner() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerpissed1, R.string.runnerpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerpissed2, R.string.runnerpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerpissed3, R.string.runnerpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerpissed4, R.string.runnerpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerpissed5, R.string.runnerpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerpissed6, R.string.runnerpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerpissed7, R.string.runnerpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerready1, R.string.runnerready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerwarcry1, R.string.runnerwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerwhat1, R.string.runnerwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerwhat2, R.string.runnerwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerwhat3, R.string.runnerwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerwhat4, R.string.runnerwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runnerwhat5, R.string.runnerwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runneryes1, R.string.runneryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runneryes2, R.string.runneryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runneryes3, R.string.runneryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runneryes4, R.string.runneryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runneryes5, R.string.runneryes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runneryesattack1, R.string.runneryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runneryesattack2, R.string.runneryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.runneryesattack3, R.string.runneryesattack3))
    }
}