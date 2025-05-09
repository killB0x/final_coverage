/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 22:15:20 GMT 2022
 */

package com.contrastsecurity.cassandra.migration.config;

import org.junit.Test;
import static org.junit.Assert.*;
import com.contrastsecurity.cassandra.migration.config.Cluster;
import com.contrastsecurity.cassandra.migration.config.Keyspace;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Keyspace_ESTest extends Keyspace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Keyspace keyspace0 = new Keyspace();
      keyspace0.setName("jmgafjD)8V*5Q6k&h");
      String string0 = keyspace0.getName();
      assertEquals("jmgafjD)8V*5Q6k&h", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Keyspace keyspace0 = new Keyspace();
      keyspace0.setCluster((Cluster) null);
      Cluster cluster0 = keyspace0.getCluster();
      assertNull(cluster0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Keyspace keyspace0 = new Keyspace();
      Cluster cluster0 = keyspace0.getCluster();
      cluster0.setPort(0);
      Cluster cluster1 = keyspace0.getCluster();
      assertNull(cluster1.getPassword());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Keyspace keyspace0 = new Keyspace();
      Cluster cluster0 = new Cluster();
      keyspace0.setCluster(cluster0);
      cluster0.setPort((-2170));
      Cluster cluster1 = keyspace0.getCluster();
      assertNull(cluster1.getUsername());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Keyspace.KeyspaceProperty keyspace_KeyspaceProperty0 = Keyspace.KeyspaceProperty.NAME;
      String string0 = keyspace_KeyspaceProperty0.getName();
      assertEquals("cassandra.migration.keyspace.name", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Keyspace.KeyspaceProperty keyspace_KeyspaceProperty0 = Keyspace.KeyspaceProperty.NAME;
      String string0 = keyspace_KeyspaceProperty0.getDescription();
      assertEquals("Name of Cassandra keyspace", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Keyspace keyspace0 = new Keyspace();
      keyspace0.setName("");
      String string0 = keyspace0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Keyspace keyspace0 = new Keyspace();
      String string0 = keyspace0.getName();
      assertNull(string0);
  }
}
