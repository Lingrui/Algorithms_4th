public class double_0_1
{
    public static void main(String[] args)
    {
        double x,y;
        StdOut.println("Please enter two numbers: ");
        x = StdIn.readDouble();
        y = StdIn.readDouble();
        StdOut.println(between(x) && between(y));
    }

    public static boolean between(double x)

    {
        if(x>0&&x<1) 
        {
            return true;
        }
        else
        { 
            return false;
        }
    }
}
