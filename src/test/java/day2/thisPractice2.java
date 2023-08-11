package day2;

public class thisPractice2 {
	int i =1;
	int j= 2;
	public static void main (String[] args) {
		
		thisPractice2 a= new thisPractice2();
		a.add(4, 5);
		
	}
	
	public void add(int i, int j) {
		System.out.println(i+j);
		System.out.println("=============");
		System.out.println(this.i+this.j);
		
	}
}



