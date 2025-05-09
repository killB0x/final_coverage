/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 17:14:13 GMT 2022
 */

package com.github.relayjdbc.server.command;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.relayjdbc.serial.CallingContext;
import com.github.relayjdbc.server.command.JdbcObjectHolder;
import java.io.DataInputStream;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JdbcObjectHolder_ESTest extends JdbcObjectHolder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CallingContext callingContext0 = new CallingContext();
      JdbcObjectHolder jdbcObjectHolder0 = new JdbcObjectHolder((Object) null, callingContext0, 0);
      Object object0 = jdbcObjectHolder0.getJdbcObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      CallingContext callingContext0 = new CallingContext();
      JdbcObjectHolder jdbcObjectHolder0 = new JdbcObjectHolder(dataInputStream0, callingContext0, 0);
      int int0 = jdbcObjectHolder0.getJdbcInterfaceType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      JdbcObjectHolder jdbcObjectHolder0 = new JdbcObjectHolder(object0, (CallingContext) null, 1650);
      int int0 = jdbcObjectHolder0.getJdbcInterfaceType();
      assertEquals(1650, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      JdbcObjectHolder jdbcObjectHolder0 = new JdbcObjectHolder(object0, (CallingContext) null, 1650);
      CallingContext callingContext0 = jdbcObjectHolder0.getCallingContext();
      assertNull(callingContext0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      CallingContext callingContext0 = new CallingContext();
      JdbcObjectHolder jdbcObjectHolder0 = new JdbcObjectHolder(dataInputStream0, callingContext0, 0);
      Object object0 = jdbcObjectHolder0.getJdbcObject();
      assertSame(object0, dataInputStream0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      CallingContext callingContext0 = new CallingContext();
      JdbcObjectHolder jdbcObjectHolder0 = new JdbcObjectHolder(dataInputStream0, callingContext0, 0);
      CallingContext callingContext1 = jdbcObjectHolder0.getCallingContext();
      assertSame(callingContext0, callingContext1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object object0 = new Object();
      JdbcObjectHolder jdbcObjectHolder0 = new JdbcObjectHolder(object0, (CallingContext) null, (-804));
      int int0 = jdbcObjectHolder0.getJdbcInterfaceType();
      assertEquals((-804), int0);
  }
}
