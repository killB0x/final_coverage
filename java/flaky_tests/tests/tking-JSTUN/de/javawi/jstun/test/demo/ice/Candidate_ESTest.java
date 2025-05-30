/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 00:18:05 GMT 2022
 */

package de.javawi.jstun.test.demo.ice;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.javawi.jstun.test.demo.ice.Candidate;
import de.javawi.jstun.util.Address;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Candidate_ESTest extends Candidate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)4;
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)3;
      Object object0 = new Object();
      Address address0 = new Address(byteArray0);
      Object object1 = new Object();
      Candidate candidate0 = new Candidate(address0, (short) (-1367));
      Candidate candidate1 = new Candidate(address0, (short) (-1367));
      Address address1 = candidate1.getAddress();
      candidate0.setPriority((-336));
      Candidate candidate2 = new Candidate(address1, (short)251);
      candidate0.compareTo(candidate2);
      Object object2 = new Object();
      candidate2.getPriority();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-17);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-88);
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)3;
      byteArray0[5] = (byte)88;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-128);
      Address address0 = new Address(byteArray0);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.Local;
      Candidate candidate0 = new Candidate(address0, (byte)8);
      Candidate candidate1 = new Candidate(address0, candidate_CandidateType0, (short)219, candidate0);
      candidate0.getAddress();
      candidate1.setFoundationId(4);
      candidate1.getAddress();
      candidate0.setInUse(false);
      candidate1.setFoundationId((byte) (-17));
      candidate0.getPort();
      candidate1.setComponentId((byte)8);
      Candidate candidate2 = candidate1.getBase();
      candidate2.setFoundationId((-929));
      candidate1.getInUse();
      candidate2.getComponentId();
      candidate1.getPriority();
      candidate1.equals(candidate2);
      candidate2.getFoundationId();
      candidate0.getFoundationId();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[35];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)255);
      candidate0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte) (-73));
      Candidate candidate1 = new Candidate(address0, (byte) (-73));
      candidate1.getAddress();
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.PeerReflexive;
      Candidate candidate2 = null;
      try {
        candidate2 = new Candidate((Address) null, candidate_CandidateType0, (short)1368, candidate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)4;
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("4.0.191.8", 40001);
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, byteArray0);
      byteArray0[1] = (byte)0;
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)3);
      Object object0 = new Object();
      Candidate candidate1 = new Candidate(address0, (short) (-799));
      candidate1.getAddress();
      address0.toString();
      candidate0.compareTo(candidate1);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress(" is not between 1 and 256 inclusive.", 12345);
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, evoSuiteRemoteAddress0, byteArray0);
      candidate0.setInUse(true);
      candidate0.getPort();
      candidate1.setFoundationId(3);
      candidate1.setComponentId((byte)4);
      Candidate candidate2 = candidate0.getBase();
      candidate0.getInUse();
      candidate2.getComponentId();
      candidate0.getPriority();
      Candidate candidate3 = new Candidate(address0, (short)3);
      Candidate candidate4 = new Candidate(address0, (short)404);
      candidate4.compareTo(candidate3);
      candidate0.getPort();
      candidate3.getBase();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Address address0 = new Address(byteArray0);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.Local;
      Candidate candidate0 = new Candidate(address0, (byte) (-65));
      Candidate.CandidateType candidate_CandidateType1 = Candidate.CandidateType.PeerReflexive;
      Candidate candidate1 = new Candidate(address0, candidate_CandidateType1, (short)24, candidate0);
      Address address1 = candidate1.getAddress();
      candidate0.setFoundationId(2691);
      Address address2 = candidate0.getAddress();
      candidate0.setInUse(true);
      candidate1.getPort();
      candidate0.setFoundationId((-3242));
      candidate1.setComponentId((short)8);
      Candidate candidate2 = candidate1.getBase();
      candidate1.getInUse();
      Candidate candidate3 = new Candidate(address2, candidate_CandidateType0, (short)243, candidate0);
      candidate3.getComponentId();
      candidate3.getPriority();
      Candidate candidate4 = new Candidate(address1, (byte) (-12));
      candidate4.compareTo(candidate2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short) (-3059));
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.PeerReflexive;
      Candidate candidate1 = new Candidate(address0, candidate_CandidateType0, (short)4, candidate0);
      candidate0.setBase(candidate1);
      candidate0.setPriority(2);
      Candidate candidate2 = candidate1.getBase();
      candidate0.getInUse();
      candidate1.getComponentId();
      candidate2.getPriority();
      Candidate.CandidateType candidate_CandidateType1 = Candidate.CandidateType.ServerReflexive;
      Candidate candidate3 = null;
      try {
        candidate3 = new Candidate(address0, candidate_CandidateType1, (short) (-3242), candidate1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3242 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)3);
      Candidate candidate1 = new Candidate(address0, (byte) (-73));
      candidate0.getAddress();
      candidate1.equals(candidate0);
      candidate1.getAddress();
      candidate1.getFoundationId();
      // Undeclared exception!
      try { 
        candidate1.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-65);
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)3;
      byteArray0[5] = (byte)88;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-128);
      Address address0 = new Address(byteArray0);
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40001);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 2299);
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)4;
      byteArray1[1] = (byte) (-128);
      byteArray1[2] = (byte) (-65);
      byteArray1[3] = (byte)8;
      byteArray1[4] = (byte) (-65);
      byteArray1[5] = (byte) (-128);
      byteArray1[6] = (byte)0;
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, evoSuiteRemoteAddress0, byteArray1);
      Candidate candidate0 = new Candidate(address0, (byte)8);
      Address address1 = candidate0.getAddress();
      candidate0.setInUse(false);
      candidate0.setPriority((byte)0);
      Object object0 = new Object();
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.Local;
      candidate0.setComponentId((short)256);
      Candidate candidate1 = new Candidate(address1, candidate_CandidateType0, (byte)8, candidate0);
      candidate0.equals(candidate1);
      candidate1.getFoundationId();
      Candidate.CandidateType.values();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-65);
      byteArray0[4] = (byte)3;
      byteArray0[5] = (byte)88;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-128);
      Address address0 = new Address(byteArray0);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.Local;
      Candidate candidate0 = new Candidate(address0, (byte)0);
      Candidate candidate1 = new Candidate(address0, candidate_CandidateType0, (short)219, candidate0);
      candidate0.getAddress();
      candidate1.setFoundationId(4);
      candidate1.getAddress();
      candidate0.setInUse(false);
      candidate0.getPort();
      candidate0.setBase(candidate1);
      candidate0.setFoundationId((byte)88);
      candidate1.setComponentId((byte)8);
      Candidate candidate2 = candidate1.getBase();
      candidate0.getInUse();
      candidate2.getComponentId();
      candidate1.getPriority();
      candidate1.equals(candidate2);
      candidate2.getFoundationId();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)4;
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("4.0.191.8", 40001);
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, byteArray0);
      byteArray0[1] = (byte)0;
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)3);
      Object object0 = new Object();
      Candidate candidate1 = new Candidate(address0, (short) (-799));
      candidate1.getAddress();
      candidate0.compareTo(candidate1);
      Object object1 = new Object();
      Object object2 = new Object();
      // Undeclared exception!
      try { 
        candidate0.compareTo(object2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class de.javawi.jstun.test.demo.ice.Candidate (java.lang.Object is in module java.base of loader 'bootstrap'; de.javawi.jstun.test.demo.ice.Candidate is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @212f2f2a)
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-58);
      byteArray0[2] = (byte)66;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)7;
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte)0);
      candidate0.getComponentId();
      // Undeclared exception!
      try { 
        candidate0.setComponentId((byte) (-58));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -58 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Address address0 = new Address(0, 0, 1, 1);
      Candidate candidate0 = new Candidate(address0, (short) (-33));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        candidate0.compareTo(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class de.javawi.jstun.test.demo.ice.Candidate (java.lang.Object is in module java.base of loader 'bootstrap'; de.javawi.jstun.test.demo.ice.Candidate is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @212f2f2a)
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-97);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-39);
      byteArray0[3] = (byte)115;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)4;
      byteArray0[6] = (byte)42;
      byteArray0[7] = (byte) (-69);
      byteArray0[8] = (byte)0;
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte)0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        candidate0.compareTo(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class de.javawi.jstun.test.demo.ice.Candidate (java.lang.Object is in module java.base of loader 'bootstrap'; de.javawi.jstun.test.demo.ice.Candidate is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @212f2f2a)
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte) (-70));
      Candidate candidate1 = candidate0.getBase();
      candidate1.compareTo(candidate0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)67;
      byteArray0[1] = (byte)67;
      byteArray0[2] = (byte)67;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)67;
      byteArray0[5] = (byte)67;
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short) (-426));
      candidate0.getComponentId();
      // Undeclared exception!
      try { 
        candidate0.setComponentId((short)410);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 410 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte) (-73));
      candidate0.setPriority((byte) (-73));
      candidate0.getAddress();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte) (-58);
      byteArray0[1] = (byte) (-58);
      byteArray0[2] = (byte)66;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)7;
      byteArray0[5] = (byte)90;
      Address address0 = new Address(byteArray0);
      address0.getBytes();
      Candidate candidate0 = new Candidate(address0, (byte)7);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.Relayed;
      Candidate candidate1 = new Candidate(address0, candidate_CandidateType0, (byte)90, candidate0);
      candidate0.setBase(candidate1);
      address0.toString();
      candidate0.getCandidateType();
      candidate0.setPriority(1979);
      candidate1.setBase(candidate0);
      candidate0.setComponentId((byte)90);
      candidate0.setBase(candidate1);
      candidate0.getFoundationId();
      Candidate candidate2 = candidate1.getBase();
      address0.getBytes();
      candidate1.setPriority((byte)66);
      // Undeclared exception!
      try { 
        candidate2.setComponentId((short)377);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 377 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte) (-73));
      Candidate candidate1 = new Candidate(address0, (byte) (-73));
      boolean boolean0 = candidate1.equals(candidate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Address address1 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address1, (short)4);
      Object object0 = new Object();
      candidate0.equals((Object) null);
      Address address2 = null;
      try {
        address2 = new Address((-502), (-502), (byte) (-73), 912);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Address is malformed.
         //
         verifyException("de.javawi.jstun.util.Address", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short) (-1));
      boolean boolean0 = candidate0.getInUse();
      assertEquals((short) (-1), candidate0.getComponentId());
      assertEquals(0, candidate0.getPriority());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-65);
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)3;
      byteArray0[5] = (byte)88;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-128);
      Address address0 = new Address(byteArray0);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.Local;
      Candidate candidate0 = new Candidate(address0, (byte)8);
      Candidate candidate1 = new Candidate(address0, candidate_CandidateType0, (short)219, candidate0);
      candidate0.getAddress();
      candidate1.setFoundationId(4);
      candidate1.getAddress();
      candidate0.setInUse(false);
      candidate1.setFoundationId((byte)4);
      candidate0.getPort();
      candidate0.setFoundationId((byte)88);
      candidate1.setComponentId((byte)8);
      Candidate candidate2 = candidate1.getBase();
      candidate0.getInUse();
      candidate2.getComponentId();
      candidate1.getPriority();
      candidate1.equals(candidate2);
      int int0 = candidate2.getFoundationId();
      assertEquals((short)8, candidate1.getComponentId());
      assertEquals(88, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short) (-1));
      // Undeclared exception!
      try { 
        candidate0.equals(address0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class de.javawi.jstun.util.Address cannot be cast to class de.javawi.jstun.test.demo.ice.Candidate (de.javawi.jstun.util.Address and de.javawi.jstun.test.demo.ice.Candidate are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @212f2f2a)
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte) (-70));
      int int0 = candidate0.getFoundationId();
      assertEquals((short) (-70), candidate0.getComponentId());
      assertEquals(0, candidate0.getPriority());
      assertEquals(0, int0);
      assertFalse(candidate0.getInUse());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Address address0 = new Address(4, 4, 0, 0);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.ServerReflexive;
      Candidate candidate0 = new Candidate(address0, (short)256);
      candidate0.getAddress();
      Candidate candidate1 = new Candidate(address0, candidate_CandidateType0, (short)16, candidate0);
      candidate0.setComponentId((short)16);
      candidate0.setBase(candidate1);
      candidate0.setInUse(false);
      address0.getInetAddress();
      candidate0.setInUse(false);
      candidate0.setBase(candidate1);
      candidate1.setBase(candidate0);
      candidate1.getFoundationId();
      candidate1.setBase(candidate0);
      candidate0.setComponentId((short)103);
      candidate1.setFoundationId(0);
      int int0 = candidate1.getPort();
      assertEquals((short)103, candidate0.getComponentId());
      assertEquals(40001, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short) (-1));
      Candidate candidate1 = new Candidate(address0, (short) (-1));
      candidate0.setBase(candidate1);
      Candidate candidate2 = candidate0.getBase();
      assertEquals((short) (-1), candidate2.getComponentId());
      assertEquals(0, candidate2.getPriority());
      assertSame(candidate2, candidate1);
      assertFalse(candidate2.getInUse());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)3100);
      int int0 = candidate0.getPort();
      assertEquals(0, candidate0.getPriority());
      assertFalse(candidate0.getInUse());
      assertEquals(40000, int0);
      assertEquals((short)3100, candidate0.getComponentId());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-114);
      byteArray0[1] = (byte) (-31);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)25;
      byteArray0[4] = (byte)86;
      byteArray0[5] = (byte)46;
      byteArray0[6] = (byte)113;
      byteArray0[7] = (byte) (-66);
      Address address0 = new Address(byteArray0);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.ServerReflexive;
      Candidate candidate0 = new Candidate(address0, (byte) (-114));
      Candidate candidate1 = null;
      try {
        candidate1 = new Candidate(address0, candidate_CandidateType0, (short) (-1388), candidate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1388 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)891);
      Candidate candidate1 = candidate0.getBase();
      assertEquals(0, candidate1.getPriority());
      assertFalse(candidate1.getInUse());
      assertEquals((short)891, candidate1.getComponentId());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)1394);
      candidate0.setFoundationId((short)1394);
      // Undeclared exception!
      try { 
        Candidate.CandidateType.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant de.javawi.jstun.test.demo.ice.Candidate.CandidateType.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Address address0 = new Address(1, 1, 1, 0);
      Candidate candidate0 = new Candidate(address0, (short)236);
      candidate0.getCandidateType();
      assertFalse(candidate0.getInUse());
      assertEquals((short)236, candidate0.getComponentId());
      assertEquals(0, candidate0.getPriority());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)3664);
      int int0 = candidate0.getPriority();
      assertFalse(candidate0.getInUse());
      assertEquals(0, int0);
      assertEquals((short)3664, candidate0.getComponentId());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte) (-73));
      candidate0.getAddress();
      assertFalse(candidate0.getInUse());
      assertEquals(0, candidate0.getPriority());
      assertEquals((short) (-73), candidate0.getComponentId());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-31);
      byteArray0[1] = (byte) (-78);
      byteArray0[2] = (byte)68;
      byteArray0[3] = (byte)0;
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte) (-78));
      candidate0.getAddress();
      address0.getInetAddress();
      address0.getBytes();
      address0.getInetAddress();
      address0.getInetAddress();
      candidate0.setInUse(true);
      candidate0.setFoundationId(0);
      address0.getBytes();
      candidate0.setInUse(false);
      candidate0.getPriority();
      candidate0.getAddress();
      Candidate.CandidateType.values();
      candidate0.setComponentId((short)4);
      candidate0.setComponentId((short)63);
      candidate0.getCandidateType();
      candidate0.getPriority();
      Candidate candidate1 = candidate0.getBase();
      int int0 = candidate1.getPriority();
      assertFalse(candidate0.getInUse());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-83);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-104);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short) (-854));
      candidate0.setInUse(false);
      assertEquals((short) (-854), candidate0.getComponentId());
      assertEquals(0, candidate0.getPriority());
      assertFalse(candidate0.getInUse());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)3100);
      candidate0.setInUse(false);
      int int0 = candidate0.getPort();
      assertEquals(0, candidate0.getPriority());
      assertEquals((short)3100, candidate0.getComponentId());
      assertFalse(candidate0.getInUse());
      assertEquals(40000, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.ServerReflexive;
      Candidate candidate0 = new Candidate(address0, (short) (-1736));
      Candidate candidate1 = null;
      try {
        candidate1 = new Candidate(address0, candidate_CandidateType0, (short) (-1736), candidate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1736 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte) (-73);
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte) (-73));
      // Undeclared exception!
      try { 
        candidate0.setComponentId((byte) (-73));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -73 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-58);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)32;
      byteArray0[4] = (byte)24;
      byteArray0[5] = (byte)4;
      byteArray0[6] = (byte)0;
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)980);
      // Undeclared exception!
      try { 
        candidate0.setComponentId((byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.Relayed;
      Candidate candidate0 = new Candidate(address0, (short) (-1386));
      Candidate candidate1 = null;
      try {
        candidate1 = new Candidate(address0, candidate_CandidateType0, (short)3559, candidate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3559 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate.CandidateType candidate_CandidateType0 = Candidate.CandidateType.ServerReflexive;
      Candidate candidate0 = new Candidate(address0, (short)3);
      Candidate candidate1 = new Candidate(address0, candidate_CandidateType0, (short)3, candidate0);
      assertFalse(candidate0.getInUse());
      assertFalse(candidate1.getInUse());
      assertEquals(0, candidate1.getPriority());
      assertEquals((short)3, candidate0.getComponentId());
      assertEquals((short)3, candidate1.getComponentId());
      assertEquals(0, candidate0.getPriority());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)124;
      byteArray0[3] = (byte) (-115);
      byteArray0[4] = (byte)67;
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (byte)67);
      candidate0.getComponentId();
      // Undeclared exception!
      try { 
        candidate0.setComponentId((short)410);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 410 is not between 1 and 256 inclusive.
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Address address0 = new Address(byteArray0);
      Candidate candidate0 = new Candidate(address0, (short)236);
      candidate0.setFoundationId((short)236);
      Address address1 = candidate0.getAddress();
      candidate0.setInUse(false);
      candidate0.setFoundationId(4);
      candidate0.getPort();
      candidate0.setFoundationId(40000);
      candidate0.getBase();
      candidate0.getComponentId();
      // Undeclared exception!
      try { 
        candidate0.equals(address1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class de.javawi.jstun.util.Address cannot be cast to class de.javawi.jstun.test.demo.ice.Candidate (de.javawi.jstun.util.Address and de.javawi.jstun.test.demo.ice.Candidate are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @212f2f2a)
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Candidate candidate0 = null;
      try {
        candidate0 = new Candidate((Address) null, (short)1531);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.javawi.jstun.test.demo.ice.Candidate", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Address address0 = new Address(0, 0, 1, 0);
      Candidate candidate0 = new Candidate(address0, (short) (-720));
      assertEquals((short) (-720), candidate0.getComponentId());
      assertFalse(candidate0.getInUse());
      assertEquals(0, candidate0.getPriority());
  }
}
