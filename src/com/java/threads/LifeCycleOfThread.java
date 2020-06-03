package com.java.threads;
/*
 * Life Cycle of thread
 */
public class LifeCycleOfThread {

	public static void main(String[] args) {
      /*
       *A thread in Java at any point of time exists in any one of the following states.
       * A thread lies only in one of the shown states at any instant:
       * 1.New
       * 2.Runnable
       * 3.Blocked
       * 4.Waiting
       * 5.Terminate 
       */
		
	//1.New State
		/*
		 *When a new thread is created, it is in the new state. 
		 *The thread has not yet started to run when thread is in this state 
		 */
	//2.Runnable State
		/*
		 * A thread that is ready to run is moved to runnable state.
		 * In this state, a thread might actually be running or it might be ready run at any instant of time.
		 */
		
	//3.Blocked/Waiting state
		/*
		 *When a thread is temporarily inactive, then it’s in one of the following states:
		 *a.Blocked
		 *b.Waiting
		 *when a thread is waiting for I/O to complete, it lies in the blocked state
		 * It’s the responsibility of the thread scheduler to reactivate and schedule a blocked/waiting thread.
		 * A thread is in the blocked state when it tries to access a protected section of code that is currently locked by some other thread
		 * When the protected section is unlocked, the schedule picks one of the thread which is blocked for that section and moves it to the runnable state.
		 * Any thread in these states does not consume any CPU cycle. 
		 */
		//4.Timed Waiting
		/*
		 *A thread lies in timed waiting state when it calls a method with a time out parameter
		 *A thread lies in this state until the timeout is completed or until a notification is received.
		 *when a thread calls sleep or a conditional wait, it is moved to a timed waiting state.
		 */
		//5.Terminate
		/*
		 *Because it exists normally. This happens when the code of thread has entirely executed by the program.
		 *Because there occurred some unusual erroneous event, like segmentation fault or an unhandled exception. 
		 */
		
		
	}

}
