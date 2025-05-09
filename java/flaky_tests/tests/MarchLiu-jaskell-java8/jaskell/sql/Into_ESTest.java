/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 11:56:15 GMT 2022
 */

package jaskell.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.script.Directive;
import jaskell.sql.Count;
import jaskell.sql.Cross;
import jaskell.sql.Full;
import jaskell.sql.Func;
import jaskell.sql.Into;
import jaskell.sql.Literal;
import jaskell.sql.Name;
import jaskell.sql.Or;
import jaskell.sql.Predicate;
import jaskell.sql.Quot;
import jaskell.sql.Text;
import jaskell.sql.ThenSelect;
import jaskell.sql.Values;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Into_ESTest extends Into_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "U%5B-1?\\>h1";
      Into into0 = new Into("U%5B-1?>h1");
      Name name0 = into0._name;
      Predicate predicate0 = name0.ne((Directive) into0);
      into0._prefix = (Directive) predicate0;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "U%5B-1?>h1";
      into0.fields(stringArray0);
      // Undeclared exception!
      try { 
        into0.parameters();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Into into0 = new Into((String) null);
      Name name0 = new Name("F5P");
      Text text0 = new Text(":");
      Predicate predicate0 = name0.or((Predicate) text0);
      into0._prefix = (Directive) predicate0;
      into0.script();
      into0.script();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Into into0 = new Into("", "");
      Values values0 = into0.values("");
      assertNotNull(values0);
      
      into0._prefix = (Directive) values0;
      // Undeclared exception!
      try { 
        into0.script();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Into into0 = new Into((String) null);
      Quot quot0 = new Quot((String) null);
      into0._prefix = (Directive) quot0;
      into0.values("");
      into0.parameters();
      String[] stringArray0 = new String[1];
      stringArray0[0] = null;
      // Undeclared exception!
      try { 
        into0.values(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.ReferencePipeline$3$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Into into0 = new Into((String) null);
      // Undeclared exception!
      try { 
        into0.values((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Values", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Into into0 = new Into("*(`I?8)J4{H#T\"00U", "");
      String[] stringArray0 = new String[3];
      Directive[] directiveArray0 = new Directive[0];
      into0.values(directiveArray0);
      stringArray0[0] = "*(`I?8)J4{H#T\"00U";
      stringArray0[1] = "*(`I?8)J4{H#T\"00U";
      stringArray0[2] = "";
      // Undeclared exception!
      try { 
        into0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Into into0 = new Into("qKUADh}BCKH)84", "qKUADh}BCKH)84");
      into0.select();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "qKUADh}BCKH)84";
      stringArray0[3] = "%s INTO %s(%s)";
      Into into1 = into0.fields(stringArray0);
      into0.values("");
      Directive[] directiveArray0 = new Directive[0];
      Values values0 = into0.values(directiveArray0);
      Into into2 = into1.fields("", directiveArray0);
      into1.values(stringArray0);
      Values values1 = into2.values("");
      assertNotSame(values1, values0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Into into0 = new Into("rmm?;ZqjOh|");
      // Undeclared exception!
      try { 
        into0.fields("rmm?;ZqjOh|", (Directive[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Into into0 = new Into("jaskell.sql.Into", "jaskell.sql.Into");
      Directive[] directiveArray0 = new Directive[8];
      directiveArray0[0] = (Directive) into0;
      Quot quot0 = new Quot("jaskell.sql.Into");
      Full full0 = quot0.full();
      directiveArray0[1] = (Directive) full0;
      directiveArray0[2] = (Directive) into0;
      directiveArray0[3] = (Directive) into0;
      directiveArray0[4] = (Directive) into0;
      directiveArray0[5] = (Directive) into0;
      directiveArray0[6] = (Directive) into0;
      directiveArray0[7] = (Directive) into0;
      Into into1 = into0.fields("Tk", directiveArray0);
      // Undeclared exception!
      try { 
        into1.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Into into0 = new Into("R", "R");
      // Undeclared exception!
      try { 
        into0.fields((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = null;
      Into into0 = new Into((String) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = null;
      stringArray0[1] = null;
      stringArray0[2] = null;
      stringArray0[3] = null;
      stringArray0[4] = null;
      // Undeclared exception!
      try { 
        into0.fields(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.ReferencePipeline$3$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "";
      Into into0 = new Into("", "");
      String string1 = "n";
      Directive[] directiveArray0 = new Directive[1];
      directiveArray0[0] = (Directive) into0;
      // Undeclared exception!
      try { 
        into0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Into into0 = null;
      try {
        into0 = new Into((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Into into0 = new Into("c`", "c`");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Into into0 = new Into("R", "R");
      Into into1 = into0.field("R");
      assertSame(into0, into1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Into into0 = new Into((String) null);
      // Undeclared exception!
      try { 
        into0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Into into0 = new Into("");
      // Undeclared exception!
      try { 
        into0.values((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "5uGwC91!";
      stringArray0[1] = "5uGwC91!";
      stringArray0[2] = "5uGwC91!";
      stringArray0[3] = "5uGwC91!";
      Into into0 = new Into("5uGwC91!", stringArray0);
      into0.select("");
      into0.select("5uGwC91!");
      Into into1 = into0.fields("L'");
      into0.values(stringArray0);
      Into into2 = into1.field((String) null);
      Quot quot0 = new Quot("5uGwC91!");
      into2._name = (Name) quot0;
      // Undeclared exception!
      try { 
        into1.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "";
      String[] stringArray0 = null;
      Into into0 = null;
      try {
        into0 = new Into("", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Into into0 = null;
      try {
        into0 = new Into("@s:F&>XjWz|X", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "o$DGs!u9o0=A";
      Into into0 = null;
      try {
        into0 = new Into("o$DGs!u9o0=A", (Directive[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Into into0 = new Into("VsMt1m C=Z*ByR");
      // Undeclared exception!
      try { 
        into0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Into into0 = new Into("pS{c9iN>CJ", "pS{c9iN>CJ");
      // Undeclared exception!
      try { 
        into0.values((Directive[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Directive[] directiveArray0 = new Directive[6];
      Quot quot0 = new Quot("SR]UD/1/55u^L:Tn");
      Count count0 = new Count("");
      Predicate predicate0 = quot0.gte((Directive) count0);
      directiveArray0[0] = (Directive) predicate0;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Predicate predicate1 = quot0.like(linkedList0);
      directiveArray0[1] = (Directive) predicate1;
      Func func0 = Func.min(predicate1);
      Func func1 = func0.arg(directiveArray0[0]);
      directiveArray0[2] = (Directive) func1;
      Quot quot1 = new Quot("");
      Predicate predicate2 = quot1.lte(directiveArray0[0]);
      directiveArray0[3] = (Directive) predicate2;
      Literal literal0 = new Literal(linkedList0);
      directiveArray0[4] = (Directive) literal0;
      Predicate predicate3 = quot1.ls(directiveArray0[1]);
      directiveArray0[5] = (Directive) predicate3;
      Into into0 = new Into("SR]UD/1/55u^L:Tn", directiveArray0);
      into0.values("");
      into0.values(directiveArray0);
      func0.ls(func1);
      Into into1 = into0.fields("");
      // Undeclared exception!
      try { 
        into1.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Into into0 = new Into((String) null);
      // Undeclared exception!
      try { 
        into0.fields((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Into into0 = new Into("");
      Into into1 = into0.fields("");
      assertSame(into0, into1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Into into0 = new Into("c`");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Into into0 = new Into("^=Ww");
      // Undeclared exception!
      try { 
        into0.fields((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Into", e);
      }
  }
}
