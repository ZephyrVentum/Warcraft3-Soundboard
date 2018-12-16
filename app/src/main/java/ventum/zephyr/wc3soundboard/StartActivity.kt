package ventum.zephyr.wc3soundboard

import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.soundboardtemplate.model.SoundboardCategory
import ventum.zephyr.soundboardtemplate.ui.SoundboardActivity
import ventum.zephyr.wc3soundboard.alliance.AllianceObject.createAlliance
import ventum.zephyr.wc3soundboard.alliance.ArchmageObject.createArchmage
import ventum.zephyr.wc3soundboard.alliance.ArthasObject.createArthas
import ventum.zephyr.wc3soundboard.alliance.CaptainObject.createCaptain
import ventum.zephyr.wc3soundboard.alliance.FootmanObject.createFootmans
import ventum.zephyr.wc3soundboard.alliance.GryphonObject.createGryphon
import ventum.zephyr.wc3soundboard.alliance.GyrocopterObject.createGyrocopter
import ventum.zephyr.wc3soundboard.alliance.HawkObject.createHawk
import ventum.zephyr.wc3soundboard.alliance.JainaObject.createJaina
import ventum.zephyr.wc3soundboard.alliance.KnightObject.createKnights
import ventum.zephyr.wc3soundboard.alliance.MortarObject.createMortar
import ventum.zephyr.wc3soundboard.alliance.MuradinObject.createMuradin
import ventum.zephyr.wc3soundboard.alliance.PeasantObject.createPeasants
import ventum.zephyr.wc3soundboard.alliance.PriestObject.createPriest
import ventum.zephyr.wc3soundboard.alliance.RiflemanObject.createRiflemans
import ventum.zephyr.wc3soundboard.alliance.SorceressObject.createSorceress
import ventum.zephyr.wc3soundboard.alliance.UtherObject.createUther
import ventum.zephyr.wc3soundboard.horde.BlademasterObject.createBlademaster
import ventum.zephyr.wc3soundboard.horde.FarSeerObject.createFarSeer
import ventum.zephyr.wc3soundboard.horde.GromObject.createGrom
import ventum.zephyr.wc3soundboard.horde.GruntObject.createGrunt
import ventum.zephyr.wc3soundboard.horde.HeadHunterObject.createHeadHunter
import ventum.zephyr.wc3soundboard.horde.HordeObject.createHorde
import ventum.zephyr.wc3soundboard.horde.OgreObject.createOgre
import ventum.zephyr.wc3soundboard.horde.PeonObject.createPeon
import ventum.zephyr.wc3soundboard.horde.ShamanObject.createShaman
import ventum.zephyr.wc3soundboard.horde.TaurenHeroObject.createTaurenHero
import ventum.zephyr.wc3soundboard.horde.TaurenObject.createTauren
import ventum.zephyr.wc3soundboard.horde.ThrallObject.createThrall
import ventum.zephyr.wc3soundboard.horde.WitchDoctorObject.createWitchDoctor
import ventum.zephyr.wc3soundboard.horde.WolfriderObject.createWolfrider
import ventum.zephyr.wc3soundboard.horde.WyvernObject.createWyvern
import ventum.zephyr.wc3soundboard.neutral.BanditObject.createBandit
import ventum.zephyr.wc3soundboard.neutral.BristlbackObject.createBristlback
import ventum.zephyr.wc3soundboard.neutral.CentaurObject.createCentaur
import ventum.zephyr.wc3soundboard.neutral.FurbolgObject.createFurbolg
import ventum.zephyr.wc3soundboard.neutral.GnollObject.createGnoll
import ventum.zephyr.wc3soundboard.neutral.MurlocObject.createMurloc
import ventum.zephyr.wc3soundboard.neutral.SapperObject.createSapper
import ventum.zephyr.wc3soundboard.nightelf.ArcherObject.createArcher
import ventum.zephyr.wc3soundboard.nightelf.ChimaeraObject.createChimaera
import ventum.zephyr.wc3soundboard.nightelf.DruidObject.createDruid
import ventum.zephyr.wc3soundboard.nightelf.DryadObject.createDryad
import ventum.zephyr.wc3soundboard.nightelf.FurionObject.createFurion
import ventum.zephyr.wc3soundboard.nightelf.HippogriffObject.createHippogriff
import ventum.zephyr.wc3soundboard.nightelf.HuntressObject.createHuntress
import ventum.zephyr.wc3soundboard.nightelf.IllidanObject.createIllidan
import ventum.zephyr.wc3soundboard.nightelf.KeeperObject.createKeeper
import ventum.zephyr.wc3soundboard.nightelf.NightElfObject.createNightElf
import ventum.zephyr.wc3soundboard.nightelf.ShandrisObject.createShandris
import ventum.zephyr.wc3soundboard.nightelf.TalonObject.createTalon
import ventum.zephyr.wc3soundboard.nightelf.TyrandeObject.createTyrande
import ventum.zephyr.wc3soundboard.nightelf.WispObject.createWisp
import ventum.zephyr.wc3soundboard.undead.AbominationObject.createAbomination
import ventum.zephyr.wc3soundboard.undead.AcolyteObject.createAcolyte
import ventum.zephyr.wc3soundboard.undead.BansheeObject.createBanshee
import ventum.zephyr.wc3soundboard.undead.CryptFiendObject.createCryptFiend
import ventum.zephyr.wc3soundboard.undead.DeathKnightObject.createDeathKnight
import ventum.zephyr.wc3soundboard.undead.DreadLordObject.createDreadLord
import ventum.zephyr.wc3soundboard.undead.FrostWyrmObject.createFrostWyrm
import ventum.zephyr.wc3soundboard.undead.GargoyleObject.createGargoyle
import ventum.zephyr.wc3soundboard.undead.GhoulObject.createGhoul
import ventum.zephyr.wc3soundboard.undead.KelthuzadObject.createKelthuzad
import ventum.zephyr.wc3soundboard.undead.LichObject.createLich
import ventum.zephyr.wc3soundboard.undead.MeatWagonObject.createMeatWagon
import ventum.zephyr.wc3soundboard.undead.NecromancerObject.createNecromancer
import ventum.zephyr.wc3soundboard.undead.ShadeObject.createShade
import ventum.zephyr.wc3soundboard.undead.UndeadObject.createUndead
import java.util.*

