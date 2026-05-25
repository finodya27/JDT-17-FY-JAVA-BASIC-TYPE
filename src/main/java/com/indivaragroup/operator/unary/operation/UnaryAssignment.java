package com.indivaragroup.operator.unary.operation;

public class UnaryAssignment {
    public void unaryAssignmentFunction(){
        int a = 5;

        System.out.println(++a); // pre-increment: 6
        System.out.println(a++); // post-increment: 6
        System.out.println(a); // after post-increment: 7

        System.out.println(--a);    // pre - decrement: 6
        System.out.println(a--);    // post - decrement: 6
        System.out.println(a);      // after post-decrement: 6

        int b = -a;                 //negation : -5
        System.out.println(b);
    }


}
