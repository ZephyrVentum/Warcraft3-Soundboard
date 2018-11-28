package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object DruidObject {

    val drawables = intArrayOf(
        R.drawable.druid,
        R.drawable.druid2,
        R.drawable.druid3
    )

    fun createDruid() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawdeath1, R.string.druidoftheclawdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawdeathalternate1, R.string.druidoftheclawdeathalternate1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorph1, R.string.druidoftheclawmorph1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphalternate1, R.string.druidoftheclawmorphalternate1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedpissed1, R.string.druidoftheclawmorphedpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedpissed2, R.string.druidoftheclawmorphedpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedpissed3, R.string.druidoftheclawmorphedpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedwarcry1, R.string.druidoftheclawmorphedwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedwhat1, R.string.druidoftheclawmorphedwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedwhat2, R.string.druidoftheclawmorphedwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedwhat3, R.string.druidoftheclawmorphedwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedyes1, R.string.druidoftheclawmorphedyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedyes2, R.string.druidoftheclawmorphedyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedyes3, R.string.druidoftheclawmorphedyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawmorphedyesattack1, R.string.druidoftheclawmorphedyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawpissed1, R.string.druidoftheclawpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawpissed2, R.string.druidoftheclawpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawpissed3, R.string.druidoftheclawpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawpissed4, R.string.druidoftheclawpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawpissed5, R.string.druidoftheclawpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawpissed6, R.string.druidoftheclawpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawpissed7, R.string.druidoftheclawpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawready1, R.string.druidoftheclawready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawwarcry1, R.string.druidoftheclawwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawwhat1, R.string.druidoftheclawwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawwhat2, R.string.druidoftheclawwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawwhat3, R.string.druidoftheclawwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawwhat4, R.string.druidoftheclawwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawyes1, R.string.druidoftheclawyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawyes2, R.string.druidoftheclawyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawyes3, R.string.druidoftheclawyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawyes4, R.string.druidoftheclawyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawyesattack1, R.string.druidoftheclawyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawyesattack2, R.string.druidoftheclawyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.druidoftheclawyesattack3, R.string.druidoftheclawyesattack3))
    }
}