package FirstHalf;
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();
        if(age>=18 && age<130){
            System.out.println("You are an adult");
        }
        else if (age>=130) {
            System.out.println("You are a ghost");

        }
        else {
            System.out.println("You are not adult");
        }

    }
}
