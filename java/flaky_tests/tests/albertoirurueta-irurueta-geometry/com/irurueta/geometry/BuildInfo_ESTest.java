/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 07:05:58 GMT 2022
 */

package com.irurueta.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import com.irurueta.geometry.BuildInfo;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BuildInfo_ESTest extends BuildInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuildInfo buildInfo0 = BuildInfo.getInstance();
      BuildInfo buildInfo1 = BuildInfo.getInstance();
      assertSame(buildInfo1, buildInfo0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuildInfo buildInfo0 = BuildInfo.getInstance();
      String string0 = buildInfo0.getCommit();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuildInfo buildInfo0 = BuildInfo.getInstance();
      String string0 = buildInfo0.getBranch();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BuildInfo buildInfo0 = BuildInfo.getInstance();
      Date date0 = buildInfo0.getBuildTimestamp();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BuildInfo buildInfo0 = BuildInfo.getInstance();
      String string0 = buildInfo0.getArtifactId();
      assertEquals("irurueta-geometry", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BuildInfo buildInfo0 = BuildInfo.getInstance();
      String string0 = buildInfo0.getVersion();
      assertEquals("1.1.0", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BuildInfo buildInfo0 = BuildInfo.getInstance();
      String string0 = buildInfo0.getBuildNumber();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BuildInfo buildInfo0 = BuildInfo.getInstance();
      String string0 = buildInfo0.getGroupId();
      assertEquals("com.irurueta", string0);
  }
}
