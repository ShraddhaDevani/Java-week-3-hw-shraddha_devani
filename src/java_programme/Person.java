package java_programme;

/**
 * Write a class with the name Person. The class needs three fields (instance variables) with the names  firstName, lastName of type String and age of type int.
 * To check if s String is empty, use the method isEmpty from the String class. For example,  firstName.isEmpty() returns true if the String is empty or in other words, when the String does not  contain any characters.
 */
public class Person {
    String firstName;
    String lastName;
    int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    public boolean isTeen(){
        return (age > 12 && age < 20);
    }
public String getFullName(){
        if (firstName.isEmpty()  &&  lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        }else {
            return firstName + " " + lastName;
        }

}

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");//empty firstName string
        person.setLastName("");//empty LastName string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is Smith
        System.out.println("fullName= " + person.getFullName());

    }

}
