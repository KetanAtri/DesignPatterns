package builder.general.objects;

import lombok.Data;

@Data
public class Cactus extends Plant
{
    private Integer thornsPerSquareInch;

    private Float waterRequiredInLitres;
}
