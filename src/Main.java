import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c,x,y,z,temp,largest,smallest;
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
                case 2:
                    System.out.println("ENTER 3 NUMBERS:");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    z = sc.nextInt();
                    temp=x<y?x:y;
                    smallest=z<temp?z:temp;
                    System.out.println(smallest+" is the smallest number");
                    break;
                case 3:
                    System.out.println("ENTER THE NUMBER:");
                    x = sc.nextInt();
                    boolean flag = false;
                    for (int i = 2; i <= x / 2; ++i) {
                        if (x % i == 0) {
                            flag = true;
                            break;
                        }
                    }
                case 4:
                    System.out.println("ENTER THE NUMBER:");
                    x = sc.nextInt();
                    if(x % 2 == 0)
                        System.out.println(x + " is even");
                    else
                        System.out.println(x + " is odd");
                    break;
                case 5:
                    System.out.println("ENTER THE NUMBER:");
                    x = sc.nextInt();
                    int rev=0;
                    while(x != 0)
                    {
                        int rem = x % 10;
                        rev = rev * 10 + rem;
                        x = x/10;
                    }
                    System.out.println("The reverse of the given number is: " + rev);
                    break;
                default:
                    System.out.println("Invalid choice...Please Enter other choice... ");
                    break;
            }
        }while (c!=6);
    }
}