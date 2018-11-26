package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object CaptainObject {

    val drawables = intArrayOf(
        R.drawable.captain,
        R.drawable.captain2,
        R.drawable.captain3
    )

    fun createCaptain() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainpissed1, R.string.captainpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainpissed2, R.string.captainpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainpissed3, R.string.captainpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainwarcry1, R.string.captainwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainwhat1, R.string.captainwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainwhat2, R.string.captainwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainwhat3, R.string.captainwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainyes1, R.string.captainyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainyes2, R.string.captainyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainyes3, R.string.captainyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.captainyesattack1, R.string.captainyesattack1))
    }
}