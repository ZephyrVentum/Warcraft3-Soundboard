package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object TyrandeObject {

    val drawables = intArrayOf(
        R.drawable.tyrande,
        R.drawable.tyrande2
    )

    fun createTyrande() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandepissed1, R.string.tyrandepissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandepissed2, R.string.tyrandepissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandepissed3, R.string.tyrandepissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandepissed4, R.string.tyrandepissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandepissed5, R.string.tyrandepissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandewarcry1, R.string.tyrandewarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandewhat1, R.string.tyrandewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandewhat2, R.string.tyrandewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandewhat3, R.string.tyrandewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandewhat4, R.string.tyrandewhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandeyes1, R.string.tyrandeyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandeyes2, R.string.tyrandeyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandeyes3, R.string.tyrandeyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandeyes4, R.string.tyrandeyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandeyesattack1, R.string.tyrandeyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandeyesattack2, R.string.tyrandeyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandeyesattack3, R.string.tyrandeyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.tyrandeyesattack4, R.string.tyrandeyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestessdeath1, R.string.heromoonpriestessdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesspissed1, R.string.heromoonpriestesspissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesspissed2, R.string.heromoonpriestesspissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesspissed3, R.string.heromoonpriestesspissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesspissed4, R.string.heromoonpriestesspissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesspissed5, R.string.heromoonpriestesspissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesspissed6, R.string.heromoonpriestesspissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestessready1, R.string.heromoonpriestessready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesswarcry1, R.string.heromoonpriestesswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesswhat1, R.string.heromoonpriestesswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesswhat2, R.string.heromoonpriestesswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesswhat3, R.string.heromoonpriestesswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestesswhat4, R.string.heromoonpriestesswhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestessyes1, R.string.heromoonpriestessyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestessyes2, R.string.heromoonpriestessyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestessyes3, R.string.heromoonpriestessyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestessyes4, R.string.heromoonpriestessyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestessyesattack1, R.string.heromoonpriestessyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestessyesattack2, R.string.heromoonpriestessyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heromoonpriestessyesattack3, R.string.heromoonpriestessyesattack3))
    }
}