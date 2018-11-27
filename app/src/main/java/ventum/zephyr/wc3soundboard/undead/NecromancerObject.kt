package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object NecromancerObject {

    val drawables = intArrayOf(
        R.drawable.necromancer,
        R.drawable.necromancer2
    )

    fun createNecromancer() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerdeath, R.string.necromancerdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerpissed1, R.string.necromancerpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerpissed2, R.string.necromancerpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerpissed3, R.string.necromancerpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerpissed4, R.string.necromancerpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerpissed5, R.string.necromancerpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerready1, R.string.necromancerready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerwarcry1, R.string.necromancerwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerwhat1, R.string.necromancerwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerwhat2, R.string.necromancerwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerwhat3, R.string.necromancerwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerwhat4, R.string.necromancerwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromanceryes1, R.string.necromanceryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromanceryes2, R.string.necromanceryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromanceryes3, R.string.necromanceryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromanceryes4, R.string.necromanceryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromanceryesattack1, R.string.necromanceryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromanceryesattack2, R.string.necromanceryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromanceryesattack3, R.string.necromanceryesattack3))
    }
}