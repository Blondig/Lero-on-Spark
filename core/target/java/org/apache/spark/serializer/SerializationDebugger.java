package org.apache.spark.serializer;
public  class SerializationDebugger {
  /** An implicit class that allows us to call private methods of ObjectStreamClass. */
  static public  class ObjectStreamClassMethods extends scala.AnyVal {
    public  java.io.ObjectStreamClass desc ()  { throw new RuntimeException(); }
    // not preceding
    public   ObjectStreamClassMethods (java.io.ObjectStreamClass desc)  { throw new RuntimeException(); }
    public  java.io.ObjectStreamClass[] getSlotDescs ()  { throw new RuntimeException(); }
    public  boolean hasWriteObjectMethod ()  { throw new RuntimeException(); }
    public  boolean hasWriteReplaceMethod ()  { throw new RuntimeException(); }
    public  java.lang.Object invokeWriteReplace (java.lang.Object obj)  { throw new RuntimeException(); }
    public  int getNumObjFields ()  { throw new RuntimeException(); }
    public  void getObjFieldValues (java.lang.Object obj, java.lang.Object[] out)  { throw new RuntimeException(); }
  }
  static public  class ObjectStreamClassMethods$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ObjectStreamClassMethods$ MODULE$ = null;
    public   ObjectStreamClassMethods$ ()  { throw new RuntimeException(); }
  }
  /**
   * Improve the given NotSerializableException with the serialization path leading from the given
   * object to the problematic object. This is turned off automatically if
   * <code>sun.io.serialization.extendedDebugInfo</code> flag is turned on for the JVM.
   * @param obj (undocumented)
   * @param e (undocumented)
   * @return (undocumented)
   */
  static public  java.io.NotSerializableException improveException (Object obj, java.io.NotSerializableException e)  { throw new RuntimeException(); }
  /**
   * Find the path leading to a not serializable object. This method is modeled after OpenJDK's
   * serialization mechanism, and handles the following cases:
   * <p>
   *  - primitives
   *  - arrays of primitives
   *  - arrays of non-primitive objects
   *  - Serializable objects
   *  - Externalizable objects
   *  - writeReplace
   * <p>
   * It does not yet handle writeObject override, but that shouldn't be too hard to do either.
   * @param obj (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.immutable.List<java.lang.String> find (Object obj)  { throw new RuntimeException(); }
  static   boolean enableDebugging ()  { throw new RuntimeException(); }
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
