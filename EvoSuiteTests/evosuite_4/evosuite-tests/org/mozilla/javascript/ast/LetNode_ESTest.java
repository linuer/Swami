/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:20:00 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.VariableDeclaration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LetNode_ESTest extends LetNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LetNode letNode0 = new LetNode((-1));
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      letNode0.setVariables(variableDeclaration0);
      letNode0.setBody(variableDeclaration0);
      StringBuilder stringBuilder0 = new StringBuilder("                                let () ");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      letNode0.visit(astNode_DebugPrintVisitor0);
      assertEquals("                                let () -1\tLETEXPR -1 1\n-1\t  VAR 0 1\n-1\t  VAR 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("159", letNode0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LetNode letNode0 = new LetNode((-1));
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      letNode0.setVariables(variableDeclaration0);
      letNode0.setBody(variableDeclaration0);
      letNode0.toSource(659);
      assertEquals((-1), letNode0.getRp());
      assertEquals("159", letNode0.toString());
      assertEquals((-1), letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      letNode0.setRp((-1));
      assertEquals("159", letNode0.toString());
      assertEquals((-1), letNode0.getLp());
      assertEquals((-1), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      assertEquals((-1), letNode0.getLp());
      
      letNode0.setLp(0);
      assertEquals(0, letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LetNode letNode0 = new LetNode(3313, 3313);
      letNode0.getVariables();
      assertEquals("159", letNode0.toString());
      assertEquals((-1), letNode0.getLp());
      assertEquals((-1), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      int int0 = letNode0.getRp();
      assertEquals((-1), int0);
      assertEquals((-1), letNode0.getLp());
      assertEquals(159, letNode0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      int int0 = letNode0.getLp();
      assertEquals((-1), int0);
      assertEquals(159, letNode0.getType());
      assertEquals((-1), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LetNode letNode0 = new LetNode(2882, 2882);
      letNode0.setParens(2882, 2048);
      assertEquals(2882, letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      letNode0.getBody();
      assertEquals((-1), letNode0.getRp());
      assertEquals((-1), letNode0.getLp());
      assertEquals(159, letNode0.getType());
  }
}
