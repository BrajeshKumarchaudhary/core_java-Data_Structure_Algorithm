package com.java.EnumandAnnotaions;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target(METHOD)
public @interface MethodAnnotation {
	public String name() default "";

	public String[] name2() default {};
}
