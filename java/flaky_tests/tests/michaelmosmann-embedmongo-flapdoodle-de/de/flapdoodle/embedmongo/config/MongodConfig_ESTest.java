/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 14:58:14 GMT 2022
 */

package de.flapdoodle.embedmongo.config;

import org.junit.Test;
import static org.junit.Assert.*;
import de.flapdoodle.embedmongo.config.MongodConfig;
import de.flapdoodle.embedmongo.distribution.Version;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MongodConfig_ESTest extends MongodConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Version version0 = Version.V2_0_1;
      MongodConfig mongodConfig0 = new MongodConfig(version0, 0, false, "de.flapdoodle.embedmongo.config.MongodConfig");
      boolean boolean0 = mongodConfig0.isIpv6();
      assertFalse(boolean0);
      assertEquals(0, mongodConfig0.getPort());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Version version0 = Version.V2_0;
      MongodConfig mongodConfig0 = new MongodConfig(version0, (-947), true);
      mongodConfig0.getVersion();
      assertTrue(mongodConfig0.isIpv6());
      assertEquals((-947), mongodConfig0.getPort());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Version version0 = Version.V1_8_4;
      MongodConfig mongodConfig0 = new MongodConfig(version0, 2, true);
      int int0 = mongodConfig0.getPort();
      assertTrue(mongodConfig0.isIpv6());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Version version0 = Version.V2_0;
      MongodConfig mongodConfig0 = new MongodConfig(version0, (-947), true);
      int int0 = mongodConfig0.getPort();
      assertTrue(mongodConfig0.isIpv6());
      assertEquals((-947), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Version version0 = Version.V2_0;
      MongodConfig mongodConfig0 = new MongodConfig(version0, (-947), true);
      mongodConfig0.getDatabaseDir();
      assertEquals((-947), mongodConfig0.getPort());
      assertTrue(mongodConfig0.isIpv6());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Version version0 = Version.V2_0_1;
      MongodConfig mongodConfig0 = new MongodConfig(version0, 0, false, "de.flapdoodle.embedmongo.config.MongodConfig");
      mongodConfig0.getDatabaseDir();
      assertEquals(0, mongodConfig0.getPort());
      assertFalse(mongodConfig0.isIpv6());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Version version0 = Version.V1_6;
      MongodConfig mongodConfig0 = new MongodConfig(version0, 0, true, "");
      int int0 = mongodConfig0.getPort();
      assertTrue(mongodConfig0.isIpv6());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Version version0 = Version.V1_6;
      MongodConfig mongodConfig0 = new MongodConfig(version0, 0, true, "");
      boolean boolean0 = mongodConfig0.isIpv6();
      assertTrue(boolean0);
      assertEquals(0, mongodConfig0.getPort());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Version version0 = Version.V1_6;
      MongodConfig mongodConfig0 = new MongodConfig(version0, 0, true, "");
      mongodConfig0.getDatabaseDir();
      assertEquals(0, mongodConfig0.getPort());
      assertTrue(mongodConfig0.isIpv6());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MongodConfig mongodConfig0 = new MongodConfig((Version) null, (-1631), false);
      mongodConfig0.getVersion();
      assertEquals((-1631), mongodConfig0.getPort());
      assertFalse(mongodConfig0.isIpv6());
  }
}
