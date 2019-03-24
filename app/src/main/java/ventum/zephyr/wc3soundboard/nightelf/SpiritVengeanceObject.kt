package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object SpiritVengeanceObject {

    val drawables = intArrayOf(
        R.drawable.spirit_vengeance,
        R.drawable.spirit_vengeance2
    )

    fun createSpiritVengeance() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spiritofvengeanceready1, R.string.spiritofvengeanceready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spiritofvengeancewhat1, R.string.spiritofvengeancewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spiritofvengeancewhat2, R.string.spiritofvengeancewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spiritofvengeancewhat3, R.string.spiritofvengeancewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spiritofvengeanceyes1, R.string.spiritofvengeanceyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spiritofvengeanceyes2, R.string.spiritofvengeanceyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.spiritofvengeanceyes3, R.string.spiritofvengeanceyes3))
    }
}