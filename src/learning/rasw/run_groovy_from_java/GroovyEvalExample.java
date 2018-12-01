package learning.rasw.run_groovy_from_java;

import groovy.util.Eval;

public class GroovyEvalExample {
    public static void main(String[] args) {

        Integer integer = (Integer) Eval.me("33*3");
        System.out.println(integer);

        String string = (String)Eval.me("'foo'.toUpperCase()");
        System.out.println(string);


        integer = (Integer) Eval.x(4, "2*x");
        System.out.println(integer);
        integer = (Integer) Eval.me("k", 4, "2*k");
        System.out.println(integer);
        integer = (Integer) Eval.xy(4, 5, "x*y");
        System.out.println(integer);
        integer = (Integer) Eval.xyz(4, 5, 6, "x*y+z");
        System.out.println(integer);

    }
}
