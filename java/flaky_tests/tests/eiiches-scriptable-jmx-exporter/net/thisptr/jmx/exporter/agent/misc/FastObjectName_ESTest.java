/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 23:34:08 GMT 2022
 */

package net.thisptr.jmx.exporter.agent.misc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import javax.management.ObjectName;
import net.thisptr.jmx.exporter.agent.misc.FastObjectName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FastObjectName_ESTest extends FastObjectName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectName objectName0 = ObjectName.WILDCARD;
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      String string0 = fastObjectName0.domain();
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastObjectName fastObjectName0 = null;
      try {
        fastObjectName0 = new FastObjectName((ObjectName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.thisptr.jmx.exporter.agent.misc.FastObjectName", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectName objectName0 = ObjectName.WILDCARD;
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      FastObjectName fastObjectName1 = new FastObjectName(objectName0);
      boolean boolean0 = fastObjectName0.equals(fastObjectName1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectName objectName0 = ObjectName.WILDCARD;
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      boolean boolean0 = fastObjectName0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectName objectName0 = ObjectName.WILDCARD;
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      boolean boolean0 = fastObjectName0.equals(fastObjectName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectName objectName0 = new ObjectName("WSy`", "WSy`", "WSy`");
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      boolean boolean0 = fastObjectName0.equals(objectName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectName objectName0 = new ObjectName("#gc|m^W", "\"jAl%F]/Sj'|]\"", "\"jAl%F]/Sj'|]\"");
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      assertEquals("#gc|m^W", fastObjectName0.domain());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectName objectName0 = ObjectName.WILDCARD;
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      String string0 = fastObjectName0.toString();
      assertEquals("*:*", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectName objectName0 = new ObjectName("V$ ", "V$ ", "V$ ");
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      fastObjectName0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectName objectName0 = new ObjectName("", "`~nBcF", "`~nBcF");
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      ObjectName objectName1 = fastObjectName0.objectName();
      assertSame(objectName0, objectName1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectName objectName0 = new ObjectName("", "`~nBcF", "`~nBcF");
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      String string0 = fastObjectName0.domain();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectName objectName0 = ObjectName.WILDCARD;
      FastObjectName fastObjectName0 = new FastObjectName(objectName0);
      Map<String, String> map0 = fastObjectName0.keyProperties();
      assertTrue(map0.isEmpty());
  }
}
