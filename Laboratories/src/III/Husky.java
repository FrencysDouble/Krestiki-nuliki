package III;

class Husky extends Dog
{
    public Husky()
    {
        this.name = "Null";
        this.mass = "Null";
    }
    public Husky(String name)
    {
        this.name = name;
        this.mass = "Null";
    }
    public Husky(String name,String mass)
    {
        this.name = name;
        this.mass = mass;
    }
    @Override
    public String getColour()
    {
        return "Colour = Black-White";
    }

    public String getMission() {
        return "Mission = Riding";
    }

}
