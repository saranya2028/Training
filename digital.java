class Digital{
 public static void main(String[]args)
 {
        int[] arr={1,3,5,8,9,2,6};
        int[] c=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
        c[i]=arr.length;
        }
    c[0]=0;
    for(int i=0;i<arr.length;i++)
    {
        for(int j=1;j<=arr[i];j++)
        {
            if(i+j<arr.length)
            {
            c[i+j]=Math.min(c[i+j],c[i]+1);
            }
    }
    System.out.println(c[6]);
  }
}
}