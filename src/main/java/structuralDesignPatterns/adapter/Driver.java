package structuralDesignPatterns.adapter;

import structuralDesignPatterns.adapter.objects.Adapter;
import structuralDesignPatterns.adapter.objects.DeskBuilder;
import structuralDesignPatterns.adapter.objects.WoodCutter;

public class Driver
{
    private static void testAdapter()
    {
        WoodCutter woodCutter = new WoodCutter();
        woodCutter.setWoodInCentimeter(10f);
        Adapter woodProvider = new Adapter(woodCutter);
        DeskBuilder deskBuilder = new DeskBuilder();
        deskBuilder.buildDesk(woodProvider);
    }

    public static void main(String[] args)
    {
        testAdapter();
    }
}
