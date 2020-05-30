## java.util.Deque
```text
      /*The java.util.Deque interface is a subtype of the java.util.Queue interface
       * The Deque is related to the double-ended queue that supports addition or removal of elements from either end of the data structure,
       *  it can be used as a queue (first-in-first-out/FIFO) or as a stack (last-in-first-out/LIFO)
       * these are intefaces Iterable->Collection->Queue->Deque.
       * Array deques prohibit the use of Null elements and do not accept any such elements.
       * Any concurrent access by multiple threads is not supported.
       * In the absence of external synchronization, Deque is not thread-safe.
       */
	//Constructor 
	*Deque<String> deque=new LinkedList<>();
   //methods of deque
      /*
       * a.add(E e):Adds an element to the tail
       * b.addFirst(E e):Adds an element to the head
       * c.addLast(E e):Adds en element to the tail.
       * d.boolean offer(E e):adds an element to tail and return true if insertion was successfully
       * e.boolean offerFirst(E e):add element to head and return true if insertion successfully
       * f.offerLast(E e):Add element to last of queue
       * g.iterator():return iterator over the queue.
       * h.descendingIterator():return reverse order iterator
       * i.push(E e):add element to head;
       * j.pop(E e):Remove the elements from head.
       * k.removeFirst(E e):remove the element at the end
       * l.removeLast(E e):remove the element at the tail
       * m.poll():retrieves and remove from the head and return null if queue is empty
       * n.pollFirst():Retrieves and removes the first element of this deque, or returns null if this deque is empty.
       * o.pollLast():Retrieves and removes the last element of this deque, or returns null if this deque is empty.
       * p.peek():Retrieves, but does not remove, the head of the queue represented by this deque
       * q.peekFirst():Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
       * r.peekLast():Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
		 */
```
---

## java.util.ArrayDeque
 ```text
    /*ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface.
     * It is also known as Array Double Ended Queue or Array Deck
     * Array deques have no capacity restrictions and they grow as necessary to support usage.
     * They are not thread-safe which means that in the absence of external synchronization, 
     * ArrayDeque does not support concurrent access by multiple threads.
     * Null elements are prohibited in the ArrayDeque.
     * ArrayDeque class is likely to be faster than Stack when used as a stack.
     * ArrayDeque class is likely to be faster than LinkedList when used as a queue.
     */
		
   //Constructor
  //a.ArrayDeque()
      Deque<String> dq=new ArrayDeque<>();
  //b.ArrayDeque(Collection c)
      Deque<String> dq1=new ArrayDeque<>(dq);
 //c.ArrayDeque(int numofElements)
      Deque<String> adq=new ArrayDeque<>(200);

```

---

## java.util.concurrent.ConcurrentLinkedDeque
```text
     /*The ConcurrentLinkedDeque class in Java is a part of the Java Collection Framework
      *  It is used to implement Deque with the help of LinkedList concurrently.
      */
      //Constructor
      //a.ConcurrentLinkedDeque(): 
	*ConcurrentLinkedDeque<String> clq=new ConcurrentLinkedDeque<>();
      //b.ConcurrentLinkedDeque(Collection<E> c):
       *ConcurrentLinkedDeque<String> clq1=new ConcurrentLinkedDeque<>(clq);
```

---

## java.util.concurrent.LinkedBlockingDeque

```text
   /*
     * The LinkedBlockingDeque class in Java is a part of the Java Collection Framework and implements the Collection interface and the AbstractQueue class.
     *.It also implements the BlockingDeque and provides an optionally-bounded functionality based on linked nodes.
     * When unspecified, the capacity is by default taken as Integer.MAX_VALUE.
     */
     //Constructor
     //a.LinkedBlockingDeque():default size Integer.MAX_VALUE
      *LinkedBlockingDeque<String> lbq=new LinkedBlockingDeque<>();
    //b.LinkedBlockingDeque(int capacity): 
      *LinkedBlockingDeque<String> lbq1=new LinkedBlockingDeque<>(100);
    //c.LinkedBlockingDeque(Collection<E> c):
       *LinkedBlockingDeque<String> lbq2=new LinkedBlockingDeque<>(lbq1);
   //method summary  
/*
     *a.put(E e):This method inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque), waiting if necessary for space to become available.
       *b.putFirst(E e): This method inserts the specified element at the front of this deque, waiting if necessary for space to become available.
       *c.putLast(E e): This method inserts the specified element at the end of this deque, waiting if necessary for space to become available.
       *d.take(): This method retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), waiting if necessary until an element becomes available.
		 *.takeFirst():This method retrieves and removes the first element of this deque, waiting if necessary until an element becomes available.
	*takeLast():This method retrieves and removes the last element of this deque, waiting if necessary until an element becomes available.
		 */


```
---



