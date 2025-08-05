package myjavaproject;
import java.util.*;
public class array {
	public static void main(String[] args) {
		int[]age= {10,20,30,40};
		int sum=0;
		Double average;
		System.out.println("first element "+age[0]);
		System.out.println("second element "+age[1]);
		System.out.println("third element "+age[2]);
		System.out.println("fourth element "+age[3]);
		System.out.println("for loop");
		//for (int i = 0;i<age.length;i++) {
			//System.out.println(age[i]);
			
		for(int ages:age) {
			System.out.println(ages);
			sum+=ages;
			System.out.println(sum);
			int al=age.length;
			average=((double)sum/(double)al);
			System.out.println(average);
		double[][]matri={{1,2,3,4},{9,6}};
		System.out.println(matri[1][0]);
		for (double[] nums:matri) {
			System.out.println(Arrays.toString(nums));
			
		}
			
		}
		}
	}


