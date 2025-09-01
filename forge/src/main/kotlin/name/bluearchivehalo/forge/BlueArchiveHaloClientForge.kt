package name.bluearchivehalo.forge

import dev.architectury.registry.client.rendering.forge.BlockEntityRendererRegistryImpl
import name.bluearchivehalo.BeaconHaloRenderer
import name.bluearchivehalo.screen.MainScreen
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.screen.Screen
import net.minecraftforge.client.ConfigScreenHandler
import net.minecraftforge.fml.ModLoadingContext
import net.minecraftforge.fml.common.Mod

@Mod("blue_archive_halo")
class BlueArchiveHaloClientForge {
    init {
        BlockEntityRendererRegistryImpl.register(
            BlockEntityType.BEACON,
            ::BeaconHaloRenderer
        )
        ModLoadingContext.get().registerExtensionPoint<ConfigScreenHandler.ConfigScreenFactory?>(
            ConfigScreenHandler.ConfigScreenFactory::class.java)
        { ConfigScreenHandler.ConfigScreenFactory { _: MinecraftClient?, parent: Screen? -> MainScreen(parent) } }
    }
}