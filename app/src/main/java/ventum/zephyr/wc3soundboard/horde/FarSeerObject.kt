package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object FarSeerObject {

    val drawables = intArrayOf(
        R.drawable.farseer,
        R.drawable.farseer2
    )

    fun createFarSeer() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerdeath1, R.string.herofarseerdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerpissed1, R.string.herofarseerpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerpissed2, R.string.herofarseerpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerpissed3, R.string.herofarseerpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerpissed4, R.string.herofarseerpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerpissed5, R.string.herofarseerpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerready1, R.string.herofarseerready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerwarcry1, R.string.herofarseerwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerwhat1, R.string.herofarseerwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerwhat2, R.string.herofarseerwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerwhat3, R.string.herofarseerwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseerwhat4, R.string.herofarseerwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseeryes1, R.string.herofarseeryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseeryes2, R.string.herofarseeryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseeryes3, R.string.herofarseeryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseeryes4, R.string.herofarseeryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseeryesattack1, R.string.herofarseeryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseeryesattack2, R.string.herofarseeryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herofarseeryesattack3, R.string.herofarseeryesattack3))
    }
}