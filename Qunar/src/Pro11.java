import java.util.Scanner;

class zhongjie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().split("\\s+")[0]);
		int sum = Integer.parseInt(sc.nextLine().split("\\s+")[1]);
		int[] arr = new int[n];
		while (sc.hasNextLine()) 
		{
			for (int i = 0; i < n; i++) 
			{
				arr[i] = sc.nextInt();
			}
		}
		int[] brr = new int[n];
		if (isOK(arr, brr, 0, 0, n, sum)) 
		{
			System.out.println("YES");
			for (int i = 0; i < n; i++) 
			{
				if (brr[i] == 1) 
				{
					System.out.print(arr[i] + " ");
				}
			}
		} else 
		{
			System.out.println("NO");
		}
		sc.close();
	}

	private static boolean isOK(int[] a, int[] b, int index, int sum, int n, int k) {
		if (sum > k)
			return false;
		if (index == n)
			return sum == k;
		if (isOK(a, b, index + 1, sum, n, k)) 
		{
			b[index] = 0;
			return true;
		}
		if (isOK(a, b, index + 1, sum + a[index], n, k)) 
		{
			b[index] = 1;
			return true;
		}
		return false;
	}
}