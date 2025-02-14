class GCD{
    public static void main(String[]args){
        int a=10,b=15;
        while(b!=0){
            int temp=b;
             b=a%b;
             a=temp;
        }
        System.out.println(a);
       
    }
}