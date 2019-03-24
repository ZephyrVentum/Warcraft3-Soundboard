package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ShadowHunterObject {

    val drawables = intArrayOf(
        R.drawable.shadow_hunter,
        R.drawable.shadow_hunter2
    )

    fun createShadowHunter() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heroshadowhunterdeath, R.string.heroshadowhunterdeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanpissed1, R.string.rokhanpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanpissed2, R.string.rokhanpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanpissed3, R.string.rokhanpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanpissed4, R.string.rokhanpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanpissed5, R.string.rokhanpissed5, true))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanready1, R.string.rokhanready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanwarcry1, R.string.rokhanwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanwhat1, R.string.rokhanwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanwhat2, R.string.rokhanwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanwhat3, R.string.rokhanwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanwhat4, R.string.rokhanwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanyes1, R.string.rokhanyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanyes2, R.string.rokhanyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanyes3, R.string.rokhanyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanyes4, R.string.rokhanyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanyesattack1, R.string.rokhanyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanyesattack2, R.string.rokhanyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanyesattack3, R.string.rokhanyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.rokhanyesattack4, R.string.rokhanyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterpissed1, R.string.shadowhunterpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterpissed2, R.string.shadowhunterpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterpissed3, R.string.shadowhunterpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterpissed4, R.string.shadowhunterpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterpissed5, R.string.shadowhunterpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterpissed6, R.string.shadowhunterpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterpissed7, R.string.shadowhunterpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterpissed8, R.string.shadowhunterpissed8))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterpissed9, R.string.shadowhunterpissed9))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterready1, R.string.shadowhunterready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterwarcry1, R.string.shadowhunterwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterwhat1, R.string.shadowhunterwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterwhat2, R.string.shadowhunterwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterwhat3, R.string.shadowhunterwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterwhat4, R.string.shadowhunterwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunterwhat5, R.string.shadowhunterwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryes1, R.string.shadowhunteryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryes2, R.string.shadowhunteryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryes3, R.string.shadowhunteryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryes4, R.string.shadowhunteryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryes5, R.string.shadowhunteryes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryes6, R.string.shadowhunteryes6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryes7, R.string.shadowhunteryes7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryesattack1, R.string.shadowhunteryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryesattack2, R.string.shadowhunteryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryesattack3, R.string.shadowhunteryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.shadowhunteryesattack4, R.string.shadowhunteryesattack4))
    }
}