package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object HeadHunterObject {

    val drawables = intArrayOf(
        R.drawable.headhunter,
        R.drawable.headhunter2,
        R.drawable.headhunter3,
        R.drawable.headhunter4
    )

    fun createHeadHunter() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.berzerkercaster, R.string.berzerkercaster))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterdeath, R.string.headhunterdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterpissed1, R.string.headhunterpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterpissed2, R.string.headhunterpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterpissed3, R.string.headhunterpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterpissed4, R.string.headhunterpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterpissed5, R.string.headhunterpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterready1, R.string.headhunterready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterwarcry1, R.string.headhunterwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterwhat1, R.string.headhunterwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterwhat2, R.string.headhunterwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterwhat3, R.string.headhunterwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunterwhat4, R.string.headhunterwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunteryes1, R.string.headhunteryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunteryes2, R.string.headhunteryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunteryes3, R.string.headhunteryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunteryes4, R.string.headhunteryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunteryesattack1, R.string.headhunteryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunteryesattack2, R.string.headhunteryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.headhunteryesattack3, R.string.headhunteryesattack3))
    }
}