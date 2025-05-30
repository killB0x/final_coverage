/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 21:43:10 GMT 2022
 */

package org.gedcom4j.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.Options;
import org.gedcom4j.model.RepositoryCitation;
import org.gedcom4j.model.SourceCallNumber;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RepositoryCitation_ESTest extends RepositoryCitation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      repositoryCitation0.setRepositoryXref("E*\"]-?8=nt}1LeJ+S{`");
      repositoryCitation0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      repositoryCitation0.setRepositoryXref("u!sK*nj");
      String string0 = repositoryCitation0.getRepositoryXref();
      assertEquals("u!sK*nj", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      repositoryCitation0.setRepositoryXref("");
      String string0 = repositoryCitation0.getRepositoryXref();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      repositoryCitation0.getCallNumbers(true);
      List<SourceCallNumber> list0 = repositoryCitation0.getCallNumbers();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = null;
      try {
        repositoryCitation0 = new RepositoryCitation((RepositoryCitation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gedcom4j.model.AbstractElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      List<SourceCallNumber> list0 = repositoryCitation0.getCallNumbers(false);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      repositoryCitation0.setRepositoryXref("u!sK*nj");
      String string0 = repositoryCitation0.toString();
      assertEquals("RepositoryCitation [repositoryXref=u!sK*nj, ]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      Options.setCollectionInitializationEnabled(true);
      RepositoryCitation repositoryCitation1 = new RepositoryCitation(repositoryCitation0);
      String string0 = repositoryCitation1.toString();
      assertEquals("RepositoryCitation [callNumbers=[], noteStructures=[], customFacts=[]]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      repositoryCitation0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      Options.setCollectionInitializationEnabled(true);
      RepositoryCitation repositoryCitation1 = new RepositoryCitation(repositoryCitation0);
      repositoryCitation1.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      List<SourceCallNumber> list0 = repositoryCitation0.getCallNumbers(true);
      List<SourceCallNumber> list1 = repositoryCitation0.getCallNumbers(true);
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      RepositoryCitation repositoryCitation1 = new RepositoryCitation(repositoryCitation0);
      repositoryCitation0.setRepositoryXref("");
      assertFalse(repositoryCitation0.equals((Object)repositoryCitation1));
      
      repositoryCitation1.setRepositoryXref("");
      boolean boolean0 = repositoryCitation0.equals(repositoryCitation1);
      assertTrue(repositoryCitation0.equals((Object)repositoryCitation1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      RepositoryCitation repositoryCitation1 = new RepositoryCitation(repositoryCitation0);
      assertTrue(repositoryCitation1.equals((Object)repositoryCitation0));
      
      repositoryCitation0.setRepositoryXref("");
      boolean boolean0 = repositoryCitation1.equals(repositoryCitation0);
      assertFalse(repositoryCitation1.equals((Object)repositoryCitation0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      RepositoryCitation repositoryCitation1 = new RepositoryCitation(repositoryCitation0);
      assertTrue(repositoryCitation1.equals((Object)repositoryCitation0));
      
      repositoryCitation0.setRepositoryXref("");
      boolean boolean0 = repositoryCitation0.equals(repositoryCitation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      RepositoryCitation repositoryCitation1 = new RepositoryCitation(repositoryCitation0);
      assertTrue(repositoryCitation1.equals((Object)repositoryCitation0));
      
      repositoryCitation1.getCallNumbers(true);
      boolean boolean0 = repositoryCitation1.equals(repositoryCitation0);
      assertFalse(repositoryCitation1.equals((Object)repositoryCitation0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      List<SourceCallNumber> list0 = repositoryCitation0.getCallNumbers(true);
      assertNotNull(list0);
      
      RepositoryCitation repositoryCitation1 = new RepositoryCitation();
      boolean boolean0 = repositoryCitation1.equals(repositoryCitation0);
      assertFalse(boolean0);
      assertFalse(repositoryCitation0.equals((Object)repositoryCitation1));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      Object object0 = new Object();
      boolean boolean0 = repositoryCitation0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      boolean boolean0 = repositoryCitation0.equals(repositoryCitation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options.setCollectionInitializationEnabled(true);
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      RepositoryCitation repositoryCitation1 = new RepositoryCitation(repositoryCitation0);
      boolean boolean0 = repositoryCitation0.equals(repositoryCitation1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      String string0 = repositoryCitation0.getRepositoryXref();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RepositoryCitation repositoryCitation0 = new RepositoryCitation();
      List<SourceCallNumber> list0 = repositoryCitation0.getCallNumbers();
      assertNull(list0);
  }
}
