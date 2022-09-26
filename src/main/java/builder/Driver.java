package builder;

import builder.general.builderImpl.CactusBuilder;
import builder.general.builderImpl.PlantBuilder;
import builder.general.objects.Plant;
import builder.immutable.objects.ElectricGuitar;
import builder.immutable.objects.Guitar;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Driver
{
    private static void testGeneral()
    {
        PlantBuilder plantBuilder = new PlantBuilder();
        Plant plant = plantBuilder
                .withHeight(10f)
                .withLeafColor("Green")
                .withLeafShape("Oval")
                .build();
        log.info("Driver::testGeneral() Created Plant: {}", plant);

        PlantBuilder cactusBuilder = new CactusBuilder();
        Plant unknownCactus = cactusBuilder
                .withLeafColor("Red")
                .withLeafShape("Square")
                .withHeight(12f)
                .build();
        log.info("Driver::testGeneral() Created Cactus: {}", unknownCactus);
    }

    private static void testImmutable()
    {
        Guitar.GuitarBuilder guitarBuilder = Guitar.getGuitarBuilder();
        Guitar guitar = guitarBuilder
                .withGrain("Fine")
                .withTree("Rosewood")
                .withNumberOfString(6)
                .build();
        log.info("Created guitar: {}", guitar);

        ElectricGuitar.ElectricGuitarBuilder electricGuitarBuilder = ElectricGuitar.getElectricGuitarBuilder();
        Guitar electricGuitar = electricGuitarBuilder
                .withNumberOfPickups(3)
                .withPickupType("Humbucker")
                .build();
        log.info("Created electric guitar: {}", electricGuitar);
    }

    public static void main(String[] args)
    {
        testGeneral();
        testImmutable();
    }
}
