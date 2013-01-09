/* LanguageTool, a natural language style checker 
 * Copyright (C) 2007 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.gui;

import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import org.languagetool.JLanguageTool;
import org.languagetool.Language;
import org.languagetool.tools.StringTools;

/**
 * A dialog with version and copyright information.
 * 
 * @author Daniel Naber
 */
public class AboutDialog {

  protected final ResourceBundle messages;
  
  public AboutDialog(final ResourceBundle messages) {
    this.messages = messages;
  }
  
  public void show() {
    final String aboutText = 
      StringTools.getLabel(messages.getString("guiMenuAbout"));
    JOptionPane.showMessageDialog(null, getAboutText(),
        aboutText, JOptionPane.INFORMATION_MESSAGE);
  }

  protected String getAboutText() {
    return "LanguageTool " + JLanguageTool.VERSION + "\n"
        + "Copyright (C) 2005-2013 Daniel Naber\n"
        + "This software is licensed under the GNU Lesser General Public License.\n"
        + "LanguageTool Homepage: http://www.languagetool.org\n\n"
        + "Maintainers of the language modules:\n\n"
        + Language.getAllMaintainers(messages);
  }

}
