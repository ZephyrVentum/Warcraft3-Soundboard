package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object MortarObject {

    val drawables = intArrayOf(
        R.drawable.mortar,
        R.drawable.mortar2,
        R.drawable.mortar3
    )

    fun createMortar() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarimpact, R.string.mortarimpact))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamattack1, R.string.mortarteamattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamdeath, R.string.mortarteamdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteampissed1, R.string.mortarteampissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteampissed2, R.string.mortarteampissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteampissed3, R.string.mortarteampissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteampissed4, R.string.mortarteampissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteampissed5, R.string.mortarteampissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteampissed6, R.string.mortarteampissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteampissed7, R.string.mortarteampissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteampissed8, R.string.mortarteampissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteampissed9, R.string.mortarteampissed9))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamready1, R.string.mortarteamready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamwarcry1, R.string.mortarteamwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamwhat1, R.string.mortarteamwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamwhat2, R.string.mortarteamwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamwhat3, R.string.mortarteamwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamwhat4, R.string.mortarteamwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyes1, R.string.mortarteamyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyes2, R.string.mortarteamyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyes3, R.string.mortarteamyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyes4, R.string.mortarteamyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyes5, R.string.mortarteamyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyes6, R.string.mortarteamyes6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyesattack1, R.string.mortarteamyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyesattack2, R.string.mortarteamyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyesattack3, R.string.mortarteamyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyesattack4, R.string.mortarteamyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.mortarteamyesattack5, R.string.mortarteamyesattack5))
    }
}