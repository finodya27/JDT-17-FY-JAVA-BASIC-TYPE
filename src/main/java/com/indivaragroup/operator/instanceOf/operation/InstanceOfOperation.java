package com.indivaragroup.operator.instanceOf.operation;

public class InstanceOfOperation {
    public void instanceOfOperationFunction(){
        Object value = "test";
        boolean isTrue = value instanceof  String;

        System.out.println(value instanceof String);
        System.out.println(value instanceof Integer);
        System.out.println(!isTrue);
    }
}
