
package mypackage;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    public static void main (String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager ();
        ScriptEngine engine = manager.getEngineByName ("js");
        String script = "println ('Hello world!')";
        try {
            engine.eval (script);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}