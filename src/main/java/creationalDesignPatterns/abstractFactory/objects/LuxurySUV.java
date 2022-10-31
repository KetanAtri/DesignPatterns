package creationalDesignPatterns.abstractFactory.objects;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class LuxurySUV extends SUV
{
    private Boolean supportsCrabWalk;
}
