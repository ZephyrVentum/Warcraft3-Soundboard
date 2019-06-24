package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object HawkObject {

    private val drawables = intArrayOf(
        R.drawable.dragonhawk,
        R.drawable.dragonhawk2
    )

    fun createHawk() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentmissile, R.string.windserpentmissile))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentpissed1, R.string.windserpentpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentpissed2, R.string.windserpentpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentpissed3, R.string.windserpentpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentpissed4, R.string.windserpentpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentpissed5, R.string.windserpentpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentready1, R.string.windserpentready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentwarcry1, R.string.windserpentwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentwhat1, R.string.windserpentwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentwhat2, R.string.windserpentwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentwhat3, R.string.windserpentwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentyes1, R.string.windserpentyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentyes2, R.string.windserpentyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentyes3, R.string.windserpentyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentyesattack1, R.string.windserpentyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentyesattack2, R.string.windserpentyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.windserpentyesattack3, R.string.windserpentyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkpissed1, R.string.dragonhawkpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkpissed2, R.string.dragonhawkpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkpissed3, R.string.dragonhawkpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkpissed4, R.string.dragonhawkpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkpissed5, R.string.dragonhawkpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkpissed6, R.string.dragonhawkpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkpissed7, R.string.dragonhawkpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkpissed8, R.string.dragonhawkpissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkready1, R.string.dragonhawkready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkwarcry1, R.string.dragonhawkwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkwhat1, R.string.dragonhawkwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkwhat2, R.string.dragonhawkwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkwhat3, R.string.dragonhawkwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkwhat4, R.string.dragonhawkwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkwhat5, R.string.dragonhawkwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkyes1, R.string.dragonhawkyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkyes2, R.string.dragonhawkyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkyes3, R.string.dragonhawkyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkyes4, R.string.dragonhawkyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkyesattack1, R.string.dragonhawkyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkyesattack2, R.string.dragonhawkyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkyesattack3, R.string.dragonhawkyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkyesattack4, R.string.dragonhawkyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.dragonhawkyesattack5, R.string.dragonhawkyesattack5))
    }
}