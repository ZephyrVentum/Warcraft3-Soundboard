package ventum.zephyr.wc3soundboard

import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.soundboardtemplate.model.SoundboardCategory
import ventum.zephyr.soundboardtemplate.ui.SoundboardActivity
import ventum.zephyr.wc3soundboard.alliance.FootmanObject.createFootmans
import ventum.zephyr.wc3soundboard.alliance.KnightObject.createKnights
import ventum.zephyr.wc3soundboard.alliance.PeasantObject.createPeasants
import ventum.zephyr.wc3soundboard.alliance.RiflemanObject.createRiflemans
import java.util.*

class StartActivity : SoundboardActivity() {

    companion object {
        fun getRandomFrom(array: IntArray) = array[Random().nextInt(array.size)]
    }

    override fun getSoundboardCategories() = ArrayList<SoundboardCategory>().apply {
        add(createAllianceCategory())
    }

    private fun createAllianceCategory() =
        SoundboardCategory(getString(R.string.alliance_category), SoundItems().apply {
            addAll(createPeasants())
            addAll(createFootmans())
            addAll(createRiflemans())
            addAll(createKnights())
        })

    override fun getBlurRadius() = 10
}
