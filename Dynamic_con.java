public class Dynamic_con
{
    public static void main(String[] args)
    {
        int N = StdIn.readInt();
        //StdOut.println(N);
        UF uf = new UF(N);
        while (!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            //StdOut.println(p);
            int q = StdIn.readInt();
            //StdOut.println(q);
            if (!uf.connected(p,q))
            {
                uf.union(p,q);
                StdOut.println(p + " " + q);
            }
        }
    }
}
