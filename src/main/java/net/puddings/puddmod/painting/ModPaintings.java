package net.puddings.puddmod.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.puddings.puddmod.PuddMod;

public class ModPaintings {

    public static final PaintingVariant TRANS_RIGHTS = registerPainting("trans_rights",
            new PaintingVariant(16, 16));

    public static final PaintingVariant EGG_ONE = registerPainting("egg_one",
            new PaintingVariant(32, 32));

    public static final PaintingVariant DEREK_JETER = registerPainting("derek_jeter",
            new PaintingVariant(16, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(PuddMod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        PuddMod.LOGGER.debug("Registering Paintings for " + PuddMod.MOD_ID);
    }
}
