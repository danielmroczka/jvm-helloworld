package com.dm.labs.jvm.interoperability;

public class Main {
    public static void main(String[] args) {
        com.dm.labs.jvm.java.Main.main(args);
        com.dm.labs.jvm.groovy.Main.main(args);
        com.dm.labs.jvm.kotlin.Main.main(args);
        com.dm.labs.jvm.scala.Main.main(args);
    }
}
