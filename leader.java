class leader
{
    public static void main(String args[])
    {
        int n=7;
        int temp=0;
        int a[]={7,10,4,10,6,5,2};
        System.out.println("hello");
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(a[i]<=a[j])
                {
                        break;               
                }
                else
                {
                    if(j==6)
                    System.out.println(a[i]);
                    else
                    break;
                }
                continue;
            }
        }
    }
}