package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object BanditObject {

    val drawables = intArrayOf(
        R.drawable.bandit,
        R.drawable.bandit2
    )

    fun createBandit() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditdeath1, R.string.banditdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditpissed1, R.string.banditpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditpissed2, R.string.banditpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditpissed3, R.string.banditpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditpissed4, R.string.banditpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditpissed5, R.string.banditpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditwarcry1, R.string.banditwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditwhat1, R.string.banditwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditwhat2, R.string.banditwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.banditwhat3, R.string.banditwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bandityes1, R.string.bandityes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bandityes2, R.string.bandityes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bandityes3, R.string.bandityes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bandityesattack1, R.string.bandityesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bandityesattack2, R.string.bandityesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bandityesattack3, R.string.bandityesattack3))
    }
}