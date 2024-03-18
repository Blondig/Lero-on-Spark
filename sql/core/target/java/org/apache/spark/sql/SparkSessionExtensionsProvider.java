package org.apache.spark.sql;
/**
 * :: Unstable ::
 * <p>
 * Base trait for implementations used by {@link SparkSessionExtensions}
 * <p>
 * For example, now we have an external function named <code>Age</code> to register as an extension for SparkSession:
 * <p>
 * <pre><code>
 *   package org.apache.spark.examples.extensions
 *
 *   import org.apache.spark.sql.catalyst.expressions.{CurrentDate, Expression, RuntimeReplaceable, SubtractDates}
 *
 *   case class Age(birthday: Expression, child: Expression) extends RuntimeReplaceable {
 *
 *     def this(birthday: Expression) = this(birthday, SubtractDates(CurrentDate(), birthday))
 *     override def exprsReplaced: Seq[Expression] = Seq(birthday)
 *     override protected def withNewChildInternal(newChild: Expression): Expression = copy(newChild)
 *   }
 * </code></pre>
 * <p>
 * We need to create our extension which inherits {@link SparkSessionExtensionsProvider}
 * Example:
 * <p>
 * <pre><code>
 *   package org.apache.spark.examples.extensions
 *
 *   import org.apache.spark.sql.{SparkSessionExtensions, SparkSessionExtensionsProvider}
 *   import org.apache.spark.sql.catalyst.FunctionIdentifier
 *   import org.apache.spark.sql.catalyst.expressions.{Expression, ExpressionInfo}
 *
 *   class MyExtensions extends SparkSessionExtensionsProvider {
 *     override def apply(v1: SparkSessionExtensions): Unit = {
 *       v1.injectFunction(
 *         (new FunctionIdentifier("age"),
 *           new ExpressionInfo(classOf[Age].getName, "age"),
 *           (children: Seq[Expression]) =&gt; new Age(children.head)))
 *     }
 *   }
 * </code></pre>
 * <p>
 * Then, we can inject <code>MyExtensions</code> in three ways,
 * <ul>
 *   <li>withExtensions of {@link SparkSession.Builder}</li>
 *   <li>Config - spark.sql.extensions</li>
 *   <li>{@link java.util.ServiceLoader} - Add to src/main/resources/META-INF/services/org.apache.spark.sql.SparkSessionExtensionsProvider</li>
 * </ul>
 * <p>
 * @see SparkSessionExtensions
 * @see SparkSession.Builder
 * @see java.util.ServiceLoader
 * <p>
 * @since 3.2.0
 */
public  interface SparkSessionExtensionsProvider extends scala.Function1<org.apache.spark.sql.SparkSessionExtensions, scala.runtime.BoxedUnit> {
}
