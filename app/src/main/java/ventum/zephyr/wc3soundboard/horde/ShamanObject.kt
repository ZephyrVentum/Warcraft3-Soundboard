package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ShamanObject {

    val drawables = intArrayOf(
        R.drawable.shaman,
        R.drawable.shaman2
    )

    fun createShaman() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamandeath, R.string.shamandeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanpissed1, R.string.shamanpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanpissed2, R.string.shamanpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanpissed3, R.string.shamanpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanpissed4, R.string.shamanpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanpissed5, R.string.shamanpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanpissed6, R.string.shamanpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanpissed7, R.string.shamanpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanready1, R.string.shamanready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanwarcry1, R.string.shamanwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanwhat1, R.string.shamanwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanwhat2, R.string.shamanwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanwhat3, R.string.shamanwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanwhat4, R.string.shamanwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanyes1, R.string.shamanyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanyes2, R.string.shamanyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanyes3, R.string.shamanyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanyes4, R.string.shamanyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanyesattack1, R.string.shamanyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanyesattack2, R.string.shamanyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanyesattack3, R.string.shamanyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shamanyesattack4, R.string.shamanyesattack4))
    }
}