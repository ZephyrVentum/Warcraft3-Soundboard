package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object GromObject {

    val drawables = intArrayOf(
        R.drawable.grom,
        R.drawable.grom2
    )

    fun createGrom() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.grompissed1, R.string.grompissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.grompissed2, R.string.grompissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.grompissed3, R.string.grompissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromwarcry1, R.string.gromwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromwhat1, R.string.gromwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromwhat2, R.string.gromwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromwhat3, R.string.gromwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromyes1, R.string.gromyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromyes2, R.string.gromyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromyes3, R.string.gromyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromyesattack1, R.string.gromyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromyesattack2, R.string.gromyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromyesattack3, R.string.gromyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gromyesattack4, R.string.gromyesattack4))
    }
}