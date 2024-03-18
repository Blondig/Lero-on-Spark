package org.apache.spark;
public abstract class ShuffleSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.matchers.must.Matchers, org.apache.spark.LocalRootDirsTest {
  static public  class AggregatedShuffleMetrics implements scala.Product, scala.Serializable {
    public  long recordsWritten ()  { throw new RuntimeException(); }
    public  long recordsRead ()  { throw new RuntimeException(); }
    public  long bytesWritten ()  { throw new RuntimeException(); }
    public  long byresRead ()  { throw new RuntimeException(); }
    // not preceding
    public   AggregatedShuffleMetrics (long recordsWritten, long recordsRead, long bytesWritten, long byresRead)  { throw new RuntimeException(); }
  }
  static public  class AggregatedShuffleMetrics$ extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.ShuffleSuite.AggregatedShuffleMetrics> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AggregatedShuffleMetrics$ MODULE$ = null;
    public   AggregatedShuffleMetrics$ ()  { throw new RuntimeException(); }
  }
  static public  class NonJavaSerializableClass implements java.lang.Comparable<org.apache.spark.ShuffleSuite.NonJavaSerializableClass> {
    // not preceding
    public   NonJavaSerializableClass (int value)  { throw new RuntimeException(); }
    public  int compareTo (org.apache.spark.ShuffleSuite.NonJavaSerializableClass o)  { throw new RuntimeException(); }
    public  int value ()  { throw new RuntimeException(); }
  }
  static public  int mergeCombineException (int x, int y)  { throw new RuntimeException(); }
  static public  org.apache.spark.ShuffleSuite.AggregatedShuffleMetrics runAndReturnMetrics (org.apache.spark.SparkContext sc, scala.Function0<scala.runtime.BoxedUnit> job)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  protected  java.io.File tempDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.KeyWord key ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.ValueWord value ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AWord a ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.AnWord an ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.TheSameInstanceAsPhrase theSameInstanceAs ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.must.Matchers.RegexWord regex ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DecidedWord decided ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.DeterminedWord determined ()  { throw new RuntimeException(); }
  public  org.scalactic.Explicitly.TheAfterWord after ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.FullyMatchWord fullyMatch ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.StartWithWord startWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EndWithWord endWith ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.IncludeWord include ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.HaveWord have ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.BeWord be ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ContainWord contain ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.NotWord not ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.LengthWord length ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SizeWord size ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.SortedWord sorted ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.DefinedWord defined ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ExistWord exist ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.ReadableWord readable ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.WritableWord writable ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.EmptyWord empty ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.CompileWord compile ()  { throw new RuntimeException(); }
  public  org.scalatest.verbs.TypeCheckWord typeCheck ()  { throw new RuntimeException(); }
  public  org.scalatest.matchers.dsl.MatchPatternWord matchPattern ()  { throw new RuntimeException(); }
  public   ShuffleSuite ()  { throw new RuntimeException(); }
}
