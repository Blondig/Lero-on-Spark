package org.apache.spark.ml.optim.loss;
/**
 * This class computes the gradient and loss of a differentiable loss function by mapping a
 * {@link DifferentiableLossAggregator} over an {@link RDD}. The loss function is the
 * sum of the loss computed on a single instance across all points in the RDD. Therefore, the actual
 * analytical form of the loss function is specified by the aggregator, which computes each points
 * contribution to the overall loss.
 * <p>
 * A differentiable regularization component can also be added by providing a
 * {@link DifferentiableRegularization} loss function.
 * <p>
 * param:  instances RDD containing the data to compute the loss function over.
 * param:  getAggregator A function which gets a new loss aggregator in every tree aggregate step.
 * param:  regularization An option representing the regularization loss function to apply to the
 *                       coefficients.
 * param:  aggregationDepth The aggregation depth of the tree aggregation step.
 * @param <Agg>  Specialization of {@link DifferentiableLossAggregator}, representing the concrete type
 *             of the aggregator.
 */
  class RDDLossFunction<T extends java.lang.Object, Agg extends org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<T, Agg>> implements breeze.optimize.DiffFunction<breeze.linalg.DenseVector<java.lang.Object>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.ml), org.apache.spark.ml.optim), org.apache.spark.ml.optim.aggregator), org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator), List(TypeTree().setOriginal(Ident(TypeName("T"))), TypeTree().setOriginal(Ident(TypeName("Agg"))))))))
  public   RDDLossFunction (org.apache.spark.rdd.RDD<T> instances, scala.Function1<org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector>, Agg> getAggregator, scala.Option<org.apache.spark.ml.optim.loss.DifferentiableRegularization<org.apache.spark.ml.linalg.Vector>> regularization, int aggregationDepth, scala.reflect.ClassTag<T> evidence$1, scala.reflect.ClassTag<Agg> evidence$2)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, breeze.linalg.DenseVector<java.lang.Object>> calculate (breeze.linalg.DenseVector<java.lang.Object> coefficients)  { throw new RuntimeException(); }
}
