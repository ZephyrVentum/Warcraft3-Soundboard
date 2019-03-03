package ventum.zephyr.wc3soundboard.naga

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object TurtleObject {

    val drawables = intArrayOf(
        R.drawable.turtle,
        R.drawable.turtle2
    )

    fun createTurtle() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.giantseaturtledeath1, R.string.giantseaturtledeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.giantseaturtlewhat1, R.string.giantseaturtlewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.giantseaturtlewhat2, R.string.giantseaturtlewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.giantseaturtleyes1, R.string.giantseaturtleyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.giantseaturtleyes2, R.string.giantseaturtleyes2))
    }
}