/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 19:00:50 GMT 2022
 */

package org.gatein.api.navigation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.gatein.api.navigation.PublicationDate;
import org.gatein.api.navigation.Visibility;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Visibility_ESTest extends Visibility_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2831), (-2831), (-2831), (-2831), 2072, 2072);
      PublicationDate publicationDate0 = PublicationDate.startingOn(mockDate0);
      Visibility visibility0 = new Visibility(publicationDate0);
      PublicationDate publicationDate1 = visibility0.getPublicationDate();
      assertSame(publicationDate0, publicationDate1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Visibility.Status visibility_Status0 = Visibility.Status.PUBLICATION;
      Visibility visibility0 = new Visibility(visibility_Status0);
      // Undeclared exception!
      try { 
        visibility0.isVisible();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gatein.api.navigation.Visibility", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Visibility visibility0 = null;
      try {
        visibility0 = new Visibility((Visibility.Status) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // status cannot be null
         //
         verifyException("org.gatein.api.internal.Parameters", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Visibility visibility0 = null;
      try {
        visibility0 = new Visibility((PublicationDate) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // publicationDate cannot be null
         //
         verifyException("org.gatein.api.internal.Parameters", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2874), (-2874), (-2874), (-2874), (-2874), (-2874));
      PublicationDate publicationDate0 = PublicationDate.startingOn(mockDate0);
      Visibility visibility0 = new Visibility(publicationDate0);
      visibility0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Visibility visibility0 = new Visibility();
      visibility0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2831), (-2831), (-2831), (-2831), (-2831), (-2831));
      PublicationDate publicationDate0 = PublicationDate.startingOn(mockDate0);
      MockDate mockDate1 = new MockDate((-2831), (-2831), 2, 0, (-1706), (-1));
      PublicationDate publicationDate1 = PublicationDate.startingOn(mockDate1);
      Visibility visibility0 = new Visibility(publicationDate1);
      Visibility visibility1 = new Visibility(publicationDate0);
      boolean boolean0 = visibility1.equals(visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2857), (-2857), (-2857), (-2857), 1, (-2857));
      PublicationDate publicationDate0 = PublicationDate.startingOn(mockDate0);
      Visibility visibility0 = new Visibility(publicationDate0);
      Visibility.Status visibility_Status0 = Visibility.Status.PUBLICATION;
      Visibility visibility1 = new Visibility(visibility_Status0);
      boolean boolean0 = visibility0.equals(visibility1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-766), (-2831), (-1), 0, 4566, 0);
      PublicationDate publicationDate0 = PublicationDate.startingOn(mockDate0);
      Visibility visibility0 = new Visibility(publicationDate0);
      Visibility.Status visibility_Status0 = Visibility.Status.PUBLICATION;
      Visibility visibility1 = new Visibility(visibility_Status0);
      boolean boolean0 = visibility1.equals(visibility0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Visibility visibility0 = new Visibility();
      Visibility visibility1 = new Visibility();
      boolean boolean0 = visibility0.equals(visibility1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2831), (-2831), (-2831), (-2831), (-2831), (-2831));
      PublicationDate publicationDate0 = PublicationDate.startingOn(mockDate0);
      Visibility visibility0 = new Visibility(publicationDate0);
      Visibility visibility1 = new Visibility(publicationDate0);
      boolean boolean0 = visibility1.equals(visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      PublicationDate publicationDate0 = PublicationDate.endingOn(mockDate0);
      Visibility visibility0 = new Visibility(publicationDate0);
      Object object0 = new Object();
      boolean boolean0 = visibility0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Visibility visibility0 = new Visibility();
      boolean boolean0 = visibility0.equals(visibility0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Visibility visibility0 = new Visibility();
      MockDate mockDate0 = new MockDate((-2831), (-2831), (-2831), (-2831), (-2831), (-2831));
      PublicationDate publicationDate0 = PublicationDate.startingOn(mockDate0);
      Visibility visibility1 = new Visibility(publicationDate0);
      boolean boolean0 = visibility0.equals(visibility1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Visibility.Status visibility_Status0 = Visibility.Status.SYSTEM;
      Visibility visibility0 = new Visibility(visibility_Status0);
      boolean boolean0 = visibility0.isVisible();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2831), (-2831), (-2831), (-2831), (-2831), (-2831));
      PublicationDate publicationDate0 = PublicationDate.startingOn(mockDate0);
      Visibility visibility0 = new Visibility(publicationDate0);
      boolean boolean0 = visibility0.isVisible();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Visibility visibility0 = new Visibility();
      boolean boolean0 = visibility0.isVisible();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2857), (-2857), (-2857), (-2857), 1, (-2857));
      PublicationDate publicationDate0 = PublicationDate.startingOn(mockDate0);
      Visibility visibility0 = new Visibility(publicationDate0);
      Visibility.Status visibility_Status0 = visibility0.getStatus();
      assertEquals(Visibility.Status.PUBLICATION, visibility_Status0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Visibility visibility0 = new Visibility();
      String string0 = visibility0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Visibility visibility0 = new Visibility();
      PublicationDate publicationDate0 = visibility0.getPublicationDate();
      assertNull(publicationDate0);
  }
}
