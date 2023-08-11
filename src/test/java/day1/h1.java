package day1;

import org.apache.log4j.*;

public  class h1 {
	int a =10;
	private static Logger log =Logger.getLogger(h1.class);
	public static void main(String[] args) {
		h1 obj1 = new h1();
		obj1.m1().m2().m3();
		}
	public h1 m1() {
		int a = 20;
		System.out.println("a valu in m1 " +a);
		System.out.println("a valu in class h1 " +this.a);// Take "a value" from class level value only
		System.out.println("m1");
		return this;
	} 
	public h1 m2() {
		System.out.println("m2");
		return this;
	}
	public String m3() {
		System.out.println("m3");
		return "h";
	}
}