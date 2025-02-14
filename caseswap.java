class Case{
    public static void main(String[] args){
        String S1="GuRuMaNoJ";
        String S2="";
        char[] arr=S1.toCharArray();
        for(int i=0;i<arr.length;i++){
         if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char)(arr[i]-32);
                S2=S2+arr[i];
            }
            else{
                arr[i]=(char)(arr[i]+32);
                S2=S2+arr[i];
            }
        }
        System.out.println(S2);
    }



    
}