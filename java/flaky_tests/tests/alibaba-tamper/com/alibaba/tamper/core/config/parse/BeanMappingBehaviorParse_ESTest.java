/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 21:42:40 GMT 2022
 */

package com.alibaba.tamper.core.config.parse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.tamper.core.config.BeanMappingBehavior;
import com.alibaba.tamper.core.config.parse.BeanMappingBehaviorParse;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BeanMappingBehaviorParse_ESTest extends BeanMappingBehaviorParse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      BeanMappingBehavior beanMappingBehavior0 = new BeanMappingBehavior();
      beanMappingBehavior0.setTrimStrings(true);
      BeanMappingBehavior beanMappingBehavior1 = BeanMappingBehaviorParse.parse(iIOMetadataNode0, beanMappingBehavior0);
      assertSame(beanMappingBehavior1, beanMappingBehavior0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      BeanMappingBehavior beanMappingBehavior0 = new BeanMappingBehavior();
      beanMappingBehavior0.setDebug(true);
      BeanMappingBehavior beanMappingBehavior1 = BeanMappingBehaviorParse.parse(iIOMetadataNode0, beanMappingBehavior0);
      assertSame(beanMappingBehavior1, beanMappingBehavior0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BeanMappingBehavior beanMappingBehavior0 = new BeanMappingBehavior();
      // Undeclared exception!
      try { 
        BeanMappingBehaviorParse.parse((Node) null, beanMappingBehavior0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.tamper.core.config.parse.BeanMappingBehaviorParse", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttribute("trimStrings", "trimStrings");
      BeanMappingBehavior beanMappingBehavior0 = new BeanMappingBehavior();
      BeanMappingBehavior beanMappingBehavior1 = BeanMappingBehaviorParse.parse(iIOMetadataNode0, beanMappingBehavior0);
      assertNotSame(beanMappingBehavior1, beanMappingBehavior0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttributeNS("mappingEmptyStrings", "mappingEmptyStrings", "mappingEmptyStrings");
      BeanMappingBehavior beanMappingBehavior0 = new BeanMappingBehavior();
      BeanMappingBehavior beanMappingBehavior1 = BeanMappingBehaviorParse.parse(iIOMetadataNode0, beanMappingBehavior0);
      assertFalse(beanMappingBehavior1.isMappingEmptyStrings());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttributeNS("mappingNullValue", "mappingNullValue", "mappingNullValue");
      BeanMappingBehavior beanMappingBehavior0 = new BeanMappingBehavior();
      BeanMappingBehavior beanMappingBehavior1 = BeanMappingBehaviorParse.parse(iIOMetadataNode0, beanMappingBehavior0);
      assertFalse(beanMappingBehavior1.isMappingNullValue());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      BeanMappingBehavior beanMappingBehavior0 = new BeanMappingBehavior();
      iIOMetadataNode0.setAttribute("debug", "debug");
      BeanMappingBehavior beanMappingBehavior1 = BeanMappingBehaviorParse.parse(iIOMetadataNode0, beanMappingBehavior0);
      assertNotSame(beanMappingBehavior1, beanMappingBehavior0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BeanMappingBehaviorParse beanMappingBehaviorParse0 = new BeanMappingBehaviorParse();
  }
}
