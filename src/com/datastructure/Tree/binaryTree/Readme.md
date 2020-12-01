## Binary Tree
```text
**
 *@author brajesh
 *A binary Tree is tree in which each node have zero,one and two child. 
 *It is a family of dataStructure (BST,HEAP Tree ,AVL tree etc)
 *Why We Need to learn Binary tree ?.
 * Prerquesites for more advance tree like AVL,Read Black Tree,
 *It is used to solve specific problem like Huffman Coding Problem
 */
 
 -Types Of Binary Tree:
    1. Strict Binary Tree:If Each node has either two chlid or none child.
    2. Full Binary Tree: Each none leaf node has two children and all leaf nodes are at same level.
    3. Complete Binary Tree: If all Level are completely filled except possibly last level and the last level has as all keys left as possible.
    
    
 -How to Represent Binary Tree on Code:
    Tree Representation:Two Ways
      1.Via LinkedList
      2.Via Array
      
 1.Linked List Represenations.
       >left Node
       >right Node;
       >data.
       
  2.Array 
    >Left Child-->ceil[2x]
    >right cild-->ceil[2x+1]
    >root -->1 
    where x=indexed of array no any value stored at 0th index.
         

```
