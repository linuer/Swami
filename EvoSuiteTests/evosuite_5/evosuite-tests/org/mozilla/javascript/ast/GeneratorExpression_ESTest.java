/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 15:57:18 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.GeneratorExpression;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GeneratorExpression_ESTest extends GeneratorExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression(3520);
      ContinueStatement continueStatement0 = new ContinueStatement(2);
      generatorExpression0.setFilter(continueStatement0);
      generatorExpression0.setResult(continueStatement0);
      StringBuilder stringBuilder0 = new StringBuilder("org.mozilla.javascript.ast.GeneratorExpression");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      generatorExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("org.mozilla.javascript.ast.GeneratorExpression3520\tGENEXPR 3520 1\n2\t  CONTINUE -3518 -1\n2\t  CONTINUE -3518 -1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals((-1), generatorExpression0.getFilterLp());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression(3521, 3521);
      ContinueStatement continueStatement0 = new ContinueStatement(2);
      generatorExpression0.setResult(continueStatement0);
      StringBuilder stringBuilder0 = new StringBuilder();
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(2, 119);
      generatorExpression0.addLoop(generatorExpressionLoop0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        generatorExpression0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.GeneratorExpressionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      StringBuilder stringBuilder0 = new StringBuilder("(continue;\n if (continue;\n))");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        generatorExpression0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.GeneratorExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      ContinueStatement continueStatement0 = new ContinueStatement(1, 17);
      generatorExpression0.setResult(continueStatement0);
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(2, 25);
      generatorExpression0.addLoop(generatorExpressionLoop0);
      // Undeclared exception!
      try { 
        generatorExpression0.toSource(19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.GeneratorExpressionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      ContinueStatement continueStatement0 = new ContinueStatement(1, 17);
      generatorExpression0.setResult(continueStatement0);
      String string0 = generatorExpression0.toSource(19);
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals("(continue;\n)", string0);
      assertEquals("163", generatorExpression0.toString());
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals((-1), generatorExpression0.getIfPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      LinkedList<GeneratorExpressionLoop> linkedList0 = new LinkedList<GeneratorExpressionLoop>();
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(2, 1);
      linkedList0.offer(generatorExpressionLoop0);
      generatorExpression0.setLoops(linkedList0);
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals(163, generatorExpression0.getType());
      assertEquals((-1), generatorExpression0.getFilterRp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression((-1), (-1));
      assertEquals((-1), generatorExpression0.getIfPosition());
      
      generatorExpression0.setIfPosition(1);
      assertEquals(1, generatorExpression0.getIfPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      assertEquals((-1), generatorExpression0.getFilterRp());
      
      generatorExpression0.setFilterRp(0);
      assertEquals(0, generatorExpression0.getFilterRp());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      assertEquals((-1), generatorExpression0.getFilterLp());
      
      generatorExpression0.setFilterLp(0);
      assertEquals(0, generatorExpression0.getFilterLp());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      ContinueStatement continueStatement0 = new ContinueStatement(2, 16);
      generatorExpression0.setFilter(continueStatement0);
      assertEquals(1, continueStatement0.depth());
      
      generatorExpression0.setResult(continueStatement0);
      String string0 = generatorExpression0.toSource();
      assertEquals("(continue;\n if (continue;\n))", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression((-2737));
      generatorExpression0.getResult();
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals(163, generatorExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      generatorExpression0.getLoops();
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals(163, generatorExpression0.getType());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals((-1), generatorExpression0.getFilterLp());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      int int0 = generatorExpression0.getIfPosition();
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals(163, generatorExpression0.getType());
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression(163, 163);
      int int0 = generatorExpression0.getFilterRp();
      assertEquals((-1), int0);
      assertEquals(163, generatorExpression0.getType());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals((-1), generatorExpression0.getFilterLp());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      int int0 = generatorExpression0.getFilterLp();
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals("163", generatorExpression0.toString());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      generatorExpression0.getFilter();
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals(163, generatorExpression0.getType());
      assertEquals((-1), generatorExpression0.getFilterLp());
  }
}
