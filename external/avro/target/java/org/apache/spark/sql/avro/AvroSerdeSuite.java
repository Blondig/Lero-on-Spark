package org.apache.spark.sql.avro;
/**
 * Tests for {@link AvroSerializer} and {@link AvroDeserializer}, complementing those in {@link AvroSuite}
 * with a more specific focus on those classes.
 */
public  class AvroSerdeSuite extends org.apache.spark.SparkFunSuite {
  /**
   * Specifier for type of serde to be used for easy creation of tests that do both
   * serialization and deserialization.
   */
  static public  interface SerdeFactory<T extends java.lang.Object> {
    public  T create (org.apache.spark.sql.types.StructType sqlSchema, org.apache.avro.Schema avroSchema, scala.Enumeration.Value fieldMatchType)  ;
  }
  public   AvroSerdeSuite ()  { throw new RuntimeException(); }
  public  void withFieldMatchType (scala.Function1<scala.Enumeration.Value, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
