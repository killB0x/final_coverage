/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:29:59 GMT 2022
 */

package org.jfaster.mango.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.parser.ASTTruncate;
import org.jfaster.mango.parser.Parser;
import org.jfaster.mango.parser.ParserVisitor;
import org.jfaster.mango.parser.visitor.InterablePropertyCollectVisitor;
import org.jfaster.mango.util.jdbc.SQLType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ASTTruncate_ESTest extends ASTTruncate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTTruncate aSTTruncate0 = new ASTTruncate(0);
      InterablePropertyCollectVisitor interablePropertyCollectVisitor0 = InterablePropertyCollectVisitor.INSTANCE;
      // Undeclared exception!
      try { 
        aSTTruncate0.jjtAccept(interablePropertyCollectVisitor0, interablePropertyCollectVisitor0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.visitor.InterablePropertyCollectVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTTruncate aSTTruncate0 = new ASTTruncate((Parser) null, 1860);
      SQLType sQLType0 = aSTTruncate0.getSQLType();
      assertTrue(sQLType0.needChangeData());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTTruncate aSTTruncate0 = new ASTTruncate(2705);
      // Undeclared exception!
      try { 
        aSTTruncate0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.ASTTruncate", e);
      }
  }
}
