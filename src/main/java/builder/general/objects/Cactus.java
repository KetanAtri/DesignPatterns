package builder.general.objects;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Cactus extends Plant
{
    private Integer thornsPerSquareInch;

    private Float waterRequiredInLitres;
}
