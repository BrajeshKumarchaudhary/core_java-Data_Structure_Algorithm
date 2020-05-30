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

