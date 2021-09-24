package III;

public abstract class Dog {
    protected String name;
    protected String mass;
    public Dog()
    {
        this.name = "Null";
        this.mass = "Null";
    }
    public Dog(String name)
    {
        this.name = name;
        this.mass = "Null";
    }
    public Dog(String name,String mass)
    {
        this.name = name;
        this.mass = mass;
    }
    public void setMass(String mass)
    {
        this.mass = mass;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public String getMass()
    {
        return mass;
    }
    public abstract String getColour();
    public abstract String getMission();
}
