package myjavaproject;
import java.util.*;

public class stringbuilderr {
	StringBuilder sb2 = new StringBuilder();
	StringBuilder sb1 = new StringBuilder("this is klh");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	StringBuilder sb = new StringBuilder(str);
	sb.append("hello");
	System.out.println(sb);
	System.out.println(sb.insert(3, "hello"));
	System.out.println(sb1.reverse());
	System.out.println(sb.replace(1,4,"java"));
	System.out.println(sb.delete(5,8));
	System.out.println(sb2.capacity());
	sb1.setCharAt(2, 'a');
	System.out.println(sb1);
	System.out.println(sb1.substring(5));
	System.out.println(sb1.substring(5,8));
	System.out.println(sb1.deleteCharAt(5));
	String str1=sb.toString();
	System.out.println(sb1);

	

}

}
