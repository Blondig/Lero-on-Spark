package org.apache.spark.deploy.yarn;
  class ContainerLocalityPreferences implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String[] nodes ()  { throw new RuntimeException(); }
  public  java.lang.String[] racks ()  { throw new RuntimeException(); }
  // not preceding
  public   ContainerLocalityPreferences (java.lang.String[] nodes, java.lang.String[] racks)  { throw new RuntimeException(); }
}
