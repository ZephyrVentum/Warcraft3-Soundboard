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
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentmissile, R.string.windserpentmissile))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentpissed1, R.string.windserpentpissed1))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentpissed2, R.string.windserpentpissed2))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentpissed3, R.string.windserpentpissed3))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentpissed4, R.string.windserpentpissed4))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentpissed5, R.string.windserpentpissed5))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentready1, R.string.windserpentready1))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentwarcry1, R.string.windserpentwarcry1))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentwhat1, R.string.windserpentwhat1))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentwhat2, R.string.windserpentwhat2))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentwhat3, R.string.windserpentwhat3))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentyes1, R.string.windserpentyes1))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentyes2, R.string.windserpentyes2))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentyes3, R.string.windserpentyes3))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentyesattack1, R.string.windserpentyesattack1))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentyesattack2, R.string.windserpentyesattack2))
        add(SoundItem(getRandomFrom(drawables), R.raw.windserpentyesattack3, R.string.windserpentyesattack3))
    }
}