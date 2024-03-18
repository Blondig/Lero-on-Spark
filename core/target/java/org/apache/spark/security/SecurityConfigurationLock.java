package org.apache.spark.security;
/**
 * There are cases when global JVM security configuration must be modified.
 * In order to avoid race the modification must be synchronized with this.
 */
public  class SecurityConfigurationLock {
}
