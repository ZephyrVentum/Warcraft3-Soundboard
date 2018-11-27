package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object BlademasterObject {

    val drawables = intArrayOf(
        R.drawable.blademaster,
        R.drawable.blademaster
    )

    fun createBlademaster() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterdeath, R.string.heroblademasterdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterpissed1, R.string.heroblademasterpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterpissed2, R.string.heroblademasterpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterpissed3, R.string.heroblademasterpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterpissed4, R.string.heroblademasterpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterready1, R.string.heroblademasterready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterwarcry1, R.string.heroblademasterwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterwhat1, R.string.heroblademasterwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterwhat2, R.string.heroblademasterwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterwhat3, R.string.heroblademasterwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasterwhat4, R.string.heroblademasterwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasteryes1, R.string.heroblademasteryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasteryes2, R.string.heroblademasteryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasteryes3, R.string.heroblademasteryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasteryes4, R.string.heroblademasteryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasteryesattack1, R.string.heroblademasteryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasteryesattack2, R.string.heroblademasteryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroblademasteryesattack3, R.string.heroblademasteryesattack3))
    }
}