package learning.rasw.run_groovy_from_java;

import groovy.lang.GroovyShell;
import groovy.lang.Script;

import java.io.File;
import java.io.IOException;

public class GroovyScriptFactory {
    private GroovyShell shell;

    public GroovyScriptFactory(GroovyShell shell) {
        this.shell = shell;
    }

    public Script createScript(String packageName, String scriptName) throws IOException {
        return shell.parse(new File(String.format("src/%s/%s", packageName, scriptName)));
    }
}
