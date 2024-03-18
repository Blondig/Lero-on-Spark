package org.apache.spark.ml.util;
/**
 * Trait for classes that provide <code>GeneralMLWriter</code>.
 */
public  interface GeneralMLWritable extends org.apache.spark.ml.util.MLWritable {
  /**
   * Returns an <code>MLWriter</code> instance for this ML instance.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.GeneralMLWriter write ()  ;
}
