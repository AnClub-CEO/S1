package com.cnchap15;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class Stringdemo {

	@Ignore
public void getlength(){
		Scanner input=new Scanner(System.in);
System.out.println("������");	
String pwd=input.next();
if(pwd.length()>=6){
	System.out.println("OK");
}else{
	System.out.println("������");
	
}
	
	
	
}



	@Ignore
	//String����
	//���ɱ���(һ�θ�ֵ���޷��޸�)
	//���ֱ�Ӹ�ֵ�Ļ���������ȥջ�в���
	//�Ѿ����ڴ�ֱֵ�����õ�ַ
	//3.new String()�Ὺ��һ���¿ռ�
	public void eq(){
		String name ="��";
		String names="��";
		System.out.println("=="+name==names);
		System.out.println("equals:"+name.equals(names));
		
		
	}@Test
	public void ignore(){
		Scanner input =new Scanner(System.in);
		System.out.println("������");
		String num=input.next();
		System.out.println("equalsignorecase:"+("zhengtianyu".equalsIgnoreCase(num)));
		System.out.println("lower:"+num.toLowerCase());
		System.out.println("upper:"+num.toUpperCase());
	}
}

