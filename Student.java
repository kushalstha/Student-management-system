public class Student {
  private String name;
  private int age;

  //Constructor
  public Student(String name, int age){
    this.name = name;
    this.age = age;
  }


  public Sting getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public void displayStudent(){
    System.out.println('Name: '+name);
    System.out.println('Age: '+age);
    

  }

}