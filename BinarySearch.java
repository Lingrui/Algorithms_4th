import java.util.Arrays;
public class BinarySearch  
{
    public static int rank(int key,int[] a)
    { // array in order  
        int lo = 0; 
        int hi = a.length - 1; 
        while(lo <= hi)
        { // key should exist in a[lo,hi] or don't exist
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                   return mid;
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty())
        { // read key, print out key if not exist in whitelist
            int key = StdIn.readInt();
            if (rank(key,whitelist) == -1)
                StdOut.println(key);
        }
    }
}


