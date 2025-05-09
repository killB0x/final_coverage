/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 14:23:07 GMT 2022
 */

package es.bsc.dataclay.util.management.sessionmgr;

import org.junit.Test;
import static org.junit.Assert.*;
import es.bsc.dataclay.util.ids.DataContractID;
import es.bsc.dataclay.util.ids.DataSetID;
import es.bsc.dataclay.util.management.sessionmgr.SessionDataContract;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SessionDataContract_ESTest extends SessionDataContract_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random.setNextRandom((-2193));
      DataContractID dataContractID0 = new DataContractID();
      DataSetID dataSetID0 = new DataSetID(dataContractID0.id);
      SessionDataContract sessionDataContract0 = new SessionDataContract(dataContractID0, dataSetID0);
      sessionDataContract0.setId(dataSetID0.id);
      UUID uUID0 = sessionDataContract0.getId();
      assertEquals((-7852025947836907520L), uUID0.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SessionDataContract sessionDataContract0 = new SessionDataContract();
      DataSetID dataSetID0 = new DataSetID("i-NFC.%");
      sessionDataContract0.setId(dataSetID0.id);
      UUID uUID0 = sessionDataContract0.getId();
      assertEquals(16793600L, uUID0.getMostSignificantBits());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataContractID dataContractID0 = new DataContractID();
      DataSetID dataSetID0 = new DataSetID();
      SessionDataContract sessionDataContract0 = new SessionDataContract(dataContractID0, dataSetID0);
      DataSetID dataSetID1 = sessionDataContract0.getDataSetOfProvider();
      assertSame(dataSetID1, dataSetID0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DataContractID dataContractID0 = new DataContractID();
      DataSetID dataSetID0 = new DataSetID();
      SessionDataContract sessionDataContract0 = new SessionDataContract(dataContractID0, dataSetID0);
      DataContractID dataContractID1 = sessionDataContract0.getDataContractID();
      assertEquals("00000000-0100-4000-8200-000003000000", dataContractID1.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SessionDataContract sessionDataContract0 = new SessionDataContract();
      DataContractID dataContractID0 = new DataContractID((UUID) null);
      sessionDataContract0.setDataContractID(dataContractID0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SessionDataContract sessionDataContract0 = new SessionDataContract();
      DataSetID dataSetID0 = new DataSetID("i-NFC.%");
      sessionDataContract0.setDataSetOfProvider(dataSetID0);
      assertEquals("00000000-0100-4000-8200-000003000000", dataSetID0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SessionDataContract sessionDataContract0 = new SessionDataContract();
      DataSetID dataSetID0 = sessionDataContract0.getDataSetOfProvider();
      assertNull(dataSetID0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DataContractID dataContractID0 = new DataContractID();
      DataSetID dataSetID0 = new DataSetID(dataContractID0.id);
      SessionDataContract sessionDataContract0 = new SessionDataContract(dataContractID0, dataSetID0);
      UUID uUID0 = sessionDataContract0.getId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SessionDataContract sessionDataContract0 = new SessionDataContract();
      DataContractID dataContractID0 = sessionDataContract0.getDataContractID();
      assertNull(dataContractID0);
  }
}
