package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object PeasantObject {

    val peasants = intArrayOf(
        R.drawable.peasant2,
        R.drawable.peasant3,
        R.drawable.peasant4,
        R.drawable.peasant5
    )

    fun createPeasants() = SoundItems().apply {
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantbuildingcomplete1, R.string.peasantbuildingcomplete1))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantcannotbuildthere1, R.string.peasantcannotbuildthere1))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantdeath, R.string.peasantdeath))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantpissed1, R.string.peasantpissed1))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantpissed2, R.string.peasantpissed2))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantpissed3, R.string.peasantpissed3))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantpissed4, R.string.peasantpissed4))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantpissed5, R.string.peasantpissed5))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantready1, R.string.peasantready1))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantwarcry1, R.string.peasantwarcry1))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantwhat1, R.string.peasantwhat1))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantwhat2, R.string.peasantwhat2))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantwhat3, R.string.peasantwhat3))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantwhat4, R.string.peasantwhat4))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantyes1, R.string.peasantyes1))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantyes2, R.string.peasantyes2))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantyes3, R.string.peasantyes3))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantyes4, R.string.peasantyes4))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantyesattack1, R.string.peasantyesattack1))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantyesattack2, R.string.peasantyesattack2))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantyesattack3, R.string.peasantyesattack3))
        add(SoundItem(getRandomFrom(peasants), R.raw.peasantyesattack4, R.string.peasantyesattack4))
    }
}