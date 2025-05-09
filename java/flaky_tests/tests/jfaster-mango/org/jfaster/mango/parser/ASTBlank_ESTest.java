/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 00:53:48 GMT 2022
 */

package org.jfaster.mango.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.parser.ASTBlank;
import org.jfaster.mango.parser.Parser;
import org.jfaster.mango.parser.ParserVisitor;
import org.jfaster.mango.parser.visitor.TextBlankJoinVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ASTBlank_ESTest extends ASTBlank_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTBlank aSTBlank0 = new ASTBlank((-1));
      // Undeclared exception!
      try { 
        aSTBlank0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.ASTBlank", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTBlank aSTBlank0 = new ASTBlank((-2321));
      TextBlankJoinVisitor textBlankJoinVisitor0 = TextBlankJoinVisitor.INSTANCE;
      Object object0 = aSTBlank0.jjtAccept(textBlankJoinVisitor0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTBlank aSTBlank0 = new ASTBlank((Parser) null, 41);
      TextBlankJoinVisitor textBlankJoinVisitor0 = TextBlankJoinVisitor.INSTANCE;
      Object object0 = aSTBlank0.jjtAccept(textBlankJoinVisitor0, textBlankJoinVisitor0);
      assertSame(textBlankJoinVisitor0, object0);
  }
}
