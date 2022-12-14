package creationalDesignPatterns.builder.general.builderImpl;

import creationalDesignPatterns.builder.general.objects.Cactus;
import creationalDesignPatterns.builder.general.objects.Plant;

public class CactusBuilder extends PlantBuilder
{
    private Cactus cactus;

    public Plant build()
    {
        Plant basePlant = super.build();
        cactus = new Cactus();
        cactus.setThornsPerSquareInch(this.leafShape.equals("Oval")? 2: 3);
        cactus.setWaterRequiredInLitres(this.height < 10? 2.5f: 5f);
        cactus.setLeaf(basePlant.getLeaf());
        cactus.setHeight(basePlant.getHeight());
        return cactus;
    }
}
