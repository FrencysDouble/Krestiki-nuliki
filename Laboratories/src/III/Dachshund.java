package III;

class Dachshund extends Dog
{
    public Dachshund()
    {
        this.name = "Null";
        this.mass = "Null";
    }
    public Dachshund(String name)
    {
        this.name = name;
        this.mass = "Null";
    }
    public Dachshund(String name,String mass)
    {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String getColour() {
        return "Colour = Brown";
    }

    public String getMission() {
        return "Mission = Hunting";
    }

}
