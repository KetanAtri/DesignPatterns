package structuralDesignPatterns.decorator.component.impl;

import lombok.extern.slf4j.Slf4j;
import structuralDesignPatterns.decorator.component.Shoes;

@Slf4j
public class ShoesImpl implements Shoes
{
    @Override
    public void walk()
    {
        log.info("I'm walkin' here!");
    }
}
