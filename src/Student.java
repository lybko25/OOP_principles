import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * Created by lubko on 21.12.2016.
 */
public class Student extends Person implements IPerson{
    private String Faculty;
    private boolean PayForStudy;
    public Student() {
    }
    public Student(String name, String surname, int age, String faculty, boolean payForStudy) {
        super(name, surname, age);
        Faculty = faculty;
        PayForStudy = payForStudy;
    }
    @Override
    public void Input(){
        Scanner scn = new Scanner(System.in);
        super.Input();
        System.out.println("Input faculty:");
        this.Faculty=scn.nextLine();
        System.out.println("Input true if you pay for study, or false if you don't pay:");
        this.PayForStudy=scn.nextBoolean();
    }
    @Override
    public void Print(){
        super.Print();
        if (this.PayForStudy==true)
            System.out.println("He studies on faculty "+Faculty+" and he pays for study!");
        else
            System.out.println("He studies on faculty "+Faculty+" and he doesn't pay for study!");
    }

}
