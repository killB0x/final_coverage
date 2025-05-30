/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:22:56 GMT 2022
 */

package com.hubspot.jinjava.tree.parse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.tree.parse.DefaultTokenScannerSymbols;
import com.hubspot.jinjava.tree.parse.NoteToken;
import com.hubspot.jinjava.tree.parse.TokenScannerSymbols;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NoteToken_ESTest extends NoteToken_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NoteToken noteToken0 = new NoteToken("", 0, (-1), (TokenScannerSymbols) null);
      noteToken0.parse();
      assertEquals(0, noteToken0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultTokenScannerSymbols defaultTokenScannerSymbols0 = new DefaultTokenScannerSymbols();
      NoteToken noteToken0 = new NoteToken((String) null, 1796, 1796, defaultTokenScannerSymbols0);
      int int0 = noteToken0.getType();
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultTokenScannerSymbols defaultTokenScannerSymbols0 = new DefaultTokenScannerSymbols();
      NoteToken noteToken0 = new NoteToken("-WnyAo)ZoN&", 1425, 1425, defaultTokenScannerSymbols0);
      String string0 = noteToken0.toString();
      assertEquals("{# ----comment---- #}", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NoteToken noteToken0 = new NoteToken("", 0, 0, (TokenScannerSymbols) null);
      // Undeclared exception!
      try { 
        noteToken0.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.tree.parse.NoteToken", e);
      }
  }
}
