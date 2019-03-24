package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object MiniSpiritVengeanceObject {

    val drawables = intArrayOf(
        R.drawable.mini_spirit_vengeance,
        R.drawable.mini_spirit_vengeance2
    )

    fun createMiniSpiritVengeance() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.minispiritpissed1, R.string.minispiritpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.minispiritready1, R.string.minispiritready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.minispiritwhat1, R.string.minispiritwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.minispiritwhat2, R.string.minispiritwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.minispiritwhat3, R.string.minispiritwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.minispirityes1, R.string.minispirityes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.minispirityes2, R.string.minispirityes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.minispirityes3, R.string.minispirityes3))
    }
}