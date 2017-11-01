import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Pro2 {

	private static int max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int guanxi = sc.nextInt();
		int max = 0;
		String[] str = sc.nextLine().split("\\s+");
		Set<String> set = new HashSet<>();
		for(int i = 0 ; i < str.length ; i ++ )
		{
			set.add(str[i]);
		}
		
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0 ; i < str.length-1 ; i += 2 )
		{
			map.put(str[i], str[i-1]);
		}
		for(int i = 0 ; i < count ; i++)
		{
			for(int j = i+1 ; j < count ; j++)
			search(str[i], str[j], map);
		}
		
	}

	private static void search(String string1, String string2, Map<String, String> map) {
		if(map.containsKey(string1) && map.containsKey(string2))
		{
			String name = map.get(string2);
			if(name != string1 && name != map.get(string1))
			{
				max++;
				//search(srt[0], str[i+1]);
			}
		}
		else {
			System.out.println("DISCONNECTED");
		}
		
	}

}
