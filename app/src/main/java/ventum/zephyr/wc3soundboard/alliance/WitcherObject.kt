package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object WitcherObject {

    private val drawables = intArrayOf(
        R.drawable.witcher,
        R.drawable.witcher2
    )

    fun createWitcher() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfspellthiefdeath1, R.string.bloodelfspellthiefdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerpissed1, R.string.spellbreakerpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerpissed2, R.string.spellbreakerpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerpissed3, R.string.spellbreakerpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerpissed4, R.string.spellbreakerpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerpissed5, R.string.spellbreakerpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerready1, R.string.spellbreakerready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerwarcry1, R.string.spellbreakerwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerwhat1, R.string.spellbreakerwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerwhat2, R.string.spellbreakerwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerwhat3, R.string.spellbreakerwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakerwhat4, R.string.spellbreakerwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakeryes1, R.string.spellbreakeryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakeryes2, R.string.spellbreakeryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakeryes3, R.string.spellbreakeryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakeryes4, R.string.spellbreakeryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakeryes5, R.string.spellbreakeryes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakeryesattack1, R.string.spellbreakeryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakeryesattack2, R.string.spellbreakeryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spellbreakeryesattack3, R.string.spellbreakeryesattack3))
    }
}