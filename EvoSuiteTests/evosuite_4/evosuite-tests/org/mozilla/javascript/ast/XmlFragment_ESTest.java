/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:57:55 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.Assignment;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.XmlExpression;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlFragment_ESTest extends XmlFragment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlExpression xmlExpression0 = new XmlExpression(2224, 2224);
      assertEquals("146", xmlExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlExpression xmlExpression0 = new XmlExpression();
      assertEquals("146", xmlExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Scope scope0 = new Scope();
      Assignment assignment0 = new Assignment((-1282), scope0, scope0, (-1364));
      XmlExpression xmlExpression0 = new XmlExpression((-1282), assignment0);
      assertEquals(146, xmlExpression0.getType());
  }
}
