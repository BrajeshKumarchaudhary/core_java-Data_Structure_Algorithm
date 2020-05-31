## java.util.Stack
```text
 /*
       *Java Collection framework provides a Stack class which models and implements Stack data structure.
       *The class is based on the basic principle of last-in-first-out. In addition to the basic push and pop operations
       */
      // Constructor
       Stack<Integer> stack=new Stack<>();
      //method Summarry
      //a.Object push(Object element):add element to stack
       stack.push(20);
      //b.Object pop():pop last element of stack
       System.out.println(""+stack.pop());
      //c.Object peek() : Returns the element on the top of the stack, but does not remove it.
       System.out.println("Peek--"+stack.peek());
      //d.boolean empty():It returns true if nothing is on the top of the stack. Else, returns false.
       System.out.println("IsEmpty--"+stack.empty());
      //e.int seacrh(Object element): It determines whether an object exists in the stack. If the element is found, it returns the position of the element from the top of the stack. Else, it returns -1.
      System.out.println("Exists or not--"+stack.search(30));

```
---
