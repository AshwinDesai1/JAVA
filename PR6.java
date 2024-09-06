class Circle {

    private double x,y,r;

    public Circle()
    {
      this.x=2;
      this.y=2;
      this.r=3;
    }

    public Circle(double r)
    {
        this.x=5;
        this.y=5;
        this.r=r;
    }
    public Circle(double x, double y, double r)
    {
        this.x=x;
        this.y=y;
        this.r=r;
    }

    public double area()
    {
        return Math.PI*r*r;
    } 
}
public class PR6 {
    
}
