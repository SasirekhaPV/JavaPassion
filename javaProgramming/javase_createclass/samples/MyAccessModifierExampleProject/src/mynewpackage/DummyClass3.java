package mynewpackage;

//Import DummyClass
import myaccessmodifierexampleproject.DummyClass;

public class DummyClass3 extends DummyClass {

    public DummyClass3() {

        System.out.println("s1 = " + s1);  // accessing private variable of DummayClass class
        System.out.println("s2 = " + s2);  // accessing protected variable s2 of DummyClass
                                           // no compile error even if DummtClass3 is in 
                                           // different package
        System.out.println("s4 = " + s4);  // accessing default access modifer variable
        method1();  // calling private method of DummyClass class
        method2();  // calling protected method
        method4();  // calling default access modifer method

        // No compile error expected
        System.out.println("s3 = " + s3);  // accessing public variable
        method3();  // calling public method
    }
}