class StartActivity : SoundboardActivity() {

    companion object {
        fun getRandomFrom(array: IntArray) = array[Random().nextInt(array.size)]
    }

    override fun getSoundboardCategories() = ArrayList<SoundboardCategory>().apply {
        add(createAllianceCategory())
        add(createHordeCategory())
        add(createUndeadCategory())
        add(createNightElfCategory())
        add(createNeutralCategory())
    }

    private fun createAllianceCategory() =
        SoundboardCategory(getString(R.string.alliance_category), SoundItems().apply {
            addAll(createAlliance())
            addAll(createPeasants())
            addAll(createFootmans())
            addAll(createCaptain())
            addAll(createRiflemans())
            addAll(createKnights())
            addAll(createPriest())
            addAll(createSorceress())
            addAll(createMortar())
            addAll(createGyrocopter())
            addAll(createGryphon())
            addAll(createHawk())
            addAll(createMuradin())
            addAll(createJaina())
            addAll(createUther())
            addAll(createArchmage())
            addAll(createArthas())
        }, getString(R.string.alliance_banner))

    private fun createHordeCategory() = SoundboardCategory(getString(R.string.horde_category), SoundItems().apply {
        addAll(createHorde())
        addAll(createPeon())
        addAll(createGrunt())
        addAll(createHeadHunter())
        addAll(createShaman())
        addAll(createWitchDoctor())
        addAll(createWolfrider())
        addAll(createWyvern())
        addAll(createTauren())
        addAll(createThrall())
        addAll(createGrom())
        addAll(createBlademaster())
        addAll(createFarSeer())
        addAll(createTaurenHero())
        addAll(createOgre())
    }, getString(R.string.horde_banner))

    private fun createUndeadCategory() = SoundboardCategory(getString(R.string.undead_category), SoundItems().apply {
        addAll(createUndead())
        addAll(createAcolyte())
        addAll(createGhoul())
        addAll(createCryptFiend())
        addAll(createGargoyle())
        addAll(createNecromancer())
        addAll(createBanshee())
        addAll(createMeatWagon())
        addAll(createAbomination())
        addAll(createShade())
        addAll(createFrostWyrm())
        addAll(createDeathKnight())
        addAll(createKelthuzad())
        addAll(createDreadLord())
        addAll(createLich())
    }, getString(R.string.undead_banner))

    private fun createNightElfCategory() =
        SoundboardCategory(getString(R.string.night_elves_category), SoundItems().apply {
            addAll(createNightElf())
            addAll(createWisp())
            addAll(createArcher())
            addAll(createHuntress())
            addAll(createDryad())
            addAll(createDruid())
            addAll(createTalon())
            addAll(createHippogriff())
            addAll(createChimaera())
            addAll(createShandris())
            addAll(createIllidan())
            addAll(createFurion())
            addAll(createTyrande())
            addAll(createKeeper())
        }, getString(R.string.night_elf_banner))


    private fun createNeutralCategory() =
        SoundboardCategory(getString(R.string.neutral_category), SoundItems().apply {
            addAll(createBandit())
            addAll(createBristlback())
            addAll(createCentaur())
            addAll(createMurloc())
            addAll(createFurbolg())
            addAll(createGnoll())
            addAll(createSapper())
        }, getString(R.string.neutral_banner))

    override fun getBlurRadius() = 8
}
