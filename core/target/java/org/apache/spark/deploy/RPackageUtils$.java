package org.apache.spark.deploy;
public  class RPackageUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RPackageUtils$ MODULE$ = null;
  public   RPackageUtils$ ()  { throw new RuntimeException(); }
  /** Documentation on how the R source file layout should be in the jar. */
   final  java.lang.String RJarDoc ()  { throw new RuntimeException(); }
  /**
   * Checks the manifest of the Jar whether there is any R source code bundled with it.
   * Exposed for testing.
   * @param jar (undocumented)
   * @return (undocumented)
   */
    boolean checkManifestForR (java.util.jar.JarFile jar)  { throw new RuntimeException(); }
  /**
   * Extracts the files under /R in the jar to a temporary directory for building.
   * @param jars (undocumented)
   * @param printStream (undocumented)
   * @param verbose (undocumented)
   */
    void checkAndBuildRPackage (java.lang.String jars, java.io.PrintStream printStream, boolean verbose)  { throw new RuntimeException(); }
  /** Zips all the R libraries built for distribution to the cluster. */
    java.io.File zipRLibraries (java.io.File dir, java.lang.String name)  { throw new RuntimeException(); }
}
