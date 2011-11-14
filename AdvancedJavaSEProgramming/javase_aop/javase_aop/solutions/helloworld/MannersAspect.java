// Aspect - MannersAspect.java
public aspect MannersAspect {

    // pointcut declares that what follows is a declaration of a named pointcut.
    // Next, callSayMessage(), the pointcut's name, resembles a method declaration.
    // The trailing empty () suggests that the pointcut collects no context.

    // The call(public static void HelloWorld.say*(..)) captures needed
    // joinpoints. call indicates the pointcut captures a call to, as opposed to
    // execution of, designated methods. The public static void HelloWorld.say*(..)
    // is the signature for methods to be captured. public static indicates that
    // the methods must have public access and be declared a static method. void
    // says that methods captured must have a void return type. HelloWorld.say*
    // specifies the to-be-captured method's class and name. Here, we are specifying
    // HelloWorld as a class.

    // say* uses the * wildcard to indicate the capture of methods with names
    // starting with "say." Finally, (..) specifies arguments to the captured methods.
    // In this case, you specify the .. wildcard to capture methods regardless of type
    // and number of arguments they take.
    pointcut callSayMessage() : call(public static void HelloWorld.say*(..));
   
    // Advice #1
    before() : callSayMessage() {
        System.out.println("Good day!");
    }

    // Advice #2
    after() : callSayMessage() {
        System.out.println("Thank you!");
    }
}