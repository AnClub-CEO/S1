package com.disanzhang.jianda;

import java.util.Scanner;

public class jianda4 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个整数：");
         int a =input.nextInt();
         if(a%3==0||a%5==0){
         System.out.print("是3或5的倍数");
         } else{
        	 System.out.print("不能被整除");
         
		
		

	}

}
}