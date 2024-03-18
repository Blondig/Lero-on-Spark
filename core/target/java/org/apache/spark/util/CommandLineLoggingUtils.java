package org.apache.spark.util;
public  interface CommandLineLoggingUtils {
    scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> exitFn ()  ;
    void printErrorAndExit (java.lang.String str)  ;
    void printMessage (java.lang.String str)  ;
    java.io.PrintStream printStream ()  ;
}
