package org.apache.spark.resource;
/**
 * Trait used to help executor/worker allocate resources.
 * Please note that this is intended to be used in a single thread.
 */
public  interface ResourceAllocator {
  /**
   * Acquire a sequence of resource addresses (to a launched task), these addresses must be
   * available. When the task finishes, it will return the acquired resource addresses.
   * Throw an Exception if an address is not available or doesn't exist.
   * @param addrs (undocumented)
   */
  public  void acquire (scala.collection.Seq<java.lang.String> addrs)  ;
  /**
   * Sequence of currently assigned resource addresses.
   * <p>
   * With {@link slotsPerAddress} greater than 1, {@link assignedAddrs} can contain duplicate addresses
   * e.g. with {@link slotsPerAddress} == 2, assignedAddrs for addresses 0 and 1 can look like
   * Seq("0", "1", "1"), where address 0 was assigned once, and 1 was assigned twice.
   * @return (undocumented)
   */
    scala.collection.Seq<java.lang.String> assignedAddrs ()  ;
  /**
   * Sequence of currently available resource addresses.
   * <p>
   * With {@link slotsPerAddress} greater than 1, {@link availableAddrs} can contain duplicate addresses
   * e.g. with {@link slotsPerAddress} == 2, availableAddrs for addresses 0 and 1 can look like
   * Seq("0", "0", "1"), where address 0 has two assignments available, and 1 has one.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> availableAddrs ()  ;
  /**
   * Release a sequence of resource addresses, these addresses must have been assigned. Resource
   * addresses are released when a task has finished.
   * Throw an Exception if an address is not assigned or doesn't exist.
   * @param addrs (undocumented)
   */
  public  void release (scala.collection.Seq<java.lang.String> addrs)  ;
  public  scala.collection.Seq<java.lang.String> resourceAddresses ()  ;
  public  java.lang.String resourceName ()  ;
  public  int slotsPerAddress ()  ;
}
