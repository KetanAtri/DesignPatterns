package structuralDesignPatterns.adapter.objects;

import lombok.Data;

@Data
public class WoodCutter
{
    private Float woodInCentimeter;

    public Float getWoodInInches()
    {
        return woodInCentimeter * 0.393701f;
    }
}
