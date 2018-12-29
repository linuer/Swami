/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:17:03 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.Name;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BreakStatement_ESTest extends BreakStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement((-64));
      StringBuilder stringBuilder0 = new StringBuilder("");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      breakStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-64\tBREAK -64 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals((-64), breakStatement0.getPosition());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement();
      Name name0 = new Name();
      breakStatement0.setBreakLabel(name0);
      assertEquals(1, name0.depth());
      
      String string0 = breakStatement0.toSource();
      assertEquals("break <null>;\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement((-64));
      LetNode letNode0 = new LetNode(27, 23);
      breakStatement0.setBreakTarget(letNode0);
      assertEquals(121, breakStatement0.getType());
      assertEquals((-64), breakStatement0.getPosition());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement((-64));
      Name name0 = new Name(8, 988, "");
      breakStatement0.setBreakLabel(name0);
      StringBuilder stringBuilder0 = new StringBuilder("");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      breakStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-64\tBREAK -64 1\n8\t  NAME 72 0 \n", astNode_DebugPrintVisitor0.toString());
      assertEquals((-64), breakStatement0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement((-64));
      breakStatement0.getBreakTarget();
      assertEquals("121", breakStatement0.toString());
      assertEquals((-64), breakStatement0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement((-64));
      breakStatement0.getBreakLabel();
      assertEquals((-64), breakStatement0.getPosition());
      assertEquals(121, breakStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement((-1), (-1));
      assertEquals((-1), breakStatement0.getLength());
      assertEquals((-1), breakStatement0.getPosition());
      assertEquals("121", breakStatement0.toString());
  }
}