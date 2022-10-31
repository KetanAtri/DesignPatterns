package creationalDesignPatterns.abstractFactory.objects;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class NormieSUV extends SUV
{
    private String brand;
}
