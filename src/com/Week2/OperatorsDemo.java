package com.Week2;

public class OperatorsDemo {

	public static void main(String[] args)
	{

		System.out.println("******Arithmetic Operators*******");
		int a=20,b=5;
		System.out.println("Addition is:"+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));
		System.out.println("******Unary Operators*******");
		/*
		 * ++(Increment) --(decrement)
		 * 
		 * a++ post increment
		 * ++a Pre increment
		 * a++=a=a+1
		 * a--=a=a-1
		 * a-- post decrement
		 * --a pre decrement
		 * 
		 */

		int x=100;
		System.out.println(x);//100
		System.out.println(x++);//100
		System.out.println(x);//101
		
		
		int y=90;
		System.out.println(y);//90
		System.out.println(++y);//91
		
		int a1=78;
		int b1=a1++;
		System.out.println(a1);//79
		System.out.println(b1);//78
		
		int r=168;
		int s=r++;
		
		System.out.println(r);//169
		System.out.println(s);//168
		
		int i=90;
		int j=++i;
		System.out.println(i);//91
		System.out.println(j);//91
		
		
		int c=45;
		System.out.println(c);//45
		System.out.println(c--);//45
		System.out.println(c);//44
		
		
		int e=74;
		System.out.println(e);//74
		System.out.println(--e);//73
		
		int u=786;
		int v=u--;
		System.out.println(u);//785
		System.out.println(v);//786
		
		
		int p=639;
		int q=--p;
		System.out.println(p);//638
		System.out.println(q);//638
		
		System.out.println("************Relational Operators*************");
		
		//p=q=638  v=786 e=73 c=44 i=j=91
		
		System.out.println("Less than <: "+(c<e));//true
		System.out.println("Less than equal to <=: "+(i<=j));//true
		System.out.println("Greater than >: "+(v>p));//true
		System.out.println("Greater than equal to >=: "+(i>=j));//true
		System.out.println(v<=i);//false
		System.out.println("Comparison operator ==: "+(u==v));//false
		System.out.println(p==q);//true
		System.out.println("Not equal to !=: "+(u!=v));//true
		System.out.println(i!=j);//false
		
		System.out.println("*********Logical Operators**************");
		
		/*
		 * a		b		a&&b(AND)		a||b(OR)	NOT !a
		 * true		true	true			true			false
		 * true		false	false			true			false
		 * false	true	false			true			true
		 * false	false	false			false			true
		 * 
		 */
		
		System.out.println((i==j) && (p==q));//true
		System.out.println(v==u  && v>i);//false
		System.out.println(v>p && u==v);//false
		System.out.println(i>j && j>v);//false
		
		System.out.println((i==j) || (p==q));//true
		System.out.println(v==u  || v>i);//true
		System.out.println(v>p || u==v);//true
		System.out.println(i>j || j>v);//false
		
		
		//Not
		System.out.println(v>p);//true
		System.out.println(!(v>p));//false
		
		System.out.println(v==u);//false
		System.out.println(!(v==u));//true
		
		
	System.out.println("*********Ternary operator***********");
	// condition?true:false
	int num1=200,num2=800;
	
	if(num1>num2)
	{
		System.out.println(num1+" is greater than "+num2);
	}else
	{
		System.out.println(num2+" is greater than "+num1);
	}
	
	System.out.println("******************************");
	
	System.out.println(num1>num2?num1+" is greater than "+num2:num2+" is greater than "+num1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
