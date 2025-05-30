/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 11:35:33 GMT 2022
 */

package com.ibanity.apis.client.products.xs2a.models.links;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibanity.apis.client.products.xs2a.models.links.UpdatedTransactionsLinks;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UpdatedTransactionsLinks_ESTest extends UpdatedTransactionsLinks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder1 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.related("mH^BP>5sQNt");
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder1.build();
      String string0 = updatedTransactionsLinks0.getRelated();
      assertEquals("mH^BP>5sQNt", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = new UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder();
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder1 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.related("");
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder1.build();
      String string0 = updatedTransactionsLinks0.getRelated();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      boolean boolean0 = updatedTransactionsLinks0.canEqual(updatedTransactionsLinks0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      boolean boolean0 = updatedTransactionsLinks0.canEqual(updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      String string0 = updatedTransactionsLinks0.getRelated();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder1 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.related("");
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder1.build();
      UpdatedTransactionsLinks updatedTransactionsLinks1 = new UpdatedTransactionsLinks();
      boolean boolean0 = updatedTransactionsLinks0.equals(updatedTransactionsLinks1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.related("a*FTi");
      UpdatedTransactionsLinks updatedTransactionsLinks1 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      boolean boolean0 = updatedTransactionsLinks0.equals(updatedTransactionsLinks1);
      assertFalse(updatedTransactionsLinks1.equals((Object)updatedTransactionsLinks0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      boolean boolean0 = updatedTransactionsLinks0.equals("UpdatedTransactionsLinks(related=mH^BP>5sQNt)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      boolean boolean0 = updatedTransactionsLinks0.equals(updatedTransactionsLinks0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      updatedTransactionsLinks0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.related("]B4=R28OA]1[jF8^");
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      updatedTransactionsLinks0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder1 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.related("mH^BP>5sQNt");
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder1.build();
      UpdatedTransactionsLinks updatedTransactionsLinks1 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder1.build();
      boolean boolean0 = updatedTransactionsLinks0.equals(updatedTransactionsLinks1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      String string0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.toString();
      assertEquals("UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder(related=null)", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UpdatedTransactionsLinks.UpdatedTransactionsLinksBuilder updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0 = UpdatedTransactionsLinks.builder();
      UpdatedTransactionsLinks updatedTransactionsLinks0 = updatedTransactionsLinks_UpdatedTransactionsLinksBuilder0.build();
      String string0 = updatedTransactionsLinks0.toString();
      assertEquals("UpdatedTransactionsLinks(related=null)", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UpdatedTransactionsLinks updatedTransactionsLinks0 = new UpdatedTransactionsLinks();
      UpdatedTransactionsLinks updatedTransactionsLinks1 = new UpdatedTransactionsLinks();
      boolean boolean0 = updatedTransactionsLinks0.equals(updatedTransactionsLinks1);
      assertTrue(boolean0);
  }
}
