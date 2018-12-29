/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:18:20 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.WhileLoop;
import org.mozilla.javascript.ast.Yield;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WhileLoop_ESTest extends WhileLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop();
      StringBuilder stringBuilder0 = new StringBuilder(27);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        whileLoop0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.WhileLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(0);
      whileLoop0.setCondition(arrayLiteral0);
      // Undeclared exception!
      try { 
        whileLoop0.toSource(20);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.WhileLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop();
      Yield yield0 = new Yield((-2), 22);
      whileLoop0.setCondition(yield0);
      StringBuilder stringBuilder0 = new StringBuilder(27);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        whileLoop0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.WhileLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop(3, 3);
      assertEquals("118", whileLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop(88);
      assertEquals("118", whileLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop();
      whileLoop0.getCondition();
      assertEquals(118, whileLoop0.getType());
  }
}