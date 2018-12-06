package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object BristlbackObject {

    val drawables = intArrayOf(
        R.drawable.bristlback
    )

    fun createBristlback() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackdeath1, R.string.bristlebackdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackmissilehit, R.string.bristlebackmissilehit))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackwhat1, R.string.bristlebackwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackwhat2, R.string.bristlebackwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackwhat3, R.string.bristlebackwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackyes1, R.string.bristlebackyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackyes2, R.string.bristlebackyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackyes3, R.string.bristlebackyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackyesattack1, R.string.bristlebackyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackyesattack2, R.string.bristlebackyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bristlebackyesattack3, R.string.bristlebackyesattack3))
    }
}