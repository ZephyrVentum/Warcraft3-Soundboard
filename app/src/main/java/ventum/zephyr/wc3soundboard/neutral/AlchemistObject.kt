package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R

object AlchemistObject {

    val drawables = intArrayOf(
        R.drawable.alchemist,
        R.drawable.alchemist2
    )

    fun createAlchemist() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000356, R.string.file00000356))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000357, R.string.file00000357))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000663, R.string.file00000663))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000664, R.string.file00000664))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000665, R.string.file00000665))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000666, R.string.file00000666))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000667, R.string.file00000667))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000668, R.string.file00000668))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000669, R.string.file00000669))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000670, R.string.file00000670))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000671, R.string.file00000671))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000672, R.string.file00000672))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000673, R.string.file00000673))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000674, R.string.file00000674))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000675, R.string.file00000675))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000676, R.string.file00000676))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000677, R.string.file00000677))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000678, R.string.file00000678))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000679, R.string.file00000679))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000680, R.string.file00000680))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000681, R.string.file00000681))
    }
}