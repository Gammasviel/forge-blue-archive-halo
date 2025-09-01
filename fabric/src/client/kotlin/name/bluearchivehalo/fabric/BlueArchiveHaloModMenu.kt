package name.bluearchivehalo.fabric

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import name.bluearchivehalo.screen.MainScreen

object BlueArchiveHaloModMenu : ModMenuApi {
    override fun getModConfigScreenFactory() = ConfigScreenFactory(::MainScreen)
}