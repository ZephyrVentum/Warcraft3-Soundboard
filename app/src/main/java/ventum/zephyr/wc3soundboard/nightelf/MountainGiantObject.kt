package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object MountainGiantObject {

    val drawables = intArrayOf(
        R.drawable.mountain_giant,
        R.drawable.mountain_giant
    )

    fun createMountainGiant() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mountaingiantdeath1, R.string.mountaingiantdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mountaingiantpissed1, R.string.mountaingiantpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mountaingiantwhat1, R.string.mountaingiantwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mountaingiantwhat2, R.string.mountaingiantwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mountaingiantwhat3, R.string.mountaingiantwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mountaingiantyes1, R.string.mountaingiantyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mountaingiantyes2, R.string.mountaingiantyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mountaingiantyes3, R.string.mountaingiantyes3))
    }
}