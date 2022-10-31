package creationalDesignPatterns.simpleFactory;

import creationalDesignPatterns.simpleFactory.objects.FeaturePhone;
import creationalDesignPatterns.simpleFactory.objects.Phone;
import creationalDesignPatterns.simpleFactory.objects.SmartPhone;

public class PhoneFactory
{
    public static Phone createPhone(String phoneType)
    {
        switch (phoneType)
        {
            case "Smart":
                return new SmartPhone();
            case "Feature":
                return new FeaturePhone();
            case "Default":
                return new Phone();
            default:
                throw new IllegalArgumentException("Unknown / Unsupported phone type: " + phoneType);
        }
    }
}
