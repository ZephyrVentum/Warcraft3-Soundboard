package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object HordeObject {

    val drawables = intArrayOf(
        R.drawable.horde_flag
    )

    fun createHorde() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.altarofstormswhat1, R.string.altarofstormswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntallyherodies1, R.string.gruntallyherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntallytownattack1, R.string.gruntallytownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntallyunderattack1, R.string.gruntallyunderattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntgoldminecollapsed1, R.string.gruntgoldminecollapsed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntgoldminelow1, R.string.gruntgoldminelow1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntherodies1, R.string.gruntherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntinventoryfull1, R.string.gruntinventoryfull1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntnoenergy1, R.string.gruntnoenergy1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntnofood1, R.string.gruntnofood1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntnogold1, R.string.gruntnogold1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntnolumber1, R.string.gruntnolumber1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntresearchcomplete1, R.string.gruntresearchcomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.grunttownattack1, R.string.grunttownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntunitattack1, R.string.gruntunitattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.gruntupgradecomplete1, R.string.gruntupgradecomplete1))
    }
}