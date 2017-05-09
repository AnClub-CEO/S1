package com.cnchap15;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class Stringdemo {

	@Ignore
public void getlength(){
		Scanner input=new Scanner(System.in);
System.out.println("请输入");	
String pwd=input.next();
if(pwd.length()>=6){
	System.out.println("OK");
}else{
	System.out.println("锤死你");
	
}
	
	
	
}



	@Ignore
	//String特性
	//不可变性(一次赋值，无法修改)
	//如果直接赋值的话，首先先去栈中查找
	//已经存在此值直接引用地址
	//3.new String()会开辟一个新空间
	public void eq(){
		String name ="我";
		String names="我";
		System.out.println("=="+name==names);
		System.out.println("equals:"+name.equals(names));
		
		
	}@Test
	public void ignore(){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入");
		String num=input.next();
		System.out.println("equalsignorecase:"+("zhengtianyu".equalsIgnoreCase(num)));
		System.out.println("lower:"+num.toLowerCase());
		System.out.println("upper:"+num.toUpperCase());
	}
}

