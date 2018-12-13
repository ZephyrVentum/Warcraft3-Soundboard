package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object MurlocObject {

    val drawables = intArrayOf(
        R.drawable.murloc,
        R.drawable.murloc2,
        R.drawable.murloc3
    )

    fun createMurloc() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocdeath, R.string.murlocdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocpissed1, R.string.murlocpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocpissed2, R.string.murlocpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocpissed3, R.string.murlocpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocready1, R.string.murlocready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocwhat1, R.string.murlocwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocwhat2, R.string.murlocwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocwhat3, R.string.murlocwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocyes1, R.string.murlocyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocyes2, R.string.murlocyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocyes3, R.string.murlocyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocyesattack1, R.string.murlocyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocyesattack2, R.string.murlocyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murlocyesattack3, R.string.murlocyesattack3))
    }
}