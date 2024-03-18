package org.apache.spark.util;
public  class TestObjectWithBogusReturns {
  static public  int run ()  { throw new RuntimeException(); }
}
