package cn.tju.st;

public class Triangle {
	public int a;
	public int b;
	public int c;
	public Triangle(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public String judge() {
		if(a==b&&b==c)
			return "equilateral";
		else if(a==b||b==c||c==a)
			return "isosceles";
		else {
			return "scalene";
		}
	}
}
