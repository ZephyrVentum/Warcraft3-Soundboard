package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ArchmageObject {

    private val drawables = intArrayOf(
        R.drawable.archmage,
        R.drawable.archmage2
    )

    fun createArchmage() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagedeath, R.string.heroarchmagedeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagepissed1, R.string.heroarchmagepissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagepissed2, R.string.heroarchmagepissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagepissed3, R.string.heroarchmagepissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagepissed4, R.string.heroarchmagepissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmageready1, R.string.heroarchmageready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagewarcry1, R.string.heroarchmagewarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagewhat1, R.string.heroarchmagewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagewhat2, R.string.heroarchmagewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagewhat3, R.string.heroarchmagewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmagewhat4, R.string.heroarchmagewhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmageyes1, R.string.heroarchmageyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmageyes2, R.string.heroarchmageyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmageyes3, R.string.heroarchmageyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmageyes4, R.string.heroarchmageyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmageyesattack1, R.string.heroarchmageyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmageyesattack2, R.string.heroarchmageyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroarchmageyesattack3, R.string.heroarchmageyesattack3))
    }
}