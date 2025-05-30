/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 09:41:21 GMT 2022
 */

package jodd.lagarto;

import org.junit.Test;
import static org.junit.Assert.*;
import jodd.lagarto.TagType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TagType_ESTest extends TagType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TagType[] tagTypeArray0 = TagType.values();
      assertEquals(3, tagTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TagType tagType0 = TagType.valueOf("END");
      assertFalse(tagType0.isStartingTag());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TagType tagType0 = TagType.valueOf("START");
      assertEquals("<", tagType0.getStartString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TagType tagType0 = TagType.START;
      boolean boolean0 = tagType0.isStartingTag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TagType tagType0 = TagType.START;
      boolean boolean0 = tagType0.isEndingTag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TagType tagType0 = TagType.SELF_CLOSING;
      boolean boolean0 = tagType0.isEndingTag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TagType tagType0 = TagType.END;
      boolean boolean0 = tagType0.isStartingTag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TagType tagType0 = TagType.SELF_CLOSING;
      String string0 = tagType0.getEndString();
      assertEquals("/>", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TagType tagType0 = TagType.SELF_CLOSING;
      String string0 = tagType0.getStartString();
      assertEquals("<", string0);
  }
}
