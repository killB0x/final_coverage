/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 13:20:25 GMT 2022
 */

package com.mongodb.atlas.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mongodb.atlas.model.Project;
import com.mongodb.atlas.model.ProjectsResult;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProjectsResult_ESTest extends ProjectsResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProjectsResult projectsResult0 = new ProjectsResult();
      List<Project> list0 = projectsResult0.getProjects();
      assertNull(list0);
  }
}
