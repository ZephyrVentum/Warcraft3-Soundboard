package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object KidObject {

    val drawables = intArrayOf(
        R.drawable.kid
    )

    fun createKid() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagerchilddeath1, R.string.villagerchilddeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagercwhat1, R.string.villagercwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagercwhat2, R.string.villagercwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagercwhat3, R.string.villagercwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagercwhat4, R.string.villagercwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagercwhat5, R.string.villagercwhat5))
    }
}