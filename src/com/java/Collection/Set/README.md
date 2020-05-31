## java.util.Set

```text
     /*
      * Set is an interface which extends Collection. 
      *it is an unordered collection of objects in which duplicate values cannot be stored.
      *Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
      */
     //Constructor
      Set<Integer> set=new HashSet<>();
```

---

## java.util.EnumSet

```text
    * EnumSet is one of the specialized implementation of Set interface for use with the enumeration type
    * It extends AbstractSet and implements Set Interface in Java.
    * EnumSet class is a member of the Java Collections Framework & is not synchronized
    * All of the elements in an enum set must come from a single enumeration type that is specified when the set is created either explicitly or implicitly.
    */

```

## java.util.HashSet
```text
/*
       * Implements Set Interface.
       * Underlying data structure for HashSet is hashtable.
       * As it implements the Set Interface, duplicate values are not allowed.
       * Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted based on their hash code.
       * NULL elements are allowed in HashSet.
       * HashSet also implements Searlizable and Cloneable interfaces.
       */
       //Constructor
       //a.HashSet h = new HashSet();Default initial capacity is 16 and default load factor is 0.75.
	HashSet<String> hst=new HashSet<>();
       //b.HashSet h = new HashSet(int initialCapacity);
	HashSet<String> set2=new HashSet<>(100);
       //c.HashSet h = new HashSet(int initialCapacity, float loadFactor);
         float loadfactor=(float) 0.98;  
	HashSet<String> set3=new HashSet<>(19,loadfactor);
	//d.HashSet h = new HashSet(Collection C);
	HashSet<String> set4=new HashSet<>(set2);
   //Methods
	/*
	 *a.boolean add(E e):Used to add the specified element if it is not present, if it is present then return false.
	 *b.void clear(): Used to remove all the elements from set.
	 *c.boolean contains(Object o): Used to return true if an element is present in set.
	 *d.boolean remove(Object o): Used to remove the element if it is present in set.
	 *e.Iterator iterator(): Used to return an iterator over the element in the set.
	 *f.boolean isEmpty(): Used to check whether the set is empty or not. Returns true
	 *g.int size(): Used to return the size of the set.
	 *h.Object clone(): Used to create a shallow copy of the set. 
	 */
       //Synchronized hash set
	 Set s = Collections.synchronizedSet(new HashSet());

````

---

## java.util.TreeSet
```text
 /*
    * TreeSet implements the SortedSet interface so duplicate values are not allowed.
    * Objects in a TreeSet are stored in a sorted and ascending order.
    * TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
    * TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
    * TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree. Therefore operations like add, remove and search take O(Log n) time. 
    * And operations like printing n elements in sorted order takes O(n) time.
    */
	//Constructor
	//a.TreeSet t = new TreeSet();This will create empty TreeSet object in which elements will get stored in default natural sorting order.
	TreeSet<String> ts1=new TreeSet<>();
	//b.TreeSet t = new TreeSet(Comparator comp):This constructor is used when external specification of sorting order of elements is needed.
	TreeSet<String> ts2=new TreeSet<>(Comparator.reverseOrder());
        //c.TreeSet t = new TreeSet(Collection col);
	 TreeSet<String> ts3=new TreeSet<>(ts1);
	//d.TreeSet t = new TreeSet(SortedSet s);
   //Synchronized HashSet
	TreeSet ts = new TreeSet();
	 Set syncSet = Collections.synchronizedSet(ts); 

```

---

## java.util.LinkedHashSet

```text
  /*
     * A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.
     * When the iteration order is needed to be maintained this class is used. 
     * LinkedHashSet lets us iterate through the elements in the order in which they were inserted
     * Contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
     * Maintains insertion order.
     */
     //Constructor
     //a.LinkedHashSet(): This constructor is used to create a default HashSet.
       LinkedHashSet<String> lsh1=new LinkedHashSet<>();
     //b.LinkedHashSet(Collection C): Used in initializing the HashSet with the eleements of the collection C
      LinkedHashSet<String> lsh2=new LinkedHashSet<>(lsh1);
      //c.LinkedHashSet(int size): Used to initialize the size of the LinkedHashSet with the integer mentioned in the parameter.
      LinkedHashSet<String> lsh3=new LinkedHashSet<>(100);
  
```

---





