package com.slidingWindow;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class paypal {
	public static boolean email(String s) {
		return(!s.isEmpty());
	}
	public static void main(String argfs[]) {
		ScriptEngine e=new ScriptEngineManager().getEngineByName("nashorn");
		try {
			e.eval(new FileReader("welcome.js"));
			Invocable i=(Invocable)e;
			i.invokeFunction("val", "argfs");
			
		}catch (Exception e1) {
			// TODO: handle exception
		}
	}
}
