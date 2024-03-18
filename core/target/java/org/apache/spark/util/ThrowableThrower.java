package org.apache.spark.util;
public  class ThrowableThrower {
  static public  class ThrowerThread extends java.lang.Thread {
    public   ThrowerThread (java.lang.String name, boolean exitOnUncaughtException)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
