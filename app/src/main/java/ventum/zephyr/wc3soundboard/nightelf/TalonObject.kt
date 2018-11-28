package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object TalonObject {

    val drawables = intArrayOf(
        R.drawable.talon,
        R.drawable.talon2,
        R.drawable.talon3
    )

    fun createTalon() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalondeath1, R.string.druidofthetalondeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalondeathalternate1, R.string.druidofthetalondeathalternate1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonmorph1, R.string.druidofthetalonmorph1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonmorphalternate1, R.string.druidofthetalonmorphalternate1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonmorphedwarcry1, R.string.druidofthetalonmorphedwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonmorphedwhat1, R.string.druidofthetalonmorphedwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonmorphedwhat2, R.string.druidofthetalonmorphedwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonmorphedyes1, R.string.druidofthetalonmorphedyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonmorphedyes2, R.string.druidofthetalonmorphedyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonmorphedyes3, R.string.druidofthetalonmorphedyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonpissed1, R.string.druidofthetalonpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonpissed2, R.string.druidofthetalonpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonpissed3, R.string.druidofthetalonpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonpissed4, R.string.druidofthetalonpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonpissed5, R.string.druidofthetalonpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonpissed6, R.string.druidofthetalonpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonpissed7, R.string.druidofthetalonpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonready1, R.string.druidofthetalonready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonwarcry1, R.string.druidofthetalonwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonwhat1, R.string.druidofthetalonwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonwhat2, R.string.druidofthetalonwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonwhat3, R.string.druidofthetalonwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonwhat4, R.string.druidofthetalonwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonyes1, R.string.druidofthetalonyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonyes2, R.string.druidofthetalonyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonyes3, R.string.druidofthetalonyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonyes4, R.string.druidofthetalonyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonyesattack1, R.string.druidofthetalonyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonyesattack2, R.string.druidofthetalonyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidofthetalonyesattack3, R.string.druidofthetalonyesattack3))
    }
}