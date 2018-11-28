package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object WispObject {

    val drawables = intArrayOf(
        R.drawable.wisp,
        R.drawable.wisp2
    )

    fun createWisp() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wispdeath1, R.string.wispdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wispentanglemine, R.string.wispentanglemine))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wisppissed1, R.string.wisppissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wisppissed2, R.string.wisppissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wisppissed3, R.string.wisppissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wispready1, R.string.wispready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wispwhat1, R.string.wispwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wispwhat2, R.string.wispwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wispwhat3, R.string.wispwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wispyes1, R.string.wispyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wispyes2, R.string.wispyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.wispyes3, R.string.wispyes3))
    }
}