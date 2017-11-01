import java.util.Scanner;

public class Pro3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][m];

        for (int i = 0; i <n ; i++) 
        {
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            for (int j = 0; j < m; j++) 
            {
                if (ch[j]=='x') 
                {
                	arr[i][j] = 0;
                } else 
                {
                	arr[i][j] = 1;
                }
            }
        }
        int res = 0;
        int res2 = 0;
        for (int i = 0; i <m ; i=i+2)
        {
            for (int j = 0; j <n ; j++) 
            {
            	res =res+arr[j][i];
            }
        }
        for (int i = 1; i <m ; i=i+2) 
        {
            for (int j = 0; j <n ; j++) 
            {
            	res2 =res2+arr[j][i];
            }
        }
        System.out.println(Math.max(res,res2));
		sc.close();
    }
}