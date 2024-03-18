package org.apache.spark.deploy;
public  interface TestPrematureExit {
  /** Returns true if the script exits and the given search string is printed. */
    void testPrematureExit (java.lang.String[] input, java.lang.String searchString, org.apache.spark.util.CommandLineUtils mainObject)  ;
}
