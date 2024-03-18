package org.apache.spark.sql.avro;
/**
 * A deserializer to deserialize data in avro format to data in catalyst format.
 */
  class AvroDeserializer {
  /**
   * A base interface for updating values inside catalyst data structure like <code>InternalRow</code> and
   * <code>ArrayData</code>.
   */
  public  interface CatalystDataUpdater {
    public  void set (int ordinal, Object value)  ;
    public  void setBoolean (int ordinal, boolean value)  ;
    public  void setByte (int ordinal, byte value)  ;
    public  void setDecimal (int ordinal, org.apache.spark.sql.types.Decimal value)  ;
    public  void setDouble (int ordinal, double value)  ;
    public  void setFloat (int ordinal, float value)  ;
    public  void setInt (int ordinal, int value)  ;
    public  void setLong (int ordinal, long value)  ;
    public  void setNullAt (int ordinal)  ;
    public  void setShort (int ordinal, short value)  ;
  }
  public final class RowUpdater implements org.apache.spark.sql.avro.AvroDeserializer.CatalystDataUpdater {
    public   RowUpdater (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
    public  void set (int ordinal, Object value)  { throw new RuntimeException(); }
    public  void setBoolean (int ordinal, boolean value)  { throw new RuntimeException(); }
    public  void setByte (int ordinal, byte value)  { throw new RuntimeException(); }
    public  void setDecimal (int ordinal, org.apache.spark.sql.types.Decimal value)  { throw new RuntimeException(); }
    public  void setDouble (int ordinal, double value)  { throw new RuntimeException(); }
    public  void setFloat (int ordinal, float value)  { throw new RuntimeException(); }
    public  void setInt (int ordinal, int value)  { throw new RuntimeException(); }
    public  void setLong (int ordinal, long value)  { throw new RuntimeException(); }
    public  void setNullAt (int ordinal)  { throw new RuntimeException(); }
    public  void setShort (int ordinal, short value)  { throw new RuntimeException(); }
  }
  public final class ArrayDataUpdater implements org.apache.spark.sql.avro.AvroDeserializer.CatalystDataUpdater {
    public   ArrayDataUpdater (org.apache.spark.sql.catalyst.util.ArrayData array)  { throw new RuntimeException(); }
    public  void set (int ordinal, Object value)  { throw new RuntimeException(); }
    public  void setBoolean (int ordinal, boolean value)  { throw new RuntimeException(); }
    public  void setByte (int ordinal, byte value)  { throw new RuntimeException(); }
    public  void setDecimal (int ordinal, org.apache.spark.sql.types.Decimal value)  { throw new RuntimeException(); }
    public  void setDouble (int ordinal, double value)  { throw new RuntimeException(); }
    public  void setFloat (int ordinal, float value)  { throw new RuntimeException(); }
    public  void setInt (int ordinal, int value)  { throw new RuntimeException(); }
    public  void setLong (int ordinal, long value)  { throw new RuntimeException(); }
    public  void setNullAt (int ordinal)  { throw new RuntimeException(); }
    public  void setShort (int ordinal, short value)  { throw new RuntimeException(); }
  }
  public   AvroDeserializer (org.apache.avro.Schema rootAvroType, org.apache.spark.sql.types.DataType rootCatalystType, boolean positionalFieldMatch, org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec datetimeRebaseSpec, org.apache.spark.sql.catalyst.StructFilters filters)  { throw new RuntimeException(); }
  public   AvroDeserializer (org.apache.avro.Schema rootAvroType, org.apache.spark.sql.types.DataType rootCatalystType, java.lang.String datetimeRebaseMode)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> deserialize (Object data)  { throw new RuntimeException(); }
}
