package org.apache.spark.deploy;
/** Provides utility functions to be used inside SparkSubmit. */
public  class SparkSubmitUtils {
  /**
   * Represents a Maven Coordinate
   * param:  groupId the groupId of the coordinate
   * param:  artifactId the artifactId of the coordinate
   * param:  version the version of the coordinate
   */
  static   class MavenCoordinate implements scala.Product, scala.Serializable {
    public  java.lang.String groupId ()  { throw new RuntimeException(); }
    public  java.lang.String artifactId ()  { throw new RuntimeException(); }
    public  java.lang.String version ()  { throw new RuntimeException(); }
    // not preceding
    public   MavenCoordinate (java.lang.String groupId, java.lang.String artifactId, java.lang.String version)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class MavenCoordinate$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MavenCoordinate$ MODULE$ = null;
    public   MavenCoordinate$ ()  { throw new RuntimeException(); }
  }
  static public  java.io.PrintStream printStream ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.String> IVY_DEFAULT_EXCLUDES ()  { throw new RuntimeException(); }
  /**
   * Extracts maven coordinates from a comma-delimited string. Coordinates should be provided
   * in the format <code>groupId:artifactId:version</code> or <code>groupId/artifactId:version</code>.
   * @param coordinates Comma-delimited string of maven coordinates
   * @return Sequence of Maven coordinates
   */
  static public  scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate> extractMavenCoordinates (java.lang.String coordinates)  { throw new RuntimeException(); }
  /** Path of the local Maven cache. */
  static   java.io.File m2Path ()  { throw new RuntimeException(); }
  /**
   * Extracts maven coordinates from a comma-delimited string
   * @param defaultIvyUserDir The default user path for Ivy
   * @return A ChainResolver used by Ivy to search for and resolve dependencies.
   */
  static public  org.apache.ivy.plugins.resolver.ChainResolver createRepoResolvers (java.io.File defaultIvyUserDir)  { throw new RuntimeException(); }
  /**
   * Output a list of paths for the downloaded jars to be added to the classpath
   * (will append to jars in SparkSubmit).
   * @param artifacts Sequence of dependencies that were resolved and retrieved
   * @param cacheDirectory Directory where jars are cached
   * @return List of paths for the dependencies
   */
  static public  scala.collection.Seq<java.lang.String> resolveDependencyPaths (java.lang.Object[] artifacts, java.io.File cacheDirectory)  { throw new RuntimeException(); }
  /** Adds the given maven coordinates to Ivy's module descriptor. */
  static public  void addDependenciesToIvy (org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor md, scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate> artifacts, java.lang.String ivyConfName)  { throw new RuntimeException(); }
  /** Add exclusion rules for dependencies already included in the spark-assembly */
  static public  void addExclusionRules (org.apache.ivy.core.settings.IvySettings ivySettings, java.lang.String ivyConfName, org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor md)  { throw new RuntimeException(); }
  /**
   * Build Ivy Settings using options with default resolvers
   * @param remoteRepos Comma-delimited string of remote repositories other than maven central
   * @param ivyPath The path to the local ivy repository
   * @return An IvySettings object
   */
  static public  org.apache.ivy.core.settings.IvySettings buildIvySettings (scala.Option<java.lang.String> remoteRepos, scala.Option<java.lang.String> ivyPath)  { throw new RuntimeException(); }
  /**
   * Load Ivy settings from a given filename, using supplied resolvers
   * @param settingsFile Path to Ivy settings file
   * @param remoteRepos Comma-delimited string of remote repositories other than maven central
   * @param ivyPath The path to the local ivy repository
   * @return An IvySettings object
   */
  static public  org.apache.ivy.core.settings.IvySettings loadIvySettings (java.lang.String settingsFile, scala.Option<java.lang.String> remoteRepos, scala.Option<java.lang.String> ivyPath)  { throw new RuntimeException(); }
  /** A nice function to use in tests as well. Values are dummy strings. */
  static public  org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor getModuleDescriptor ()  { throw new RuntimeException(); }
  /**
   * Resolves any dependencies that were supplied through maven coordinates
   * @param coordinates Comma-delimited string of maven coordinates
   * @param ivySettings An IvySettings containing resolvers to use
   * @param transitive Whether resolving transitive dependencies, default is true
   * @param exclusions Exclusions to apply when resolving transitive dependencies
   * @return Seq of path to the jars of the given maven artifacts including their
   *         transitive dependencies
   * @param isTest (undocumented)
   */
  static public  scala.collection.Seq<java.lang.String> resolveMavenCoordinates (java.lang.String coordinates, org.apache.ivy.core.settings.IvySettings ivySettings, boolean transitive, scala.collection.Seq<java.lang.String> exclusions, boolean isTest)  { throw new RuntimeException(); }
  static   org.apache.ivy.core.module.descriptor.ExcludeRule createExclusion (java.lang.String coords, org.apache.ivy.core.settings.IvySettings ivySettings, java.lang.String ivyConfName)  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.String, java.lang.String> parseSparkConfProperty (java.lang.String pair)  { throw new RuntimeException(); }
  static   org.apache.spark.deploy.SparkSubmitOperation getSubmitOperations (java.lang.String master)  { throw new RuntimeException(); }
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
