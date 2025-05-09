/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 22:13:38 GMT 2022
 */

package net.named_data.jndn.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import net.named_data.jndn.util.BoostInfoParser;
import net.named_data.jndn.util.BoostInfoTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BoostInfoParser_ESTest extends BoostInfoParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read(";t.e&YL}`iezER.'", ";t.e&YL}`iezER.'");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read("^\tYM", "}85O>Yc");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      boostInfoParser0.write("|H:L");
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read("|H:L");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      // Undeclared exception!
      try { 
        boostInfoParser0.write((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        boostInfoParser0.write("HV9P9x^vxWe\"+.*F?_");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      // Undeclared exception!
      try { 
        boostInfoParser0.read((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      // Undeclared exception!
      try { 
        boostInfoParser0.read((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      boostInfoParser0.write("\"u[");
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        boostInfoParser0.read("\"u[");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read("eZPLe \")N0L.-.7]E", "HV9P9x^vxWe\"+.*F?_");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      // Undeclared exception!
      try { 
        boostInfoParser0.read("::9== }", "::9== }");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // BoostInfoParser: input line is malformed
         //
         verifyException("net.named_data.jndn.util.BoostInfoParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read("}\n", "}\n");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read("{ ST-b^/rwSF1g_z", "{ ST-b^/rwSF1g_z");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read(">\"lA\"kEPH2(6~.", ">\"lA\"kEPH2(6~.");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read("'^B\"UX0U5X^&~oW .", "RXj(nPLvw){I,NXt~");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read("cXBM;7", "cXBM;7");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.read("yBzczc {", "yBzczc {");
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      try { 
        boostInfoParser0.read("#.f5");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      BoostInfoTree boostInfoTree0 = boostInfoParser0.getRoot();
      assertEquals("", boostInfoTree0.getValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      try { 
        boostInfoParser0.read("#include", "#include");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BoostInfoParser boostInfoParser0 = new BoostInfoParser();
      try { 
        boostInfoParser0.write("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }
}
