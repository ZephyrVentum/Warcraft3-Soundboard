package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object SorceressObject {

    val drawables = intArrayOf(
        R.drawable.sorceress,
        R.drawable.sorceress2,
        R.drawable.sorceress3
    )

    fun createSorceress() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceressdeath, R.string.sorceressdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresspissed1, R.string.sorceresspissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresspissed2, R.string.sorceresspissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresspissed3, R.string.sorceresspissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresspissed4, R.string.sorceresspissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresspissed5, R.string.sorceresspissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresspissed6, R.string.sorceresspissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceressready1, R.string.sorceressready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresswarcry1, R.string.sorceresswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresswhat1, R.string.sorceresswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresswhat2, R.string.sorceresswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresswhat3, R.string.sorceresswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresswhat4, R.string.sorceresswhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceresswhat5, R.string.sorceresswhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceressyes1, R.string.sorceressyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceressyes2, R.string.sorceressyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceressyes3, R.string.sorceressyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceressyes4, R.string.sorceressyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceressyesattack1, R.string.sorceressyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceressyesattack2, R.string.sorceressyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sorceressyesattack3, R.string.sorceressyesattack3))
    }
}