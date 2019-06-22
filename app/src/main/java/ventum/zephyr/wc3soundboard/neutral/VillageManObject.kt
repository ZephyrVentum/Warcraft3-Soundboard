package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object VillageManObject {

    val drawables = intArrayOf(
        R.drawable.villager,
        R.drawable.villager2
    )

    fun createVillageMan() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagerm1, R.string.villagerm1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagerm2, R.string.villagerm2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagerm3, R.string.villagerm3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.villagermaledeath1, R.string.villagermaledeath1))
    }
}