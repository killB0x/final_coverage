/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 19:49:53 GMT 2022
 */

package com.alipay.sofa.common.config.source;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alipay.sofa.common.config.ConfigKey;
import com.alipay.sofa.common.config.source.SystemEnvConfigSource;
import com.alipay.sofa.common.config.source.SystemPropertyConfigSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractConfigSource_ESTest extends AbstractConfigSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      boolean boolean0 = systemEnvConfigSource0.hasKey("IR#C\"V5R>~ZNiRtg'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      String string0 = systemPropertyConfigSource0.doGetConfig("84zte");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      Class<Object> class0 = Object.class;
      Object object0 = systemEnvConfigSource0.changeValueType((String) null, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      // Undeclared exception!
      try { 
        systemPropertyConfigSource0.hasKey((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      // Undeclared exception!
      try { 
        systemPropertyConfigSource0.hasKey("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      ConfigKey<Object> configKey0 = ConfigKey.build("", (Object) "", false, "");
      // Undeclared exception!
      try { 
        systemPropertyConfigSource0.getStringConfig(configKey0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConfigKey<Object> configKey0 = ConfigKey.build("", (Object) "", true, "");
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      // Undeclared exception!
      try { 
        systemPropertyConfigSource0.getEffectiveKey(configKey0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      // Undeclared exception!
      try { 
        systemEnvConfigSource0.getConfig((ConfigKey<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.config.source.AbstractConfigSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConfigKey<Object> configKey0 = ConfigKey.build("", (Object) "", false, "");
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      // Undeclared exception!
      try { 
        systemPropertyConfigSource0.getConfig(configKey0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      // Undeclared exception!
      try { 
        systemPropertyConfigSource0.doGetConfig((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      // Undeclared exception!
      try { 
        systemPropertyConfigSource0.doGetConfig("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        systemEnvConfigSource0.changeValueType("UU~J.L", class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultConverter not support type [class java.lang.Object],failed to convert value [UU~J.L].
         //
         verifyException("com.alipay.sofa.common.config.converter.DefaultConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "com.alipay.sofa.common.config.source.AbstractConfigSource";
      stringArray0[1] = ")@d>voN7!<IkMs%n";
      ConfigKey<Object> configKey0 = ConfigKey.build(")@d>voN7!<IkMs%n", (Object) systemPropertyConfigSource0, false, "com.alipay.sofa.common.config.source.AbstractConfigSource", stringArray0);
      String string0 = systemPropertyConfigSource0.getStringConfig(configKey0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SystemPropertyConfigSource systemPropertyConfigSource0 = new SystemPropertyConfigSource();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        systemPropertyConfigSource0.changeValueType("Tc(/h:_9", class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Tc(/h:_9\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      Object object0 = systemEnvConfigSource0.changeValueType("^xVP .r'$KD _$;=s%N", (Class<Object>) null);
      assertEquals("^xVP .r'$KD _$;=s%N", object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "c8>BGur:T";
      ConfigKey<Object> configKey0 = new ConfigKey<Object>("c8>BGur:T", stringArray0, "c8>BGur:T", true, "c8>BGur:T");
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      // Undeclared exception!
      try { 
        systemEnvConfigSource0.getEffectiveKey(configKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConfigKey<Object> configKey0 = ConfigKey.build("=", (Object) "=", true, "=");
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      String string0 = systemEnvConfigSource0.getEffectiveKey(configKey0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "^xVP .r'$KD _$;=s%N";
      ConfigKey<Object> configKey0 = new ConfigKey<Object>("^xVP .r'$KD _$;=s%N", stringArray0, "^xVP .r'$KD _$;=s%N", true, "");
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      // Undeclared exception!
      try { 
        systemEnvConfigSource0.getStringConfig(configKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      ConfigKey<Object> configKey0 = ConfigKey.build("1%1&&cF6Qt}Z/", (Object) "1%1&&cF6Qt}Z/", true, "1%1&&cF6Qt}Z/");
      Object object0 = systemEnvConfigSource0.getConfig(configKey0);
      assertNull(object0);
  }
}
