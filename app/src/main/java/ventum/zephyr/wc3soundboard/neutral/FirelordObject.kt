package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R

object FirelordObject {

    val drawables = intArrayOf(
        R.drawable.firelord,
        R.drawable.firelord2
    )

    fun createFirelord() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000644, R.string.file00000644))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000645, R.string.file00000645))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000646, R.string.file00000646))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000647, R.string.file00000647))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000648, R.string.file00000648))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000649, R.string.file00000649))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000650, R.string.file00000650))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000651, R.string.file00000651))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000652, R.string.file00000652))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000653, R.string.file00000653))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000654, R.string.file00000654))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000655, R.string.file00000655))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000656, R.string.file00000656))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000657, R.string.file00000657))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000658, R.string.file00000658))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000659, R.string.file00000659))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000660, R.string.file00000660))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000661, R.string.file00000661))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000662, R.string.file00000662))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.firelorddeath, R.string.firelorddeath))
    }
}