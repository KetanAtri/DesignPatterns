package structuralDesignPatterns.adapter.objects;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Adapter implements WoodProvider
{
    private WoodCutter woodCutter;

    @Override
    public Float getWood()
    {
        return woodCutter.getWoodInInches();
    }
}
