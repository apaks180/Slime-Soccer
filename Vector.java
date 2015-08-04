public class Vector
{
    public double x;
    public double y;
    
    public Vector(double a, double b)
    {
        x = a;
        y = b;        
    }     
    public static Vector addVectors(Vector a, Vector b)
    {
        return new Vector(a.x + b.x, a.y + b.y);
    }
    public static Vector subtractVectors(Vector a, Vector b)
    {
        return new Vector(a.x - b.x, a.y - b.y);
    }
}