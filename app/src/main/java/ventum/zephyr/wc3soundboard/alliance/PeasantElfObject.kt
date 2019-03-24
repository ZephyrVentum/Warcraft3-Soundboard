package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object PeasantElfObject {

    private val drawables = intArrayOf(
        R.drawable.peasant_elf,
        R.drawable.peasant_elf2
    )

    fun createPeasantElf() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerpissed1, R.string.bloodelfengineerpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerpissed2, R.string.bloodelfengineerpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerpissed3, R.string.bloodelfengineerpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerpissed4, R.string.bloodelfengineerpissed4, true))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerpissed5, R.string.bloodelfengineerpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerpissed6, R.string.bloodelfengineerpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerready1, R.string.bloodelfengineerready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerwarcry1, R.string.bloodelfengineerwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerwhat1, R.string.bloodelfengineerwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerwhat2, R.string.bloodelfengineerwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerwhat3, R.string.bloodelfengineerwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineerwhat4, R.string.bloodelfengineerwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineeryes1, R.string.bloodelfengineeryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineeryes2, R.string.bloodelfengineeryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineeryes3, R.string.bloodelfengineeryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineeryes4, R.string.bloodelfengineeryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineeryes5, R.string.bloodelfengineeryes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.bloodelfengineeryesattack1, R.string.bloodelfengineeryesattack1))
    }
}