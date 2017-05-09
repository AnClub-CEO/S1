package com.cnchap15;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class ClassSJOne {
	Scanner input=new Scanner(System.in);
	@Ignore
public void register() {
	System.out.println("欢迎使用注册系统");
	boolean flag=false;
	do {
		System.out.println("用户名");
		String name=input.next();
		System.out.println("密码");
		String pwd =input.next();
		System.out.println("确认密码");
		String repwd=input.next();
		//判断是否三位
if (name.length()<3) {
	System.out.println("必须大于三位");
	
}else if(!pwd.equals(repwd)){
	System.out.println("必须一致");
	
	
}else{
	
	//ok
	flag=true;
}
	} while (!flag);
	System.out.println("OK");
}@Ignore
	public void index(){
		System.out.println("请输入");
		String email=input.next();
		System.out.println("indexof"+email.indexOf("@"));
		System.out.println("lastindexof"+email.lastIndexOf("@"));
	}
@Ignore
public void email() {
	System.out.println("请输入邮箱");
	String email=input.next();
	int index =email.indexOf("@");
	int index_1=email.indexOf('.');
	if(index_1-index>2){
		System.out.println("正确~");
	}else{
		System.out.println("错误");
	}
}
@Ignore
public void substring(){
	//截取
	System.out.println("请输入字符串");
	String str=input.next();
	System.out.println("从第三个开始截取"+str.substring(2));
	System.out.println("带两个参数"+str.substring(2,5));
	
}
@Ignore
public void trim(){
	String name="     娃哈哈";
	if(name.trim().equals("娃哈哈")){
		System.out.println("去掉了~");
		
		
	}
	
	
}
@Test
public void split() {
	String str="那是我日夜思念深深爱着的人啊@到底我该如何表达@她会接受我吗";
	//空格拆分
	String[]strs=str.split("@");
	for (String string : strs) {
System.out.println(string);
		
	}
}
}
