package org.apache.spark.ml.util;
/**
 * Trait for classes that provide <code>MLWriter</code>.
 */
public  interface MLWritable {
  /**
   * Saves this ML instance to the input path, a shortcut of <code>write.save(path)</code>.
   * @param path (undocumented)
   */
  public  void save (java.lang.String path) throws java.io.IOException ;
  /**
   * Returns an <code>MLWriter</code> instance for this ML instance.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write ()  ;
}
