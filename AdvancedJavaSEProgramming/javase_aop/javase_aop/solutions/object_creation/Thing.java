/*
 * To work with an object right when it is constructed,
 * understand the differences between the join points for 
 * constructor call, constructor execution, and initialization.
 */
 // ------- examples of constructors and the ways they invoke each other.
class Thing {
    String message;
    Thing() {
        this("none");
    }
    Thing(String message) {
        this.message = message;
    }
}

class AnotherThing extends Thing {
    AnotherThing() {
        super(); // this does not append to message as the one below does.
    }
    
    AnotherThing(String message) {
        super(message + " from-AnotherThing");
    }
}