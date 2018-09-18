
public class ShadowTest {
	public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int y) {
        		System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
