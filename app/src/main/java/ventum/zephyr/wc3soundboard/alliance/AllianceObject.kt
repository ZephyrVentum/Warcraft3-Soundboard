package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object AllianceObject {

    private val drawables = intArrayOf(
        R.drawable.alliance_flag
    )

    fun createAlliance() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.altarofkingswhat1, R.string.altarofkingswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightallyattack1, R.string.knightallyattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightallyherodies1, R.string.knightallyherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightallytownattack1, R.string.knightallytownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightgoldminecollapsed1, R.string.knightgoldminecollapsed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightgoldminelow1, R.string.knightgoldminelow1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightherodies1, R.string.knightherodies1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightinventoryfull1, R.string.knightinventoryfull1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightnoenergy1, R.string.knightnoenergy1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightnofood1, R.string.knightnofood1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightnogold1, R.string.knightnogold1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightnolumber1, R.string.knightnolumber1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightresearchcomplete1, R.string.knightresearchcomplete1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knighttownattack1, R.string.knighttownattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightunitattack1, R.string.knightunitattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.knightupgradecomplete1, R.string.knightupgradecomplete1))
    }
}