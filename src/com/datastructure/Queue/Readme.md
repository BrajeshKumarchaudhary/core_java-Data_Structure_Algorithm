## Queue

### Property Of Queye
  ```text
   Follows FIFO (First in first Out) 

---common operations on Queue
  1. createQueue()
  2. enQueue()
  3. deQuque()
  4. peekInQueue()
  5. isEmpty()
  6. isFull()
  7. deleteQueue()


-Implementation options on Queue
  1. Array
       1.Linear Queue
       2.Circular Queue  
  2. LinkedList
       1.Linear Queuue

-Linear Queue(Array Implemenation)

  1. createQueue(size n)  -----------------------TimeComplexity :o(1)  and Space complexity:o(n)
       create new blank array of given size.
       initialize rear and front of queue equal -1.

  2. enQueue(int data) ----------------------o(1)      and o(1)
      if Queue isfull()
       return error message;
      else
        arr[rear+1]=data;
         rear=rear+1;

  3. deQueue()
      if queue isEmpty()
       return queue is empty;
       else
        int item=arr[front+1];
        front=front+1;
            
  return item;
  4. peekInQueue()
     if Queue isEmpty
         return Queue is empty;
    else
      int peek=arr[front+1];
       front=front+1;
  
return peek;

  5. isEmpty()
       return rear==-1;
     
  6. isFull()
       return rear==size;

  7. deleteQueue()
    array=null;



--CircularQueue (Array Implemenation) 

 1. createQueue
    create new blank array of size.
    initialiaze front and rear to value -1;

2. enQueue(int data)
    if Queue isFull 
     return Error meassage;
   else if rear+1==size 
       rear=0;
      else
      rear=rear+1;
     arr[rear]=data;

3. deQuque()
    if Queue isEmpty 
        return "Error meassage queue is underflow".
    else
      int peek=arr[front];
      if front==rear
        rear=front=-1;
      else if front+1==size
        front=-1;
         else
         front=front+1;















```

 

