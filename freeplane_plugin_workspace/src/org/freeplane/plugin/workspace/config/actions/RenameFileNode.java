package org.freeplane.plugin.workspace.config.actions;

import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;

import org.freeplane.core.ui.AFreeplaneAction;
import org.freeplane.features.clipboard.ClipboardController;
import org.freeplane.features.mode.Controller;
import org.freeplane.features.mode.IMapSelection;
import org.freeplane.features.mode.ModeController;

public class RenameFileNode extends AFreeplaneAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RenameFileNode() {
		super("RenameFileNode");
	}
	
	public void actionPerformed(final ActionEvent e) {
        System.out.println("RenameFileNode: "+e.getActionCommand()+" : "+e.getID());
    }


}