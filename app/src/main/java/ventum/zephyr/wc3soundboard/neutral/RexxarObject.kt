package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object RexxarObject {

    val drawables = intArrayOf(
        R.drawable.rexxar,
        R.drawable.rexxar2
    )

    fun createRexxar() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.beastmasterdeath1, R.string.beastmasterdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterpissed1, R.string.ogrebeastmasterpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterpissed2, R.string.ogrebeastmasterpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterpissed3, R.string.ogrebeastmasterpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterpissed4, R.string.ogrebeastmasterpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterpissed5, R.string.ogrebeastmasterpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterpissed6, R.string.ogrebeastmasterpissed6, true))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterready1, R.string.ogrebeastmasterready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterwarcry1, R.string.ogrebeastmasterwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterwhat1, R.string.ogrebeastmasterwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterwhat2, R.string.ogrebeastmasterwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterwhat3, R.string.ogrebeastmasterwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterwhat4, R.string.ogrebeastmasterwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasterwhat5, R.string.ogrebeastmasterwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasteryes1, R.string.ogrebeastmasteryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasteryes2, R.string.ogrebeastmasteryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasteryes3, R.string.ogrebeastmasteryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasteryes4, R.string.ogrebeastmasteryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasteryes5, R.string.ogrebeastmasteryes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasteryesattack1, R.string.ogrebeastmasteryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasteryesattack2, R.string.ogrebeastmasteryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ogrebeastmasteryesattack3, R.string.ogrebeastmasteryesattack3))
    }
}