package ventum.zephyr.wc3soundboard.naga

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object MyrmadonObject {

    val drawables = intArrayOf(
        R.drawable.myrmidon,
        R.drawable.myrmidon2
    )

    fun createMyrmadon() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonpissed1, R.string.nagamyrmadonpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonpissed2, R.string.nagamyrmadonpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonpissed3, R.string.nagamyrmadonpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonpissed4, R.string.nagamyrmadonpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonpissed5, R.string.nagamyrmadonpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonpissed6, R.string.nagamyrmadonpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonpissed7, R.string.nagamyrmadonpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonready1, R.string.nagamyrmadonready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonwarcry1, R.string.nagamyrmadonwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonwhat1, R.string.nagamyrmadonwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonwhat2, R.string.nagamyrmadonwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonwhat3, R.string.nagamyrmadonwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonwhat4, R.string.nagamyrmadonwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonwhat5, R.string.nagamyrmadonwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonyes1, R.string.nagamyrmadonyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonyes2, R.string.nagamyrmadonyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonyes3, R.string.nagamyrmadonyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonyes4, R.string.nagamyrmadonyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonyesattack1, R.string.nagamyrmadonyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonyesattack2, R.string.nagamyrmadonyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagamyrmadonyesattack3, R.string.nagamyrmadonyesattack3))
    }
}