class ddarray2
{
    public static void main()
    {
        int Arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        System.out.println("Array is= ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(Arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}