class Som{
    public static void main(String[] args){
        String S1="Hello World!!".toLowerCase();
        int opt=0,a=0;
        if(opt==0){
            for(int i=0;i<S1.length();i++){
                if(S1.charAt(i)>='a' && S1.charAt(i)<='z'){

                }
                if(S1.charAt(i)=='a' || S1.charAt(i)=='e' || S1.charAt(i)=='i' || S1.charAt(i)=='o' || S1.charAt(i)=='u'){
                    continue;}
                    a+=S1.charAt(i)-96;
                
            }
        }System.out.println(a);
    }
}