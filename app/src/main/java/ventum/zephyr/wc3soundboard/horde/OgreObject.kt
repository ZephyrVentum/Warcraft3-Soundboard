package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object OgreObject {

    val drawables = intArrayOf(
        R.drawable.ogre,
        R.drawable.ogre2
    )

    fun createOgre() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogredeath1, R.string.ogredeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrepissed1, R.string.ogrepissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrepissed2, R.string.ogrepissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrepissed3, R.string.ogrepissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrepissed4, R.string.ogrepissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrepissed5, R.string.ogrepissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogreready1, R.string.ogreready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrewarcry1, R.string.ogrewarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrewhat1, R.string.ogrewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrewhat2, R.string.ogrewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrewhat3, R.string.ogrewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrewhat4, R.string.ogrewhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogreyes1, R.string.ogreyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogreyes2, R.string.ogreyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogreyes3, R.string.ogreyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogreyes4, R.string.ogreyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogreyesattack2, R.string.ogreyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogreyesattack3, R.string.ogreyesattack3))
    }
}