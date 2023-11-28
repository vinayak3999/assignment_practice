package assignment_practice;

public class UnaryOperato {
	public static void main(String[] args) {
		
		boolean b1 = true;
		System.out.println(!b1);
		
		boolean b2 = false;
		System.out.println(!b2);
		System.out.println(+10);
		System.out.println(-10);
		
		
		//Increment Operator
		
//		int i = 10;
//		i++;
//		++i;
//		System.out.println(i);
		
//		// Pre Increment- ++i- First Increase then assign
//		
//		int i = 10;
//		int j = ++i;
//		System.out.println("J-> " + j);
//		System.out.println("i-> " + i);
	
//		//Post Increment- i++- First Assign then increment
//		
//		int i = 10;
//		int j = i++;
//		System.out.println("j->" + j);
//		System.out.println("i->" + i);
		
//		int i = 10;
//		int j = i++ + ++i;
//		
//		System.out.println("J-> " + j);
//		System.out.println("i-> " + i);
		
//		int i = 10;
//		int j = ++i + ++i;
//		
//		System.out.println("J-> " + j);
//		System.out.println("i-> " + i);
		
//		int i = 10;
//		int j = i++ + i++;
//		
//		System.out.println("J-> " + j);
//		System.out.println("i-> " + i);
		
		int i = 10;
		int j = ++i + i++;
		
		System.out.println("J-> " + j);
		System.out.println("i-> " + i);
		

	
	}

}
 