package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object DryadObject {

    val drawables = intArrayOf(
        R.drawable.dryade,
        R.drawable.dryade2
    )

    fun createDryad() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryaddeath1, R.string.dryaddeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadpissed1, R.string.dryadpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadpissed2, R.string.dryadpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadpissed3, R.string.dryadpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadpissed4, R.string.dryadpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadpissed5, R.string.dryadpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadpissed6, R.string.dryadpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadpissed7, R.string.dryadpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadpissed8, R.string.dryadpissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadpissed9, R.string.dryadpissed9))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadready1, R.string.dryadready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadwarcry1, R.string.dryadwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadwhat1, R.string.dryadwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadwhat2, R.string.dryadwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadwhat3, R.string.dryadwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadwhat4, R.string.dryadwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadyes1, R.string.dryadyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadyes2, R.string.dryadyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadyes3, R.string.dryadyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadyes4, R.string.dryadyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadyesattack2, R.string.dryadyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadyesattack3, R.string.dryadyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dryadyesattack4, R.string.dryadyesattack4))
    }
}