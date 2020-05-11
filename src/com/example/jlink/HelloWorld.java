package com.example.jlink;

import java.util.logging.Logger;

public class HelloWorld {
	private static final Logger LOG = Logger.getLogger(HelloWorld.class.getName());

	public static void main(String[] args) {
		LOG.info("Hello World!");
	}
}

//--compile module and classes
//javac -d out module-info.java
//javac -d out --module-path out com\example\jlink\HelloWorld.java
//
//--find dependencies
//
//jdeps --module-path out -s --module Java11JlinkExample	
//
//--create custom JRE
//jlink --module-path "%JAVA_HOME%\jmods";out  --add-modules Java11JlinkExample --output C:\customjre
//
//--run the program from bin folder of newly created JRE  
//java --module Java11JlinkExample/com.example.jlink.HelloWorld
//
//--create launcher bat file for windows
//jlink --launcher customjrelauncher=Java11JlinkExample/com.example.jlink.HelloWorld --module-path "%JAVA_HOME%\jmods";out --add-modules Java11JlinkExample --output c:\customjre