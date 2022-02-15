package net.yoruniii.playdate.painting;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yoruniii.playdate.Playdate;

public class ModPaintings {
    public static final PaintingMotive PLAYDATE_POSTER = registerPainting("playdate_poster", new PaintingMotive(32, 32));
    public static final PaintingMotive LOLLIPOP_POSTER = registerPainting("lollipop_poster", new PaintingMotive(16, 32));
    public static final PaintingMotive PETUNIA_POSTER = registerPainting("petunia_poster", new PaintingMotive(16, 32));
    public static final PaintingMotive HAPPY_SUN_POSTER = registerPainting("happy_sun_poster", new PaintingMotive(16, 32));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Playdate.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
        System.out.println("Registering Paintings for " + Playdate.MOD_ID);
    }
}
