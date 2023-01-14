package structuralDesignPatterns.decorator.component.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import structuralDesignPatterns.decorator.component.Shoes;

@Slf4j
@AllArgsConstructor
public class DecoratedShoesImpl implements Shoes
{
    private Shoes shoes;

    @Override
    public void walk()
    {
        shoes.walk();
        log.info("With the bLiNg BlInG!");
    }
}
