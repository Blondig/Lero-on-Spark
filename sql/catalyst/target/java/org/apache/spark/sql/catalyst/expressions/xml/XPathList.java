package org.apache.spark.sql.catalyst.expressions.xml;
public  class XPathList extends org.apache.spark.sql.catalyst.expressions.xml.XPathExtract implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression xml ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression path ()  { throw new RuntimeException(); }
  // not preceding
  public   XPathList (org.apache.spark.sql.catalyst.expressions.Expression xml, org.apache.spark.sql.catalyst.expressions.Expression path)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object xml, Object path)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.xml.XPathList withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
