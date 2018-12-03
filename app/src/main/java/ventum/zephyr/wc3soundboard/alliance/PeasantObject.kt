package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object PeasantObject {

    val drawables = intArrayOf(
        R.drawable.peasant2,
        R.drawable.peasant3,
        R.drawable.peasant4,
        R.drawable.peasant5
    )

    fun createPeasants() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantbuildingcomplete1, R.string.peasantbuildingcomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantcannotbuildthere1, R.string.peasantcannotbuildthere1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantdeath, R.string.peasantdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantpissed1, R.string.peasantpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantpissed2, R.string.peasantpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantpissed3, R.string.peasantpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantpissed4, R.string.peasantpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantpissed5, R.string.peasantpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantready1, R.string.peasantready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantwarcry1, R.string.peasantwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantwhat1, R.string.peasantwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantwhat2, R.string.peasantwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantwhat3, R.string.peasantwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantwhat4, R.string.peasantwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantyes1, R.string.peasantyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantyes3, R.string.peasantyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantyes4, R.string.peasantyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantyesattack1, R.string.peasantyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantyesattack2, R.string.peasantyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantyesattack3, R.string.peasantyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.peasantyesattack4, R.string.peasantyesattack4))
    }
}