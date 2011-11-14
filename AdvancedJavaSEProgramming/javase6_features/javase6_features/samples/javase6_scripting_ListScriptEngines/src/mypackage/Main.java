package mypackage;

import java.util.List;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class Main {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        List<ScriptEngineFactory> factories = manager.getEngineFactories();
        for (ScriptEngineFactory factory : factories) {
            System.out.println("engine name = " + factory.getEngineName());
            System.out.println("engine version = " + factory.getEngineVersion());
            System.out.println("engine language = " + factory.getLanguageName());
            System.out.println("engine language version = " + factory.getLanguageVersion());
            System.out.println("engine extension = " + factory.getExtensions());
            System.out.println("engine mime types = " + factory.getMimeTypes());
            System.out.println("engine names = " + factory.getNames());
        }
    }
}
