package ventum.zephyr.wc3soundboard.neutral

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object ZeppelinObject {

    val drawables = intArrayOf(
        R.drawable.zeppelin
    )

    fun createZeppelin() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelindeath1, R.string.goblinzeppelindeath1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinfull1, R.string.goblinzeppelinfull1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinloading1, R.string.goblinzeppelinloading1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinpissed2, R.string.goblinzeppelinpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinpissed3, R.string.goblinzeppelinpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinpissed4, R.string.goblinzeppelinpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinpissed5, R.string.goblinzeppelinpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinready1, R.string.goblinzeppelinready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinwhat1, R.string.goblinzeppelinwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinwhat2, R.string.goblinzeppelinwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinwhat3, R.string.goblinzeppelinwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinwhat4, R.string.goblinzeppelinwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinyes1, R.string.goblinzeppelinyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinyes2, R.string.goblinzeppelinyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinyes3, R.string.goblinzeppelinyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.goblinzeppelinyes4, R.string.goblinzeppelinyes4))
    }
}