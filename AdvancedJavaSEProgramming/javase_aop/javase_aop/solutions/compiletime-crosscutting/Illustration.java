public class Illustration {
    public static void main(String[] args) {
	ThirdParty tpc = new ThirdParty();
	tpc.blocking();
	tpc.dangerous();
    }
}

class ThirdParty {
    public void blocking() {
	System.out.println("Blocking");
    }

    public void blocking2() {
	System.out.println("Blocking");
    }

    public void dangerous() {
    }
}
