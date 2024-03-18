package org.apache.spark.ml.r;
  class FPGrowthWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class FPGrowthWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.FPGrowthWrapper> {
    public   FPGrowthWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.FPGrowthWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class FPGrowthWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   FPGrowthWrapperWriter (org.apache.spark.ml.r.FPGrowthWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.FPGrowthWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, double minSupport, double minConfidence, java.lang.String itemsCol, java.lang.Integer numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.FPGrowthWrapper> read ()  { throw new RuntimeException(); }
  static public  T load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.fpm.FPGrowthModel fpGrowthModel ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> freqItemsets ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> associationRules ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
