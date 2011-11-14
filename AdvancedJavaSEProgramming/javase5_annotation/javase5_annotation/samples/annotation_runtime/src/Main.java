import java.lang.annotation.*;

public class Main {
    
    AnnotatedClass ac;
    
    public Main() {
        ac = new AnnotatedClass();
    }
    
    public void printAnnotations() {
        Class c = ac.getClass();
        Annotation[] annotations = c.getAnnotations();
        int numberOfAnnotations = annotations.length;
        System.out.println("Class " + c.getName() + " has " +
                numberOfAnnotations + " annotations");
        
        for (int i = 0 ; i < numberOfAnnotations; i++) {
            System.out.println("Annotation " + i + ": " + annotations[i] +
                    ", type" + annotations[i].annotationType().getName());
        }
    }
    
    public static void main(String[] args) {
        Main ar = new Main();
        ar.printAnnotations();
        
    }
}