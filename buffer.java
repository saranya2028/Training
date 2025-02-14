import java.util.Scanner;
class Buffer{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();//only one word is accepted
        String hii=sc.nextLine();//reads more words and immutable
        System.out.println(name+hii);
        StringBuilder ba=new StringBuilder(hii);//mutable
        System.out.println(ba);
        ba.append("Hello");
        ba.replace(0, 1, "Hi");
        System.out.println(ba);


    }
}