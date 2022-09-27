package builder.immutable.objects;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Guitar
{
    private Integer numberOfString;

    private Wood woodType;

    private void setWoodType(Wood woodType)
    {
        this.woodType = woodType;
    }

    private void setNumberOfString(Integer numberOfString)
    {
        this.numberOfString = numberOfString;
    }

    public static GuitarBuilder getGuitarBuilder()
    {
        return new GuitarBuilder();
    }

    public static class GuitarBuilder
    {
        private Integer numberOfString;

        private String grain;

        private String tree;

        private Guitar guitar;

        public GuitarBuilder withNumberOfString(Integer numberOfString)
        {
            this.numberOfString = numberOfString;
            return this;
        }

        public GuitarBuilder withGrain(String grain)
        {
            this.grain = grain;
            return this;
        }

        public GuitarBuilder withTree(String tree)
        {
            this.tree = tree;
            return this;
        }

        public Guitar build()
        {
            guitar = new Guitar();
            Wood wood = new Wood();
            wood.setTree(tree);
            wood.setGrain(grain);
            guitar.setWoodType(wood);
            guitar.setNumberOfString(numberOfString);
            return guitar;
        }
    }
}
