package com.disanzhang.jianda;

import java.util.Scanner;

public class jianda3 {

	public static void main(String[] args) {
              Scanner input=new Scanner(System.in);
              System.out.print("ÇëÊäÈëa£º");
              int a=input.nextInt();
              System.out.print("ÇëÊäÈëb£º");
              int b=input.nextInt();
              System.out.print("ÇëÊäÈëc£º");
              int c=input.nextInt();
              int num;
            
              if (a>b){
                     num=a;
                     a=b;
                     b=num;
              }
                      if(a>c){
                    num=a;
                   a=c;
                   c=num;
                     }
                    if(b>c){
                	   num=b;
                	   b=c;
                	   c=num;          
                   }
                   {
                	   System.out.print(a+"\n"+b+"\n"+c);
                 
                   }     	
                   }
                   
	       
            
              
}



