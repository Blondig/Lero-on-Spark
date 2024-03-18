package org.apache.sparktest;
/**
 * A test suite to make sure all <code>implicit</code> functions work correctly.
 * Please don't <code>import org.apache.spark.SparkContext._</code> in this class.
 * <p>
 * As <code>implicit</code> is a compiler feature, we don't need to run this class.
 * What we need to do is making the compiler happy.
 */
public  class ImplicitSuite {
  public   ImplicitSuite ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.rdd.RDD<T> mockRDD ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.SparkContext mockSparkContext ()  { throw new RuntimeException(); }
  public  void testBooleanWritableConverter ()  { throw new RuntimeException(); }
  public  void testBytesWritableConverter ()  { throw new RuntimeException(); }
  public  void testDoubleRDDToDoubleRDDFunctions ()  { throw new RuntimeException(); }
  public  void testDoubleWritableConverter ()  { throw new RuntimeException(); }
  public  void testFloatWritableConverter ()  { throw new RuntimeException(); }
  public  void testIntWritableConverter ()  { throw new RuntimeException(); }
  public  void testLongWritableConverter ()  { throw new RuntimeException(); }
  public  void testNumericRDDToDoubleRDDFunctions ()  { throw new RuntimeException(); }
  public  void testRddToAsyncRDDActions ()  { throw new RuntimeException(); }
  public  void testRddToOrderedRDDFunctions ()  { throw new RuntimeException(); }
  public  void testRddToPairRDDFunctions ()  { throw new RuntimeException(); }
  public  void testRddToSequenceFileRDDFunctions ()  { throw new RuntimeException(); }
  public  void testRddToSequenceFileRDDFunctionsWithBytesArray ()  { throw new RuntimeException(); }
  public  void testRddToSequenceFileRDDFunctionsWithWritable ()  { throw new RuntimeException(); }
  public  void testStringWritableConverter ()  { throw new RuntimeException(); }
  public  void testWritableWritableConverter ()  { throw new RuntimeException(); }
}
