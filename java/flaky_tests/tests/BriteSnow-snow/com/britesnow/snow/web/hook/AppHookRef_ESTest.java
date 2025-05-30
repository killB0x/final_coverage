/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 20:59:38 GMT 2022
 */

package com.britesnow.snow.web.hook;

import org.junit.Test;
import static org.junit.Assert.*;
import com.britesnow.snow.web.handler.ParamDef;
import com.britesnow.snow.web.hook.AppHookRef;
import com.britesnow.snow.web.hook.AppPhase;
import com.britesnow.snow.web.hook.On;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AppHookRef_ESTest extends AppHookRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      AppPhase appPhase0 = AppPhase.INIT;
      On on0 = On.AFTER;
      AppHookRef appHookRef0 = new AppHookRef(class0, (Method) null, (ParamDef[]) null, appPhase0, on0);
      AppPhase appPhase1 = appHookRef0.getStep();
      assertSame(appPhase1, appPhase0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      On on0 = On.AFTER;
      AppHookRef appHookRef0 = new AppHookRef((Class) null, (Method) null, (ParamDef[]) null, (AppPhase) null, on0);
      appHookRef0.getStep();
  }
}
