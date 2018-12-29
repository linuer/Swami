/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 21:25:51 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyledEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.Menubar;
import org.mozilla.javascript.tools.debugger.SwingGui;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Menubar_ESTest extends Menubar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Menubar menubar0 = new Menubar((SwingGui) null);
      JMenu jMenu0 = menubar0.getDebugMenu();
      assertFalse(jMenu0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Menubar menubar0 = new Menubar((SwingGui) null);
      menubar0.addFile("PI");
      menubar0.addFile("PI");
      menubar0.addFile("PI");
      menubar0.addFile("PI");
      menubar0.addFile("PI");
      menubar0.addFile("PI");
      menubar0.addFile("PI");
      assertFalse(menubar0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Menubar menubar0 = new Menubar((SwingGui) null);
      JCheckBoxMenuItem jCheckBoxMenuItem0 = menubar0.getBreakOnReturn();
      ActionEvent actionEvent0 = new ActionEvent(jCheckBoxMenuItem0, (-1734430249), "Open.Z.");
      // Undeclared exception!
      try { 
        menubar0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.Menubar", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Menubar menubar0 = new Menubar((SwingGui) null);
      JCheckBoxMenuItem jCheckBoxMenuItem0 = menubar0.getBreakOnEnter();
      ActionEvent actionEvent0 = new ActionEvent(jCheckBoxMenuItem0, (-2132), "^5qbd m", (-2132));
      // Undeclared exception!
      try { 
        menubar0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.Menubar", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Menubar menubar0 = new Menubar((SwingGui) null);
      JCheckBoxMenuItem jCheckBoxMenuItem0 = menubar0.getBreakOnExceptions();
      ActionEvent actionEvent0 = new ActionEvent(jCheckBoxMenuItem0, (-422), ":)[oA?aVCU$5,", (-422));
      // Undeclared exception!
      try { 
        menubar0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.Menubar", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Menubar menubar0 = new Menubar((SwingGui) null);
      Integer integer0 = new Integer((-35));
      ActionEvent actionEvent0 = new ActionEvent(integer0, (-35), "IZP':7r~J", (-35));
      // Undeclared exception!
      try { 
        menubar0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.Menubar", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Menubar menubar0 = new Menubar((SwingGui) null);
      StyledEditorKit.AlignmentAction styledEditorKit_AlignmentAction0 = new StyledEditorKit.AlignmentAction("Motif", 82);
      ActionEvent actionEvent0 = new ActionEvent(styledEditorKit_AlignmentAction0, 82, "Motif", 82, 82);
      menubar0.actionPerformed(actionEvent0);
      assertFalse(menubar0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Menubar menubar0 = new Menubar((SwingGui) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      ActionEvent actionEvent0 = new ActionEvent(defaultTableModel0, (-2815), "Metal");
      menubar0.actionPerformed(actionEvent0);
      assertFalse(menubar0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Menubar menubar0 = new Menubar((SwingGui) null);
      ActionEvent actionEvent0 = new ActionEvent(menubar0, (-35), "Windows", (-35));
      menubar0.actionPerformed(actionEvent0);
      assertFalse(menubar0.isFocusTraversalPolicySet());
  }
}