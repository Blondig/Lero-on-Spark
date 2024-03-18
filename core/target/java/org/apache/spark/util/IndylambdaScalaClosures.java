package org.apache.spark.util;
public  class IndylambdaScalaClosures {
  static public  java.lang.String LambdaMetafactoryClassName ()  { throw new RuntimeException(); }
  static public  java.lang.String LambdaMetafactoryMethodName ()  { throw new RuntimeException(); }
  static public  java.lang.String LambdaMetafactoryMethodDesc ()  { throw new RuntimeException(); }
  /**
   * Check if the given reference is a indylambda style Scala closure.
   * If so (e.g. for Scala 2.12+ closures), return a non-empty serialization proxy
   * (SerializedLambda) of the closure;
   * otherwise (e.g. for Scala 2.11 closures) return None.
   * <p>
   * @param maybeClosure the closure to check.
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.invoke.SerializedLambda> getSerializationProxy (java.lang.Object maybeClosure)  { throw new RuntimeException(); }
  static public  boolean isIndylambdaScalaClosure (java.lang.invoke.SerializedLambda lambdaProxy)  { throw new RuntimeException(); }
  static public  java.lang.invoke.SerializedLambda inspect (java.lang.Object closure)  { throw new RuntimeException(); }
  /**
   * Check if the handle represents the LambdaMetafactory that indylambda Scala closures
   * use for creating the lambda class and getting a closure instance.
   * @param bsmHandle (undocumented)
   * @return (undocumented)
   */
  static public  boolean isLambdaMetafactory (org.apache.xbean.asm9.Handle bsmHandle)  { throw new RuntimeException(); }
  /**
   * Check if the handle represents a target method that is:
   * - a STATIC method that implements a Scala lambda body in the indylambda style
   * - captures the enclosing <code>this</code>, i.e. the first argument is a reference to the same type as
   *   the owning class.
   * Returns true if both criteria above are met.
   * @param handle (undocumented)
   * @param ownerInternalName (undocumented)
   * @return (undocumented)
   */
  static public  boolean isLambdaBodyCapturingOuter (org.apache.xbean.asm9.Handle handle, java.lang.String ownerInternalName)  { throw new RuntimeException(); }
  /**
   * Check if the callee of a call site is a inner class constructor.
   * - A constructor has to be invoked via INVOKESPECIAL
   * - A constructor's internal name is "&amp;lt;init&amp;gt;" and the return type is "V" (void)
   * - An inner class' first argument in the signature has to be a reference to the
   *   enclosing "this", aka <code>$outer</code> in Scala.
   * @param op (undocumented)
   * @param owner (undocumented)
   * @param name (undocumented)
   * @param desc (undocumented)
   * @param callerInternalName (undocumented)
   * @return (undocumented)
   */
  static public  boolean isInnerClassCtorCapturingOuter (int op, java.lang.String owner, java.lang.String name, java.lang.String desc, java.lang.String callerInternalName)  { throw new RuntimeException(); }
  /**
   * Scans an indylambda Scala closure, along with its lexically nested closures, and populate
   * the accessed fields info on which fields on the outer object are accessed.
   * <p>
   * This is equivalent to getInnerClosureClasses() + InnerClosureFinder + FieldAccessFinder fused
   * into one for processing indylambda closures. The traversal order along the call graph is the
   * same for all three combined, so they can be fused together easily while maintaining the same
   * ordering as the existing implementation.
   * <p>
   * Precondition: this function expects the <code>accessedFields</code> to be populated with all known
   *               outer classes and their super classes to be in the map as keys, e.g.
   *               initializing via ClosureCleaner.initAccessedFields.
   * @param lambdaProxy (undocumented)
   * @param lambdaClassLoader (undocumented)
   * @param accessedFields (undocumented)
   * @param findTransitively (undocumented)
   */
  static public  void findAccessedFields (java.lang.invoke.SerializedLambda lambdaProxy, java.lang.ClassLoader lambdaClassLoader, scala.collection.mutable.Map<java.lang.Class<?>, scala.collection.mutable.Set<java.lang.String>> accessedFields, boolean findTransitively)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
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
}
