/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:56:19 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.VariableInitializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VariableInitializer_ESTest extends VariableInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer();
      NumberLiteral numberLiteral0 = new NumberLiteral();
      variableInitializer0.setTarget(numberLiteral0);
      variableInitializer0.setInitializer(numberLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      variableInitializer0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tVAR -1 1\n-1\t  NUMBER 0 1\n-1\t  NUMBER 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("123", variableInitializer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer();
      NumberLiteral numberLiteral0 = new NumberLiteral();
      variableInitializer0.setTarget(numberLiteral0);
      variableInitializer0.setInitializer(numberLiteral0);
      String string0 = variableInitializer0.toSource(11);
      assertEquals("                      <null> = <null>", string0);
      assertEquals(123, variableInitializer0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer();
      // Undeclared exception!
      try { 
        variableInitializer0.setTarget((AstNode) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid target arg
         //
         verifyException("org.mozilla.javascript.ast.VariableInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer();
      // Undeclared exception!
      try { 
        variableInitializer0.setNodeType(8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid node type
         //
         verifyException("org.mozilla.javascript.ast.VariableInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer();
      variableInitializer0.setNodeType(123);
      assertEquals(123, variableInitializer0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(1, 1);
      NumberLiteral numberLiteral0 = new NumberLiteral(22, "", 0.0);
      variableInitializer0.setInitializer(numberLiteral0);
      assertEquals(21, numberLiteral0.getPosition());
      assertEquals("123", variableInitializer0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(1, 1);
      variableInitializer0.getTarget();
      assertEquals("123", variableInitializer0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(2581);
      variableInitializer0.getInitializer();
      assertEquals(123, variableInitializer0.getType());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer();
      boolean boolean0 = variableInitializer0.isDestructuring();
      assertEquals("123", variableInitializer0.toString());
      assertTrue(boolean0);
  }
}