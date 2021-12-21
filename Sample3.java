class DisplayOverloading3{
	public void dsp(char c, int num) {
		System.out.println("i'm the first definition of the method display");
	}
	public void dsp(int num, char c) {
		System.out.println("i'm the second definition of the method display");
}
}
class Sample3 {

	public static void main(String[] args) {
		DisplayOverloading3 obj = new DisplayOverloading3();
		obj.dsp('x',51);
		obj.dsp(52,'y');
	}

}
