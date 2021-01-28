package nullcraft

import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.util.registry.RegistryKey

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager

object NullCraft : ModInitializer {
    private val logger = LogManager.getFormatterLogger("NullCraft")
    private val MOD_ID = "nullcraft"

    override fun onInitialize() {
        logger.info("**************************")
        logger.info("Loading NullCraft")
        logger.info("**************************")

    }
}
