
public class ShadowTest2 {
	
	public int x = 5;

	void methodInFirstLevel(int x) {
		System.out.println("x = " + x);
    //System.out.println("y = " + y);
    System.out.println("this.x = " + this.x);
    System.out.println("ShadowTest.this.x = " + ShadowTest2.this.x);
	}
	
	public static void main(String[] args) {
		ShadowTest2 st = new ShadowTest2();
        //ShadowTest.FirstLevel fl = st.new FirstLevel();
        st.methodInFirstLevel(23);
	}
	
}
