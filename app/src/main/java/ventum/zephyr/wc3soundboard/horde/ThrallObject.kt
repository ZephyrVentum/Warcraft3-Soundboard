package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ThrallObject {

    val drawables = intArrayOf(
        R.drawable.thrall,
        R.drawable.thrall2,
        R.drawable.thrall3
    )

    fun createThrall() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallpissed1, R.string.thrallpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallpissed2, R.string.thrallpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallpissed3, R.string.thrallpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallpissed4, R.string.thrallpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallwarcry1, R.string.thrallwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallwhat1, R.string.thrallwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallwhat2, R.string.thrallwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallwhat3, R.string.thrallwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallwhat4, R.string.thrallwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallyes1, R.string.thrallyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallyes2, R.string.thrallyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallyes3, R.string.thrallyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallyes4, R.string.thrallyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallyesattack1, R.string.thrallyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallyesattack2, R.string.thrallyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallyesattack3, R.string.thrallyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.thrallyesattack4, R.string.thrallyesattack4))
    }
}