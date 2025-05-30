/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 04:49:54 GMT 2022
 */

package io.probedock.client.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.probedock.client.utils.ConfigurationUtils;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConfigurationUtils_ESTest extends ConfigurationUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = ConfigurationUtils.configureString("", hashMap0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Integer integer0 = Integer.getInteger("", 0);
      Integer integer1 = ConfigurationUtils.configureInteger(integer0, hashMap0, "java.lang.Object@0000000001");
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Integer integer0 = ConfigurationUtils.configureInteger((Integer) null, hashMap0, "}B!XC^B");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Integer integer0 = new Integer((-3003));
      Integer integer1 = ConfigurationUtils.configureInteger(integer0, hashMap0, "}B!XC^B");
      assertEquals((-3003), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Boolean boolean1 = ConfigurationUtils.configureBoolean(boolean0, hashMap0, "");
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConfigurationUtils.configureString("Y;3GzM#u/<Xj", (Map<String, Object>) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.probedock.client.utils.ConfigurationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer((-1727));
      // Undeclared exception!
      try { 
        ConfigurationUtils.configureInteger(integer0, (Map<String, Object>) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.probedock.client.utils.ConfigurationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      // Undeclared exception!
      try { 
        ConfigurationUtils.configureBoolean(boolean0, (Map<String, Object>) null, "uvP`");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.probedock.client.utils.ConfigurationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Boolean boolean0 = ConfigurationUtils.configureBoolean((Boolean) null, hashMap0, "I\"bRdU<\"^,09@E");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap1.put("", "");
      hashMap0.putAll(hashMap1);
      Boolean boolean0 = Boolean.valueOf("java.lang.String@0000000001");
      Boolean boolean1 = ConfigurationUtils.configureBoolean(boolean0, hashMap0, "");
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Integer integer0 = new Integer(1649);
      Integer integer1 = ConfigurationUtils.configureInteger(integer0, hashMap0, "I\"bRdU<\"^,09@E");
      assertEquals(1649, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap1.put("", "");
      hashMap0.putAll(hashMap1);
      Integer integer0 = new Integer(3480);
      // Undeclared exception!
      try { 
        ConfigurationUtils.configureInteger(integer0, hashMap0, "");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lang.String@0000000001\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = ConfigurationUtils.configureString((String) null, hashMap0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.put("", object0);
      String string0 = ConfigurationUtils.configureString("", hashMap0, "");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConfigurationUtils configurationUtils0 = new ConfigurationUtils();
  }
}
