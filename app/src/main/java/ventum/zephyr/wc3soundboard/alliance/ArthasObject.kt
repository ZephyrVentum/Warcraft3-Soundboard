package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ArthasObject {

    private val drawables = intArrayOf(
        R.drawable.arthas,
        R.drawable.arthas2,
        R.drawable.arthas3
    )

    fun createArthas() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaspissed1, R.string.arthaspissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaspissed2, R.string.arthaspissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaspissed3, R.string.arthaspissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaspissed4, R.string.arthaspissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaspissed5, R.string.arthaspissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaspissed6, R.string.arthaspissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaspissed7, R.string.arthaspissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaswarcry1, R.string.arthaswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaswhat1, R.string.arthaswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaswhat2, R.string.arthaswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaswhat3, R.string.arthaswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaswhat4, R.string.arthaswhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthaswhat5, R.string.arthaswhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyes1, R.string.arthasyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyes2, R.string.arthasyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyes3, R.string.arthasyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyes4, R.string.arthasyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyesattack1, R.string.arthasyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyesattack2, R.string.arthasyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyesattack3, R.string.arthasyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyesattack4, R.string.arthasyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyesattack5, R.string.arthasyesattack5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.arthasyesattack6, R.string.arthasyesattack6))
    }
}