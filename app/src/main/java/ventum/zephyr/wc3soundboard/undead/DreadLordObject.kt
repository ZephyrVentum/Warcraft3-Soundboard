package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object DreadLordObject {

    val drawables = intArrayOf(
        R.drawable.dreadlord,
        R.drawable.dreadlord2,
        R.drawable.dreadlord3
    )

    fun createDreadLord() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlorddeath, R.string.herodreadlorddeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordpissed1, R.string.herodreadlordpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordpissed2, R.string.herodreadlordpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordpissed3, R.string.herodreadlordpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordpissed4, R.string.herodreadlordpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordpissed5, R.string.herodreadlordpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordpissed6, R.string.herodreadlordpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordpissed7, R.string.herodreadlordpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordready1, R.string.herodreadlordready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordwarcry1, R.string.herodreadlordwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordwhat1, R.string.herodreadlordwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordwhat2, R.string.herodreadlordwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordwhat3, R.string.herodreadlordwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordwhat4, R.string.herodreadlordwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordyes1, R.string.herodreadlordyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordyes2, R.string.herodreadlordyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordyes3, R.string.herodreadlordyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordyes4, R.string.herodreadlordyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordyesattack1, R.string.herodreadlordyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordyesattack2, R.string.herodreadlordyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodreadlordyesattack3, R.string.herodreadlordyesattack3))
    }
}