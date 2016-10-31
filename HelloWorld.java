public class HelloWorld {
    public static void main (String[] args) {
        new HelloWorld();
    }

	public HelloWorld() {
        System.out.println(this.hello() + " " + this.world() + "!");
    }

	private String hello() {
        return "Hello";
    }

	private String world() {
        return "World";
    }


}
