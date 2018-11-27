package ventum.zephyr.wc3soundboard.undead

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object DeathKnightObject {

    val drawables = intArrayOf(
        R.drawable.death_knight,
        R.drawable.death_knight2,
        R.drawable.death_knight3
    )

    fun createDeathKnight() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathcoilspecialart1, R.string.deathcoilspecialart1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightpissed1, R.string.deathknightpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightpissed2, R.string.deathknightpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightpissed3, R.string.deathknightpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightpissed4, R.string.deathknightpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightpissed5, R.string.deathknightpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightpissed6, R.string.deathknightpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightready1, R.string.deathknightready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightwarcry1, R.string.deathknightwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightwhat1, R.string.deathknightwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightwhat2, R.string.deathknightwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightwhat3, R.string.deathknightwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightwhat4, R.string.deathknightwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightyes1, R.string.deathknightyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightyes2, R.string.deathknightyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightyes3, R.string.deathknightyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightyes4, R.string.deathknightyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightyes5, R.string.deathknightyes5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightyesattack1, R.string.deathknightyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightyesattack2, R.string.deathknightyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.deathknightyesattack3, R.string.deathknightyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaspissed1, R.string.evilarthaspissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaspissed2, R.string.evilarthaspissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaspissed3, R.string.evilarthaspissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaspissed4, R.string.evilarthaspissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaspissed5, R.string.evilarthaspissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaswarcry1, R.string.evilarthaswarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaswhat1, R.string.evilarthaswhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaswhat2, R.string.evilarthaswhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaswhat3, R.string.evilarthaswhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthaswhat4, R.string.evilarthaswhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyes1, R.string.evilarthasyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyes2, R.string.evilarthasyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyes3, R.string.evilarthasyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyes4, R.string.evilarthasyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyesattack1, R.string.evilarthasyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyesattack2, R.string.evilarthasyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyesattack3, R.string.evilarthasyesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyesattack4, R.string.evilarthasyesattack4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyesattack5, R.string.evilarthasyesattack5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.evilarthasyesattack6, R.string.evilarthasyesattack6))
    }
}