package org.apache.spark.mllib.pmml.export;
public  interface PMMLModelExport {
  // not preceding
  public  org.dmg.pmml.PMML getPmml ()  ;
  /**
   * Holder of the exported model in PMML format
   * @return (undocumented)
   */
  public  org.dmg.pmml.PMML pmml ()  ;
}
