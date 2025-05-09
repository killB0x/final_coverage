/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 23:55:28 GMT 2022
 */

package io.resourcepool.model;

import org.junit.Test;
import static org.junit.Assert.*;
import io.resourcepool.model.FullName;
import io.resourcepool.model.Gender;
import io.resourcepool.model.GivenName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GivenName_ESTest extends GivenName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Gender gender0 = Gender.MALE;
      GivenName givenName0 = new GivenName(", surname='", "@[[VSgc52DW)*TK}v~", gender0);
      String string0 = givenName0.toString();
      assertEquals("GivenName{givenName=', surname='', nickname='@[[VSgc52DW)*TK}v~', gender=MALE}", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gender gender0 = Gender.MALE;
      GivenName givenName0 = new GivenName(", surname='", "@[[VSgc52DW)*TK}v~", gender0);
      givenName0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gender gender0 = Gender.MALE;
      GivenName givenName0 = new GivenName("Lw@k^TG:svTrL3", "LNNO|11Ur.4\"Qj{0$sH", gender0);
      boolean boolean0 = givenName0.equals("Lw@k^TG:svTrL3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gender gender0 = Gender.FEMALE;
      GivenName givenName0 = new GivenName((String) null, "Cpv<<F", gender0);
      givenName0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gender gender0 = Gender.FEMALE;
      GivenName givenName0 = new GivenName("@w", "@w", gender0);
      Gender gender1 = Gender.MALE;
      GivenName givenName1 = new GivenName("@w", "@w", gender1);
      boolean boolean0 = givenName1.equals(givenName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gender gender0 = Gender.MALE;
      GivenName givenName0 = new GivenName("Cpv<<F", (String) null, gender0);
      GivenName givenName1 = new GivenName("Cpv<<F", "Cpv<<F", givenName0.gender);
      boolean boolean0 = givenName0.equals(givenName1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gender gender0 = Gender.FEMALE;
      GivenName givenName0 = new GivenName("GivenName{givenName='R', nickname='R', gender=FEMALE}", "GivenName{givenName='R', nickname='R', gender=FEMALE}", gender0);
      GivenName givenName1 = new GivenName("GivenName{givenName='R', nickname='R', gender=FEMALE}", "aW{Hd%zoxi=&\"('", givenName0.gender);
      boolean boolean0 = givenName0.equals(givenName1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gender gender0 = Gender.MALE;
      GivenName givenName0 = new GivenName("Cpv<<F", (String) null, gender0);
      GivenName givenName1 = givenName0.clone();
      boolean boolean0 = givenName0.equals(givenName1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gender gender0 = Gender.FEMALE;
      GivenName givenName0 = new GivenName("wR", "wR", gender0);
      GivenName givenName1 = new GivenName((String) null, "wR", givenName0.gender);
      boolean boolean0 = givenName1.equals(givenName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gender gender0 = Gender.FEMALE;
      GivenName givenName0 = new GivenName("$.AAUEa", "$.AAUEa", gender0);
      GivenName givenName1 = new GivenName("esl^fwr$)mal{e5=", "esl^fwr$)mal{e5=", gender0);
      boolean boolean0 = givenName0.equals(givenName1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gender gender0 = Gender.FEMALE;
      GivenName givenName0 = new GivenName((String) null, "Cpv<<F", gender0);
      GivenName givenName1 = givenName0.clone();
      boolean boolean0 = givenName1.equals(givenName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gender gender0 = Gender.FEMALE;
      GivenName givenName0 = new GivenName((String) null, "Cpv<<F", gender0);
      Object object0 = new Object();
      boolean boolean0 = givenName0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gender gender0 = Gender.FEMALE;
      GivenName givenName0 = new GivenName((String) null, (String) null, gender0);
      boolean boolean0 = givenName0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gender gender0 = Gender.FEMALE;
      GivenName givenName0 = new GivenName("", "", gender0);
      boolean boolean0 = givenName0.equals(givenName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gender gender0 = Gender.MALE;
      GivenName givenName0 = new GivenName("", "", gender0);
      FullName fullName0 = givenName0.toFullName(", gender=");
      GivenName givenName1 = new GivenName("", ".-j$p;wX=V$A$U7", fullName0.gender);
      givenName1.toFullName("q::xw6dnx]-uv");
      assertFalse(givenName1.equals((Object)givenName0));
  }
}
