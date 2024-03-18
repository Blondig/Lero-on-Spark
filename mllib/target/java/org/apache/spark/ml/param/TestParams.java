package org.apache.spark.ml.param;
/** A subclass of Params for testing. */
public  class TestParams implements org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasHandleInvalid, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasInputCol {
  // not preceding
  public   TestParams (java.lang.String uid)  { throw new RuntimeException(); }
  public   TestParams ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.TestParams clearMaxIter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.TestParams copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
    org.apache.spark.ml.param.ParamMap defaultParamMap ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
    org.apache.spark.ml.param.ParamMap paramMap ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.TestParams setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.TestParams setMaxIter (int value)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
}
