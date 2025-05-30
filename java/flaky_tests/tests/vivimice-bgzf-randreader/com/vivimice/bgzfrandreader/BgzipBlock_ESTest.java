/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 19:36:06 GMT 2022
 */

package com.vivimice.bgzfrandreader;

import org.junit.Test;
import static org.junit.Assert.*;
import com.vivimice.bgzfrandreader.BgzipBlock;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BgzipBlock_ESTest extends BgzipBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BgzipBlock bgzipBlock0 = new BgzipBlock((-810), 317L, (-810), (-475));
      int int0 = bgzipBlock0.getInputLength();
      assertEquals((-810), bgzipBlock0.getBlockSize());
      assertEquals((-810), bgzipBlock0.getDataLength());
      assertEquals(317L, bgzipBlock0.getDataOffset());
      assertEquals((-475), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BgzipBlock bgzipBlock0 = new BgzipBlock((-810), 317L, (-810), (-475));
      long long0 = bgzipBlock0.getDataOffset();
      assertEquals((-475), bgzipBlock0.getInputLength());
      assertEquals((-810), bgzipBlock0.getBlockSize());
      assertEquals(317L, long0);
      assertEquals((-810), bgzipBlock0.getDataLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BgzipBlock.Builder bgzipBlock_Builder0 = new BgzipBlock.Builder();
      BgzipBlock.Builder bgzipBlock_Builder1 = bgzipBlock_Builder0.dataOffset((-2607L));
      BgzipBlock bgzipBlock0 = bgzipBlock_Builder1.build();
      long long0 = bgzipBlock0.getDataOffset();
      assertEquals(0, bgzipBlock0.getBlockSize());
      assertEquals(0, bgzipBlock0.getInputLength());
      assertEquals((-2607L), long0);
      assertEquals(0, bgzipBlock0.getDataLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BgzipBlock.Builder bgzipBlock_Builder0 = new BgzipBlock.Builder();
      bgzipBlock_Builder0.dataLength(50);
      BgzipBlock bgzipBlock0 = bgzipBlock_Builder0.build();
      int int0 = bgzipBlock0.getDataLength();
      assertEquals(50, int0);
      assertEquals(0, bgzipBlock0.getInputLength());
      assertEquals(0, bgzipBlock0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BgzipBlock bgzipBlock0 = new BgzipBlock((-810), 317L, (-810), (-475));
      int int0 = bgzipBlock0.getDataLength();
      assertEquals((-810), bgzipBlock0.getBlockSize());
      assertEquals((-475), bgzipBlock0.getInputLength());
      assertEquals((-810), int0);
      assertEquals(317L, bgzipBlock0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BgzipBlock bgzipBlock0 = new BgzipBlock(1908, 1908, 1908, 1908);
      int int0 = bgzipBlock0.getBlockSize();
      assertEquals(1908L, bgzipBlock0.getDataOffset());
      assertEquals(1908, int0);
      assertEquals(1908, bgzipBlock0.getInputLength());
      assertEquals(1908, bgzipBlock0.getDataLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BgzipBlock bgzipBlock0 = new BgzipBlock((-810), 317L, (-810), (-475));
      int int0 = bgzipBlock0.getBlockSize();
      assertEquals((-810), int0);
      assertEquals((-810), bgzipBlock0.getDataLength());
      assertEquals(317L, bgzipBlock0.getDataOffset());
      assertEquals((-475), bgzipBlock0.getInputLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BgzipBlock.Builder bgzipBlock_Builder0 = new BgzipBlock.Builder();
      BgzipBlock bgzipBlock0 = bgzipBlock_Builder0.build();
      int int0 = bgzipBlock0.getInputLength();
      assertEquals(0, bgzipBlock0.getBlockSize());
      assertEquals(0, int0);
      assertEquals(0, bgzipBlock0.getDataLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BgzipBlock.Builder bgzipBlock_Builder0 = new BgzipBlock.Builder();
      BgzipBlock bgzipBlock0 = bgzipBlock_Builder0.build();
      bgzipBlock0.getDataOffset();
      assertEquals(0, bgzipBlock0.getBlockSize());
      assertEquals(0, bgzipBlock0.getDataLength());
      assertEquals(0, bgzipBlock0.getInputLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BgzipBlock.Builder bgzipBlock_Builder0 = new BgzipBlock.Builder();
      BgzipBlock bgzipBlock0 = bgzipBlock_Builder0.build();
      int int0 = bgzipBlock0.getBlockSize();
      assertEquals(0, bgzipBlock0.getInputLength());
      assertEquals(0, bgzipBlock0.getDataLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BgzipBlock.Builder bgzipBlock_Builder0 = BgzipBlock.builder();
      assertNotNull(bgzipBlock_Builder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BgzipBlock.Builder bgzipBlock_Builder0 = new BgzipBlock.Builder();
      BgzipBlock.Builder bgzipBlock_Builder1 = bgzipBlock_Builder0.inputLength(1);
      BgzipBlock bgzipBlock0 = bgzipBlock_Builder1.build();
      int int0 = bgzipBlock0.getInputLength();
      assertEquals(0, bgzipBlock0.getDataLength());
      assertEquals(0, bgzipBlock0.getBlockSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BgzipBlock.Builder bgzipBlock_Builder0 = new BgzipBlock.Builder();
      BgzipBlock bgzipBlock0 = bgzipBlock_Builder0.build();
      int int0 = bgzipBlock0.getDataLength();
      assertEquals(0, bgzipBlock0.getInputLength());
      assertEquals(0, int0);
      assertEquals(0, bgzipBlock0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BgzipBlock.Builder bgzipBlock_Builder0 = new BgzipBlock.Builder();
      BgzipBlock.Builder bgzipBlock_Builder1 = bgzipBlock_Builder0.blockSize(1);
      assertSame(bgzipBlock_Builder1, bgzipBlock_Builder0);
  }
}
