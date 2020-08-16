## LinkedList
```text
 -What is LinkedList
    *A linkedList is a linear data structure where each element is a seperate object.
    *Each element(node) of a list comprasies two item the data and the refernce of next node.
    *The most powerfull feature is that is a varrible size.
 
 -LinkedList vs Array
   *Seperate Object.
   *Varraible size.
   *Random Access is not possible in linkedlist .this is limitation of linkedlist.

 -Components of LinkedList
  a.Node:Conatains data and reference to next Node.
  b.Head:reference to the first node of list.
  c.Tail:reference to the last node of list.

 -Types of List
  1. Single Linked list.
  2. Circular Single list
  3. Double linked list
  4. Circular linked list
  
   -Single Linked list:
         *In a single linked list each node in the list stores the data of node and reference to the next node of list. it
                does not store any refernce to the previous node.
   
   -Circular Single list: 
        *In this list only one change occured is that the end of given list  linked to back to front node.
   
   -Double linked List: 
        *In double linked list each node contains two refernces that refernces to prev and next.
   - Circular linked list:
        *It is Similar to Doubly linked list one difference is that last node of list is point to first node of list.  

   Advantages over arrays
    1) Dynamic size
    2) Ease of insertion/deletion

 Drawbacks:
    1) Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists efficiently with its default implementation. Read about it here.
    2) Extra memory space for a pointer is required with each element of the list.
    3) Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.




	


```
