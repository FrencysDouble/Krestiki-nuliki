package III;

class Square extends Rectangle
{
    protected double side;
    Square()
    {
        this.side = 0;
    }
    Square(double side)
    {
        this.side = side;
    }
    Square (double side, String color, boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public void setSide()
    {
        this.side = side;
    }
    public double getSide()
    {
        return side;
    }
    public void SetWidth(double side)
    {
        this.width = side;
    }
    public void setLength(double side)
    {
        this.length = side;
    }
    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return 2*width+2*length;
    }
    public String toString()
    {
        return "Rectangle : Square, length:"+ this.length+"width: "+ this.width;
    }

}
