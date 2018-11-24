package ventum.zephyr.wc3soundboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.soundboardtemplate.model.SoundboardCategory
import ventum.zephyr.soundboardtemplate.ui.SoundboardActivity
import java.util.ArrayList

class StartActivity : SoundboardActivity() {
    override fun getSoundboardCategories() = ArrayList<SoundboardCategory>().apply {
        add(createFirstCategory())
    }

    private fun createFirstCategory(): SoundboardCategory {
        val soundItems = SoundItems()
        for (i in 0..6 step 1) {
            soundItems.add(SoundItem(R.drawable.bg_main, R.raw.example_sound, soundPool.load(this, R.raw.example_sound, 1)))
        }
        return SoundboardCategory("First", soundItems)
    }


}
