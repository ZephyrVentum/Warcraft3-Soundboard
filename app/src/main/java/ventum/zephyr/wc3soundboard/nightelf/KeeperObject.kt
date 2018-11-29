package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object KeeperObject {

    val drawables = intArrayOf(
        R.drawable.keeper,
        R.drawable.keeper2
    )

    fun createKeeper() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovepissed1, R.string.keeperofthegrovepissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovepissed2, R.string.keeperofthegrovepissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovepissed3, R.string.keeperofthegrovepissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovepissed4, R.string.keeperofthegrovepissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovepissed5, R.string.keeperofthegrovepissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovepissed6, R.string.keeperofthegrovepissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegroveready1, R.string.keeperofthegroveready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovewarcry1, R.string.keeperofthegrovewarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovewhat1, R.string.keeperofthegrovewhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovewhat2, R.string.keeperofthegrovewhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovewhat3, R.string.keeperofthegrovewhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovewhat4, R.string.keeperofthegrovewhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegrovewhat5, R.string.keeperofthegrovewhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegroveyes1, R.string.keeperofthegroveyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegroveyes2, R.string.keeperofthegroveyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegroveyes3, R.string.keeperofthegroveyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegroveyes4, R.string.keeperofthegroveyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegroveyes5, R.string.keeperofthegroveyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegroveyesattack1, R.string.keeperofthegroveyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegroveyesattack2, R.string.keeperofthegroveyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.keeperofthegroveyesattack3, R.string.keeperofthegroveyesattack3))
    }
}