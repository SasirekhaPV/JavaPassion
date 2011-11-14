
package mypeopleexample;

public class InternationalStudent extends Student {
   
    public InternationalStudent() {
        // System.out.println("InternationalStudent: constructor is called");
    } 

    public InternationalStudent(String name, String school, double grade, String country) {
        super.name = name;
        super.school = school;
        super.grade = grade;
        this.country = country;
        // System.out.println("InternationalStudent: constructor 2 is called");
    } 
   
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // A overriding method
    public void myMethod(String t){
        System.out.println("myMethod(" + t + ") in InternationalStudent class");
    }
   
}