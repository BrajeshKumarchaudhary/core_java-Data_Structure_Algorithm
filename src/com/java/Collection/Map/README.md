## java.util.Map
```text
      /*The java.util.Map interface represents a mapping between a key and a value
       * A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and null value like the HashMap and LinkedHashMap, but some do not like the TreeMap.
       * The order of a map depends on specific implementations, e.g TreeMap and LinkedHashMap have predictable order, while HashMap does not.
       * There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, TreeMap and LinkedHashMap.
       */
      //creating the map
       Map<Integer,String> map=new HashMap<>();

```

---

## java.util.HashMap

```text
 /*
  *HashMap is a part of java.util package.
  *HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
  *It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value respectively.
  *HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
  *HashMap allows null key also but only once and multiple null values.
  */
  //Constructor
  //a.HashMap(): It is the default constructor which creates an instance of HashMap with initial capacity 16 and load factor 0.75.
		 HashMap<Integer,String> map=new HashMap<>();
  //b.HashMap(int initial capacity): It creates a HashMap instance with specified initial capacity and load factor 0.75.
		 HashMap<Integer,String> map2=new HashMap<>(200);
  //c.HashMap(int initial capacity, float loadFactor): It creates a HashMap instance with specified initial capacity and specified load factor.
		 HashMap<Integer, String> map3=new HashMap<>(100, (float)1);
  //d.HashMap(Map map): It creates instance of HashMap with same mappings as specified map.
	         HashMap<Integer, String> map4=new HashMap<>(map);
	    
 //Method Summarry
  /*
   *a.void clear(): Used to remove all mappings from a map.
   *b.boolean containsKey(Object key): Used to return True if for a specified key, mapping is present in the map.
   *c.boolean containsValue(Object value): Used to return true if one or more key is mapped to a specified value.
   *d.Object clone(): It is used to return a shallow copy of the mentioned hash map.
   *e.boolean isEmpty(): Used to check whether the map is empty or not. Returns true if the map is empty.
   *f.Set entrySet(): It is used to return a set view of the hash map.
   *g.Object get(Object key): It is used to retrieve or fetch the value mapped by a particular key.
   *i.Set keySet(): It is used to return a set view of the keys.
   *j.int size(): It is used to return the size of a map.
   *k.Object put(Object key, Object value): It is used to insert a particular mapping of key-value pair into a map.
   *l.putAll(Map M): It is used to copy all of the elements from one map into another.
   *m.Object remove(Object key): It is used to remove the values for any particular key in the Map.
   *n.replace(K key, V oldValue, V newValue): This method replaces the entry for the specified key only if currently mapped to the specified value.
   */


```

---

## java.util.TreeMap

```text
   /*
    *TreeMap can be a bit handy when we only need to store unique elements in a sorted order.
    *Java.util.TreeMap uses a red-black tree in the background which makes sure that there are no duplicates
    *additionally it also maintains the elements in a sorted order.
    */
    //Constructor
   //TreeMap<K, V> hmap = new TreeMap<K, V>();
		TreeMap<String,String> tm=new TreeMap<>();
   //TreeMap<String, String> map=new TreeMap<>(Comparator.reverseOrder()); Descending order

```

---

## java.util.LinkedHashMap

```text
   /*
    * A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
    * It contains only unique elements
    * It may have one null key and multiple null values
    * It is same as HashMap with additional feature that it maintains insertion order.
    */
    //Constructor
    //a.LinkedHashMap(): This is used to construct a default LinkedHashMap constuctor.
		LinkedHashMap<String, String> map1=new LinkedHashMap<>();
    //b.LinkedHashMap(int capacity): It is used to initialize a particular LinkedHashMap with a specified capacity.
		LinkedHashMap<String, String> map2=new LinkedHashMap<>(200);
    //c.LinkedHashMap(Map m_a_p): It is used to initialize a particular LinkedHashMap with the elements of the specified map.
      LinkedHashMap<String, String> map3=new LinkedHashMap<>(map1);

```

---

## HashMap_LinkedHashMap_TreeMap
   1. HashMap
       ```text
          /*HashMap offers 0(1) lookup and insertion. 
	   *If you iterate through the keys, though, the ordering of the keys is essentially arbitrary.
	   *it is implemented by an array of linked lists.
	   *A HashMap contains values based on the key.
           *It contains only unique elements.
           *It may have one null key and multiple null values.
           *It maintains no order.
	   */
        ```
   2. LinkedHashMap
       ```text
           /*LinkedHashMap offers 0(1) lookup and insertion.
	    *Keys are ordered by their insertion order. 
	    *It is implemented by doubly-linked buckets.
	    *A LinkedHashMap contains values based on the key.
            *It contains only unique elements.
            *It may have one null key and multiple null values.
            *It is same as HashMap instead maintains insertion order.
		 */
        ```
   3. TreeMap
      ```text
            *TreeMap offers O(log N) lookup and insertion. 
	    *Keys are ordered, so if you need to iterate through the keys in sorted order, you can. This means that keys must implement the Comparable interface. 
	    *TreeMap is implemented by a Red-Black Tree.
	    *A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
            *It contains only unique elements.
            *It cannot have null key but can have multiple null values.
            *It is same as HashMap instead maintains ascending order(Sorted using the natural order of its key).
	    */
     ```

---
