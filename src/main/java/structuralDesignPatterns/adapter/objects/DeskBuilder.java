package structuralDesignPatterns.adapter.objects;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeskBuilder
{
    private Float woodInInches;

    public void buildDesk(WoodProvider woodProvider)
    {
        woodInInches = woodProvider.getWood();
        log.info("Desk built; woodInInches: {}", woodInInches);
    }
}
