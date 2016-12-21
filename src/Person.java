import java.util.Scanner;

/**
 * Created by lubko on 21.12.2016.
 */

public class  Person implements IPerson {
    protected  String Name;
    protected  String Surname;
    protected  int Age;

    public Person() {
    }

    public Person(String name, String surname, int age) {
        Name = name;
        Surname = surname;

        Age = age;
    }

    @Override
    public void Print (){
        System.out.println(Name+" "+Surname+" is "+Age+" years old.");
    }
    @Override
    public void Input(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input name:");
        this.Name=scn.nextLine();
        System.out.println("Input surname:");
        this.Surname=scn.nextLine();
        System.out.println("Input age:");
        this.Age=scn.nextInt();
    }
}
