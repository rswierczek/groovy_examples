package learning.rasw.run_groovy_from_java;

import groovy.lang.GroovyShell;

import java.io.IOException;
import java.io.StringReader;

public class GroovyShellExample {

    public static void main(String[] args) throws IOException {

        GroovyShell shell = new GroovyShell();
        Integer result = (Integer) shell.evaluate("3*5");
        Integer result2 = (Integer) shell.evaluate(new StringReader("3*5"));
        assert result == result2;

        groovy.lang.Script script = shell.parse("3*5");
        Integer result3 = (Integer)script.run();

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        String packageName = GroovyShellExample.class.getPackage().getName().replace(".", "/");

        GroovyScriptFactory scriptFactory = new GroovyScriptFactory(shell);
        script = scriptFactory.createScript(packageName, "hello.groovy");

        System.out.println(script.run());

        script = scriptFactory.createScript(packageName, "hello_with_return.groovy");

        System.out.println(script.run());
    }


}
