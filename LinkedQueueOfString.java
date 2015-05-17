package KataProgramming;


/**
 * Description of LinkedQueueOfString
 *
 * (c) lsroudi  <lsroudi@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
public class LinkedQueueOfString {

	private Node first, last;
	private int size = 0;
	
	public class Node
	{
		String item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void enqueue(String item)
	{
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		
		if(isEmpty()) first = last;
		else 	oldLast.next = last;
		
		size++;
	}
	
	public String dequeue(){
		String item = first.item;
		first = first.next;
		if(isEmpty()) last = null;
		
		size--;
		
		return item;
	}

	public int size() {
		
		return size;
	}
}
