package creationalDesignPatterns.simpleFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Driver
{
    public static void main(String[] args)
    {
        log.info("Default phone: {}", PhoneFactory.createPhone("Default"));
        log.info("Smart phone: {}", PhoneFactory.createPhone("Smart"));
        log.info("Feature phone: {}", PhoneFactory.createPhone("Feature"));
        try
        {
            PhoneFactory.createPhone("Error");
        }
        catch (IllegalArgumentException e)
        {
            log.error("Error on unknown / unsupported phone type", e);
        }
    }
}
