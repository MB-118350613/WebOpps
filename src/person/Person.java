/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import java.util.Scanner;
//import Person.personExample;


/**
 *
 * @author mark1
 */
public class Person {
//import.java.util.scanner;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = sc.next();
        System.out.println("What is your age");
        int age = sc.nextInt();
        System.out.println(" what is your height");
        double height = sc.nextDouble();
        System.out.println("Thank You ");
        
        
        // so basically you either need to use the way above and use a scanner 
        //or you can hard code an an value to the variables 
        //using getters and setters
       
      personExample me2 = new personExample();
        me2.setName("Mark");
        System.out.println(me2.getName());
              me2.setHeight(5.7);
        System.out.println(me2.getHeight());
              me2.setAge(21);
        System.out.println(me2.getAge());
    }
    
}
