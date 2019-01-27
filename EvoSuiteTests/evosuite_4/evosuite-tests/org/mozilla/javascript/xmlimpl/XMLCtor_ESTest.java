/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 14:30:32 GMT 2018
 */

package org.mozilla.javascript.xmlimpl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLCtor;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLCtor_ESTest extends XMLCtor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 0, 8);
      xMLCtor0.setInstanceIdValue(5, xmlNode0);
      assertEquals(8, xMLCtor0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.mozilla.javascript.xmlimpl.XmlProcessor", "org.mozilla.javascript.xmlimpl.XmlProcessor");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 105, 0);
      // Undeclared exception!
      try { 
        xMLCtor0.setInstanceIdValue(10, xmlNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 0, 8);
      // Undeclared exception!
      try { 
        xMLCtor0.setInstanceIdValue(9, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 0, 8);
      // Undeclared exception!
      try { 
        xMLCtor0.setInstanceIdValue(8, "tByHW^OCT@s$Cy)'qA");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.mozilla.javascript.xmlimpl.XmlProcessor", "org.mozilla.javascript.xmlimpl.XmlProcessor");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 1, 0);
      // Undeclared exception!
      try { 
        xMLCtor0.setInstanceIdValue(7, xmlNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.ozilla.javascript.xmlimpl.XmlProcessor", "org.ozilla.javascript.xmlimpl.XmlProcessor");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 1, 8);
      // Undeclared exception!
      try { 
        xMLCtor0.setInstanceIdValue(6, xmlNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.mozilla.javWscript.xmlimpl.XmlProcsso", "org.mozilla.javWscript.xmlimpl.XmlProcsso");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 4, 0);
      // Undeclared exception!
      try { 
        xMLCtor0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "org.mozilla.javascript.xmlimpl.XmlProcessor");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 8, 8);
      // Undeclared exception!
      try { 
        xMLCtor0.getInstanceIdValue(10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.mozllajavWscript.xmlimpl.XmlP5ocsso", "org.mozllajavWscript.xmlimpl.XmlP5ocsso");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 4, 0);
      // Undeclared exception!
      try { 
        xMLCtor0.getInstanceIdValue(9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 1, 1);
      // Undeclared exception!
      try { 
        xMLCtor0.getInstanceIdValue(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.mozlla.javWscript.xmlimpl.XmlProcsso", "org.mozlla.javWscript.xmlimpl.XmlProcsso");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 4, 0);
      // Undeclared exception!
      try { 
        xMLCtor0.getInstanceIdValue(7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.mozlla.javWscript.xmlimpl.XmlProcsso", "org.mozlla.javWscript.xmlimpl.XmlProcsso");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 4, 0);
      // Undeclared exception!
      try { 
        xMLCtor0.getInstanceIdValue(6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "org.mozilla.javascript.xmlimpl.XmlProcessor");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 1, 1);
      Object object0 = xMLCtor0.getInstanceIdValue(4);
      boolean boolean0 = xMLCtor0.hasInstance(((Undefined) object0).SCRIPTABLE_UNDEFINED);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.ozilla.javascript.xmlimpl.XmlProcessor", "org.ozilla.javascript.xmlimpl.XmlProcessor");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xML0, 1, 8);
      // Undeclared exception!
      try { 
        xMLCtor0.getIds();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Context context0 = Context.getCurrentContext();
      XMLCtor xMLCtor0 = new XMLCtor(xML0, context0, 2, 2);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(xMLCtor0, (Object) null, 8, "language version", 152, xML0);
      // Undeclared exception!
      try { 
        xMLCtor0.execIdCall(idFunctionObjectES6_0, context0, xML0, (Scriptable) null, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=8 MASTER=org.mozilla.javascript.xmlimpl.XMLCtor@a
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }
}
