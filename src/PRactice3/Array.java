package PRactice3;

import java.util.Arrays;
import java.util.HashMap;

public class Array {
	public static void main(String[] args) {
		int [] sum = {2,3,4,5,6};
		
		int target = 11;
		
		int result [] = findztwozSum(sum, target);
		
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] findztwozSum(int[] sum, int target) {
//		// TODO Auto-generated method stub
//		
//		for(int i=0;i<sum.length;i++)
//		{
//			for(int j=i+1;j<sum.length;j++)
//			{
//				if(target == sum[i]+sum[j])
//				{
//					return new int [] {i, j};
//				}
//			}
//		}
//		return new int[] {-1-1};
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<sum.length;i++)
		{
			int comp = target - sum[i];
			
			if(map.containsKey(comp))
			{
				return new int [] {map.get(comp),i};
			}
			map.put(sum[i], i);
		}
		return new int [] {-1,-1};
	}
}
