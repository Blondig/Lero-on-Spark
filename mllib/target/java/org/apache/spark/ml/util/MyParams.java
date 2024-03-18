package org.apache.spark.ml.util;
public  class MyParams implements org.apache.spark.ml.param.Params, org.apache.spark.ml.util.MLWritable {
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.util.MyParams> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MyParams load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
    org.apache.spark.ml.param.ParamMap paramMap ()  { throw new RuntimeException(); }
    org.apache.spark.ml.param.ParamMap defaultParamMap ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MyParams (java.lang.String uid)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam intParamWithDefault ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam shouldNotSetIfSetintParamWithDefault ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam intParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.FloatParam floatParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam doubleParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam longParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> stringParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntArrayParam intArrayParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleArrayParam doubleArrayParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam stringArrayParam ()  { throw new RuntimeException(); }
  public  void checkExclusiveParams ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Params copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
