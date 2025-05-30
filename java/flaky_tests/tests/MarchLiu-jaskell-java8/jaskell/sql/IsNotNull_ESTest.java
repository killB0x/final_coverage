/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 11:45:38 GMT 2022
 */

package jaskell.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.script.Directive;
import jaskell.sql.Count;
import jaskell.sql.Func;
import jaskell.sql.IsNotNull;
import jaskell.sql.Literal;
import jaskell.sql.Name;
import jaskell.sql.Predicate;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IsNotNull_ESTest extends IsNotNull_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IsNotNull isNotNull0 = new IsNotNull();
      Func func0 = Func.max(isNotNull0);
      Func func1 = func0.arg(isNotNull0);
      Func.max(isNotNull0);
      List<Directive> list0 = func1._args;
      isNotNull0.in(list0);
      Literal literal0 = new Literal("");
      isNotNull0._prefix = (Directive) literal0;
      literal0.script();
      isNotNull0.script();
      isNotNull0.parameters();
      isNotNull0.script();
      isNotNull0.script();
      isNotNull0.parameters();
      isNotNull0.parameters();
      isNotNull0.script();
      isNotNull0.parameters();
      isNotNull0.parameters();
      isNotNull0.parameters();
      isNotNull0.parameters();
      literal0.left();
      isNotNull0.parameters();
      isNotNull0.script();
      String string0 = isNotNull0.script();
      assertEquals(" IS NOT NULL", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IsNotNull isNotNull0 = new IsNotNull();
      Name name0 = new Name((String) null);
      Count count0 = new Count(name0);
      isNotNull0._prefix = (Directive) count0;
      String string0 = isNotNull0.script();
      assertEquals("COUNT(null) IS NOT NULL", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IsNotNull isNotNull0 = new IsNotNull();
      Directive[] directiveArray0 = new Directive[4];
      directiveArray0[0] = (Directive) isNotNull0;
      directiveArray0[1] = (Directive) isNotNull0;
      directiveArray0[2] = (Directive) isNotNull0;
      Predicate predicate0 = isNotNull0.ls(directiveArray0[1]);
      directiveArray0[3] = (Directive) predicate0;
      Func func0 = new Func("0\"&j8qDSM:WRJ{zR", directiveArray0);
      isNotNull0._prefix = (Directive) func0;
      // Undeclared exception!
      try { 
        isNotNull0.script();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IsNotNull isNotNull0 = new IsNotNull();
      isNotNull0.lt((Integer) null);
      isNotNull0.or((Object) null);
      Integer integer0 = Integer.getInteger("", 2644);
      isNotNull0.lt(integer0);
      // Undeclared exception!
      try { 
        isNotNull0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.IsNotNull", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IsNotNull isNotNull0 = new IsNotNull();
      // Undeclared exception!
      try { 
        isNotNull0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.IsNotNull", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IsNotNull isNotNull0 = new IsNotNull();
      // Undeclared exception!
      try { 
        isNotNull0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.IsNotNull", e);
      }
  }
}
