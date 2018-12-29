/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:26:35 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.WithStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WithStatement_ESTest extends WithStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      Label label0 = new Label(3);
      withStatement0.setExpression(label0);
      withStatement0.setStatement(label0);
      String string0 = withStatement0.debugPrint();
      assertEquals((-1), withStatement0.getRp());
      assertEquals("-1\tWITH -1 1\n3\t  LABEL 4 -1\n3\t  LABEL 4 -1\n", string0);
      assertEquals((-1), withStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      Label label0 = new Label(3);
      withStatement0.setExpression(label0);
      withStatement0.setStatement(label0);
      String string0 = withStatement0.toSource(9);
      assertEquals("                  with (null:\n) \n                    null:\n", string0);
      assertEquals((-1), withStatement0.getRp());
      assertEquals(124, withStatement0.getType());
      assertEquals((-1), withStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      Label label0 = new Label(3);
      label0.setType(130);
      withStatement0.setExpression(label0);
      withStatement0.setStatement(label0);
      String string0 = withStatement0.toSource(9);
      assertEquals("                  with (null:\n) null:\n", string0);
      assertEquals((-1), withStatement0.getLp());
      assertEquals((-1), withStatement0.getRp());
      assertEquals("124", withStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement(0);
      assertEquals((-1), withStatement0.getRp());
      
      withStatement0.setRp(0);
      assertEquals(0, withStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      withStatement0.setParens((-1), (-1));
      assertEquals((-1), withStatement0.getLp());
      assertEquals((-1), withStatement0.getRp());
      assertEquals("124", withStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement(5170);
      withStatement0.setLp(5170);
      assertEquals(5170, withStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      withStatement0.getStatement();
      assertEquals((-1), withStatement0.getRp());
      assertEquals((-1), withStatement0.getLp());
      assertEquals(124, withStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement(0);
      int int0 = withStatement0.getRp();
      assertEquals((-1), int0);
      assertEquals(124, withStatement0.getType());
      assertEquals((-1), withStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      int int0 = withStatement0.getLp();
      assertEquals((-1), withStatement0.getRp());
      assertEquals((-1), int0);
      assertEquals(124, withStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement(403, 403);
      assertEquals((-1), withStatement0.getLp());
      assertEquals(124, withStatement0.getType());
      assertEquals((-1), withStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      withStatement0.getExpression();
      assertEquals((-1), withStatement0.getRp());
      assertEquals("124", withStatement0.toString());
      assertEquals((-1), withStatement0.getLp());
  }
}