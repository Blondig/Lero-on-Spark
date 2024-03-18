package org.apache.spark.mllib.tree;
public  class DecisionTreeSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext {
  static public  void validateClassifier (org.apache.spark.mllib.tree.model.DecisionTreeModel model, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input, double requiredAccuracy)  { throw new RuntimeException(); }
  static public  void validateRegressor (org.apache.spark.mllib.tree.model.DecisionTreeModel model, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input, double requiredMSE)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPointsWithLabel0 ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPointsWithLabel1 ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPoints ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.regression.LabeledPoint[] generateCategoricalDataPoints ()  { throw new RuntimeException(); }
  static public  java.util.List<org.apache.spark.mllib.regression.LabeledPoint> generateCategoricalDataPointsAsJavaList ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.regression.LabeledPoint[] generateCategoricalDataPointsForMulticlass ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.regression.LabeledPoint[] generateContinuousDataPointsForMulticlass ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.regression.LabeledPoint[] generateCategoricalDataPointsForMulticlassForOrderedFeatures ()  { throw new RuntimeException(); }
  /**
   * Create a tree model.  This is deterministic and contains a variety of node and feature types.
   * @param algo (undocumented)
   * @return (undocumented)
   */
  static   org.apache.spark.mllib.tree.model.DecisionTreeModel createModel (scala.Enumeration.Value algo)  { throw new RuntimeException(); }
  /**
   * Check if the two trees are exactly the same.
   * Note: I hesitate to override Node.equals since it could cause problems if users
   *       make mistakes such as creating loops of Nodes.
   * If the trees are not equal, this prints the two trees and throws an exception.
   * @param a (undocumented)
   * @param b (undocumented)
   */
  static   void checkEqual (org.apache.spark.mllib.tree.model.DecisionTreeModel a, org.apache.spark.mllib.tree.model.DecisionTreeModel b)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> org.scalactic.Equality<A> defaultEquality ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<T> $eq$eq$eq (T right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<T> $bang$eq$eq (T right)  { throw new RuntimeException(); }
  static public  org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<scala.runtime.Null$> $eq$eq$eq (scala.runtime.Null$ right)  { throw new RuntimeException(); }
  static public  org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<scala.runtime.Null$> $bang$eq$eq (scala.runtime.Null$ right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread<T> $eq$eq$eq (org.scalactic.TripleEqualsSupport.Spread<T> right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread<T> $bang$eq$eq (org.scalactic.TripleEqualsSupport.Spread<T> right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.Equalizer<T> convertToEqualizer (T left)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.CheckingEqualizer<T> convertToCheckingEqualizer (T left)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> unconstrainedEquality (org.scalactic.Equality<A> equalityOfA)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> lowPriorityTypeCheckedConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Predef.$less$colon$less<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToAToBConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Predef.$less$colon$less<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> typeCheckedConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Predef.$less$colon$less<B, A> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToBToAConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Predef.$less$colon$less<B, A> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> lowPriorityConversionCheckedConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Function1<A, B> cnv)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToAToBConversionConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Function1<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> conversionCheckedConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Function1<B, A> cnv)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToBToAConversionConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Function1<B, A> ev)  { throw new RuntimeException(); }
  static   java.lang.Throwable newAssertionFailedException (scala.Option<java.lang.String> optionalMessage, scala.Option<java.lang.Throwable> optionalCause, org.scalactic.source.Position pos, scala.collection.immutable.IndexedSeq<java.lang.String> analysis)  { throw new RuntimeException(); }
  static   java.lang.Throwable newTestCanceledException (scala.Option<java.lang.String> optionalMessage, scala.Option<java.lang.Throwable> optionalCause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assume (boolean condition, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assume (boolean condition, Object clue, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertTypeError (java.lang.String code, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertDoesNotCompile (java.lang.String code, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertCompiles (java.lang.String code, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T intercept (scala.Function0<java.lang.Object> f, scala.reflect.ClassTag<T> classTag, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalatest.compatible.Assertion assertThrows (scala.Function0<java.lang.Object> f, scala.reflect.ClassTag<T> classTag, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertResult (Object expected, Object clue, Object actual, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertResult (Object expected, Object actual, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.String message, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.String message, java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.String message, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.String message, java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T withClue (Object clue, scala.Function0<T> fun)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion pending ()  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion pendingUntilFixed (scala.Function0<scala.runtime.BoxedUnit> f, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.IndexedSeq<org.scalatest.Suite> nestedSuites ()  { throw new RuntimeException(); }
  static public final  void execute (java.lang.String testName, org.scalatest.ConfigMap configMap, boolean color, boolean durations, boolean shortstacks, boolean fullstacks, boolean stats)  { throw new RuntimeException(); }
  static public final  java.lang.String execute$default$1 ()  { throw new RuntimeException(); }
  static public final  org.scalatest.ConfigMap execute$default$2 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$3 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$4 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$5 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$6 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$7 ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Status runNestedSuites (org.scalatest.Args args)  { throw new RuntimeException(); }
  static public  java.lang.String suiteName ()  { throw new RuntimeException(); }
  static public  java.lang.String suiteId ()  { throw new RuntimeException(); }
  static public  int expectedTestCount (org.scalatest.Filter filter)  { throw new RuntimeException(); }
  static   org.scalatest.Reporter createCatchReporter (org.scalatest.Reporter reporter)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> rerunner ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Informer info ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Notifier note ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Alerter alert ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Documenter markup ()  { throw new RuntimeException(); }
  static public final  void registerTest (java.lang.String testText, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public final  void registerIgnoredTest (java.lang.String testText, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static protected  void test (java.lang.String testName, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static protected  void ignore (java.lang.String testName, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.String> testNames ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Status runTest (java.lang.String testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<java.lang.String>> tags ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Status runTests (scala.Option<java.lang.String> testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static public  org.scalatest.Status run (scala.Option<java.lang.String> testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static protected  void testsFor (scala.runtime.BoxedUnit unit)  { throw new RuntimeException(); }
  static public  org.scalatest.TestData testDataFor (java.lang.String testName, org.scalatest.ConfigMap theConfigMap)  { throw new RuntimeException(); }
  static public  org.scalatest.ConfigMap testDataFor$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public final  org.scalatest.Engine org$scalatest$funsuite$AnyFunSuiteLike$$engine ()  { throw new RuntimeException(); }
  static public final  java.lang.String styleName ()  { throw new RuntimeException(); }
  static protected final  void org$scalatest$funsuite$AnyFunSuiteLike$_setter_$org$scalatest$funsuite$AnyFunSuiteLike$$engine_$eq (org.scalatest.Engine x$1)  { throw new RuntimeException(); }
  static protected final  void org$scalatest$funsuite$AnyFunSuiteLike$_setter_$styleName_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public  org.scalatest.TestSuite.NoArgTest$ NoArgTest ()  { throw new RuntimeException(); }
  static protected  void org$scalatest$Suite$_setter_$styleName_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  static protected final  void org$scalatest$Assertions$_setter_$succeed_$eq (org.scalatest.compatible.Assertion x$1)  { throw new RuntimeException(); }
  static protected abstract  org.scalatest.Status runNestedSuites (org.scalatest.Args args)  ;
  static protected abstract  org.scalatest.Status runTests (scala.Option<java.lang.String> testName, org.scalatest.Args args)  ;
  static public abstract  java.lang.String suiteName ()  ;
  static public abstract  java.lang.String suiteId ()  ;
  static public abstract  org.scalatest.TestData testDataFor (java.lang.String testName, org.scalatest.ConfigMap theConfigMap)  ;
  static public abstract  scala.collection.immutable.Set<java.lang.String> testNames ()  ;
  static public abstract  scala.collection.immutable.IndexedSeq<org.scalatest.Suite> nestedSuites ()  ;
  static public abstract  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<java.lang.String>> tags ()  ;
  static public abstract  int expectedTestCount (org.scalatest.Filter filter)  ;
  static public abstract  scala.Option<java.lang.String> rerunner ()  ;
  static public abstract  java.lang.String styleName ()  ;
  static public  org.scalatest.Status run (scala.Option<java.lang.String> testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static protected  void beforeEach ()  { throw new RuntimeException(); }
  static protected  void afterEach ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Status runTest (java.lang.String testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  void doThreadPreAudit ()  { throw new RuntimeException(); }
  static protected  void doThreadPostAudit ()  { throw new RuntimeException(); }
  static protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  static protected  void beforeAll ()  { throw new RuntimeException(); }
  static protected  void afterAll ()  { throw new RuntimeException(); }
  static protected final  java.io.File getTestResourceFile (java.lang.String file)  { throw new RuntimeException(); }
  static protected final  java.lang.String getTestResourcePath (java.lang.String file)  { throw new RuntimeException(); }
  static protected final  java.io.File copyAndGetResourceFile (java.lang.String fileName, java.lang.String suffix)  { throw new RuntimeException(); }
  static protected final  java.nio.file.Path getWorkspaceFilePath (java.lang.String first, scala.collection.Seq<java.lang.String> more)  { throw new RuntimeException(); }
  static public  void testRetry (java.lang.String s, int n, scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  static public  int testRetry$default$2 ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T retry (int n, scala.Function0<T> body)  { throw new RuntimeException(); }
  static protected  void logForFailedTest ()  { throw new RuntimeException(); }
  static protected final  org.scalatest.Outcome withFixture (org.scalatest.TestSuite.NoArgTest test)  { throw new RuntimeException(); }
  static protected  void withTempDir (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static protected  void withLogAppender (org.apache.logging.log4j.core.appender.AbstractAppender appender, scala.collection.Seq<java.lang.String> loggerNames, scala.Option<org.apache.logging.log4j.Level> level, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.String> withLogAppender$default$2 ()  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.logging.log4j.Level> withLogAppender$default$3 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.String> threadExcludeList ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.String> org$apache$spark$ThreadAudit$$threadNamesSnapshot ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$ThreadAudit$$threadNamesSnapshot_$eq (scala.collection.immutable.Set<java.lang.String> x$1)  { throw new RuntimeException(); }
  static protected  void org$apache$spark$ThreadAudit$_setter_$threadExcludeList_$eq (scala.collection.immutable.Set<java.lang.String> x$1)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static public  boolean invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected ()  { throw new RuntimeException(); }
  static protected  void org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq (boolean x$1)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  public   DecisionTreeSuite ()  { throw new RuntimeException(); }
}
