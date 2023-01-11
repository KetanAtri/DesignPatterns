package structuralDesignPatterns.bridge.speciality;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cardiology implements Speicality
{
    @Override
    public void performOperation()
    {
        log.info("Heart fixed; for now");
    }

    @Override
    public void contactBank()
    {
        log.info("Not enough money in the bank");
    }
}
