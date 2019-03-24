package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object BatriderObject {

    val drawables = intArrayOf(
        R.drawable.batrider,
        R.drawable.batrider2,
        R.drawable.batrider3
    )

    fun createBatrider() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.batriderdeath1, R.string.batriderdeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderpissed1, R.string.trollbatriderpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderpissed2, R.string.trollbatriderpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderpissed3, R.string.trollbatriderpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderpissed4, R.string.trollbatriderpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderpissed5, R.string.trollbatriderpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderready1, R.string.trollbatriderready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatridersuicideattack1, R.string.trollbatridersuicideattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderwarcry1, R.string.trollbatriderwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderwhat1, R.string.trollbatriderwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderwhat2, R.string.trollbatriderwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderwhat3, R.string.trollbatriderwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderwhat4, R.string.trollbatriderwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatriderwhat5, R.string.trollbatriderwhat5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatrideryes1, R.string.trollbatrideryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatrideryes2, R.string.trollbatrideryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatrideryes3, R.string.trollbatrideryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatrideryes4, R.string.trollbatrideryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatrideryes5, R.string.trollbatrideryes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatrideryesattack1, R.string.trollbatrideryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatrideryesattack2, R.string.trollbatrideryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatrideryesattack3, R.string.trollbatrideryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.trollbatrideryesattack4, R.string.trollbatrideryesattack4))
    }
}