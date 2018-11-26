package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object GryphonObject {

    private val drawables = intArrayOf(
        R.drawable.gryphon,
        R.drawable.gryphon2,
        R.drawable.gryphon3
    )

    fun createGryphon() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderdeath1, R.string.gryphonriderdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderpissed1, R.string.gryphonriderpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderpissed2, R.string.gryphonriderpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderpissed3, R.string.gryphonriderpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderpissed4, R.string.gryphonriderpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderpissed5, R.string.gryphonriderpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderready1, R.string.gryphonriderready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderwarcry1, R.string.gryphonriderwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderwhat1, R.string.gryphonriderwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderwhat2, R.string.gryphonriderwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderwhat3, R.string.gryphonriderwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderwhat4, R.string.gryphonriderwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonriderwhat5, R.string.gryphonriderwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonrideryes1, R.string.gryphonrideryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonrideryes2, R.string.gryphonrideryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonrideryes3, R.string.gryphonrideryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonrideryes4, R.string.gryphonrideryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonrideryes5, R.string.gryphonrideryes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonrideryesattack1, R.string.gryphonrideryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonrideryesattack2, R.string.gryphonrideryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gryphonrideryesattack3, R.string.gryphonrideryesattack3))
    }
}