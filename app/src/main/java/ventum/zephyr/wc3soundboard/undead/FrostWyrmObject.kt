package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object FrostWyrmObject {

    val drawables = intArrayOf(
        R.drawable.wyrm,
        R.drawable.wyrm2
    )

    fun createFrostWyrm() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmattack1, R.string.frostwyrmattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmpissed1, R.string.frostwyrmpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmpissed2, R.string.frostwyrmpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmpissed3, R.string.frostwyrmpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmpissed4, R.string.frostwyrmpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmpissed5, R.string.frostwyrmpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmready1, R.string.frostwyrmready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmwarcry1, R.string.frostwyrmwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmwhat1, R.string.frostwyrmwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmwhat2, R.string.frostwyrmwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmwhat3, R.string.frostwyrmwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmyes1, R.string.frostwyrmyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmyes2, R.string.frostwyrmyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmyes3, R.string.frostwyrmyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmyesattack1, R.string.frostwyrmyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmyesattack2, R.string.frostwyrmyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.frostwyrmyesattack3, R.string.frostwyrmyesattack3))
    }
}