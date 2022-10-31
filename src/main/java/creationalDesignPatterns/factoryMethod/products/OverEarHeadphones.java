package creationalDesignPatterns.factoryMethod.products;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class OverEarHeadphones extends Headphones
{
    private String cushionType;

    @Override
    public void playMusic()
    {
        log.info(this.getClass().getSimpleName() + "::playMusic()");
    }

    @Override
    public void playAudio()
    {
        log.info(this.getClass().getSimpleName() + "::playAudio()");
    }
}
