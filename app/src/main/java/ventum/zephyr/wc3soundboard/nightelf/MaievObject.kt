package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object MaievObject {

    val drawables = intArrayOf(
        R.drawable.maiev,
        R.drawable.maiev2
    )

    fun createMaiev() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenpissed1, R.string.herowardenpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenpissed2, R.string.herowardenpissed2, true))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenpissed3, R.string.herowardenpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenpissed4, R.string.herowardenpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenpissed5, R.string.herowardenpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenpissed6, R.string.herowardenpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenpissed7, R.string.herowardenpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenpissed8, R.string.herowardenpissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenready1, R.string.herowardenready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenwarcry1, R.string.herowardenwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenwhat1, R.string.herowardenwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenwhat2, R.string.herowardenwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenwhat3, R.string.herowardenwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenwhat4, R.string.herowardenwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenwhat5, R.string.herowardenwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenyes1, R.string.herowardenyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenyes2, R.string.herowardenyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenyes3, R.string.herowardenyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenyes4, R.string.herowardenyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenyes5, R.string.herowardenyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenyesattack1, R.string.herowardenyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenyesattack2, R.string.herowardenyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herowardenyesattack3, R.string.herowardenyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievpissed1, R.string.maievpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievpissed2, R.string.maievpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievpissed3, R.string.maievpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievpissed4, R.string.maievpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievpissed5, R.string.maievpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievready1, R.string.maievready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievwarcry1, R.string.maievwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievwhat1, R.string.maievwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievwhat2, R.string.maievwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievwhat3, R.string.maievwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievwhat4, R.string.maievwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievwhat5, R.string.maievwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievyes1, R.string.maievyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievyes2, R.string.maievyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievyes3, R.string.maievyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievyes4, R.string.maievyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievyes5, R.string.maievyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievyesattack1, R.string.maievyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievyesattack2, R.string.maievyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.maievyesattack3, R.string.maievyesattack3))
    }
}