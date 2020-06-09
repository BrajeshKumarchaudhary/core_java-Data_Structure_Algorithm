## Searching

```text
   -Searching Algorithms are designed to check for an element or retrieve an element from any data structure where it is stored
   -Based on the type of search operation, these algorithms are generally classified into two categories:
     a.Sequential Search: In this, the list or array is traversed sequentially and every element is checked. For example: Linear Search.
     b.These algorithms are specifically designed for searching in sorted data-structures. These type of searching algorithms are much more efficient than Linear Search as they repeatedly target the center of the search structure and divide the search space in half. For Example: Binary Search.

   -Linear Search
     *Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
     *If x matches with an element, return the index.
     *If x doesn’t match with any of elements, return -1.
     *The time complexity of above algorithm is O(n).
  -Binary Search
     *Search a sorted array by repeatedly dividing the search interval in half.
     *Begin with an interval covering the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
     *Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
    Algo:
     1.Compare x with the middle element.
     2.If x matches with middle element, we return the mid index.
     3.Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
     4.Else (x is smaller) recur for the left half.

```

