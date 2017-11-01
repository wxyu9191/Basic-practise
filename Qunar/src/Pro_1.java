

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Pro_1 {
	static Scanner sc = new Scanner(System.in);
	static boolean flag = false;
	static List<Integer> list = new LinkedList<Integer>();
	static Stack<Object> st = new Stack<>();
	public static void main(String []args) {
		int n = sc.nextInt();
				//Integer.parseInt(sc.nextLine().split(" ")[0]);
		int sum = sc.nextInt();
				//Integer.parseInt(sc.nextLine().split(" ")[1]);
		//System.out.print(sum);
		int[] arr = new int[n];
		//int len = arr.length;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		sumofK(sum, arr, 0, flag);
	}
	private static void sumofK(int sum, int[] arr, int len, boolean flag) {
		 if (sum <= 0 || flag) {  
		        return;  
		    }  
		if(sum > 0 &&sum == arr[len] && len < arr.length)
		{
			flag = true;
			//list.add(arr[len]);
			st.push(arr[len]);
			for(Integer i : list)
				System.out.print(i+" ");
		}
		else if(sum > 0 && len < arr.length){
			st.push(arr[len]);
			//list.add(arr[len]);
			sumofK(sum - arr[len], arr, len+1, flag);
			st.pop();
			//list.remove(arr[len]);
			sumofK(sum, arr, len+1, flag);
		}
		
		
	}
}
