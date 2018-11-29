package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object IllidanObject {

    val drawables = intArrayOf(
        R.drawable.illidan,
        R.drawable.illidan2,
        R.drawable.illidan3
    )

    fun createIllidan() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedpissed1, R.string.illidanmorphedpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedpissed2, R.string.illidanmorphedpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedpissed3, R.string.illidanmorphedpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedpissed4, R.string.illidanmorphedpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedpissed5, R.string.illidanmorphedpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedwarcry1, R.string.illidanmorphedwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedwhat1, R.string.illidanmorphedwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedwhat2, R.string.illidanmorphedwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedwhat3, R.string.illidanmorphedwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedwhat4, R.string.illidanmorphedwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedyes1, R.string.illidanmorphedyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedyes2, R.string.illidanmorphedyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedyes3, R.string.illidanmorphedyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedyes4, R.string.illidanmorphedyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedyesattack1, R.string.illidanmorphedyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedyesattack2, R.string.illidanmorphedyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanmorphedyesattack3, R.string.illidanmorphedyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanpissed1, R.string.illidanpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanpissed2, R.string.illidanpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanpissed3, R.string.illidanpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanpissed4, R.string.illidanpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanpissed5, R.string.illidanpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanwarcry1, R.string.illidanwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanwhat1, R.string.illidanwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanwhat2, R.string.illidanwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanwhat3, R.string.illidanwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanwhat4, R.string.illidanwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanyes1, R.string.illidanyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanyes2, R.string.illidanyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanyes3, R.string.illidanyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanyes4, R.string.illidanyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanyesattack1, R.string.illidanyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanyesattack2, R.string.illidanyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.illidanyesattack3, R.string.illidanyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterdeath1, R.string.herodemonhunterdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterpissed1, R.string.herodemonhunterpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterpissed2, R.string.herodemonhunterpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterpissed3, R.string.herodemonhunterpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterpissed4, R.string.herodemonhunterpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterpissed5, R.string.herodemonhunterpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterpissed6, R.string.herodemonhunterpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterpissed7, R.string.herodemonhunterpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterready1, R.string.herodemonhunterready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterwarcry1, R.string.herodemonhunterwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterwhat1, R.string.herodemonhunterwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterwhat2, R.string.herodemonhunterwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterwhat3, R.string.herodemonhunterwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterwhat4, R.string.herodemonhunterwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunterwhat5, R.string.herodemonhunterwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunteryes1, R.string.herodemonhunteryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunteryes2, R.string.herodemonhunteryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunteryes3, R.string.herodemonhunteryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunteryes4, R.string.herodemonhunteryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunteryes5, R.string.herodemonhunteryes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunteryesattack1, R.string.herodemonhunteryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunteryesattack2, R.string.herodemonhunteryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunteryesattack3, R.string.herodemonhunteryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.herodemonhunteryesattack4, R.string.herodemonhunteryesattack4))
    }
}