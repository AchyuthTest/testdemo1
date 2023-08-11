package day2;

public class thisPractice {
	int i =1;
	int j= 2;
	public static void main (String[] args) {
		
		thisPractice a= new thisPractice();
		a.add(4, 5);
		
	}
	
	public void add(int i, int j) {
		System.out.println(i+j);
		System.out.println("=============");
		System.out.println(this.i+this.j);
		
	}
}



