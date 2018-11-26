package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object RiflemanObject {

    val drawables = intArrayOf(
        R.drawable.rifleman,
        R.drawable.rifleman2,
        R.drawable.rifleman3,
        R.drawable.rifleman4
    )

    fun createRiflemans() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanattack1, R.string.riflemanattack1))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanattack2, R.string.riflemanattack2))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemandeath, R.string.riflemandeath))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanpissed1, R.string.riflemanpissed1))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanpissed2, R.string.riflemanpissed2))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanpissed3, R.string.riflemanpissed3))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanpissed4, R.string.riflemanpissed4))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanpissed5, R.string.riflemanpissed5))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanpissed6, R.string.riflemanpissed6))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanpissed7, R.string.riflemanpissed7))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanpissed8, R.string.riflemanpissed8))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanready1, R.string.riflemanready1))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanwarcry1, R.string.riflemanwarcry1))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanwhat1, R.string.riflemanwhat1))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanwhat2, R.string.riflemanwhat2))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanwhat3, R.string.riflemanwhat3))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanwhat4, R.string.riflemanwhat4))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanyes1, R.string.riflemanyes1))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanyes2, R.string.riflemanyes2))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanyes3, R.string.riflemanyes3))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanyes4, R.string.riflemanyes4))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanyesattack1, R.string.riflemanyesattack1))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanyesattack2, R.string.riflemanyesattack2))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanyesattack3, R.string.riflemanyesattack3))
            add(SoundItem(drawables[i++ % drawables.size], R.raw.riflemanyesattack4, R.string.riflemanyesattack4))
    }
}