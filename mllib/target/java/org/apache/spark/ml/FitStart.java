package org.apache.spark.ml;
/**
 * Event fired before <code>Estimator.fit</code>.
 */
public  class FitStart<M extends org.apache.spark.ml.Model<M>> implements org.apache.spark.ml.MLEvent, scala.Product, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.Model), List(TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public   FitStart ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.Estimator<M> estimator ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<?> dataset ()  { throw new RuntimeException(); }
}
