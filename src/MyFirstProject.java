/**
 * Created by lubko on 21.12.2016.
 */
import  java.util.Scanner;

public class MyFirstProject {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input n = ");
        int n = scn.nextInt();

        Person[] array=new Person[n];

        for (int i=0;i<n;i++){
            System.out.println("Input 1 to create worker or 0 to create student.");
            int c = scn.nextInt();
            if (c==1)
                array[i]=new Worker();
            else
                array[i]= new Student();

            array[i].Input();
        }

        for (int i=0;i<n;i++)
        {array[i].Print();}
    }
}

