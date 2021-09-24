package I;

import java.lang.*;

public class Ball {
    private String type;
    private String colour;

    public Ball(String t, String c)
    {
        type = t;
        colour = c;
    }
    public void SetType(String type)
    {
        this.type = type;
    }
    public void SetColour(String colour)
    {
        this.colour = colour;
    }
    public String GetType(String type)
    {
        return type;
    }
    public String GetColour(String colour)
    {
        return colour;
    }
    public void Print() {
        System.out.println(type);
    }
}
