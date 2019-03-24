package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object AkamaObject {

    val drawables = intArrayOf(
        R.drawable.akama,
        R.drawable.akama2
    )

    fun createAkama() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamapissed1, R.string.akamapissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamapissed2, R.string.akamapissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamapissed3, R.string.akamapissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamapissed4, R.string.akamapissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamapissed5, R.string.akamapissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamapissed6, R.string.akamapissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamapissed7, R.string.akamapissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamapissed8, R.string.akamapissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamapissed9, R.string.akamapissed9))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamaready1, R.string.akamaready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamawarcry1, R.string.akamawarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamawhat1, R.string.akamawhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamawhat2, R.string.akamawhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamawhat3, R.string.akamawhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamawhat4, R.string.akamawhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamawhat5, R.string.akamawhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamayes1, R.string.akamayes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamayes2, R.string.akamayes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamayes3, R.string.akamayes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamayes4, R.string.akamayes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamayes5, R.string.akamayes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamayesattack1, R.string.akamayesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamayesattack2, R.string.akamayesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.akamayesattack3, R.string.akamayesattack3))
        add(SoundItem(R.drawable.dranai, R.raw.draeneideath1, R.string.draeneideath1))
        add(SoundItem(R.drawable.dranai, R.raw.draeneipissed1, R.string.draeneipissed1))
        add(SoundItem(R.drawable.dranai, R.raw.draeneipissed2, R.string.draeneipissed2))
        add(SoundItem(R.drawable.dranai, R.raw.draeneipissed3, R.string.draeneipissed3))
        add(SoundItem(R.drawable.dranai, R.raw.draeneipissed4, R.string.draeneipissed4))
        add(SoundItem(R.drawable.dranai, R.raw.draeneipissed5, R.string.draeneipissed5))
        add(SoundItem(R.drawable.dranai, R.raw.draeneipissed6, R.string.draeneipissed6))
        add(SoundItem(R.drawable.dranai, R.raw.draeneipissed7, R.string.draeneipissed7))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiready1, R.string.draeneiready1))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiwarcry1, R.string.draeneiwarcry1))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiwhat1, R.string.draeneiwhat1))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiwhat2, R.string.draeneiwhat2))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiwhat3, R.string.draeneiwhat3))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiwhat4, R.string.draeneiwhat4))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiwhat5, R.string.draeneiwhat5))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiyes1, R.string.draeneiyes1))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiyes2, R.string.draeneiyes2))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiyes3, R.string.draeneiyes3))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiyes4, R.string.draeneiyes4))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiyes5, R.string.draeneiyes5))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiyesattack1, R.string.draeneiyesattack1))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiyesattack2, R.string.draeneiyesattack2))
        add(SoundItem(R.drawable.dranai, R.raw.draeneiyesattack3, R.string.draeneiyesattack3))
    }
}