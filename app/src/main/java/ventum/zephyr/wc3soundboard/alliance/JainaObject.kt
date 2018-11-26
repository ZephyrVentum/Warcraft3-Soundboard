package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object JainaObject {

    private val drawables = intArrayOf(
        R.drawable.jaina,
        R.drawable.jaina2
    )

    fun createJaina() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainaonfootdeath1, R.string.jainaonfootdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainapissed1, R.string.jainapissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainapissed2, R.string.jainapissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainapissed3, R.string.jainapissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainapissed4, R.string.jainapissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainapissed5, R.string.jainapissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainawarcry1, R.string.jainawarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainawhat1, R.string.jainawhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainawhat2, R.string.jainawhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainawhat3, R.string.jainawhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainawhat4, R.string.jainawhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainayes1, R.string.jainayes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainayes2, R.string.jainayes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainayes3, R.string.jainayes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainayes4, R.string.jainayes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainayesattack1, R.string.jainayesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.jainayesattack2, R.string.jainayesattack2))
    }
}