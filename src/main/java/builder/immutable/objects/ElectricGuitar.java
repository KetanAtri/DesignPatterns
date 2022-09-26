package builder.immutable.objects;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ElectricGuitar extends Guitar
{
    private Integer numberOfPickups;

    private String pickupType;

    private void setNumberOfPickups(Integer numberOfPickups)
    {
        this.numberOfPickups = numberOfPickups;
    }

    private void setPickupType(String pickupType)
    {
        this.pickupType = pickupType;
    }

    public static ElectricGuitarBuilder getElectricGuitarBuilder()
    {
        return new ElectricGuitarBuilder();
    }

    public static class ElectricGuitarBuilder extends GuitarBuilder
    {
        private Integer numberOfPickups;

        private String pickupType;

        private ElectricGuitar electricGuitar;

        public ElectricGuitarBuilder withNumberOfPickups(Integer numberOfPickups)
        {
            this.numberOfPickups = numberOfPickups;
            return this;
        }

        public ElectricGuitarBuilder withPickupType(String pickupType)
        {
            this.pickupType = pickupType;
            return this;
        }

        public Guitar build()
        {
            electricGuitar = new ElectricGuitar();
            electricGuitar.setNumberOfPickups(numberOfPickups);
            electricGuitar.setPickupType(pickupType);
            return electricGuitar;
        }

        public Guitar getElectricGuitar()
        {
            return electricGuitar;
        }
    }
}
