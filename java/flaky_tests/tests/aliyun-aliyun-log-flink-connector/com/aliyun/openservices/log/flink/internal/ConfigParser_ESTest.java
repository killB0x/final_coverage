/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 22:16:07 GMT 2022
 */

package com.aliyun.openservices.log.flink.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aliyun.openservices.log.flink.internal.ConfigParser;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConfigParser_ESTest extends ConfigParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Properties properties0 = new Properties();
      ConfigParser configParser0 = new ConfigParser(properties0);
      String string0 = configParser0.getString("*sJ3>VBz+~");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Properties properties0 = new Properties();
      ConfigParser configParser0 = new ConfigParser(properties0);
      // Undeclared exception!
      try { 
        configParser0.getInt("", (-1748));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/flink/util/PropertiesUtil
         //
         verifyException("com.aliyun.openservices.log.flink.internal.ConfigParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConfigParser configParser0 = new ConfigParser((Properties) null);
      // Undeclared exception!
      try { 
        configParser0.getString("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.aliyun.openservices.log.flink.internal.ConfigParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Properties properties0 = new Properties();
      ConfigParser configParser0 = new ConfigParser(properties0);
      // Undeclared exception!
      try { 
        configParser0.getBool((String) null, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/flink/util/PropertiesUtil
         //
         verifyException("com.aliyun.openservices.log.flink.internal.ConfigParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Properties properties0 = new Properties();
      ConfigParser configParser0 = new ConfigParser(properties0);
      // Undeclared exception!
      try { 
        configParser0.getLong("", 1L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/flink/util/PropertiesUtil
         //
         verifyException("com.aliyun.openservices.log.flink.internal.ConfigParser", e);
      }
  }
}
