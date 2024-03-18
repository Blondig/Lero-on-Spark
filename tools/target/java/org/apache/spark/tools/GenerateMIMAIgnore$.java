package org.apache.spark.tools;
/**
 * A tool for generating classes to be excluded during binary checking with MIMA. It is expected
 * that this tool is run with ./spark-class.
 * <p>
 * MIMA itself only supports JVM-level visibility and doesn't account for package-private classes.
 * This tool looks at all currently package-private classes and generates exclusions for them. Note
 * that this approach is not sound. It can lead to false positives if we move or rename a previously
 * package-private class. It can lead to false negatives if someone explicitly makes a class
 * package-private that wasn't before. This exists only to help catch certain classes of changes
 * which might be difficult to catch during review.
 */
public  class GenerateMIMAIgnore$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GenerateMIMAIgnore$ MODULE$ = null;
  public   GenerateMIMAIgnore$ ()  { throw new RuntimeException(); }
  /**
   * Scala reflection does not let us see inner function even if they are upgraded
   * to public for some reason. So had to resort to java reflection to get all inner
   * functions with $$ in there name.
   * @param classSymbol (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> getInnerFunctions (scala.reflect.runtime.universe classSymbol)  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
