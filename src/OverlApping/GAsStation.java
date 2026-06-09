package OverlApping;

public class GAsStation {
	 public int canCompleteCircuit(int[] gas, int[] cost) {
	        
		    int totalgas =0;
		    int totalcost = 0;

		  int start =0;

		  int currentgas =0;
		   for(int i=0;i<gas.length;i++)
		   {

		    totalgas += gas[i];
		    totalcost +=cost[i];

		       currentgas = currentgas+(gas[i]-cost[i]);

		       if(currentgas<0)
		       {
		        start=i+1;
		        currentgas=0;
		       }
		   }
		return totalgas<totalcost ? -1 :start;

		}
}
