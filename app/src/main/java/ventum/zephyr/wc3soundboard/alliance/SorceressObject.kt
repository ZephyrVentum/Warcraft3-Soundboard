package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object SorceressObject {

    val sorceress = intArrayOf(
        R.drawable.sorceress,
        R.drawable.sorceress2,
        R.drawable.sorceress3
    )

    fun createSorceress() = SoundItems().apply {
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceressdeath, R.string.sorceressdeath))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresspissed1, R.string.sorceresspissed1))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresspissed2, R.string.sorceresspissed2))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresspissed3, R.string.sorceresspissed3))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresspissed4, R.string.sorceresspissed4))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresspissed5, R.string.sorceresspissed5))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresspissed6, R.string.sorceresspissed6))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceressready1, R.string.sorceressready1))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresswarcry1, R.string.sorceresswarcry1))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresswhat1, R.string.sorceresswhat1))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresswhat2, R.string.sorceresswhat2))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresswhat3, R.string.sorceresswhat3))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresswhat4, R.string.sorceresswhat4))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceresswhat5, R.string.sorceresswhat5))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceressyes1, R.string.sorceressyes1))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceressyes2, R.string.sorceressyes2))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceressyes3, R.string.sorceressyes3))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceressyes4, R.string.sorceressyes4))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceressyesattack1, R.string.sorceressyesattack1))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceressyesattack2, R.string.sorceressyesattack2))
        add(SoundItem(getRandomFrom(sorceress), R.raw.sorceressyesattack3, R.string.sorceressyesattack3))
    }
}