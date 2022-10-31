package creationalDesignPatterns.factoryMethod.products;

import lombok.Data;

@Data
public abstract class Headphones
{
    protected boolean hasNoiseCancellation;

    public abstract void playMusic();

    public abstract void playAudio();
}
