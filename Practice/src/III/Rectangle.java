package III;

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

        public double getWidth()
        {
            return width;
        }

        public void setWidth(double width)
        {
            this.width = width;
        }

        public double getLength()
        {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return (width+length) * 2;
    }
    public String toString()
    {
        return "Shape: Rectangle, length: " +this.length+ "width: "+ this.width+"color: " + this.color;
    }
}
