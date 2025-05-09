/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 14:12:50 GMT 2022
 */

package org.jfaster.mango.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfaster.mango.binding.InvocationContext;
import org.jfaster.mango.parser.ASTGTNode;
import org.jfaster.mango.parser.Node;
import org.jfaster.mango.parser.Parser;
import org.jfaster.mango.parser.ParserVisitor;
import org.jfaster.mango.parser.Token;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ASTGTNode_ESTest extends ASTGTNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ASTGTNode aSTGTNode0 = new ASTGTNode(0);
      Node[] nodeArray0 = new Node[0];
      aSTGTNode0.children = nodeArray0;
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        aSTGTNode0.value(invocationContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.jfaster.mango.parser.SimpleNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      ParserVisitor parserVisitor0 = mock(ParserVisitor.class, new ViolatedAssumptionAnswer());
      ASTGTNode aSTGTNode0 = new ASTGTNode(527);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) aSTGTNode0;
      aSTGTNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        aSTGTNode0.value(invocationContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASTGTNode aSTGTNode0 = new ASTGTNode(2566);
      ParserVisitor parserVisitor0 = mock(ParserVisitor.class, new ViolatedAssumptionAnswer());
      doReturn(aSTGTNode0).when(parserVisitor0).visit(any(org.jfaster.mango.parser.ASTGTNode.class) , any());
      Parser parser0 = mock(Parser.class, new ViolatedAssumptionAnswer());
      ASTGTNode aSTGTNode1 = new ASTGTNode(parser0, 2566);
      aSTGTNode0.jjtSetParent(aSTGTNode1);
      aSTGTNode1.jjtSetLastToken((Token) null);
      aSTGTNode0.jjtSetLastToken((Token) null);
      aSTGTNode0.jjtAccept(parserVisitor0, (Object) null);
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        aSTGTNode1.value(invocationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.SimpleNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = (-3961);
      ASTGTNode aSTGTNode0 = new ASTGTNode((-3961));
      ParserVisitor parserVisitor0 = null;
      // Undeclared exception!
      try { 
        aSTGTNode0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.ASTGTNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ASTGTNode aSTGTNode0 = new ASTGTNode(0);
      Node[] nodeArray0 = new Node[9];
      nodeArray0[0] = (Node) aSTGTNode0;
      nodeArray0[1] = (Node) aSTGTNode0;
      nodeArray0[2] = (Node) aSTGTNode0;
      nodeArray0[3] = (Node) aSTGTNode0;
      nodeArray0[4] = (Node) aSTGTNode0;
      ASTGTNode aSTGTNode1 = new ASTGTNode(1532);
      Node node0 = aSTGTNode1.parent;
      nodeArray0[5] = null;
      nodeArray0[6] = (Node) aSTGTNode0;
      nodeArray0[7] = (Node) aSTGTNode0;
      nodeArray0[8] = (Node) aSTGTNode0;
      aSTGTNode0.children = nodeArray0;
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        aSTGTNode0.evaluate(invocationContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ASTGTNode aSTGTNode0 = new ASTGTNode(527);
      assertEquals(0, aSTGTNode0.jjtGetNumChildren());
      
      // Undeclared exception!
      try { 
        aSTGTNode0.evaluate((InvocationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.SimpleNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ASTGTNode aSTGTNode0 = new ASTGTNode((-1550));
      ParserVisitor parserVisitor0 = mock(ParserVisitor.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(parserVisitor0).visit(any(org.jfaster.mango.parser.ASTGTNode.class) , any());
      aSTGTNode0.jjtAccept(parserVisitor0, parserVisitor0);
      aSTGTNode0.value = null;
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        aSTGTNode0.evaluate(invocationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.SimpleNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASTGTNode aSTGTNode0 = new ASTGTNode((-1950));
      Node[] nodeArray0 = new Node[0];
      aSTGTNode0.jjtGetParent();
      aSTGTNode0.jjtSetParent((Node) null);
      aSTGTNode0.children = nodeArray0;
      ParserVisitor parserVisitor0 = mock(ParserVisitor.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(parserVisitor0).visit(any(org.jfaster.mango.parser.ASTGTNode.class) , any());
      aSTGTNode0.jjtAccept(parserVisitor0, parserVisitor0);
      aSTGTNode0.jjtGetFirstToken();
      aSTGTNode0.firstToken = null;
      InvocationContext invocationContext0 = null;
      // Undeclared exception!
      try { 
        aSTGTNode0.evaluate((InvocationContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.jfaster.mango.parser.SimpleNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ASTGTNode aSTGTNode0 = new ASTGTNode(527);
      // Undeclared exception!
      try { 
        aSTGTNode0.value((InvocationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.SimpleNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser parser0 = mock(Parser.class, new ViolatedAssumptionAnswer());
      ASTGTNode aSTGTNode0 = new ASTGTNode(parser0, (-1762));
      Object object0 = aSTGTNode0.value;
      aSTGTNode0.value = null;
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        aSTGTNode0.value(invocationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.SimpleNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASTGTNode aSTGTNode0 = new ASTGTNode((Parser) null, 3290);
      assertEquals(0, aSTGTNode0.jjtGetNumChildren());
  }
}
