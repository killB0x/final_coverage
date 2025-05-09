/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:45:40 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast.partial;

import org.junit.Test;
import static org.junit.Assert.*;
import com.evolvedbinary.xpath.parser.ast.QNameW;
import com.evolvedbinary.xpath.parser.ast.partial.PartialPrefixedName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PartialPrefixedName_ESTest extends PartialPrefixedName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PartialPrefixedName partialPrefixedName0 = new PartialPrefixedName("?DXy5Q83>W");
      String string0 = partialPrefixedName0.describe();
      assertEquals("PrefixedName(?DXy5Q83>W, ?)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PartialPrefixedName partialPrefixedName0 = new PartialPrefixedName("%![CI,'vhuAq 1");
      QNameW qNameW0 = partialPrefixedName0.complete("%![CI,'vhuAq 1");
      assertEquals("%![CI,'vhuAq 1", qNameW0.getPrefix());
  }
}
