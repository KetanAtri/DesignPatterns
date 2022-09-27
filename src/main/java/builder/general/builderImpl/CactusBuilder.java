package builder.general.builderImpl;

import builder.general.objects.Cactus;
import builder.general.objects.Plant;

public class CactusBuilder extends PlantBuilder
{
    private Cactus cactus;

    public Plant build()
    {
        cactus = new Cactus();
        cactus.setThornsPerSquareInch(this.leafShape.equals("Oval")? 2: 3);
        cactus.setWaterRequiredInLitres(this.height < 10? 2.5f: 5f);
        return cactus;
    }
}
