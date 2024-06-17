package Lesson40;

import Lesson32.Test;

public class Test7 {
    void abc (){
        try {
            def();
            return;
        }finally {
            System.out.println("finaly");
        }
    }
    void def(){
        System.out.println("def");
        throw new StackOverflowError();
    }

    public static void main(String[] args) {
        Test7 test7 = new Test7();
        test7.abc();
    }
}
