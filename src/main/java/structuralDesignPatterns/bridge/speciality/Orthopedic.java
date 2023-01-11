package structuralDesignPatterns.bridge.speciality;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Orthopedic implements Speicality
{
    @Override
    public void performOperation()
    {
        log.info("Eyes fixed");
    }

    @Override
    public void contactBank()
    {
        log.info("Bank looted");
    }
}
