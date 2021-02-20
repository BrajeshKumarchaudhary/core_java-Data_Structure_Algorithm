package com.interview;

public interface I1 {
abstract void disPlay();
default void d() {
	System.out.println("I1");
}
static void d2() {
	System.out.println("I1 Static Function.");
}

}
