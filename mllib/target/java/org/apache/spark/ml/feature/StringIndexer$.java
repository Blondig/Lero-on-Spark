package org.apache.spark.ml.feature;
public  class StringIndexer$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.StringIndexer>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StringIndexer$ MODULE$ = null;
  public   StringIndexer$ ()  { throw new RuntimeException(); }
    java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
    java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
    java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
    java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
    java.lang.String frequencyDesc ()  { throw new RuntimeException(); }
    java.lang.String frequencyAsc ()  { throw new RuntimeException(); }
    java.lang.String alphabetDesc ()  { throw new RuntimeException(); }
    java.lang.String alphabetAsc ()  { throw new RuntimeException(); }
    java.lang.String[] supportedStringOrderType ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StringIndexer load (java.lang.String path)  { throw new RuntimeException(); }
    scala.Function2<scala.Tuple2<java.lang.String, java.lang.Object>, scala.Tuple2<java.lang.String, java.lang.Object>, java.lang.Object> getSortFunc (boolean ascending)  { throw new RuntimeException(); }
}
