import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter first number");
            int a= sc.nextInt();
            System.out.println("Please enter second number");
            int b = sc.nextInt();
            System.out.println("Please enter third number");
            int c = sc.nextInt();
            if (a>b)
            {
                if (a>c)
                    System.out.println(a+" is the largest number");
                else System.out.println(c+" is the largest number");
            }
            else
            if (b>c)
                System.out.println(b+" is the largest number");
            else System.out.println(c+" is the largest number");
        }

    }
}