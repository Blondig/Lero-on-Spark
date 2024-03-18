package org.apache.spark.sql.kafka010.consumer;
/**
 * Provides object pool for {@link InternalKafkaConsumer} which is grouped by {@link CacheKey}.
 * <p>
 * This class leverages {@link GenericKeyedObjectPool} internally, hence providing methods based on
 * the class, and same contract applies: after using the borrowed object, you must either call
 * returnObject() if the object is healthy to return to pool, or invalidateObject() if the object
 * should be destroyed.
 * <p>
 * The soft capacity of pool is determined by "spark.kafka.consumer.cache.capacity" config value,
 * and the pool will have reasonable default value if the value is not provided.
 * (The instance will do its best effort to respect soft capacity but it can exceed when there's
 * a borrowing request and there's neither free space nor idle object to clear.)
 * <p>
 * This class guarantees that no caller will get pooled object once the object is borrowed and
 * not yet returned, hence provide thread-safety usage of non-thread-safe {@link InternalKafkaConsumer}
 * unless caller shares the object to multiple threads.
 */
  class InternalKafkaConsumerPool implements org.apache.spark.internal.Logging {
  static public  class CustomSwallowedExceptionListener$ implements org.apache.commons.pool2.SwallowedExceptionListener, org.apache.spark.internal.Logging {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CustomSwallowedExceptionListener$ MODULE$ = null;
    public   CustomSwallowedExceptionListener$ ()  { throw new RuntimeException(); }
    public  void onSwallowException (java.lang.Exception e)  { throw new RuntimeException(); }
  }
  static public  class PoolConfig extends org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig<org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer> {
    public   PoolConfig (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    public  void init ()  { throw new RuntimeException(); }
    public  int softMaxSize ()  { throw new RuntimeException(); }
  }
  static public  class ObjectFactory extends org.apache.commons.pool2.BaseKeyedPooledObjectFactory<org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey, org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer> {
    public   ObjectFactory ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer create (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key)  { throw new RuntimeException(); }
    public  void destroyObject (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key, org.apache.commons.pool2.PooledObject<org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer> p)  { throw new RuntimeException(); }
    public  java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey, java.util.Map<java.lang.String, java.lang.Object>> keyToKafkaParams ()  { throw new RuntimeException(); }
    public  org.apache.commons.pool2.PooledObject<org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer> wrap (org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer value)  { throw new RuntimeException(); }
  }
  public   InternalKafkaConsumerPool (org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumerPool.ObjectFactory objectFactory, org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumerPool.PoolConfig poolConfig)  { throw new RuntimeException(); }
  public   InternalKafkaConsumerPool (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Borrows {@link InternalKafkaConsumer} object from the pool. If there's no idle object for the key,
   * the pool will create the {@link InternalKafkaConsumer} object.
   * <p>
   * If the pool doesn't have idle object for the key and also exceeds the soft capacity,
   * pool will try to clear some of idle objects.
   * <p>
   * Borrowed object must be returned by either calling returnObject or invalidateObject, otherwise
   * the object will be kept in pool as active object.
   * @param key (undocumented)
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer borrowObject (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** Returns borrowed object to the pool. */
  public  void returnObject (org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer consumer)  { throw new RuntimeException(); }
  /** Invalidates (destroy) borrowed object to the pool. */
  public  void invalidateObject (org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer consumer)  { throw new RuntimeException(); }
  /** Invalidates all idle consumers for the key */
  public  void invalidateKey (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key)  { throw new RuntimeException(); }
  /**
   * Closes the keyed object pool. Once the pool is closed,
   * borrowObject will fail with {@link IllegalStateException}, but returnObject and invalidateObject
   * will continue to work, with returned objects destroyed on return.
   * <p>
   * Also destroys idle instances in the pool.
   */
  public  void close ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  int numIdle ()  { throw new RuntimeException(); }
  public  int numIdle (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key)  { throw new RuntimeException(); }
  public  int numActive ()  { throw new RuntimeException(); }
  public  int numActive (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key)  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  public  int size (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key)  { throw new RuntimeException(); }
}
