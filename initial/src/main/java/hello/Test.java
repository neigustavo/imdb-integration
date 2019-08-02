package hello;

public class Test {

	public static void main(String[] args) {
		System.out.println("teste");
		System.out.println("Env: " + System.getenv().get("JAVA_HOME"));
		System.out.println(System.getenv().get("HISTFILESIZE"));
	}
}
