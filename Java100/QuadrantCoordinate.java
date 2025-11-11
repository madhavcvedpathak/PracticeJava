package Java100;
public class QuadrantCoordinate {
    public static void main (String[] args)
    {
        int x=-3, y=-33;

        if(x>0 && y>0)
            System.out.println("Quadrant I");
        else if(x<0 && y>0)
            System.out.println("Quadrant II");
        else if(x<0 && y<0) System.out.println("Quadrant III");
        else if (x > 0 && y < 0)
            System.out.println("Quadrant IV");

        else if (x == 0 && y == 0)
            System.out.println("Origin");
        else if (y==0 && x!=0)
            System.out.println("x-axis");
        else if (x==0 && y!=0)
            System.out.println("y-axis");
    }
}
