package org.apache.spark.ml.feature;
public  class VectorAssembler$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.VectorAssembler>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final VectorAssembler$ MODULE$ = null;
  public   VectorAssembler$ ()  { throw new RuntimeException(); }
    java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
    java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
    java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
    java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  /**
   * Infers lengths of vector columns from the first row of the dataset
   * @param dataset the dataset
   * @param columns name of vector columns whose lengths need to be inferred
   * @return map of column names to lengths
   */
    scala.collection.immutable.Map<java.lang.String, java.lang.Object> getVectorLengthsFromFirstRow (org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<java.lang.String> columns)  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.Object> getLengths (org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<java.lang.String> columns, java.lang.String handleInvalid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorAssembler load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Returns a function that has the required information to assemble each row.
   * @param lengths an array of lengths of input columns, whose size should be equal to the number
   *                of cells in the row (vv)
   * @param keepInvalid indicate whether to throw an error or not on seeing a null in the rows
   * @return  a udf that can be applied on each row
   * @param vv (undocumented)
   */
    org.apache.spark.ml.linalg.Vector assemble (int[] lengths, boolean keepInvalid, scala.collection.Seq<java.lang.Object> vv)  { throw new RuntimeException(); }
}
