package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object UndeadObject {

    val drawables = intArrayOf(
        R.drawable.undead_flag
    )

    fun createUndead() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolytebuildingcomplete1, R.string.acolytebuildingcomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.acolyteplacedoffblight1, R.string.acolyteplacedoffblight1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.altarofdarknesswhat, R.string.altarofdarknesswhat))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerallyherodies1, R.string.necromancerallyherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerallytownattack1, R.string.necromancerallytownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerallyunderattack1, R.string.necromancerallyunderattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancergoldminecollapsed1, R.string.necromancergoldminecollapsed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancergoldminenearlyempty1, R.string.necromancergoldminenearlyempty1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerherodies1, R.string.necromancerherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerinventoryfull1, R.string.necromancerinventoryfull1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancernoenergy1, R.string.necromancernoenergy1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancernofood1, R.string.necromancernofood1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancernogold1, R.string.necromancernogold1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancernolumber1, R.string.necromancernolumber1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerresearchcomplete1, R.string.necromancerresearchcomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancertownattack1, R.string.necromancertownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerunitattack1, R.string.necromancerunitattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necromancerupgradecomplete1, R.string.necromancerupgradecomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necropolisupgrade1, R.string.necropolisupgrade1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.necropolisupgrade2, R.string.necropolisupgrade2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.zombiedeath1, R.string.zombiedeath1))
    }
}