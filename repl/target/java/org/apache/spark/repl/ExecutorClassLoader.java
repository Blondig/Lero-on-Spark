package org.apache.spark.repl;
/**
 * A ClassLoader that reads classes from a Hadoop FileSystem or Spark RPC endpoint, used to load
 * classes defined by the interpreter when the REPL is used. Allows the user to specify if user
 * class path should be first.
 * This class loader delegates getting/finding resources to parent loader, which makes sense because
 * the REPL never produce resources dynamically. One exception is when getting a Class file as
 * resource stream, in which case we will try to fetch the Class file in the same way as loading
 * the class, so that dynamically generated Classes from the REPL can be picked up.
 * <p>
 * Note: {@link ClassLoader} will preferentially load class from parent. Only when parent is null or
 * the load failed, that it will call the overridden <code>findClass</code> function. To avoid the potential
 * issue caused by loading class using inappropriate class loader, we should set the parent of
 * ClassLoader to null, so that we can fully control which class loader is used. For detailed
 * discussion, see SPARK-18646.
 */
public  class ExecutorClassLoader extends java.lang.ClassLoader implements org.apache.spark.internal.Logging {
  public   ExecutorClassLoader (org.apache.spark.SparkConf conf, org.apache.spark.SparkEnv env, java.lang.String classUri, java.lang.ClassLoader parent, boolean userClassPathFirst)  { throw new RuntimeException(); }
  public  java.lang.String directory ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> findClass (java.lang.String name)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Class<?>> findClassLocally (java.lang.String name)  { throw new RuntimeException(); }
  public  java.net.URL getResource (java.lang.String name)  { throw new RuntimeException(); }
  public  java.io.InputStream getResourceAsStream (java.lang.String name)  { throw new RuntimeException(); }
  public  java.util.Enumeration<java.net.URL> getResources (java.lang.String name)  { throw new RuntimeException(); }
    int httpUrlConnectionTimeoutMillis ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.ParentClassLoader parentLoader ()  { throw new RuntimeException(); }
  public  byte[] readAndTransformClass (java.lang.String name, java.io.InputStream in)  { throw new RuntimeException(); }
  public  java.net.URI uri ()  { throw new RuntimeException(); }
  /**
   * URL-encode a string, preserving only slashes
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String urlEncode (java.lang.String str)  { throw new RuntimeException(); }
}
