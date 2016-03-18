package cn.tju.st;

public class Triangle2 {
	public String judge(int a,int b,int c) {
		if(a==b&&b==c)
			return "equilateral";
		else if(a==b||b==c||c==a)
			return "isosceles";
		else {
			return "scalene";
		}
	}
}
