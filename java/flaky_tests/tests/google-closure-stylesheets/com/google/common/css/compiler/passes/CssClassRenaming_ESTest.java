/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:15:12 GMT 2022
 */

package com.google.common.css.compiler.passes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.IdentitySubstitutionMap;
import com.google.common.css.SimpleSubstitutionMap;
import com.google.common.css.SubstitutionMap;
import com.google.common.css.compiler.ast.CssClassSelectorNode;
import com.google.common.css.compiler.ast.CssIdSelectorNode;
import com.google.common.css.compiler.ast.MutatingVisitController;
import com.google.common.css.compiler.passes.CssClassRenaming;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CssClassRenaming_ESTest extends CssClassRenaming_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IdentitySubstitutionMap identitySubstitutionMap0 = new IdentitySubstitutionMap();
      SimpleSubstitutionMap simpleSubstitutionMap0 = new SimpleSubstitutionMap();
      MutatingVisitController mutatingVisitController0 = mock(MutatingVisitController.class, new ViolatedAssumptionAnswer());
      CssClassRenaming cssClassRenaming0 = new CssClassRenaming(mutatingVisitController0, simpleSubstitutionMap0, identitySubstitutionMap0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutatingVisitController mutatingVisitController0 = mock(MutatingVisitController.class, new ViolatedAssumptionAnswer());
      SimpleSubstitutionMap simpleSubstitutionMap0 = new SimpleSubstitutionMap();
      CssClassRenaming cssClassRenaming0 = new CssClassRenaming(mutatingVisitController0, simpleSubstitutionMap0, simpleSubstitutionMap0);
      cssClassRenaming0.runPass();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MutatingVisitController mutatingVisitController0 = mock(MutatingVisitController.class, new ViolatedAssumptionAnswer());
      CssClassRenaming cssClassRenaming0 = new CssClassRenaming(mutatingVisitController0, (SubstitutionMap) null, (SubstitutionMap) null);
      boolean boolean0 = cssClassRenaming0.enterIdSelector((CssIdSelectorNode) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IdentitySubstitutionMap identitySubstitutionMap0 = new IdentitySubstitutionMap();
      CssClassRenaming cssClassRenaming0 = new CssClassRenaming((MutatingVisitController) null, identitySubstitutionMap0, identitySubstitutionMap0);
      // Undeclared exception!
      try { 
        cssClassRenaming0.enterIdSelector((CssIdSelectorNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.passes.CssClassRenaming", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IdentitySubstitutionMap identitySubstitutionMap0 = new IdentitySubstitutionMap();
      CssClassRenaming cssClassRenaming0 = new CssClassRenaming((MutatingVisitController) null, identitySubstitutionMap0, identitySubstitutionMap0);
      // Undeclared exception!
      try { 
        cssClassRenaming0.enterClassSelector((CssClassSelectorNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.passes.CssClassRenaming", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IdentitySubstitutionMap identitySubstitutionMap0 = new IdentitySubstitutionMap();
      CssClassRenaming cssClassRenaming0 = new CssClassRenaming((MutatingVisitController) null, identitySubstitutionMap0, identitySubstitutionMap0);
      // Undeclared exception!
      try { 
        cssClassRenaming0.runPass();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.passes.CssClassRenaming", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MutatingVisitController mutatingVisitController0 = mock(MutatingVisitController.class, new ViolatedAssumptionAnswer());
      CssClassRenaming cssClassRenaming0 = new CssClassRenaming(mutatingVisitController0, (SubstitutionMap) null, (SubstitutionMap) null);
      boolean boolean0 = cssClassRenaming0.enterClassSelector((CssClassSelectorNode) null);
      assertTrue(boolean0);
  }
}
