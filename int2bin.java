public class int2bin
{
    public static void main(String[] args)
    {
        int x; 
        //x = 0; 
        StdOut.println("Please enter a number: ");
        x = StdIn.readInt();
        StdOut.println(convert(x));
    }

    public static String convert(int x)
    {
        String s = "";
        for (int n = x; n >0; n/=2)
            s = (n % 2) + s;
        return s; 
     }

}
