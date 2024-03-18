package org.apache.spark.ml;
/**
 * Event fired after <code>Estimator.fit</code>.
 */
public  class FitEnd<M extends org.apache.spark.ml.Model<M>> implements org.apache.spark.ml.MLEvent, scala.Product, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.Model), List(TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public   FitEnd ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.Estimator<M> estimator ()  { throw new RuntimeException(); }
  public  M model ()  { throw new RuntimeException(); }
}
