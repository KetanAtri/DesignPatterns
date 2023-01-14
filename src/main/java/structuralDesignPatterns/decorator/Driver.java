package structuralDesignPatterns.decorator;

import lombok.extern.slf4j.Slf4j;
import structuralDesignPatterns.decorator.component.Shoes;
import structuralDesignPatterns.decorator.component.impl.DecoratedShoesImpl;
import structuralDesignPatterns.decorator.component.impl.OverlyDecoratedShoesImpl;
import structuralDesignPatterns.decorator.component.impl.ShoesImpl;

@Slf4j
public class Driver
{
    private static void testDecorator()
    {
        Shoes shoes = new ShoesImpl();
        shoes.walk();
        log.info("-------------");
        Shoes decoratedShoes = new DecoratedShoesImpl(shoes);
        decoratedShoes.walk();
        log.info("-------------");
        Shoes overlyDecoratedShoes = new OverlyDecoratedShoesImpl(decoratedShoes);
        overlyDecoratedShoes.walk();
    }

    public static void main(String[] args)
    {
        testDecorator();
    }
}
