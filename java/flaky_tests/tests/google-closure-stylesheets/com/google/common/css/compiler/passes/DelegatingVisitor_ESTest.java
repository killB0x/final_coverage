/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:28:10 GMT 2022
 */

package com.google.common.css.compiler.passes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.CssTreeVisitor;
import com.google.common.css.compiler.ast.DefaultTreeVisitor;
import com.google.common.css.compiler.passes.DelegatingVisitor;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DelegatingVisitor_ESTest extends DelegatingVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<CssTreeVisitor> arrayList0 = new ArrayList<CssTreeVisitor>();
      List<CssTreeVisitor> list0 = arrayList0.subList(0, 0);
      arrayList0.add((CssTreeVisitor) null);
      // Undeclared exception!
      try { 
        DelegatingVisitor.from(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        DelegatingVisitor.from((List<CssTreeVisitor>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.passes.DelegatingVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stack<CssTreeVisitor> stack0 = new Stack<CssTreeVisitor>();
      DefaultTreeVisitor defaultTreeVisitor0 = new DefaultTreeVisitor();
      stack0.add((CssTreeVisitor) defaultTreeVisitor0);
      // Undeclared exception!
      try { 
        DelegatingVisitor.from((List<CssTreeVisitor>) stack0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.common.css.compiler.passes.DelegatingVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Stack<CssTreeVisitor> stack0 = new Stack<CssTreeVisitor>();
      // Undeclared exception!
      try { 
        DelegatingVisitor.from((List<CssTreeVisitor>) stack0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.common.css.compiler.passes.DelegatingVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CssTreeVisitor[] cssTreeVisitorArray0 = new CssTreeVisitor[0];
      // Undeclared exception!
      try { 
        DelegatingVisitor.from(cssTreeVisitorArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/ImmutableList
         //
         verifyException("com.google.common.css.compiler.passes.DelegatingVisitor", e);
      }
  }
}
