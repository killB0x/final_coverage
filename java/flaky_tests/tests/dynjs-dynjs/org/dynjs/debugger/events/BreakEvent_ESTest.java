/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 21:35:32 GMT 2022
 */

package org.dynjs.debugger.events;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringReader;
import org.dynjs.debugger.Debugger;
import org.dynjs.debugger.events.BreakEvent;
import org.dynjs.debugger.model.Script;
import org.dynjs.runtime.source.ClassLoaderSourceProvider;
import org.dynjs.runtime.source.ReaderSourceProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BreakEvent_ESTest extends BreakEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BreakEvent breakEvent0 = new BreakEvent((Debugger) null, 0, (-1), (Script) null);
      int int0 = breakEvent0.getSourceLine();
      assertEquals(0, int0);
      assertEquals((-1), breakEvent0.getSourceColumn());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BreakEvent breakEvent0 = new BreakEvent((Debugger) null, (-1), 0, (Script) null);
      int int0 = breakEvent0.getSourceLine();
      assertEquals(0, breakEvent0.getSourceColumn());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderSourceProvider classLoaderSourceProvider0 = new ClassLoaderSourceProvider(classLoader0, "");
      Script script0 = new Script(classLoaderSourceProvider0, true);
      BreakEvent breakEvent0 = new BreakEvent((Debugger) null, 0, 0, script0);
      int int0 = breakEvent0.getSourceColumn();
      assertEquals(0, breakEvent0.getSourceLine());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BreakEvent breakEvent0 = new BreakEvent((Debugger) null, 0, (-1), (Script) null);
      int int0 = breakEvent0.getSourceColumn();
      assertEquals(0, breakEvent0.getSourceLine());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BreakEvent breakEvent0 = new BreakEvent((Debugger) null, 0, (-1), (Script) null);
      breakEvent0.getScript();
      assertEquals((-1), breakEvent0.getSourceColumn());
      assertEquals(0, breakEvent0.getSourceLine());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("BITWISE_OR");
      ReaderSourceProvider readerSourceProvider0 = new ReaderSourceProvider(stringReader0, "BITWISE_OR");
      Script script0 = new Script(readerSourceProvider0, false);
      BreakEvent breakEvent0 = new BreakEvent((Debugger) null, 113, 113, script0);
      breakEvent0.getScript();
      assertEquals(113, breakEvent0.getSourceLine());
      assertEquals(113, breakEvent0.getSourceColumn());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderSourceProvider classLoaderSourceProvider0 = new ClassLoaderSourceProvider(classLoader0, "");
      Script script0 = new Script(classLoaderSourceProvider0, true);
      BreakEvent breakEvent0 = new BreakEvent((Debugger) null, 0, 0, script0);
      breakEvent0.getScript();
      assertEquals(0, breakEvent0.getSourceLine());
      assertEquals(0, breakEvent0.getSourceColumn());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringReader stringReader0 = new StringReader("BITWISE_OR");
      ReaderSourceProvider readerSourceProvider0 = new ReaderSourceProvider(stringReader0, "BITWISE_OR");
      Script script0 = new Script(readerSourceProvider0, false);
      BreakEvent breakEvent0 = new BreakEvent((Debugger) null, 113, 113, script0);
      int int0 = breakEvent0.getSourceLine();
      assertEquals(113, int0);
      assertEquals(113, breakEvent0.getSourceColumn());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StringReader stringReader0 = new StringReader("BITWISE_OR");
      ReaderSourceProvider readerSourceProvider0 = new ReaderSourceProvider(stringReader0, "");
      Script script0 = new Script(readerSourceProvider0, true);
      BreakEvent breakEvent0 = new BreakEvent((Debugger) null, 2622, 48, script0);
      int int0 = breakEvent0.getSourceColumn();
      assertEquals(48, int0);
      assertEquals(2622, breakEvent0.getSourceLine());
  }
}
