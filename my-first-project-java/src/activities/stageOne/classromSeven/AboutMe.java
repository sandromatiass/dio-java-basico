package activities.stageOne.classromSeven;

import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
  
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Type your height: ");
    double height = scanner.nextDouble();

    System.out.print("Type your first name: ");
    String firstName = scanner.next();

    System.out.print("Type your second name: ");
    String secondName = scanner.next();

    System.out.print("Type your age: ");
    int age = scanner.nextInt();
 

    System.out.println("Hi, my name is " + firstName + " " + secondName);
    System.out.println("I have " + age + " years ");
    System.out.println("My height is " + height + " cm ");
  }
}
