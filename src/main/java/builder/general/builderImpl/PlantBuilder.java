package builder.general.builderImpl;

import builder.general.objects.Leaf;
import builder.general.objects.Plant;

public class PlantBuilder
{
    protected String leafColor;

    protected String leafShape;

    protected Float height;

    private Plant plant;

    public PlantBuilder withLeafColor(String leafColor)
    {
        this.leafColor = leafColor;
        return this;
    }

    public PlantBuilder withLeafShape(String leafShape)
    {
        this.leafShape = leafShape;
        return this;
    }

    public PlantBuilder withHeight(Float height)
    {
        this.height = height;
        return this;
    }

    public Plant build()
    {
        plant = new Plant();
        plant.setHeight(height);
        Leaf leaf = new Leaf();
        leaf.setColor(leafColor);
        leaf.setShape(leafShape);
        plant.setLeaf(leaf);
        return plant;
    }

    public Plant getPlant()
    {
        return plant;
    }
}
