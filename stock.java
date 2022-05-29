class stock
{
    public static void main()
    {
        int prices[]={7,1,5,3,6,4};
        int min_prof=0;
        int min_index=0;
        for(int i=0;i<=5;i++)
        {
            for(int j=i+1;j<=4;j++)
            {
                if(prices[i]<=prices[j])
                {
                        min_prof=prices[i];
                        min_index=i;
                }
            }
        }
        for(int i=min_index;i<6;i++)
        {
            if(prices[i]>min_prof)
            {
                System.out.println("Max. profit is: "+(prices[i]-min_prof));
            }
        }
    }
}