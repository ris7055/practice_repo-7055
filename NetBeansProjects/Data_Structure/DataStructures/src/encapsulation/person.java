
package encapsulation;


public class person {

private String name;
private int age;// setter and getter method is used,
                //to access this private variables in main class

public void setName(String name){
this.name = name;

}

public String getName(){
    return name;
}

public void setAge(int age){
    this.age = age;
}
public int getAge(){
    return age;
  
}
    
}
