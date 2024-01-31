import java.util.Scanner;

public class ifelse{
    public static void main(String[] args) {
        int age;
        System.out.println("enetr ur age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age==18)
        {
            System.out.println("u are a adult");

        }
        else if (age<15)
        {
            System.out.println(("ur are a student"));
        }
        else if(age>25)
        {
            System.out.println("ur can drink:");
        }
        else {
            System.out.println("have a good day");
        }
    }
}