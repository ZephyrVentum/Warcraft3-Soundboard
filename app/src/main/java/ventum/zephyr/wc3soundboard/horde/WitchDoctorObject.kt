package ventum.zephyr.wc3soundboard.horde

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object WitchDoctorObject {

    val drawables = intArrayOf(
        R.drawable.witch_doctor,
        R.drawable.witch_doctor2
    )

    fun createWitchDoctor() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctordeath, R.string.witchdoctordeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorpissed1, R.string.witchdoctorpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorpissed2, R.string.witchdoctorpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorpissed3, R.string.witchdoctorpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorpissed4, R.string.witchdoctorpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorpissed5, R.string.witchdoctorpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorpissed6, R.string.witchdoctorpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorpissed7, R.string.witchdoctorpissed7))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorready1, R.string.witchdoctorready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorwarcry1, R.string.witchdoctorwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorwhat1, R.string.witchdoctorwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorwhat2, R.string.witchdoctorwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorwhat3, R.string.witchdoctorwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctorwhat4, R.string.witchdoctorwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctoryes1, R.string.witchdoctoryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctoryes2, R.string.witchdoctoryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctoryes3, R.string.witchdoctoryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctoryesattack1, R.string.witchdoctoryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctoryesattack2, R.string.witchdoctoryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.witchdoctoryesattack3, R.string.witchdoctoryesattack3))
    }
}