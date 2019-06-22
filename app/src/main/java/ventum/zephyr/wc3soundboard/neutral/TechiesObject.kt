package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object TechiesObject {

    val drawables = intArrayOf(
        R.drawable.techies,
        R.drawable.techies2
    )

    fun createTechies() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000362, R.string.file00000362))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000364, R.string.file00000364))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000682, R.string.file00000682))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000683, R.string.file00000683))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000684, R.string.file00000684))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000685, R.string.file00000685))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000686, R.string.file00000686))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000687, R.string.file00000687))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000688, R.string.file00000688))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000689, R.string.file00000689))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000690, R.string.file00000690))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000691, R.string.file00000691))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000692, R.string.file00000692))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000693, R.string.file00000693))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000694, R.string.file00000694))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000695, R.string.file00000695))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000696, R.string.file00000696))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000697, R.string.file00000697))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000698, R.string.file00000698))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000699, R.string.file00000699))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000700, R.string.file00000700))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000701, R.string.file00000701))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000702, R.string.file00000702))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.file00000703, R.string.file00000703))
    }
}