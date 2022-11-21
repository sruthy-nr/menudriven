import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c,x,y,z,temp,largest;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("MENU\n1.LARGEST OF 3 NUMBERS\n2.SMALLEST OF 3 NUMBERS\n3.PRIME OR NOT\n4.EVEN OR NOT\n5.REVERSE A NUMBER\n6.EXIT");
            System.out.println("ENTER YOUR CHOICE:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("ENTER 3 NUMBERS:");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    z = sc.nextInt();
                    temp=x>y?x:y;
                    largest=z>temp?z:temp;
                    System.out.println(largest+" is the largest number");
                    break;
                default:
                    System.out.println("Invalid choice...Please Enter other choice... ");
                    break;
            }
        }while (c!=6);
    }
}