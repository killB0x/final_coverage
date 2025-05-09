/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 13:37:00 GMT 2022
 */

package com.github.dkellenb.formulaevaluator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.dkellenb.formulaevaluator.CachedFormulaCompiler;
import com.github.dkellenb.formulaevaluator.term.Term;
import com.github.dkellenb.formulaevaluator.valueprovider.GenericInitOnlyVariableValueProvider;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CachedFormulaCompiler_ESTest extends CachedFormulaCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BiFunction<String, Set<String>, Term<Object>> biFunction0 = (BiFunction<String, Set<String>, Term<Object>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , anySet());
      CachedFormulaCompiler<Object> cachedFormulaCompiler0 = new CachedFormulaCompiler<Object>(biFunction0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      GenericInitOnlyVariableValueProvider<String> genericInitOnlyVariableValueProvider0 = new GenericInitOnlyVariableValueProvider<String>(hashMap0);
      Set<String> set0 = genericInitOnlyVariableValueProvider0.getVariables();
      Term<Object> term0 = cachedFormulaCompiler0.getCompiledTerm("5+XmCXWdW1`y?", set0);
      assertNull(term0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CachedFormulaCompiler<Object> cachedFormulaCompiler0 = new CachedFormulaCompiler<Object>((BiFunction<String, Set<String>, Term<Object>>) null);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      // Undeclared exception!
      try { 
        cachedFormulaCompiler0.getCompiledTerm("", linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.dkellenb.formulaevaluator.CachedFormulaCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Term<BigDecimal> term0 = (Term<BigDecimal>) mock(Term.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(term0).toString();
      BiFunction<String, Set<String>, Term<BigDecimal>> biFunction0 = (BiFunction<String, Set<String>, Term<BigDecimal>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(term0).when(biFunction0).apply(anyString() , anySet());
      CachedFormulaCompiler<BigDecimal> cachedFormulaCompiler0 = new CachedFormulaCompiler<BigDecimal>(biFunction0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      GenericInitOnlyVariableValueProvider<String> genericInitOnlyVariableValueProvider0 = new GenericInitOnlyVariableValueProvider<String>(hashMap0);
      Set<String> set0 = genericInitOnlyVariableValueProvider0.getVariables();
      Term<BigDecimal> term1 = cachedFormulaCompiler0.getCompiledTerm(";ME", set0);
      Term<BigDecimal> term2 = cachedFormulaCompiler0.getCompiledTerm(";ME", set0);
      assertSame(term2, term1);
  }
}
