package III;

class Circle extends Shape
{
    protected double radius;
    public Circle()
    {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }
    public Circle(double radius)
    {
        this.radius = radius;
        this.color = "blue";
        this.filled = false;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return  radius*radius*Math.PI;
    }
    public double getPerimeter()
    {
        return  2*Math.PI*radius;
    }
    public String toString()
    {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;

    }
}
