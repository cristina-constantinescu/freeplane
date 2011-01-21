/*
 *  Freeplane - mind map editor
 *  Copyright (C) 2008 Dimitry Polivaev
 *
 *  This file author is Dimitry Polivaev
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.freeplane.plugin.latex;

import org.freeplane.core.addins.NodeHookDescriptor;
import org.freeplane.core.controller.Controller;
import org.freeplane.core.ui.ActionLocationDescriptor;
import org.freeplane.core.ui.MenuBuilder;
import org.freeplane.features.common.map.ModeController;

/**
 * @author Stefan Ott
 * @file LatexRegistration.java
 * @package org.freeplane.plugin.latex
 * 
 * This class registers the LaTeX plugin in Freeplane
 */
@NodeHookDescriptor(hookName = "plugins/latex/LatexNodeHook.properties", //
onceForMap = false)
@ActionLocationDescriptor(locations = "/menu_bar/insert/other")
class LatexRegistration {
	public LatexRegistration() {
		final ModeController modeController = Controller.getCurrentModeController();
		//LattexNodeHook -> Menu insert
		final LatexNodeHook nodeHook = new LatexNodeHook();
		if (modeController.getModeName() == "MindMap") {
			//Edit only visible in mindmap mode
			final MenuBuilder menuBuilder = modeController.getUserInputListenerFactory().getMenuBuilder();
			menuBuilder.addAnnotatedAction(new EditLatex(nodeHook));
		}
	}
}