aspect CompileTimeCrosscutting {
    pointcut callToDangerousCode() : call(* ThirdParty.dangerous());
    pointcut callToBlockingOperations() : call(* ThirdParty.blocking());

    declare error : callToDangerousCode()
	: "This third-party code is known to result in crash";

    declare warning : callToBlockingOperations() 
	: "Please ensure you are not calling this from AWT thread";

    before() : callToBlockingOperations() {
	   System.out.println("Going to block");
    }
}

