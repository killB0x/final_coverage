/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 11:18:39 GMT 2022
 */

package edu.ksu.canvas.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.ksu.canvas.exception.CanvasException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CanvasException_ESTest extends CanvasException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CanvasException canvasException0 = new CanvasException();
      String string0 = canvasException0.getRequestUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CanvasException canvasException0 = new CanvasException(")e+MV6AEIfw", ")e+MV6AEIfw");
      String string0 = canvasException0.getRequestUrl();
      assertEquals(")e+MV6AEIfw", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      CanvasException canvasException0 = new CanvasException("", "", object0);
      Object object1 = canvasException0.getError();
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CanvasException canvasException0 = new CanvasException();
      String string0 = canvasException0.getCanvasErrorMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      CanvasException canvasException0 = new CanvasException("edu.ksu.canvas.exception.CanvasException", "edu.ksu.canvas.exception.CanvasException", object0);
      String string0 = canvasException0.getCanvasErrorMessage();
      assertEquals("edu.ksu.canvas.exception.CanvasException", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object object0 = new Object();
      CanvasException canvasException0 = new CanvasException("", "", object0);
      String string0 = canvasException0.getRequestUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object object0 = new Object();
      CanvasException canvasException0 = new CanvasException("", "", object0);
      String string0 = canvasException0.getCanvasErrorMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CanvasException canvasException0 = new CanvasException();
      Object object0 = canvasException0.getError();
      assertNull(object0);
  }
}
