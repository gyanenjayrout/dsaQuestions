package AraryList;

import java.util.*;

public class Reverse {
	 public static void manualReverse(List<Integer> list)
	 {
		 
		 List<Integer>list1 = List.of(1,2,3,4,5);
		 
		 List<Integer> mutableList = new ArrayList<>(list1);
	        
		 for(int i=0;i<mutableList.size()/2;i++)
		 {
			 int temp=  mutableList.get(i);
			 
			 mutableList.set(i, mutableList.get(mutableList.size()-i-1));
			 mutableList.set(mutableList.size() -i-1, temp);
			 
			 
		 }
		 
		 Collections.reverse(mutableList);
		 
		 System.out.println(mutableList);
	 }
	 

public static void main(String[] args) {
List<Integer> numbers = List.of(1, 2, 3, 4, 5); // Immutable list
manualReverse(numbers); // Outputs: [5, 4, 3, 2, 1]}

}}
/*
List<Integer> mutableList = new ArrayList<>(list);

int size = mutableList.size();
for (int i = 0; i < size / 2; i++) {
    int temp = mutableList.get(i);
    mutableList.set(i, mutableList.get(size - i - 1));
    mutableList.set(size - i - 1, temp);
}

System.out.println(mutableList);
}

public static void main(String[] args) {
List<Integer> numbers = List.of(1, 2, 3, 4, 5); // Immutable list
manualReverse(numbers); // Outputs: [5, 4, 3, 2, 1]
}*/