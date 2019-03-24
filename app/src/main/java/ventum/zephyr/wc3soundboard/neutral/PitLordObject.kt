package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R

object PitLordObject {

    val drawables = intArrayOf(
        R.drawable.pit_lord,
        R.drawable.pit_lord2
    )

    fun createPitLord() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordpissed1, R.string.hpitlordpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordpissed2, R.string.hpitlordpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordpissed3, R.string.hpitlordpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordpissed4, R.string.hpitlordpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordpissed5, R.string.hpitlordpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordready1, R.string.hpitlordready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordwarcry1, R.string.hpitlordwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordwhat1, R.string.hpitlordwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordwhat2, R.string.hpitlordwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordwhat3, R.string.hpitlordwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordwhat4, R.string.hpitlordwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordwhat5, R.string.hpitlordwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordyes1, R.string.hpitlordyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordyes2, R.string.hpitlordyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordyes3, R.string.hpitlordyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordyes4, R.string.hpitlordyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordyes5, R.string.hpitlordyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordyesattack1, R.string.hpitlordyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordyesattack2, R.string.hpitlordyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.hpitlordyesattack3, R.string.hpitlordyesattack3))
    }
}