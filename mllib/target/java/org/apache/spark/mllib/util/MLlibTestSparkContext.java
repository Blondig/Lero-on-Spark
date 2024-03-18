package org.apache.spark.mllib.util;
public  interface MLlibTestSparkContext extends org.apache.spark.ml.util.TempDirectory {
  /**
   * A helper object for importing SQL implicits.
   * <p>
   * Note that the alternative of importing <code>spark.implicits._</code> is not possible here.
   * This is because we create the <code>SQLContext</code> immediately before the first test is run,
   * but the implicits import is needed in the constructor.
   */
  protected  class testImplicits {
    static protected  org.apache.spark.sql.SQLContext _sqlContext ()  { throw new RuntimeException(); }
    static public <T extends scala.Product> org.apache.spark.sql.Encoder<T> newProductEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$9)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SQLImplicits.StringToColumn StringToColumn (scala.StringContext sc)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newIntEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newLongEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newDoubleEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newFloatEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newByteEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newShortEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newBooleanEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.String> newStringEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.math.BigDecimal> newJavaDecimalEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.math.BigDecimal> newScalaDecimalEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.sql.Date> newDateEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.time.LocalDate> newLocalDateEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.sql.Timestamp> newTimeStampEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.time.Instant> newInstantEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.time.Duration> newDurationEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.time.Period> newPeriodEncoder ()  { throw new RuntimeException(); }
    static public <A extends java.lang.Enum<?>> org.apache.spark.sql.Encoder<A> newJavaEnumEncoder (scala.reflect.api.TypeTags.TypeTag<A> evidence$1)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Integer> newBoxedIntEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Long> newBoxedLongEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Double> newBoxedDoubleEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Float> newBoxedFloatEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Byte> newBoxedByteEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Short> newBoxedShortEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Boolean> newBoxedBooleanEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newIntSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newLongSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newDoubleSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newFloatSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newByteSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newShortSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newBooleanSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.String>> newStringSeqEncoder ()  { throw new RuntimeException(); }
    static public <A extends scala.Product> org.apache.spark.sql.Encoder<scala.collection.Seq<A>> newProductSeqEncoder (scala.reflect.api.TypeTags.TypeTag<A> evidence$2)  { throw new RuntimeException(); }
    static public <T extends scala.collection.Seq<?>> org.apache.spark.sql.Encoder<T> newSequenceEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$3)  { throw new RuntimeException(); }
    static public <T extends scala.collection.Map<?, ?>> org.apache.spark.sql.Encoder<T> newMapEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$4)  { throw new RuntimeException(); }
    static public <T extends scala.collection.immutable.Set<?>> org.apache.spark.sql.Encoder<T> newSetEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$5)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<int[]> newIntArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<long[]> newLongArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<double[]> newDoubleArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<float[]> newFloatArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<byte[]> newByteArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<short[]> newShortArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<boolean[]> newBooleanArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.String[]> newStringArrayEncoder ()  { throw new RuntimeException(); }
    static public <A extends scala.Product> org.apache.spark.sql.Encoder<java.lang.Object> newProductArrayEncoder (scala.reflect.api.TypeTags.TypeTag<A> evidence$6)  { throw new RuntimeException(); }
    static public <T extends java.lang.Object> org.apache.spark.sql.DatasetHolder<T> rddToDatasetHolder (org.apache.spark.rdd.RDD<T> rdd, org.apache.spark.sql.Encoder<T> evidence$7)  { throw new RuntimeException(); }
    static public <T extends java.lang.Object> org.apache.spark.sql.DatasetHolder<T> localSeqToDatasetHolder (scala.collection.Seq<T> s, org.apache.spark.sql.Encoder<T> evidence$8)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.ColumnName symbolToColumn (scala.Symbol s)  { throw new RuntimeException(); }
  }
  /**
   * A helper object for importing SQL implicits.
   * <p>
   * Note that the alternative of importing <code>spark.implicits._</code> is not possible here.
   * This is because we create the <code>SQLContext</code> immediately before the first test is run,
   * but the implicits import is needed in the constructor.
   */
  protected  class testImplicits$ extends org.apache.spark.sql.SQLImplicits {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final testImplicits$ MODULE$ = null;
    public   testImplicits$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.SQLContext _sqlContext ()  { throw new RuntimeException(); }
  }
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  public  java.lang.String checkpointDir ()  ;
  public  org.apache.spark.SparkContext sc ()  ;
  public  org.apache.spark.sql.SparkSession spark ()  ;
    org.apache.spark.ml.feature.Instance[] standardize (org.apache.spark.ml.feature.Instance[] instances)  ;
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  ;
}
