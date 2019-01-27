/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 02:15:45 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.Scriptable;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EcmaError_ESTest extends EcmaError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "/=", 1, 1, "/=");
      String string0 = ecmaError0.getSourceName();
      assertEquals("null", ecmaError0.getErrorMessage());
      assertEquals("InternalError", ecmaError0.getName());
      assertEquals(1, ecmaError0.lineNumber());
      assertEquals("/=", string0);
      assertEquals(1, ecmaError0.getColumnNumber());
      assertEquals("/=", ecmaError0.lineSource());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "/=", 1, 1, "/=");
      String string0 = ecmaError0.getName();
      assertEquals("null", ecmaError0.getErrorMessage());
      assertEquals("InternalError", string0);
      assertEquals(1, ecmaError0.getLineNumber());
      assertEquals("/=", ecmaError0.lineSource());
      assertEquals("/=", ecmaError0.getSourceName());
      assertEquals(1, ecmaError0.getColumnNumber());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("05", "", "g ", 1970, "g ", 0);
      String string0 = ecmaError0.getLineSource();
      assertEquals("", ecmaError0.getErrorMessage());
      assertEquals("g ", ecmaError0.getSourceName());
      assertEquals(1970, ecmaError0.lineNumber());
      assertEquals("05", ecmaError0.getName());
      assertEquals(0, ecmaError0.getColumnNumber());
      assertEquals("g ", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("05", "", "g ", 1970, "g ", 0);
      int int0 = ecmaError0.getLineNumber();
      assertEquals("05", ecmaError0.getName());
      assertEquals(0, ecmaError0.getColumnNumber());
      assertEquals(1970, int0);
      assertEquals("g ", ecmaError0.getSourceName());
      assertEquals("", ecmaError0.getErrorMessage());
      assertEquals("g ", ecmaError0.getLineSource());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("D>bUBk]nm=g", "", "", 3602, "", 0);
      ecmaError0.getErrorObject();
      assertEquals("", ecmaError0.sourceName());
      assertEquals(3602, ecmaError0.lineNumber());
      assertEquals(0, ecmaError0.columnNumber());
      assertEquals("D>bUBk]nm=g", ecmaError0.getName());
      assertEquals("", ecmaError0.getErrorMessage());
      assertEquals("", ecmaError0.lineSource());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("D>bUBk]nm=g", "", "", 3602, "", 0);
      String string0 = ecmaError0.details();
      assertEquals(3602, ecmaError0.lineNumber());
      assertEquals("D>bUBk]nm=g: ", string0);
      assertEquals(0, ecmaError0.columnNumber());
      assertEquals("", ecmaError0.getSourceName());
      assertEquals("", ecmaError0.lineSource());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "/=", 1, 1, "/=");
      String string0 = ecmaError0.getErrorMessage();
      assertEquals("InternalError", ecmaError0.getName());
      assertEquals(1, ecmaError0.columnNumber());
      assertEquals("/=", ecmaError0.getLineSource());
      assertEquals("null", string0);
      assertEquals(1, ecmaError0.lineNumber());
      assertEquals("/=", ecmaError0.sourceName());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("(U=.A", "(U=.A", "92JzbRzDS", 676, "(U=.A", 676);
      int int0 = ecmaError0.getColumnNumber();
      assertEquals(676, ecmaError0.lineNumber());
      assertEquals(676, int0);
      assertEquals("(U=.A", ecmaError0.getErrorMessage());
      assertEquals("92JzbRzDS", ecmaError0.getSourceName());
      assertEquals("(U=.A", ecmaError0.getName());
      assertEquals("(U=.A", ecmaError0.lineSource());
  }
}
