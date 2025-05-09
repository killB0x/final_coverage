/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 02:41:23 GMT 2022
 */

package simplenlg.lexicon.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simplenlg.lexicon.util.NIHLexiconXMLDumpUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NIHLexiconXMLDumpUtil_ESTest extends NIHLexiconXMLDumpUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[6];
      NIHLexiconXMLDumpUtil.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        NIHLexiconXMLDumpUtil.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("simplenlg.lexicon.util.NIHLexiconXMLDumpUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "o";
      stringArray0[1] = "o";
      stringArray0[2] = "";
      NIHLexiconXMLDumpUtil.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "o";
      stringArray0[1] = "o";
      stringArray0[2] = "o";
      NIHLexiconXMLDumpUtil.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "ZohcHid g-i7";
      stringArray0[1] = "";
      NIHLexiconXMLDumpUtil.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "o";
      stringArray0[1] = "o";
      NIHLexiconXMLDumpUtil.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      NIHLexiconXMLDumpUtil.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "o";
      NIHLexiconXMLDumpUtil.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[1];
      NIHLexiconXMLDumpUtil.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[3];
      NIHLexiconXMLDumpUtil.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NIHLexiconXMLDumpUtil nIHLexiconXMLDumpUtil0 = new NIHLexiconXMLDumpUtil();
  }
}
