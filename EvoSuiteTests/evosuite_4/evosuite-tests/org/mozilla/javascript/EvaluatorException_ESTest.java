/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:44:53 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.EvaluatorException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EvaluatorException_ESTest extends EvaluatorException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("");
      String string0 = evaluatorException0.getSourceName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("");
      String string0 = evaluatorException0.getLineSource();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("");
      int int0 = evaluatorException0.getLineNumber();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("F", "", 41);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("");
      int int0 = evaluatorException0.getColumnNumber();
      assertEquals(0, int0);
  }
}
