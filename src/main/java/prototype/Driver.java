package prototype;

import lombok.extern.slf4j.Slf4j;
import prototype.objects.Bag;
import prototype.objects.LaptopBag;

@Slf4j
public class Driver
{
    private static void testPrototype()
    {
        Bag generic = new Bag();
        generic.setCompartments(2);
        generic.setMaterial("Canvas");
        log.info("Driver::testPrototype() Created bag: {}", generic);
        try
        {
            Bag genericClone = generic.clone();
            log.info("Driver::testPrototype() Cloned bag: {}", genericClone);
        }
        catch (CloneNotSupportedException e)
        {
            log.error("Driver::testPrototype() Exception while cloning bag: ", e);
        }
    }

    private static void testCloneNotSupported()
    {
        LaptopBag laptopBag = new LaptopBag();
        laptopBag.setCompartments(3);
        laptopBag.setMaterial("grass");
        laptopBag.setHasPadding(Boolean.FALSE);
        log.info("Driver::testCloneNotSupported() Created laptop bag: {}", laptopBag);
        try
        {
            Bag laptopBagClone = laptopBag.clone();
            log.info("Driver::testCloneNotSupported() Cloned laptop bag: {}", laptopBagClone);
        }
        catch (CloneNotSupportedException e)
        {
            log.error("Driver::testCloneNotSupported() Exception while cloning laptop bag: ", e);
        }
    }

    public static void main(String[] args)
    {
        testPrototype();
        testCloneNotSupported();
    }
}
