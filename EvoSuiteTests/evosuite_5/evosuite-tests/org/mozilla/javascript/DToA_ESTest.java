/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 21:59:13 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.DToA;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DToA_ESTest extends DToA_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      DToA.roundOff(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      CharBuffer charBuffer0 = CharBuffer.allocate(2261);
      StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
      DToA.JS_dtoa((-4684.273067472269), 1075, true, 1075, booleanArray0, stringBuilder0);
      DToA.roundOff(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "10");
      DToA.JS_dtostr(stringBuilder0, 2, 1026, (-1024.74899));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(3);
      DToA.JS_dtostr(stringBuilder0, 3, 3, 3734.19);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "10");
      DToA.JS_dtostr(stringBuilder0, 2, (-6), 0.3798034);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "10");
      DToA.JS_dtostr(stringBuilder0, 2, 7, 0.3798034);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(0);
      DToA.JS_dtostr(stringBuilder0, 0, 1529, 1529);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DToA.JS_dtobasestr(27, 1011.5052060439668);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DToA.JS_dtobasestr(18, 623.8467854528043);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DToA.JS_dtobasestr(21, 7.8745937555E-314);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DToA.JS_dtobasestr(27, 27);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DToA.JS_dtobasestr(17, (-2415.527785903));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DToA.JS_dtobasestr(21, 0.0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DToA.JS_dtobasestr(500, (-1838.083954));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad base: 500
         //
         verifyException("org.mozilla.javascript.DToA", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "10");
      DToA.JS_dtoa(0.3798034, 7, true, 21, booleanArray0, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("-Infinity");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
      boolean[] booleanArray0 = new boolean[9];
      DToA.JS_dtoa((-4921.2504362), (-3565), false, (-1150), booleanArray0, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[12];
      // Undeclared exception!
      try { 
        DToA.JS_dtoa(6.838463E-315, 0, false, 0, booleanArray0, (StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.DToA", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      StringBuilder stringBuilder0 = new StringBuilder();
      DToA.JS_dtoa((-1.0E21), 0, false, 0, booleanArray0, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[14];
      // Undeclared exception!
      try { 
        DToA.JS_dtoa((-1.0E21), 9, true, 0, booleanArray0, (StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.DToA", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("-Infinity");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
      boolean[] booleanArray0 = new boolean[9];
      DToA.JS_dtoa((-1150), 2, false, 2, booleanArray0, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("-Infinity");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
      DToA.JS_dtostr(stringBuilder0, 4, (-982), (-1150));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(4);
      boolean[] booleanArray0 = new boolean[9];
      DToA.JS_dtoa(1529, 4, false, 4, booleanArray0, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      StringBuilder stringBuilder0 = new StringBuilder("x;&X8}U@*W[Z2I/V");
      DToA.JS_dtoa(11, 4, false, 4, booleanArray0, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("tB\"aQw~>Rc1E=Ux");
      DToA.JS_dtostr(stringBuilder0, 4, 4, '\\');
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(27);
      boolean[] booleanArray0 = new boolean[8];
      // Undeclared exception!
      try { 
        DToA.JS_dtoa(5.86986009793E-313, 5, false, 0, booleanArray0, stringBuilder0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Negative exponent
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      // Undeclared exception!
      try { 
        DToA.JS_dtoa(0.9999999999999147, 33, false, (-2137827564), booleanArray0, (StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.DToA", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      DToA.JS_dtostr(stringBuilder0, 4, 0, 1.5086063826E-314);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("tB\"aQw~>Rc1E=Ux");
      DToA.JS_dtostr(stringBuilder0, 0, (-2560), 3.74786430697E-313);
      assertEquals("t.B\"aQw~>Rc1E=Ux374786430697e-313", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "10");
      int int0 = DToA.JS_dtoa(0.0, 10, false, 1, booleanArray0, stringBuilder0);
      assertEquals("0", stringBuilder0.toString());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("tB\"aQw~>Rc1E=Ux");
      DToA.JS_dtostr(stringBuilder0, 0, (-2590), Double.NaN);
      assertEquals("tB\"aQw~>Rc1E=UxNaN", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DToA dToA0 = new DToA();
  }
}