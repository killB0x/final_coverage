/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 23:18:33 GMT 2022
 */

package com.github.psambit9791.wavfile;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.psambit9791.wavfile.WavFileException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WavFileException_ESTest extends WavFileException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WavFileException wavFileException0 = new WavFileException();
      WavFileException wavFileException1 = new WavFileException(wavFileException0);
      assertFalse(wavFileException1.equals((Object)wavFileException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WavFileException wavFileException0 = new WavFileException();
      WavFileException wavFileException1 = new WavFileException("", wavFileException0);
      assertFalse(wavFileException1.equals((Object)wavFileException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WavFileException wavFileException0 = new WavFileException("4rF");
  }
}
