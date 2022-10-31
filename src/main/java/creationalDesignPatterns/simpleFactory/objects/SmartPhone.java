package creationalDesignPatterns.simpleFactory.objects;

import lombok.Data;

@Data
public class SmartPhone extends Phone
{
    private Integer cameraMP;

    private String screenType;
}
