package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object CryptLordObject {

    val drawables = intArrayOf(
        R.drawable.crypt_lord,
        R.drawable.crypt_lord2
    )

    fun createCryptLord() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordpissed1, R.string.nerubiancryptlordpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordpissed2, R.string.nerubiancryptlordpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordpissed3, R.string.nerubiancryptlordpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordpissed4, R.string.nerubiancryptlordpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordpissed5, R.string.nerubiancryptlordpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordpissed6, R.string.nerubiancryptlordpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordready1, R.string.nerubiancryptlordready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordwarcry1, R.string.nerubiancryptlordwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordwhat1, R.string.nerubiancryptlordwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordwhat2, R.string.nerubiancryptlordwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordwhat3, R.string.nerubiancryptlordwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordwhat4, R.string.nerubiancryptlordwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordwhat5, R.string.nerubiancryptlordwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordyes1, R.string.nerubiancryptlordyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordyes2, R.string.nerubiancryptlordyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordyes3, R.string.nerubiancryptlordyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordyes4, R.string.nerubiancryptlordyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordyes5, R.string.nerubiancryptlordyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordyesattack1, R.string.nerubiancryptlordyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordyesattack2, R.string.nerubiancryptlordyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nerubiancryptlordyesattack3, R.string.nerubiancryptlordyesattack3))
    }
}