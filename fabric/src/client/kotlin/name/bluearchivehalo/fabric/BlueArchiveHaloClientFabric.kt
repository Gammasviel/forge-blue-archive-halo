package name.bluearchivehalo.fabric

import dev.architectury.registry.client.rendering.fabric.BlockEntityRendererRegistryImpl
import name.bluearchivehalo.BeaconHaloRenderer
import name.bluearchivehalo.BlueArchiveHaloClient
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.block.entity.BeaconBlockEntity
import net.minecraft.block.entity.BlockEntityType

object BlueArchiveHaloClientFabric : ClientModInitializer{
    override fun onInitializeClient() {
        BlockEntityRendererRegistryImpl.register(
            BlockEntityType.BEACON,
            ::BeaconHaloRenderer
        )
        val shrinkers = FabricLoader.getInstance().getEntrypoints("blue_archive_halo_beacon_level_shrinker",Function1::class.java)
        shrinkers.firstOrNull()?.let { BlueArchiveHaloClient.shrinker = it as ((BeaconBlockEntity) -> Int) }
    }
}