package name.bluearchivehalo.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class MyExpectPlatformImpl {
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
