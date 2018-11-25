package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object FootmanObject {

    val footmans = intArrayOf(
        R.drawable.footman,
        R.drawable.footman2,
        R.drawable.footman3,
        R.drawable.footman4
    )

    fun createFootmans() = SoundItems().apply {
        add(SoundItem(getRandomFrom(footmans), R.raw.footmandeath, R.string.footmandeath))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanpissed1, R.string.footmanpissed1))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanpissed2, R.string.footmanpissed2))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanpissed3, R.string.footmanpissed3))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanpissed4, R.string.footmanpissed4))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanready1, R.string.footmanready1))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanwarcry1, R.string.footmanwarcry1))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanwhat1, R.string.footmanwhat1))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanwhat2, R.string.footmanwhat2))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanwhat3, R.string.footmanwhat3))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanwhat4, R.string.footmanwhat4))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanyes1, R.string.footmanyes1))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanyes2, R.string.footmanyes2))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanyes3, R.string.footmanyes3))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanyes4, R.string.footmanyes4))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanyesattack1, R.string.footmanyesattack1))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanyesattack2, R.string.footmanyesattack2))
        add(SoundItem(getRandomFrom(footmans), R.raw.footmanyesattack3, R.string.footmanyesattack3))
    }
}