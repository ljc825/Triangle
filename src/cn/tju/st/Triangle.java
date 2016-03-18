package cn.tju.st;

public class Triangle {
	public int a;
	public int b;
	public int c;
	public Triangle(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
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
