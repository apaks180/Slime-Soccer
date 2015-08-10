public class Global
{
    public static final int WIDTH = 1120;
    public static final int HEIGHT = 645;
    public static final int minV = 5;
    public static final int maxV = 12;
    
    public static final int SLIME1 = 0;
    public static final int SLIME2 = 1;
    
    
    //Brent. Be vary careful when using these because whether they're 
    //negative or positive depends on direction.
    public static final double XDECELERATION = .2;
    public static final double XACCELERATION = .1;
    public static final double GRAVITY_GOING_UP = 1;//when going up
    public static final double GRAVITY_GOING_DOWN = .5;//when going down
    
    public static final double MAX_X_VELOCITY = 5;
    public static final double MAX_FALLING_SPEED = 2;
    public static final double JUMP_SPEED = 3;
}