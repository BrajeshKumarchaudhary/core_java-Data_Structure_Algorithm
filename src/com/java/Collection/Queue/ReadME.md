## java.util.concurrent.ArrayBlockingQueue

```text
	  * ArrayBlockingQueue class is a bounded blocking queue backed by an array.
	  * By bounded it means that the size of the Queue is fixed.
	  * Once created, the capacity cannot be changed.
	  * Attempts to put an element into a full queue will result in the operation blocking.
	  * Similarly attempts to take an element from an empty queue will also be blocked
	  * Class Heirarchy:Object->AbstarctColection->AbstractQueue->java.util.concurrent.ArrayBlockingQueue
	  */
	  /*
	   * Constructor Summary
	   * a.ArrayBlockingQueue(int capacity):create an array with given fixed capacity
	   * b.ArrayBlockingQueue(int capacity,boolean fair):Create an Queue with fixed capacity and fair value true means threads blocked operation like insertion or removal.otherwise unorder
	   *c.ArrayBlockingQueue(int capacity,boolean fair,Collection c):create Queue with fixed capacity with other collections.
	   */
       //Method Summary
	 /*
	  * a.boolean add(E e):insert the element at tail of queue.
	  * b.void clear():remove the all elements from queue
	  * c.boolean contains(Object e):return true if specified value contains
	  * d.int drainTo(Collection c):Remove all the elements from queue and add to another collections
	  * e.Iteratot iterator():returns iterator over queue in proper sequence 
	  * f.boolean offer(E e,long timeout,TimeUnit unit):insert the element tail of queue.and wait time to space available.
	  *g.E peek():return element but not remove head of the queue.
	  *h.int size():return the size of an array
	  *i.E take():return and remove the head of this queue.
	  *j.Object toArray[]:return an array containing all elements in proper sequence 
	  */

```

---

## java.util.concurrent.ConcurrentLinkedQueue

```text
      /*The ConcurrentLinkedQueue class in Java is a part of the Java Collection Framework
       *and implements the Collection interface and the AbstractCollection class
       * It is used to implement Queue with the help of LinkedList concurrently.
       */
      /*
       * Constructors in Java ConcurrentLinkedQueue:
       * a.ConcurrentLinkedQueue():create and empty queue.
       * b.ConcurrentLinkedQueue(Collection<E> c): create a queue with given collection elements
       */
       methods Summary
       *a.add(E e):add the elements in end of queue.
       *b.addAll(Collection c):appends the all elements end of queue.
       *c.boolean contains():this methods return true if specified elements contains in queue.
       *d.boolean isEmpty():This method returns true if queue is empty.
       *e.offer(E e):add the elements end of queue.
       *E peek():this methods retrieve ,but does not remove the head of elements
       *E poll():this method retrieve.and remove the head of queue.
       *int size():return number of elements.
       *Object toArray():return an array containing all elements.

```
---


## java.util.concurrent.LinkedBlockingQueue
```text
  /*LinkedBlockingQueue is an optionally-bounded blocking queue based on linked nodes.
   *It means that the LinkedBlockingQueue can be bounded, if its capacity is given, else the LinkedBlockingQueue will be unbounded
   *The capacity can be given as a parameter to the constructor of LinkedBlockingQueue.
   *The capacity, if unspecified, is equal to Integer.MAX_VALUE. 
   *Linked nodes are dynamically created upon each insertion, till the capacity of the queue is not filled.
   */
   //Constructor summary
   //a.LinkedBlockingQueue()
   //LinkedBlockingQueue<Integer> lbq=new LinkedBlockingQueue<>();
   //b.LinkedBlockingQueue(Collection c)
   //LinkedBlockingQueue<Integer> lbq1=new LinkedBlockingQueue<>(lbq);
   //c.LinkedBlockingQueue(int initialCapacity)
   //LinkedBlockingQueue<Integer> lbq2=new LinkedBlockingQueue<>();
  
 //method summary
   *a.void clear():remove all the elements
   *b.boolean contains():return true if specified value exists in queue
   *c.E peek():retrieve value and not remove the head of queue.
   *d.E poll():retrieves and reomve head of the queue
   *e.E take(): Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
   */

```


---

## java.util.concurrent.LinkedTransferQueue

```text
     /*The LinkedTransferQueue class in Java is a part of the Java Collection Framework
      * and implements the Collection interface and the AbstractQueue class
      * It also implements the TransferQueue and provides an unbounded functionality based on linked nodes. 
      */
      //Constructors in Java LinkedTransferQueue:
      //a.LinkedTransferQueue():
     *LinkedTransferQueue<Integer> ltq=new LinkedTransferQueue<>();
     //b.LinkedTransferQueue(Collection<E> c):
     *LinkedTransferQueue<Integer> ltq1=new LinkedTransferQueue<>(ltq);

```
---

## java.util.concurrent.PriorityBlockingQueue

```text
//PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and supplies blocking retrieval operations.
//Constructor summary
//a.PriorityBlockingQueue()
PriorityBlockingQueue<Integer> pbq=new PriorityBlockingQueue<>();
//b.PriorityBlockingQueue(Collection c)
PriorityBlockingQueue<Integer> lbq1=new PriorityBlockingQueue<>(pbq);
//c.PriorityBlockingQueue(int initialCapacity)
PriorityBlockingQueue<Integer> pbq1=new PriorityBlockingQueue<>(100);
//d.PriorityBlockingQueue(int initialCapacity, Comparator comparator)
PriorityBlockingQueue<Integer> lbq2=new PriorityBlockingQueue<>(100, Comparator.reverseOrder());

```
