/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 09:12:28 GMT 2022
 */

package io.github.rcarlosdasilva.kits.net.ua;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.rcarlosdasilva.kits.net.ua.PatternBasedVersionFetcher;
import io.github.rcarlosdasilva.kits.net.ua.SequentialVersionFetcher;
import io.github.rcarlosdasilva.kits.net.ua.Version;
import io.github.rcarlosdasilva.kits.net.ua.VersionFetcher;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SequentialVersionFetcher_ESTest extends SequentialVersionFetcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VersionFetcher[] versionFetcherArray0 = new VersionFetcher[8];
      PatternBasedVersionFetcher patternBasedVersionFetcher0 = new PatternBasedVersionFetcher("'$B'gj_v:/xvX*");
      SequentialVersionFetcher sequentialVersionFetcher0 = new SequentialVersionFetcher(patternBasedVersionFetcher0, versionFetcherArray0);
      // Undeclared exception!
      try { 
        sequentialVersionFetcher0.version("'$B'gj_v:/xvX*");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.rcarlosdasilva.kits.net.ua.SequentialVersionFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PatternBasedVersionFetcher patternBasedVersionFetcher0 = new PatternBasedVersionFetcher("io.github.rcarlosdasilva.kits.net.ua.Ve5sionFetcherFomMap");
      VersionFetcher[] versionFetcherArray0 = new VersionFetcher[0];
      SequentialVersionFetcher sequentialVersionFetcher0 = new SequentialVersionFetcher(patternBasedVersionFetcher0, versionFetcherArray0);
      // Undeclared exception!
      try { 
        sequentialVersionFetcher0.version("io.github.rcarlosdasilva.kits.net.ua.Ve5sionFetcherFomMap");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // No group 1
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SequentialVersionFetcher sequentialVersionFetcher0 = null;
      try {
        sequentialVersionFetcher0 = new SequentialVersionFetcher((VersionFetcher) null, (VersionFetcher[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.rcarlosdasilva.kits.net.ua.SequentialVersionFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("j/:cd%X", 31);
      PatternBasedVersionFetcher patternBasedVersionFetcher0 = new PatternBasedVersionFetcher(pattern0);
      VersionFetcher[] versionFetcherArray0 = new VersionFetcher[7];
      versionFetcherArray0[0] = (VersionFetcher) patternBasedVersionFetcher0;
      versionFetcherArray0[1] = (VersionFetcher) patternBasedVersionFetcher0;
      versionFetcherArray0[2] = (VersionFetcher) patternBasedVersionFetcher0;
      versionFetcherArray0[3] = (VersionFetcher) patternBasedVersionFetcher0;
      versionFetcherArray0[4] = (VersionFetcher) patternBasedVersionFetcher0;
      versionFetcherArray0[5] = (VersionFetcher) patternBasedVersionFetcher0;
      versionFetcherArray0[6] = (VersionFetcher) patternBasedVersionFetcher0;
      SequentialVersionFetcher sequentialVersionFetcher0 = new SequentialVersionFetcher(patternBasedVersionFetcher0, versionFetcherArray0);
      Version version0 = sequentialVersionFetcher0.version("j+60");
      assertNull(version0);
  }
}
