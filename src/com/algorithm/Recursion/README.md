## Recursion
```text
 -The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called as recursive function
 -Using recursive algorithm, certain problems can be solved quite easily
 -Properties of Recusrion
   1. Same operation is performed multiple times with different inputs.
   2. In every step we try to make the problem smaller.
   3. We mandatory need to have a base condition ,which tells system when to stop recursion.
  
 -Example-
       search(Root root,int value)
         {
          if(root==null)
           {
             return "Tree not Exists";
           }
        elseif(root.data==value)
           {
           return "Value found"
           }
        elseif(root.data>value)
             {
              search(root.right,value);
             }
        else{
              search(root.left,value)
            }
        }
  
 -Why should we learn Recusion?
     -Because it makes the code easy to write(comared to iterative).WhenEver a given problem can be broken down into similar sub-problem
     -Because it is havily used in DataStructure Tree and Graph etc.
     -it is havily used in technique like "divide and conquer" ,"Greedy","Dynamic problem"
  
 -Recursive Vs Iterative
   1. Space efficient  ---Recursive--No(Uses Stack extra spaces) ,Iterative-Yes(No Stack is used) ,
   2. Time efficient   ---Recursive--No(Required extra time to posh and pop operation)   ,Iterative-yes(No any Extra operation)
   3. Ease of code(to solve sub-problems) ---Recursive-Yes , Iterative-No.

```

