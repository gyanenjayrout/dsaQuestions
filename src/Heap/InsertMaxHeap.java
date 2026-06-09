package Heap;

import java.util.Arrays;

public class InsertMaxHeap {
	
	private int [] heap;
	private int size;
	private int capacity;
	
	public InsertMaxHeap( int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		this.size   = 0;
		this.heap  =  new int[capacity];
	}
	
	private int parent(int i)
	{
		return (i-1)/2;
	}
	
	private int leftChild(int i)
	{
		return 2 *i+1;
	}
	private int rightchidd(int i)
	{
		return 2 * i+2;
	}
	
	public void insert(int key)
	{
		
		if(size ==capacity)
		{
			return ;
		}
		
		size++;
		
		int  i  = size-1;
		
		heap[i] = key;
		
		
		while(i!=0 && heap[parent(i)] <heap[i])
		{
			swap(i , parent(i));
			
			i = parent(i);
;
			}
		
		
	}
	
	public int deleteMax()
	
	{
		if(size==0)
		{
			throw new IllegalStateException("Heap is empty!");
		}
		
		if(size==1)
		{
			size--;
			return heap[0];
		}
		
		int root  =heap[0];
		
		heap[0] = heap [size-1];
		
		size--;
		
		heapifyDown(0);  // Restore max-heap property
        return root;
	}
	
	private void  heapifyDown(int i) {
		// TODO Auto-generated method stub
		
		int largest = i;
		
		int left  = leftChild(i);
		
		int right  = rightchidd(i);
		
		if(left<size && heap[left]>heap[largest])
		{
			largest =left;
		}
		if(right <size && heap[right]>heap[largest])
		{
			largest = right;
		}
		
		if(largest !=i) //Purpose of if (largest != i)

//his condition checks whether the current node at index i is not the largest among itself and its children. Here’s how it works:
		{
			  swap(i, largest);
	            heapifyDown(largest);
		}
		
		
	}

	public void printheap()
	{
		System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
	}
	
	public void swap(int i, int j)
	{
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] =temp;
	}
	
	public static void main(String[] args) {
		InsertMaxHeap maxheap  =new InsertMaxHeap(10);
		maxheap.insert(3);
		maxheap.insert(4);
		maxheap.insert(5);
		maxheap.insert(6);
		maxheap.insert(2);
		maxheap.insert(7);
		maxheap.printheap();
		
		maxheap.deleteMax();
		maxheap.printheap();
	}
	

}
