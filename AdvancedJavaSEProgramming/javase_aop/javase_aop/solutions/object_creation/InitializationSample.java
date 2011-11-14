aspect InitializationSample {
    // -------- constructor-call picks out the calls
    /**
     * After any call to any constructor, fix up the thing.
     * When creating an object, there is only one call to 
     * construct it, so use call(..) avoid duplicate advice.
     * There is no target for the call, but the object
     * constructed is returned from the call.
     * In AspectJ 1.1, this only picks  out callers in the input
     * classes or source files, and it does not pick out
     * invocations via super(..) 
     * or this(..).
     */
    after() returning (Thing thing): 
            call(Thing.new(..)) { 
        thing.message += " after-any-constructor-call";
    }

    // -------- constructor-execution picks out each body
    /**
     * After executing the String constructor, fix up the thing.
     * The object being-constructed is available as either
     * this or target.
     * This works even if the constructor was invoked using 
     * super() or this() or by code 
     * outside the control of the AspectJ compiler.
     * However, if you advise multiple constructors, you'll advise
     * a single instance being constructed multiple times 
     * if the constructors call each other.
     * In AspectJ 1.1, this only affects constructors in the input
     * classes or source files.
     */
    after(Thing thing) returning : target(thing) && 
            execution(Thing.new(String)) { 
        thing.message += " after-String-constructor-execution";
    }

    /**
     * DANGER -- BAD!!  Before executing the String constructor,
     * this uses the target object, which is not constructed.
     */
    before (Thing thing): this(thing) && execution(Thing.new(String)) { 
        // DANGER!! thing not constructed yet.
        //thing.message += " before-String-constructor-execution";
    }
    
    // -------- initialization picks out any construction, once
    /**
     * This advises all Thing constructors in one join point, 
     * even if they call each other with this(), etc.
     * The object being-constructed is available as either
     * this or target.
     * In AspectJ 1.1, this only affects types input to the compiler.
     */
    after(Thing thing) returning: this(thing) 
            && initialization(Thing.new(..)) {
        thing.message += " after-initialization";
    }
}