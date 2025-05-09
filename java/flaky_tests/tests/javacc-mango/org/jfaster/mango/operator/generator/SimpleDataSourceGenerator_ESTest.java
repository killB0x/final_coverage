/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:25:11 GMT 2022
 */

package org.jfaster.mango.operator.generator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.binding.DefaultInvocationContext;
import org.jfaster.mango.datasource.DataSourceFactoryGroup;
import org.jfaster.mango.datasource.DataSourceType;
import org.jfaster.mango.operator.generator.SimpleDataSourceGenerator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleDataSourceGenerator_ESTest extends SimpleDataSourceGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataSourceType dataSourceType0 = DataSourceType.MASTER;
      SimpleDataSourceGenerator simpleDataSourceGenerator0 = new SimpleDataSourceGenerator((DataSourceFactoryGroup) null, dataSourceType0, (String) null);
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      String string0 = simpleDataSourceGenerator0.getDataSourceFactoryName(defaultInvocationContext0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataSourceFactoryGroup dataSourceFactoryGroup0 = new DataSourceFactoryGroup();
      DataSourceType dataSourceType0 = DataSourceType.MASTER;
      SimpleDataSourceGenerator simpleDataSourceGenerator0 = new SimpleDataSourceGenerator(dataSourceFactoryGroup0, dataSourceType0, "");
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      String string0 = simpleDataSourceGenerator0.getDataSourceFactoryName(defaultInvocationContext0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataSourceFactoryGroup dataSourceFactoryGroup0 = new DataSourceFactoryGroup();
      DataSourceType dataSourceType0 = DataSourceType.MASTER;
      SimpleDataSourceGenerator simpleDataSourceGenerator0 = new SimpleDataSourceGenerator(dataSourceFactoryGroup0, dataSourceType0, "org.jfaster.mango.util.logging.Slf4JLoggerFactory$1");
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      String string0 = simpleDataSourceGenerator0.getDataSourceFactoryName(defaultInvocationContext0);
      assertEquals("org.jfaster.mango.util.logging.Slf4JLoggerFactory$1", string0);
  }
}
