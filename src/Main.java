import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("MENU\n1.LARGEST OF 3 NUMBERS\n2.SMALLEST OF 3 NUMBERS\n3.PRIME OR NOT\n4.EVEN OR NOT\n5.REVERSE A NUMBER\n6.EXIT");
            System.out.println("ENTER YOUR CHOICE:");
            c = sc.nextInt();
        }while (c!=6);
    }
}