/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 14:24:52 GMT 2022
 */

package es.bsc.dataclay.util.management.metadataservice;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.util.ids.DataClayInstanceID;
import es.bsc.dataclay.util.management.metadataservice.DataClayInstance;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DataClayInstance_ESTest extends DataClayInstance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataClayInstanceID dataClayInstanceID0 = new DataClayInstanceID();
      String[] stringArray0 = new String[6];
      Integer[] integerArray0 = new Integer[4];
      DataClayInstance dataClayInstance0 = new DataClayInstance(dataClayInstanceID0, stringArray0, integerArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataClayInstance dataClayInstance0 = new DataClayInstance();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      dataClayInstance0.setPorts(linkedList0);
      List<Integer> list0 = dataClayInstance0.getPorts();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer((-407));
      DataClayInstance dataClayInstance0 = new DataClayInstance((DataClayInstanceID) null, "] [hosts: ", integer0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add(integer0);
      dataClayInstance0.setPorts(linkedList0);
      List<Integer> list0 = dataClayInstance0.getPorts();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataClayInstance dataClayInstance0 = new DataClayInstance();
      List<String> list0 = dataClayInstance0.getHosts();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataClayInstance dataClayInstance0 = new DataClayInstance();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add(")0ys;9");
      dataClayInstance0.setHosts(linkedList0);
      List<String> list0 = dataClayInstance0.getHosts();
      assertTrue(list0.contains(")0ys;9"));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataClayInstance dataClayInstance0 = new DataClayInstance();
      DataClayInstanceID dataClayInstanceID0 = new DataClayInstanceID((String) null);
      dataClayInstance0.setDcID(dataClayInstanceID0);
      DataClayInstanceID dataClayInstanceID1 = dataClayInstance0.getDcID();
      assertEquals("00000000-0100-4000-8200-000003000000", dataClayInstanceID1.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataClayInstance dataClayInstance0 = new DataClayInstance();
      DataClayInstanceID dataClayInstanceID0 = new DataClayInstanceID((UUID) null);
      dataClayInstance0.setDcID(dataClayInstanceID0);
      // Undeclared exception!
      try { 
        dataClayInstance0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.ids.ID", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-407));
      DataClayInstance dataClayInstance0 = new DataClayInstance((DataClayInstanceID) null, "] [hosts: ", integer0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      dataClayInstance0.setHosts(linkedList0);
      List<String> list0 = dataClayInstance0.getHosts();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer((-407));
      DataClayInstance dataClayInstance0 = new DataClayInstance((DataClayInstanceID) null, "] [hosts: ", integer0);
      String string0 = dataClayInstance0.toString();
      assertEquals("DataClay instance info: [id: null] [hosts: [] [hosts: ]] [corresponding ports: [-407]]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-407));
      DataClayInstance dataClayInstance0 = new DataClayInstance((DataClayInstanceID) null, "] [hosts: ", integer0);
      DataClayInstanceID dataClayInstanceID0 = dataClayInstance0.getDcID();
      assertNull(dataClayInstanceID0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataClayInstance dataClayInstance0 = new DataClayInstance();
      List<Integer> list0 = dataClayInstance0.getPorts();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataClayInstanceID dataClayInstanceID0 = new DataClayInstanceID();
      String[] stringArray0 = new String[0];
      DataClayInstance dataClayInstance0 = null;
      try {
        dataClayInstance0 = new DataClayInstance(dataClayInstanceID0, stringArray0, (Integer[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
