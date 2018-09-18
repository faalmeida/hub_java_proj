package lambda;

public class School {

	public int total (int a,int b, int c, Home home) {
		return home.execute(a, b, c);
	}
	
	public static void main(String[] args) {
		
		School sh = new School();
		
		Home home = (a,b,c) -> a + b +c;
		
		int total = sh.total(2, 3, 5, home);
		
		System.out.println("total: "+total);
		
	}
	
}
