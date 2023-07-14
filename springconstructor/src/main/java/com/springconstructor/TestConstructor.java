package com.springconstructor;

import java.util.List;

public class TestConstructor 
{
    private String name;
    private int personId;
    private Certi certi;
    private List<String> list;
     public TestConstructor(String name,int personId,Certi certi,List<String>list) 
     {
    	 this.name=name;
    	 this.personId=personId;
    	 this.certi=certi;
    	 this.list=list;
     }
	public TestConstructor() 
	{
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() 
	{
		return this.name+ " : "+this.personId+" {" +this.certi.name+ "}";
	}
     
}
