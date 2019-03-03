package ventum.zephyr.wc3soundboard.naga

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object NagaObject {

    val drawables = intArrayOf(
        R.drawable.naga_flag
    )

    fun createNaga() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murgulbuildingcomplete1, R.string.murgulbuildingcomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.murgulcannotbuildthere1, R.string.murgulcannotbuildthere1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaallyherodies1, R.string.nagaallyherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaallytownattack1, R.string.nagaallytownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaallyunderattack1, R.string.nagaallyunderattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagagoldminecollapse1, R.string.nagagoldminecollapse1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagagoldminelow1, R.string.nagagoldminelow1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaherodies1, R.string.nagaherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagainventoryfull1, R.string.nagainventoryfull1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naganofood1, R.string.naganofood1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naganogold1, R.string.naganogold1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naganolumber1, R.string.naganolumber1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.naganomana1, R.string.naganomana1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaresearchcomplete1, R.string.nagaresearchcomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagatownattack1, R.string.nagatownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaunitattack1, R.string.nagaunitattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.nagaupgradecomplete1, R.string.nagaupgradecomplete1))
    }
}