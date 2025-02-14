import java.util.Scanner;
class New{
    public static void main(String[]args){
        Scanner n=new Scanner(System.in);
        String S1=n.nextLine();
        String S2=n.nextLine();
        StringBuilder sa=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        System.out.print(S1.equals(S2));
        System.out.print(S1.startsWith("S"));
        System.out.print(S1.charAt(5));
        System.out.print(S1.indexOf("a"));
        System.out.print(S1.contains("ran"));
        System.out.print(S1.toCharArray());
        System.out.print(S1.toUpperCase());
        System.out.print(S1.substring(2,7));
        System.out.println(sa);

    }
}