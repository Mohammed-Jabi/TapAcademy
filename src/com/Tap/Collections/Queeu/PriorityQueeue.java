package com.Tap.Collections.Queeu;

import java.util.PriorityQueue;

public class PriorityQueeue {

	public static void main(String[] args) {
		
	PriorityQueue<Integer> queue	=new PriorityQueue<Integer>();
	
	queue.offer(10);
	queue.offer(20);
	queue.offer(30);
	queue.add(40);
	queue.add(50);
	
	System.out.println(queue);
	
	System.out.println(queue.remove());//exception
	System.out.println(queue.poll());
	
	System.out.println(queue);
	
	System.out.println(queue.element());//exception
	System.out.println(queue.peek());

	}

}
