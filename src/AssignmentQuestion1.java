public class AssignmentQuestion1 {

    public static void main (String[] args)
        {
            int [] a = {-1, 2, 3, -7, 12, -4, 0, 1, 3};
            int size = a.length;
            int max = Integer.MIN_VALUE, max_end = 0;
            int  first = 0,last = 0,start = 0;

            for (int i = 0; i<size; i++)
            {
                max_end = max_end + a[i];
                if (max<max_end)
                {
                    max = max_end;
                    first=start;
                    last=i;
                }
                if (max_end< 0)
                {
                    max_end = 0;
                    start=i+1;
                }
            }

            int sum=0;
            for(int i=last+1;i<size;i++)
            {
                sum=sum+a[i];
                //System.out.println(sum);
                if (sum == 0)
                {
                    last=i;
                }
            }
            for (int i = first; i<= last; i++) {
                System.out.print(a[i] + " ");
            }
        }
}
