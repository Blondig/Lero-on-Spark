package org.apache.spark.storage;
/**
 * :: DeveloperApi ::
 * Identifies a particular Block of data, usually associated with a single file.
 * A Block can be uniquely identified by its filename, but each type of Block has a different
 * set of keys which produce its unique name.
 * <p>
 * If your BlockId should be serializable, be sure to add it to the BlockId.apply() method.
 */
public abstract class BlockId {
  static public  scala.util.matching.Regex RDD ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_BATCH ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_DATA ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_INDEX ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_PUSH ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_MERGED ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_MERGED_DATA ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_MERGED_INDEX ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_MERGED_META ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_CHUNK ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex BROADCAST ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex TASKRESULT ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex STREAM ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex TEMP_LOCAL ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex TEMP_SHUFFLE ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex TEST ()  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.BlockId apply (java.lang.String name)  { throw new RuntimeException(); }
  public   BlockId ()  { throw new RuntimeException(); }
  /** A globally unique identifier for this Block. Can be used for ser/de. */
  public abstract  java.lang.String name ()  ;
  public  scala.Option<org.apache.spark.storage.RDDBlockId> asRDDId ()  { throw new RuntimeException(); }
  public  boolean isRDD ()  { throw new RuntimeException(); }
  public  boolean isShuffle ()  { throw new RuntimeException(); }
  public  boolean isShuffleChunk ()  { throw new RuntimeException(); }
  public  boolean isBroadcast ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
