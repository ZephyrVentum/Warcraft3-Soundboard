package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object NaishaObject {

    val drawables = intArrayOf(
        R.drawable.naisha,
        R.drawable.naisha2
    )

    fun createNaisha() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishapissed1, R.string.naishapissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishapissed2, R.string.naishapissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishapissed3, R.string.naishapissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishaready1, R.string.naishaready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishawarcry1, R.string.naishawarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishawhat1, R.string.naishawhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishawhat2, R.string.naishawhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishawhat3, R.string.naishawhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishawhat4, R.string.naishawhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishawhat5, R.string.naishawhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishayes1, R.string.naishayes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishayes2, R.string.naishayes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishayes3, R.string.naishayes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishayes4, R.string.naishayes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishayes5, R.string.naishayes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishayesattack1, R.string.naishayesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishayesattack2, R.string.naishayesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naishayesattack3, R.string.naishayesattack3))
    }
}