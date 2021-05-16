package Interfaces;

import java.io.Serializable;

public class Person  {
String name;

public Person(int id, String name){
this.name = name;
}

    public void sayHello(){
        System.out.println("Привет");
    }

    public void showInfo(){
        System.out.println(this.name + "Рад знакомству");
    }


}
