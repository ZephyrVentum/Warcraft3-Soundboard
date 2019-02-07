package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R

object TaurenHeroObject {

    val drawables = intArrayOf(
        R.drawable.tauren,
        R.drawable.tauren2,
        R.drawable.tauren3
    )

    fun createTaurenHero() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftaindeath, R.string.herotaurenchieftaindeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainpissed1, R.string.herotaurenchieftainpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainpissed2, R.string.herotaurenchieftainpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainpissed3, R.string.herotaurenchieftainpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainpissed4, R.string.herotaurenchieftainpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainpissed5, R.string.herotaurenchieftainpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainpissed6, R.string.herotaurenchieftainpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainready1, R.string.herotaurenchieftainready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainwarcry1, R.string.herotaurenchieftainwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainwhat1, R.string.herotaurenchieftainwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainwhat2, R.string.herotaurenchieftainwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainwhat3, R.string.herotaurenchieftainwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainwhat4, R.string.herotaurenchieftainwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainyes1, R.string.herotaurenchieftainyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainyes2, R.string.herotaurenchieftainyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainyes3, R.string.herotaurenchieftainyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainyes4, R.string.herotaurenchieftainyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainyesattack1, R.string.herotaurenchieftainyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainyesattack2, R.string.herotaurenchieftainyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herotaurenchieftainyesattack3, R.string.herotaurenchieftainyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnepissed1, R.string.cairnepissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnepissed2, R.string.cairnepissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnepissed3, R.string.cairnepissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnepissed4, R.string.cairnepissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnepissed5, R.string.cairnepissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnewarcry1, R.string.cairnewarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnewhat1, R.string.cairnewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnewhat2, R.string.cairnewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnewhat3, R.string.cairnewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairnewhat4, R.string.cairnewhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairneyes1, R.string.cairneyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairneyes2, R.string.cairneyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairneyes3, R.string.cairneyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairneyes4, R.string.cairneyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairneyesattack1, R.string.cairneyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairneyesattack2, R.string.cairneyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairneyesattack3, R.string.cairneyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.cairneyesattack4, R.string.cairneyesattack4))
    }
}