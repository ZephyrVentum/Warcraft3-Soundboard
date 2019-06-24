package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object SylvanasObject {

    private val drawables = intArrayOf(
        R.drawable.sylvanas,
        R.drawable.sylvanas2
    )

    fun createSylvanas() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaspissed1, R.string.sylvanaspissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaspissed2, R.string.sylvanaspissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaspissed3, R.string.sylvanaspissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaspissed4, R.string.sylvanaspissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaspissed5, R.string.sylvanaspissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaswarcry1, R.string.sylvanaswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaswhat1, R.string.sylvanaswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaswhat2, R.string.sylvanaswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaswhat3, R.string.sylvanaswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sylvanaswhat4, R.string.sylvanaswhat4))
    }
}