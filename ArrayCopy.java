import java.util.Arrays;
public class ArrayCopy
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,6};
        int[] b={2,4,6,8,10};
        int c=a.length;
        int d=b.length;
        int result[]=new int[c+d];
        System.arraycopy(a, 0, result, 0, c);
        System.arraycopy(b, 0, result, c,d);
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        int n=result.length;
        if(n%2==0)
        {
            System.out.print((result[n/2]+result[(n/2)+1])/2);
        }
        System.out.println(result[n/2]);
    }
}
