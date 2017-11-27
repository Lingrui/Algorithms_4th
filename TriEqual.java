public class TriEqual 
{
    public static void main(String[] args)
    {
        int a,b,c;
        a=b=c=0;
        StdOut.println("Please enter three numbers:");
        a = StdIn.readInt();
        b = StdIn.readInt();
        c = StdIn.readInt();
        if(equals(a,b,c)==1)
        {
            StdOut.print("equal");
        }
        else
        {
            StdOut.print("not equal");
        }
    }

    public static int equals(int a,int b,int c)
    {
        if(a==b&&b==c)
        {
            return 1;
        }
        else
        {  
            return 0;
        }
    }
}
