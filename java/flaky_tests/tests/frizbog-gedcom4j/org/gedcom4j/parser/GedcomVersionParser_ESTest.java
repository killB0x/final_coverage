/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 22:53:14 GMT 2022
 */

package org.gedcom4j.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.model.GedcomVersion;
import org.gedcom4j.model.StringTree;
import org.gedcom4j.parser.GedcomParser;
import org.gedcom4j.parser.GedcomVersionParser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GedcomVersionParser_ESTest extends GedcomVersionParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      GedcomVersionParser gedcomVersionParser0 = new GedcomVersionParser(gedcomParser0, (StringTree) null, (GedcomVersion) null);
      // Undeclared exception!
      try { 
        gedcomVersionParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gedcom4j.parser.GedcomVersionParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      StringTree stringTree0 = new StringTree();
      stringTree0.getChildren(true);
      GedcomVersion gedcomVersion0 = new GedcomVersion();
      GedcomVersionParser gedcomVersionParser0 = new GedcomVersionParser(gedcomParser0, stringTree0, gedcomVersion0);
      gedcomVersionParser0.parse();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      StringTree stringTree0 = new StringTree();
      GedcomVersion gedcomVersion0 = new GedcomVersion();
      GedcomVersionParser gedcomVersionParser0 = new GedcomVersionParser(gedcomParser0, stringTree0, gedcomVersion0);
      gedcomVersionParser0.parse();
  }
}
