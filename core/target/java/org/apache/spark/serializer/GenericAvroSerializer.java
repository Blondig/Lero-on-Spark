package org.apache.spark.serializer;
/**
 * Custom serializer used for generic Avro containers. If the user registers the schemas
 * ahead of time, then the schema's fingerprint will be sent with each message instead of the actual
 * schema, as to reduce network IO.
 * Actions like parsing or compressing schemas are computationally expensive so the serializer
 * caches all previously seen values as to reduce the amount of work needed to do.
 * param:  schemas a map where the keys are unique IDs for Avro schemas and the values are the
 *                string representation of the Avro schema, used to decrease the amount of data
 *                that needs to be serialized.
 * @param <D>  the subtype of {@link GenericContainer} handled by this serializer
 */
  class GenericAvroSerializer<D extends org.apache.avro.generic.GenericContainer> extends com.esotericsoftware.kryo.Serializer<D> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Select(Select(Select(Ident(org), org.apache), org.apache.avro), org.apache.avro.generic), org.apache.avro.generic.GenericContainer))))
  public   GenericAvroSerializer (scala.collection.immutable.Map<java.lang.Object, java.lang.String> schemas)  { throw new RuntimeException(); }
  /**
   * Used to compress Schemas when they are being sent over the wire.
   * The compression results are memoized to reduce the compression time since the
   * same schema is compressed many times over
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  byte[] compress (org.apache.avro.Schema schema)  { throw new RuntimeException(); }
  /**
   * Decompresses the schema into the actual in-memory object. Keeps an internal cache of already
   * seen values so to limit the number of times that decompression has to be done.
   * @param schemaBytes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.avro.Schema decompress (java.nio.ByteBuffer schemaBytes)  { throw new RuntimeException(); }
  /**
   * Deserializes generic containers into their in-memory form. There is internal
   * state to keep a cache of already seen schemas and datum readers.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  D deserializeDatum (com.esotericsoftware.kryo.io.Input input)  { throw new RuntimeException(); }
  public  D read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input input, java.lang.Class<D> datumClass)  { throw new RuntimeException(); }
  /**
   * Serializes a generic container to the given output stream. It caches a lot of the internal
   * data as to not redo work
   * @param datum (undocumented)
   * @param output (undocumented)
   */
  public  void serializeDatum (D datum, com.esotericsoftware.kryo.io.Output output)  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output output, D datum)  { throw new RuntimeException(); }
}
