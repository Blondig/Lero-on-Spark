package org.apache.spark.repl;
/**
 * An error when we cannot load a class due to exceptions. We don't know if this class exists, so
 * throw a special one that's neither {@link LinkageError} nor {@link ClassNotFoundException} to make JVM
 * retry to load this class later.
 */
  class RemoteClassLoaderError extends java.lang.Error {
  public   RemoteClassLoaderError (java.lang.String className, java.lang.Throwable cause)  { throw new RuntimeException(); }
}
