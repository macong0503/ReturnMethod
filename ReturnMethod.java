package com.fs.test;

public class ReturnMethod {
	
	//基本数据类型作为返回值
	public int aMethod(){
		//直接返回该类型
//		return 1;
		
		//返回值自动类型转换
//		byte b =10 ;
//		return b;//byte-->int
		
		//返回值强制类型转换
		double d =12.5;
		return (int)d;
		
	}
	
	int b=1000;
	//引用类型作为返回值
	public ReturnTest bMethod(){
		System.out.println("bMethod");
		return new ReturnTest();
	}
//一个有返回值的方法中有且只有一条return被执行
	public String cMethod(int a){
		if(a>0){
			return "a>0";
		}
		else{
			return "a<0";
		}
	}
	
	
	public static void main(String[] args) {
		ReturnMethod rt = new ReturnMethod();
		rt.bMethod();//没有接受方法的返回值
		
		ReturnTest x = rt.bMethod();//接受方法的返回值
		System.out.println(x.b);
	

	}

}
