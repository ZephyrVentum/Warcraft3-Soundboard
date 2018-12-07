package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object GhoulObject {

    val drawables = intArrayOf(
        R.drawable.ghoul,
        R.drawable.ghoul2
    )

    fun createGhoul() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghouldeath, R.string.ghouldeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulpissed1, R.string.ghoulpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulpissed2, R.string.ghoulpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulpissed3, R.string.ghoulpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulpissed4, R.string.ghoulpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulready1, R.string.ghoulready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulwarcry1, R.string.ghoulwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulwhat1, R.string.ghoulwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulwhat2, R.string.ghoulwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulwhat3, R.string.ghoulwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulwhat4, R.string.ghoulwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulyes1, R.string.ghoulyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulyes2, R.string.ghoulyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulyes3, R.string.ghoulyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulyesattack1, R.string.ghoulyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulyesattack2, R.string.ghoulyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.ghoulyesattack3, R.string.ghoulyesattack3))
    }
}