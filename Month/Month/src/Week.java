import java.util.Scanner;
public class Week {
    public static void main(String args[])
    {
        int m;
        System.out.println("Enter your choice(1-7):");
        Scanner input=new Scanner(System.in);
        m=input.nextInt();
        switch (m)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }

    }
}
