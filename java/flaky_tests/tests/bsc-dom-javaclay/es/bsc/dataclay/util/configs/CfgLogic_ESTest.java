/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 14:08:31 GMT 2022
 */

package es.bsc.dataclay.util.configs;

import org.junit.Test;
import static org.junit.Assert.*;
import es.bsc.dataclay.util.configs.CfgLogic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CfgLogic_ESTest extends CfgLogic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("", "Xs", 0, true, "");
      boolean boolean0 = cfgLogic0.isInMemory();
      assertEquals("", cfgLogic0.getExposedIPForClient());
      assertEquals("Xs", cfgLogic0.getLogicModuleHostName());
      assertEquals(0, cfgLogic0.getLogicModuleTCPPort());
      assertEquals("", cfgLogic0.getLogicModuleName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("72^=QsyIFbg", "72^=QsyIFbg", 0, false, "72^=QsyIFbg");
      int int0 = cfgLogic0.getLogicModuleTCPPort();
      assertEquals(0, int0);
      assertFalse(cfgLogic0.isInMemory());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("es.bsc.dataclay.util.configs.CfgLogic", "JuEEkmBw{V'9qv!nA", (-2647), false, "JuEEkmBw{V'9qv!nA");
      int int0 = cfgLogic0.getLogicModuleTCPPort();
      assertEquals("JuEEkmBw{V'9qv!nA", cfgLogic0.getLogicModuleHostName());
      assertEquals("JuEEkmBw{V'9qv!nA", cfgLogic0.getExposedIPForClient());
      assertEquals("es.bsc.dataclay.util.configs.CfgLogic", cfgLogic0.getLogicModuleName());
      assertEquals((-2647), int0);
      assertFalse(cfgLogic0.isInMemory());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic((String) null, (String) null, 0, false, (String) null);
      cfgLogic0.getLogicModuleName();
      assertEquals(0, cfgLogic0.getLogicModuleTCPPort());
      assertFalse(cfgLogic0.isInMemory());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("", ")k-hp3&nt#.vu ho,", 0, false, "");
      String string0 = cfgLogic0.getLogicModuleName();
      assertEquals(0, cfgLogic0.getLogicModuleTCPPort());
      assertEquals(")k-hp3&nt#.vu ho,", cfgLogic0.getLogicModuleHostName());
      assertEquals("", cfgLogic0.getExposedIPForClient());
      assertFalse(cfgLogic0.isInMemory());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("", (String) null, 4971, true, "");
      String string0 = cfgLogic0.getLogicModuleHostName();
      assertEquals(4971, cfgLogic0.getLogicModuleTCPPort());
      assertTrue(cfgLogic0.isInMemory());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("", "", 1, false, "");
      cfgLogic0.getLogicModuleHostName();
      assertEquals(1, cfgLogic0.getLogicModuleTCPPort());
      assertFalse(cfgLogic0.isInMemory());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("", "", (-801), true, (String) null);
      String string0 = cfgLogic0.getExposedIPForClient();
      assertEquals((-801), cfgLogic0.getLogicModuleTCPPort());
      assertNull(string0);
      assertTrue(cfgLogic0.isInMemory());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("", "", 1, true, "");
      cfgLogic0.getExposedIPForClient();
      assertTrue(cfgLogic0.isInMemory());
      assertEquals(1, cfgLogic0.getLogicModuleTCPPort());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("es.bsc.dataclay.util.configs.CfgLogic", "JuEEkmBw{V'9qv!nA", (-2647), false, "JuEEkmBw{V'9qv!nA");
      String string0 = cfgLogic0.getLogicModuleHostName();
      assertEquals((-2647), cfgLogic0.getLogicModuleTCPPort());
      assertEquals("es.bsc.dataclay.util.configs.CfgLogic", cfgLogic0.getLogicModuleName());
      assertEquals("JuEEkmBw{V'9qv!nA", cfgLogic0.getExposedIPForClient());
      assertEquals("JuEEkmBw{V'9qv!nA", string0);
      assertFalse(cfgLogic0.isInMemory());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("nNoe", "nNoe", 1312, false, "nNoe");
      cfgLogic0.getExposedIPForClient();
      assertEquals(1312, cfgLogic0.getLogicModuleTCPPort());
      assertFalse(cfgLogic0.isInMemory());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("nNoe", "nNoe", 1312, false, "nNoe");
      boolean boolean0 = cfgLogic0.isInMemory();
      assertEquals(1312, cfgLogic0.getLogicModuleTCPPort());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("nNoe", "nNoe", 1312, false, "nNoe");
      int int0 = cfgLogic0.getLogicModuleTCPPort();
      assertEquals(1312, int0);
      assertFalse(cfgLogic0.isInMemory());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CfgLogic cfgLogic0 = new CfgLogic("nNoe", "nNoe", 1312, false, "nNoe");
      cfgLogic0.getLogicModuleName();
      assertFalse(cfgLogic0.isInMemory());
      assertEquals(1312, cfgLogic0.getLogicModuleTCPPort());
  }
}
