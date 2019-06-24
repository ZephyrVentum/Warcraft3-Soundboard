package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object KaelObject {

    private val drawables = intArrayOf(
        R.drawable.kael,
        R.drawable.kael2
    )

    fun createKael() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagepissed1, R.string.bloodelfmagepissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagepissed2, R.string.bloodelfmagepissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagepissed3, R.string.bloodelfmagepissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagepissed4, R.string.bloodelfmagepissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagepissed5, R.string.bloodelfmagepissed5, true))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagepissed6, R.string.bloodelfmagepissed6, true))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmageready1, R.string.bloodelfmageready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagewarcry1, R.string.bloodelfmagewarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagewhat1, R.string.bloodelfmagewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagewhat2, R.string.bloodelfmagewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagewhat3, R.string.bloodelfmagewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagewhat4, R.string.bloodelfmagewhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmagewhat5, R.string.bloodelfmagewhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmageyes1, R.string.bloodelfmageyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmageyes2, R.string.bloodelfmageyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmageyes3, R.string.bloodelfmageyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmageyes4, R.string.bloodelfmageyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmageyes5, R.string.bloodelfmageyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmageyesattack1, R.string.bloodelfmageyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmageyesattack2, R.string.bloodelfmageyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfmageyesattack3, R.string.bloodelfmageyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfsorcerordeath, R.string.bloodelfsorcerordeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelpissed1, R.string.kaelpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelpissed2, R.string.kaelpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelpissed3, R.string.kaelpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelpissed4, R.string.kaelpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelready1, R.string.kaelready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelwarcry1, R.string.kaelwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelwhat1, R.string.kaelwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelwhat2, R.string.kaelwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelwhat3, R.string.kaelwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelwhat4, R.string.kaelwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelwhat5, R.string.kaelwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelyes1, R.string.kaelyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelyes2, R.string.kaelyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelyes3, R.string.kaelyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelyes4, R.string.kaelyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelyes5, R.string.kaelyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelyesattack1, R.string.kaelyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelyesattack2, R.string.kaelyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.kaelyesattack3, R.string.kaelyesattack3))
    }
}