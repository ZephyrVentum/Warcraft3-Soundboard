package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object GnollObject {

    val drawables = intArrayOf(
        R.drawable.gnoll,
        R.drawable.gnoll2,
        R.drawable.gnoll3
    )

    fun createGnoll() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnolldeath, R.string.gnolldeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollpissed1, R.string.gnollpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollpissed2, R.string.gnollpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollpissed3, R.string.gnollpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollpissed4, R.string.gnollpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollready1, R.string.gnollready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollwhat1, R.string.gnollwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollwhat2, R.string.gnollwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollwhat3, R.string.gnollwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollyes1, R.string.gnollyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollyes2, R.string.gnollyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollyes3, R.string.gnollyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollyesattack1, R.string.gnollyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollyesattack2, R.string.gnollyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gnollyesattack3, R.string.gnollyesattack3))
    }
}