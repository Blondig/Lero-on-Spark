package org.apache.spark.sql.avro;
public abstract class AvroSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.execution.datasources.CommonFileDataSourceSuite, org.apache.spark.sql.NestedDataSourceSuiteBase {
  public  class NestedBottom implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  int id ()  { throw new RuntimeException(); }
    public  java.lang.String data ()  { throw new RuntimeException(); }
    // not preceding
    public   NestedBottom (int id, java.lang.String data)  { throw new RuntimeException(); }
  }
  public  class NestedBottom$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.String, org.apache.spark.sql.avro.AvroSuite.NestedBottom> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NestedBottom$ MODULE$ = null;
    public   NestedBottom$ ()  { throw new RuntimeException(); }
  }
  public  class NestedMiddle implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.avro.AvroSuite.NestedBottom data ()  { throw new RuntimeException(); }
    // not preceding
    public   NestedMiddle (int id, org.apache.spark.sql.avro.AvroSuite.NestedBottom data)  { throw new RuntimeException(); }
  }
  public  class NestedMiddle$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.sql.avro.AvroSuite.NestedBottom, org.apache.spark.sql.avro.AvroSuite.NestedMiddle> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NestedMiddle$ MODULE$ = null;
    public   NestedMiddle$ ()  { throw new RuntimeException(); }
  }
  public  class NestedTop implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.avro.AvroSuite.NestedMiddle data ()  { throw new RuntimeException(); }
    // not preceding
    public   NestedTop (int id, org.apache.spark.sql.avro.AvroSuite.NestedMiddle data)  { throw new RuntimeException(); }
  }
  public  class NestedTop$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.sql.avro.AvroSuite.NestedMiddle, org.apache.spark.sql.avro.AvroSuite.NestedTop> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NestedTop$ MODULE$ = null;
    public   NestedTop$ ()  { throw new RuntimeException(); }
  }
  public  class NestedMiddleArray implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.avro.AvroSuite.NestedBottom[] data ()  { throw new RuntimeException(); }
    // not preceding
    public   NestedMiddleArray (int id, org.apache.spark.sql.avro.AvroSuite.NestedBottom[] data)  { throw new RuntimeException(); }
  }
  public  class NestedMiddleArray$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.sql.avro.AvroSuite.NestedBottom[], org.apache.spark.sql.avro.AvroSuite.NestedMiddleArray> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NestedMiddleArray$ MODULE$ = null;
    public   NestedMiddleArray$ ()  { throw new RuntimeException(); }
  }
  public  class NestedTopArray implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.avro.AvroSuite.NestedMiddleArray data ()  { throw new RuntimeException(); }
    // not preceding
    public   NestedTopArray (int id, org.apache.spark.sql.avro.AvroSuite.NestedMiddleArray data)  { throw new RuntimeException(); }
  }
  public  class NestedTopArray$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.sql.avro.AvroSuite.NestedMiddleArray, org.apache.spark.sql.avro.AvroSuite.NestedTopArray> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NestedTopArray$ MODULE$ = null;
    public   NestedTopArray$ ()  { throw new RuntimeException(); }
  }
  public  class NestedMiddleMap implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  int id ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.avro.AvroSuite.NestedBottom> data ()  { throw new RuntimeException(); }
    // not preceding
    public   NestedMiddleMap (int id, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.avro.AvroSuite.NestedBottom> data)  { throw new RuntimeException(); }
  }
  public  class NestedMiddleMap$ extends scala.runtime.AbstractFunction2<java.lang.Object, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.avro.AvroSuite.NestedBottom>, org.apache.spark.sql.avro.AvroSuite.NestedMiddleMap> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NestedMiddleMap$ MODULE$ = null;
    public   NestedMiddleMap$ ()  { throw new RuntimeException(); }
  }
  public  class NestedTopMap implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.avro.AvroSuite.NestedMiddleMap data ()  { throw new RuntimeException(); }
    // not preceding
    public   NestedTopMap (int id, org.apache.spark.sql.avro.AvroSuite.NestedMiddleMap data)  { throw new RuntimeException(); }
  }
  public  class NestedTopMap$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.sql.avro.AvroSuite.NestedMiddleMap, org.apache.spark.sql.avro.AvroSuite.NestedTopMap> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NestedTopMap$ MODULE$ = null;
    public   NestedTopMap$ ()  { throw new RuntimeException(); }
  }
  public   AvroSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  void beforeAll ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  public  void checkAvroSchemaEquals (java.lang.String avroSchema, java.lang.String expectedAvroSchema)  { throw new RuntimeException(); }
  public  void checkReloadMatchesSaved (java.lang.String originalFile, java.lang.String newFile)  { throw new RuntimeException(); }
  protected  java.lang.String colType ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  java.lang.String dataSourceFormat ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  public  java.lang.String episodesAvro ()  { throw new RuntimeException(); }
  public  java.lang.String getAvroSchemaStringFromFiles (java.lang.String filePath)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> nestedDataSources ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  public  java.lang.String testAvro ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
