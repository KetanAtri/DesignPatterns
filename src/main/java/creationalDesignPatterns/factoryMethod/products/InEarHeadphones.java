package creationalDesignPatterns.factoryMethod.products;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class InEarHeadphones extends Headphones
{
    private String budsType;

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
