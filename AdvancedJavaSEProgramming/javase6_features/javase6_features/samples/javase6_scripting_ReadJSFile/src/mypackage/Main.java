package mypackage;

import java.io.InputStream;
import java.io.InputStreamReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            //FileReader reader = new FileReader("SampleJavaScript.js");
            //engine.eval(reader);
            //reader.close();
            InputStream is = Main.class.getResourceAsStream("/scripts/SampleJavaScript.js");
            engine.eval(new InputStreamReader(is));
            engine.eval("println ('Hello world!')");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
