package com.cnchap15;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class ClassSJOne {
	Scanner input=new Scanner(System.in);
	@Ignore
public void register() {
	System.out.println("��ӭʹ��ע��ϵͳ");
	boolean flag=false;
	do {
		System.out.println("�û���");
		String name=input.next();
		System.out.println("����");
		String pwd =input.next();
		System.out.println("ȷ������");
		String repwd=input.next();
		//�ж��Ƿ���λ
if (name.length()<3) {
	System.out.println("���������λ");
	
}else if(!pwd.equals(repwd)){
	System.out.println("����һ��");
	
	
}else{
	
	//ok
	flag=true;
}
	} while (!flag);
	System.out.println("OK");
}@Ignore
	public void index(){
		System.out.println("������");
		String email=input.next();
		System.out.println("indexof"+email.indexOf("@"));
		System.out.println("lastindexof"+email.lastIndexOf("@"));
	}
@Ignore
public void email() {
	System.out.println("����������");
	String email=input.next();
	int index =email.indexOf("@");
	int index_1=email.indexOf('.');
	if(index_1-index>2){
		System.out.println("��ȷ~");
	}else{
		System.out.println("����");
	}
}
@Ignore
public void substring(){
	//��ȡ
	System.out.println("�������ַ���");
	String str=input.next();
	System.out.println("�ӵ�������ʼ��ȡ"+str.substring(2));
	System.out.println("����������"+str.substring(2,5));
	
}
@Ignore
public void trim(){
	String name="     �޹���";
	if(name.trim().equals("�޹���")){
		System.out.println("ȥ����~");
		
		
	}
	
	
}
@Test
public void split() {
	String str="��������ҹ˼������ŵ��˰�@�����Ҹ���α��@�����������";
	//�ո���
	String[]strs=str.split("@");
	for (String string : strs) {
System.out.println(string);
		
	}
}
}
