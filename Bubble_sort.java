import java.io.*;
class test
{
    public static void bubble_sort(int[] ar)
    {
        int n=ar.length;
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(ar[j-1]>ar[j])
                {
                    temp=ar[j-1];
                    ar[j-1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ar[];
        System.out.println("Enter for how many numbers you want to apply bubble sort:");
        int limit=Integer.parseInt(br.readLine());
        
        System.out.println("Enter the numbers to apply bubble sort: ");
        for(int i=0;i<limit;i++)
        {
            ar[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Before applying bubble sort");
        for(int i=0;i<ar.length;i++)
        System.out.println(ar[i]);
        bubble_sort(ar);
        System.out.println("After applying bubble sort");
        for(int i=0;i<ar.length;i++)
        System.out.println(ar[i]);
    }

}
