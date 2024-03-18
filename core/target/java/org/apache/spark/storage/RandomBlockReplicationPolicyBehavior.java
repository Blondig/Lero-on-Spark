package org.apache.spark.storage;
public  class RandomBlockReplicationPolicyBehavior extends org.apache.spark.SparkFunSuite implements org.scalatest.matchers.must.Matchers, org.scalatest.BeforeAndAfter, org.apache.spark.LocalSparkContext {
  public   RandomBlockReplicationPolicyBehavior ()  { throw new RuntimeException(); }
  protected  org.apache.spark.storage.BlockId StringToBlockId (java.lang.String value)  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AWord a ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.TheAfterWord after ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AnWord an ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.BeWord be ()  { throw new RuntimeException(); }
  public  java.lang.String blockId ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.CompileWord compile ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ContainWord contain ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DecidedWord decided ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.DefinedWord defined ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DeterminedWord determined ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EmptyWord empty ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EndWithWord endWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ExistWord exist ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.FullyMatchWord fullyMatch ()  { throw new RuntimeException(); }
  /**
   * Returns a sequence of {@link BlockManagerId}, whose rack is randomly picked from the given <code>racks</code>.
   * Note that, each rack will be picked at least once from <code>racks</code>, if <code>count</code> is greater or equal
   * to the number of <code>racks</code>.
   * @param count (undocumented)
   * @param racks (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> generateBlockManagerIds (int count, scala.collection.Seq<java.lang.String> racks)  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.HaveWord have ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.IncludeWord include ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.KeyWord key ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.LengthWord length ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.MatchPatternWord matchPattern ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.NotWord not ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ReadableWord readable ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.RegexWord regex ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockReplicationPolicy replicationPolicy ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SizeWord size ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SortedWord sorted ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.StartWithWord startWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.TheSameInstanceAsPhrase theSameInstanceAs ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.TypeCheckWord typeCheck ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.ValueWord value ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.WritableWord writable ()  { throw new RuntimeException(); }
}
