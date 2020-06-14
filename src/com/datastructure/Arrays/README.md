## Arrays
```text
  -An array is collection of items stored at contiguous memory locations. 
  -The idea is to store multiple items of same type together.
  -This makes it easier to calculate the position of each element by simply adding an offset to a base value
  -the memory location of the first element of the array (generally denoted by the name of the array).
  -Arrays allow random access of elements. This makes accessing elements by position faster.

  -Finding the address of an array element
   1. One Dimensional Array
     Address of A [I] = B + W * ( I – LB ) 
     where 
      B = Base address
      W = Storage Size of one element stored in the array (in byte)
      I = Subscript of element whose address is to be found
      LB = Lower limit / Lower Bound of subscript, if not specified assume 0 (zero)
  2. Two Dimensional Array
   1. Row Measure System
      Address of A [ I ][ J ] = B + W * [ N * ( I – Lr ) + ( J – Lc ) ]
   2. Column Measure System  
      Address of A [ I ][ J ] Column Major Wise = B + W * [( I – Lr ) + M * ( J – Lc )]
    Where,
     B = Base address
     I = Row subscript of element whose address is to be found
     J = Column subscript of element whose address is to be found
     W = Storage Size of one element stored in the array (in byte)
     Lr = Lower limit of row/start row index of matrix, if not given assume 0 (zero)
     Lc = Lower limit of column/start column index of matrix, if not given assume 0 (zero)
     M = Number of row of the given matrix
     N = Number of column of the given matrix

   Number of rows (M) will be calculated as = (Ur – Lr) + 1
   Number of columns (N) will be calculated as = (Uc – Lc) + 1

```
