/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:52:07 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.EmptyStatement;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NewExpression;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ElementGet_ESTest extends ElementGet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet(0);
      ExpressionStatement expressionStatement0 = new ExpressionStatement(elementGet0);
      // Undeclared exception!
      try { 
        expressionStatement0.debugPrint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ElementGet", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmptyStatement emptyStatement0 = new EmptyStatement();
      Name name0 = new Name((-965), "V1:fF?|(dUvyL1lw!");
      ElementGet elementGet0 = new ElementGet(emptyStatement0, name0);
      String string0 = elementGet0.toSource((-1));
      assertEquals(0, emptyStatement0.getPosition());
      assertEquals(";\n[V1:fF?|(dUvyL1lw!]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContinueStatement continueStatement0 = new ContinueStatement(3284, 0);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(0);
      ElementGet elementGet0 = new ElementGet(continueStatement0, arrayComprehensionLoop0);
      elementGet0.setRb(27);
      assertEquals(1, continueStatement0.depth());
      assertEquals(27, elementGet0.getRb());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      elementGet0.setLb((-572));
      assertEquals((-572), elementGet0.getLb());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      ElementGet elementGet0 = new ElementGet(newExpression0, newExpression0);
      int int0 = elementGet0.getRb();
      assertEquals((-1), int0);
      assertEquals((-1), elementGet0.getLb());
      assertEquals("36", elementGet0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet((-1));
      int int0 = elementGet0.getLb();
      assertEquals("36", elementGet0.toString());
      assertEquals((-1), int0);
      assertEquals((-1), elementGet0.getRb());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Label label0 = new Label(95);
      ElementGet elementGet0 = new ElementGet(label0, label0);
      AstNode astNode0 = elementGet0.getElement();
      assertNotNull(astNode0);
      assertEquals((-1), elementGet0.getRb());
      assertEquals(36, elementGet0.getType());
      assertEquals((-1), elementGet0.getLb());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Name name0 = new Name(2591, 163);
      ElementGet elementGet0 = new ElementGet(name0, name0);
      StringBuilder stringBuilder0 = new StringBuilder(1);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      elementGet0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tGETELEM -1 1\n2591\t  NAME 2592 163 null\n2591\t  NAME 2592 163 null\n", astNode_DebugPrintVisitor0.toString());
      assertEquals((-1), elementGet0.getLb());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet((-229), (-229));
      assertEquals((-1), elementGet0.getLb());
      assertEquals("36", elementGet0.toString());
      assertEquals((-1), elementGet0.getRb());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      elementGet0.getTarget();
      assertEquals((-1), elementGet0.getRb());
      assertEquals("36", elementGet0.toString());
      assertEquals((-1), elementGet0.getLb());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet(0);
      elementGet0.setParens(0, 27);
      assertEquals(27, elementGet0.getRb());
  }
}