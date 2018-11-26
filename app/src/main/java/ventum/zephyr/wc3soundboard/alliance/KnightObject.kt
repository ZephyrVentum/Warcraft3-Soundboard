package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object KnightObject {

    val drawables = intArrayOf(
        R.drawable.knight,
        R.drawable.knight2
    )

    fun createKnights() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightdeath, R.string.knightdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightpissed1, R.string.knightpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightpissed2, R.string.knightpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightpissed3, R.string.knightpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightpissed4, R.string.knightpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightpissed5, R.string.knightpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightpissed6, R.string.knightpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightready1, R.string.knightready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightwarcry1, R.string.knightwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightwhat1, R.string.knightwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightwhat2, R.string.knightwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightwhat3, R.string.knightwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightwhat4, R.string.knightwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightyes1, R.string.knightyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightyes2, R.string.knightyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightyes3, R.string.knightyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightyes4, R.string.knightyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightyesattack1, R.string.knightyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightyesattack2, R.string.knightyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightyesattack3, R.string.knightyesattack3))
    }
}