import java.util.Scanner;

/**
 * Created by lubko on 21.12.2016.
 */
public class Worker extends Person implements IPerson{
    private String Company;
    private int Salary;

    public Worker(String name, String surname, int age, String company, int salary) {
        super(name, surname, age);
        Company = company;
        Salary = salary;
    }

    public Worker() {

    }
    @Override
    public  void Input(){
        super.Input();
        Scanner scn = new Scanner(System.in);

        System.out.println("Input company:");
        this.Company=scn.nextLine();
        System.out.println("Input salary:");
        this.Salary=scn.nextInt();
    }
    @Override
    public void Print(){
        super.Print();
        System.out.println("He works in company "+this.Company+" and earns "+this.Salary);
    }
}
