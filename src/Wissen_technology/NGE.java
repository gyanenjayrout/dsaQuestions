package Wissen_technology;
import java.util.*;
public class NGE {
	
public static void main(String[] args) {
int [] arr = {4, 5, 2, 10};


Stack<Integer>stack = new Stack<>();
int result [] = new int [arr.length];

int n= arr.length;

for(int i=n-1;i>=0;i--)
{
    if(!stack.isEmpty() && stack.peek()<=arr[i] )
    {
    	stack.pop();
    }
	
	result[i] = stack.isEmpty()?-1:stack.peek();
	stack.push(arr[i]);
}

System.out.println(Arrays.toString(result));
}



}
