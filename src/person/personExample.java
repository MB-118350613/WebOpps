/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author mark1
 */
public class personExample {
  public String name;
  public int age ;
  public double height ;
  
  personExample(){
      
  }
  personExample(String name, int age , double height){
      this.name = name ;
      this.age= age;
      this.height =height;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
  
  
        
    @Override
    public String toString(){
    return "Hi my name is " + this.name+ ", my age is "+ this.age +"my height is " + this.height;
}
}

