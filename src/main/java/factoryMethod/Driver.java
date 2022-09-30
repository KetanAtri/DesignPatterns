package factoryMethod;

import factoryMethod.factories.HeadphoneFactory;
import factoryMethod.factories.InEarHeadphoneFactory;
import factoryMethod.factories.OverEarHeadphoneFactory;
import factoryMethod.products.Headphones;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Driver
{
    private static Headphones createHeadphones(HeadphoneFactory headphoneFactory)
    {
        return headphoneFactory.createHeadphones();
    }
    public static void testFactories()
    {
        createHeadphones(new InEarHeadphoneFactory()).playAudio();
        createHeadphones(new OverEarHeadphoneFactory()).playMusic();
    }

    public static void main(String[] args)
    {
        testFactories();
    }
}
