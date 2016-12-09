package com.wyc.Exam_12709_20161209_2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	 Scanner scan = new Scanner(System.in);// 扫描器，接收控制台输入信息  
    	  
         System.out.print("请输入工资：");  
         double salary=scan.nextDouble();
         System.out.println("所需要缴纳的税费为"+count(salary));
    }
    
	public static double count(double salary) {
		double s = salary - 3500;// 工资减去3500即为要交税的金额
		if (s < 1500) {
			return (double) (s * 0.03);
		} // 超出部分S在1500内
		else if (s < 4500) {
			return (double) ((s - 1500) * 0.1 + 45);
		} // 1500-4500
		else if (s < 9000) {
			return (double) ((s - 4500) * 0.2 + 345);
		} // 4500-9000
		else if (s < 35000) {
			return (double) ((s - 9000) * 0.25) + 345 + 900;
		} // 9000-35000
		else if (s < 55000) {
			return (double) ((s - 35000) * 0.3) + 1245 + 6500;
		} // 35000-55000
		else if (s < 80000) {
			return (double) ((s - 55000) * 0.35) + 7745 + 6000;
		} // 55000-80000
		else {
			return (double) ((s - 80000) * 0.45) + 13745 + 8750;
		} // >80000
	}
}
