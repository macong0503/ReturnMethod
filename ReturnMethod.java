package com.fs.test;

public class ReturnMethod {
	
	//��������������Ϊ����ֵ
	public int aMethod(){
		//ֱ�ӷ��ظ�����
//		return 1;
		
		//����ֵ�Զ�����ת��
//		byte b =10 ;
//		return b;//byte-->int
		
		//����ֵǿ������ת��
		double d =12.5;
		return (int)d;
		
	}
	
	int b=1000;
	//����������Ϊ����ֵ
	public ReturnTest bMethod(){
		System.out.println("bMethod");
		return new ReturnTest();
	}
//һ���з���ֵ�ķ���������ֻ��һ��return��ִ��
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
		rt.bMethod();//û�н��ܷ����ķ���ֵ
		
		ReturnTest x = rt.bMethod();//���ܷ����ķ���ֵ
		System.out.println(x.b);
	

	}

}
