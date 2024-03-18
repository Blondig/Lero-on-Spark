package org.apache.spark.util;
/**
 * Find the fields accessed by a given class.
 * <p>
 * The resulting fields are stored in the mutable map passed in through the constructor.
 * This map is assumed to have its keys already populated with the classes of interest.
 * <p>
 * param:  fields the mutable map that stores the fields to return
 * param:  findTransitively if true, find fields indirectly referenced through method calls
 * param:  specificMethod if not empty, visit only this specific method
 * param:  visitedMethods a set of visited methods to avoid cycles
 */
  class FieldAccessFinder extends org.apache.xbean.asm9.ClassVisitor {
  public   FieldAccessFinder (scala.collection.mutable.Map<java.lang.Class<?>, scala.collection.mutable.Set<java.lang.String>> fields, boolean findTransitively, scala.Option<org.apache.spark.util.MethodIdentifier<?>> specificMethod, scala.collection.mutable.Set<org.apache.spark.util.MethodIdentifier<?>> visitedMethods)  { throw new RuntimeException(); }
  public  org.apache.xbean.asm9.MethodVisitor visitMethod (int access, java.lang.String name, java.lang.String desc, java.lang.String sig, java.lang.String[] exceptions)  { throw new RuntimeException(); }
}
