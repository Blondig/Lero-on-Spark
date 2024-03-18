package org.apache.spark;
/**
 * Utilities for tests. Included in main codebase since it's used by multiple
 * projects.
 * <p>
 * TODO: See if we can move this to the test codebase by specifying
 * test dependencies between projects.
 */
public  class TestUtils {
  static   class JavaSourceFromString extends javax.tools.SimpleJavaFileObject {
    // not preceding
    public   JavaSourceFromString (java.lang.String name, java.lang.String code)  { throw new RuntimeException(); }
    public  java.lang.String code ()  { throw new RuntimeException(); }
    public  java.lang.String getCharContent (boolean ignoreEncodingErrors)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
  }
  /**
   * Create a jar that defines classes with the given names.
   * <p>
   * Note: if this is used during class loader tests, class names should be unique
   * in order to avoid interference between tests.
   * @param classNames (undocumented)
   * @param toStringValue (undocumented)
   * @param classNamesWithBase (undocumented)
   * @param classpathUrls (undocumented)
   * @return (undocumented)
   */
  static public  java.net.URL createJarWithClasses (scala.collection.Seq<java.lang.String> classNames, java.lang.String toStringValue, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> classNamesWithBase, scala.collection.Seq<java.net.URL> classpathUrls)  { throw new RuntimeException(); }
  /**
   * Create a jar file containing multiple files. The <code>files</code> map contains a mapping of
   * file names in the jar file to their contents.
   * @param files (undocumented)
   * @param dir (undocumented)
   * @return (undocumented)
   */
  static public  java.net.URL createJarWithFiles (scala.collection.immutable.Map<java.lang.String, java.lang.String> files, java.io.File dir)  { throw new RuntimeException(); }
  /**
   * Create a jar file that contains this set of files. All files will be located in the specified
   * directory or at the root of the jar.
   * @param files (undocumented)
   * @param jarFile (undocumented)
   * @param directoryPrefix (undocumented)
   * @param mainClass (undocumented)
   * @return (undocumented)
   */
  static public  java.net.URL createJar (scala.collection.Seq<java.io.File> files, java.io.File jarFile, scala.Option<java.lang.String> directoryPrefix, scala.Option<java.lang.String> mainClass)  { throw new RuntimeException(); }
  /** Creates a compiled class with the source file. Class file will be placed in destDir. */
  static public  java.io.File createCompiledClass (java.lang.String className, java.io.File destDir, org.apache.spark.TestUtils.JavaSourceFromString sourceFile, scala.collection.Seq<java.net.URL> classpathUrls)  { throw new RuntimeException(); }
  /** Creates a compiled class with the given name. Class file will be placed in destDir. */
  static public  java.io.File createCompiledClass (java.lang.String className, java.io.File destDir, java.lang.String toStringValue, java.lang.String baseClass, scala.collection.Seq<java.net.URL> classpathUrls, scala.collection.Seq<java.lang.String> implementsClasses, java.lang.String extraCodeBody)  { throw new RuntimeException(); }
  /**
   * Run some code involving jobs submitted to the given context and assert that the jobs spilled.
   * @param sc (undocumented)
   * @param identifier (undocumented)
   * @param body (undocumented)
   */
  static public  void assertSpilled (org.apache.spark.SparkContext sc, java.lang.String identifier, scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  /**
   * Run some code involving jobs submitted to the given context and assert that the jobs
   * did not spill.
   * @param sc (undocumented)
   * @param identifier (undocumented)
   * @param body (undocumented)
   */
  static public  void assertNotSpilled (org.apache.spark.SparkContext sc, java.lang.String identifier, scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  /**
   * Asserts that exception message contains the message. Please note this checks all
   * exceptions in the tree. If a type parameter <code>E</code> is supplied, this will additionally confirm
   * that the exception is a subtype of the exception provided in the type parameter.
   * @param exception (undocumented)
   * @param msg (undocumented)
   * @param ignoreCase (undocumented)
   * @param evidence$1 (undocumented)
   */
  static public <E extends java.lang.Throwable> void assertExceptionMsg (java.lang.Throwable exception, java.lang.String msg, boolean ignoreCase, scala.reflect.ClassTag<E> evidence$1)  { throw new RuntimeException(); }
  /**
   * Test if a command is available.
   * @param command (undocumented)
   * @return (undocumented)
   */
  static public  boolean testCommandAvailable (java.lang.String command)  { throw new RuntimeException(); }
  static public  boolean isPythonVersionAtLeast38 ()  { throw new RuntimeException(); }
  /**
   * Get the absolute path from the executable. This implementation was borrowed from
   * <code>spark/dev/sparktestsupport/shellutils.py</code>.
   * @param executable (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.String> getAbsolutePathFromExecutable (java.lang.String executable)  { throw new RuntimeException(); }
  /**
   * Returns the response code from an HTTP(S) URL.
   * @param url (undocumented)
   * @param method (undocumented)
   * @param headers (undocumented)
   * @return (undocumented)
   */
  static public  int httpResponseCode (java.net.URL url, java.lang.String method, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> headers)  { throw new RuntimeException(); }
  /**
   * Returns the response message from an HTTP(S) URL.
   * @param url (undocumented)
   * @param method (undocumented)
   * @param headers (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String httpResponseMessage (java.net.URL url, java.lang.String method, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> headers)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T withHttpConnection (java.net.URL url, java.lang.String method, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> headers, scala.Function1<java.net.HttpURLConnection, T> fn)  { throw new RuntimeException(); }
  /**
   * Runs some code with the given listener installed in the SparkContext. After the code runs,
   * this method will wait until all events posted to the listener bus are processed, and then
   * remove the listener from the bus.
   * @param sc (undocumented)
   * @param listener (undocumented)
   * @param body (undocumented)
   */
  static public <L extends org.apache.spark.scheduler.SparkListener> void withListener (org.apache.spark.SparkContext sc, L listener, scala.Function1<L, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  static public  void withHttpServer (java.lang.String resBaseDir, scala.Function1<java.net.URL, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  /**
   * Wait until at least <code>numExecutors</code> executors are up, or throw <code>TimeoutException</code> if the waiting
   * time elapsed before <code>numExecutors</code> executors up. Exposed for testing.
   * <p>
   * @param numExecutors the number of executors to wait at least
   * @param timeout time to wait in milliseconds
   * @param sc (undocumented)
   */
  static   void waitUntilExecutorsUp (org.apache.spark.SparkContext sc, int numExecutors, long timeout)  { throw new RuntimeException(); }
  /**
   * config a log4j2 properties used for testsuite
   * @param level (undocumented)
   */
  static public  void configTestLog4j2 (java.lang.String level)  { throw new RuntimeException(); }
  /**
   * Lists files recursively.
   * @param f (undocumented)
   * @return (undocumented)
   */
  static public  java.io.File[] recursiveList (java.io.File f)  { throw new RuntimeException(); }
  /**
   * Returns the list of files at 'path' recursively. This skips files that are ignored normally
   * by MapReduce.
   * @param path (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String[] listDirectory (java.io.File path)  { throw new RuntimeException(); }
  /** Creates a temp JSON file that contains the input JSON record. */
  static public  java.lang.String createTempJsonFile (java.io.File dir, java.lang.String prefix, org.json4s.JsonAST.JValue jsonValue)  { throw new RuntimeException(); }
  /** Creates a temp bash script that prints the given output. */
  static public  java.lang.String createTempScriptWithExpectedOutput (java.io.File dir, java.lang.String prefix, java.lang.String output)  { throw new RuntimeException(); }
}
