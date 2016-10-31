public class HelloWorld {
    public static void main (String[] args) {
        new HelloWorld(args);
    }

	public HelloWorld(String[] args) {
		if(args.length == 1) {
			System.out.println(this.hello() + " " + args [0] + "!");
		} else {
			System.out.println(this.hello() + " " + this.world() + "!");
		}
    }

	private String hello() {
        return "Hello";
    }

	private String world() {
        return "World!";
    }


}
