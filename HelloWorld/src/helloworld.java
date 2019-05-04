
public class helloworld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] x = {10,20,30};
		int[] y = new int[3];		
		System.arraycopy(x, 0, y, 0, x.length);
		System.out.println(y[2]);
	}

}
