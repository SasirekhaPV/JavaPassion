// Test code
public class Test {
    public static void main(String[] args) {
    
        Thing aThing = new Thing();
        System.out.println("aThing.message = " + aThing.message);
        aThing = new Thing("Sang");
        System.out.println("aThing.message = " + aThing.message);

        AnotherThing anotherThing = new AnotherThing();
        System.out.println("anotherThing.message = " + anotherThing.message);
        anotherThing = new AnotherThing("Shin");
        System.out.println("anotherThing.message = " + anotherThing.message);        

    }
}