package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object CentaurObject {

    val drawables = intArrayOf(
        R.drawable.centaur,
        R.drawable.centaur2
    )

    fun createCentaur() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcherdeath, R.string.centaurarcherdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcherpissed1, R.string.centaurarcherpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcherpissed2, R.string.centaurarcherpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcherready1, R.string.centaurarcherready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcherwhat1, R.string.centaurarcherwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcherwhat2, R.string.centaurarcherwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcherwhat3, R.string.centaurarcherwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcheryes1, R.string.centaurarcheryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcheryes2, R.string.centaurarcheryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcheryes3, R.string.centaurarcheryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcheryesattack1, R.string.centaurarcheryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcheryesattack2, R.string.centaurarcheryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurarcheryesattack3, R.string.centaurarcheryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.centaurdeath, R.string.centaurdeath))
    }
}