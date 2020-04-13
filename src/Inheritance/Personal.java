package Inheritance;

import polymoprhism.Person;

public class Personal {
    private String name;
    private String surname;
    private int age;

    public Personal(){
        name = "Empty field";
        surname = "Empty field";
        age = 0;
    }
    public Personal(String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public String getIdInfo(){
        return "Info =  Name :" + name + " Surname : " + surname + " Age : " + age;
    }
    @Override
    public String toString(){
        return "Info = " + name + " " + surname + " " + age;
    }
}
