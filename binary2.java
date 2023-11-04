class binary2
{
    public void Search(int n)
    {
        int A[]={5,10,15,20,25,30};
        int flag=0,L,U,M=0;
        L=0;
        U=5;
        while(L<=U)
        {
          M=(L+U)/2;
          if(n>A[M])
          {
              L=M+1;
          }
          else if(n<A[M])
          {
              U=M-1;
          }
          else
          {
              flag=1;
              break;
          }
        }
        if(flag==1)
        System.out.println("Element at index="+M);
        else
        System.out.println("Element not found");
    }
}