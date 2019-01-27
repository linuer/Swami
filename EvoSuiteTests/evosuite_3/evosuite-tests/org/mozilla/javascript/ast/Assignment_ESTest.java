/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:38:44 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.Assignment;
import org.mozilla.javascript.ast.CatchClause;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Assignment_ESTest extends Assignment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CatchClause catchClause0 = new CatchClause(46);
      Assignment assignment0 = new Assignment(catchClause0, catchClause0);
      Assignment assignment1 = new Assignment(4, catchClause0, assignment0, 1);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CatchClause catchClause0 = new CatchClause(46);
      Assignment assignment0 = new Assignment(catchClause0, catchClause0);
      Assignment assignment1 = new Assignment(11, (-436), assignment0, catchClause0);
      assertEquals(2, Node.END_RETURNS);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Assignment assignment0 = new Assignment(2, 16);
      assertEquals(14, Node.CATCH_SCOPE_PROP);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Assignment assignment0 = new Assignment(4);
      assertEquals(12, Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Assignment assignment0 = new Assignment();
      assertEquals(0, Node.NON_SPECIALCALL);
  }
}
