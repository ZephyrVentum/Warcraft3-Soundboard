package ventum.zephyr.wc3soundboard.nightelf

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object NightElfObject {

    val drawables = intArrayOf(
        R.drawable.night_elf_flag
    )

    fun createNightElf() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.altarofelderswhat1, R.string.altarofelderswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressbuildingcomplete1, R.string.huntressbuildingcomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntresscannotbuildthere1, R.string.huntresscannotbuildthere1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressgoldminecollapsed1, R.string.huntressgoldminecollapsed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressgoldminelow1, R.string.huntressgoldminelow1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.huntressnofood1, R.string.huntressnofood1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelallyherodies1, R.string.sentinelallyherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelallytownattack1, R.string.sentinelallytownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelallyunderattack1, R.string.sentinelallyunderattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentineldeath1, R.string.sentineldeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelherodies1, R.string.sentinelherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelinventoryfull1, R.string.sentinelinventoryfull1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelnoenergy1, R.string.sentinelnoenergy1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelnogold1, R.string.sentinelnogold1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelnolumber1, R.string.sentinelnolumber1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelnorootthere1, R.string.sentinelnorootthere1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelresearchcomplete1, R.string.sentinelresearchcomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentineltownattack1, R.string.sentineltownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelunitattack1, R.string.sentinelunitattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.sentinelupgradecomplete1, R.string.sentinelupgradecomplete1))
    }
}