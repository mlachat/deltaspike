package org.apache.deltaspike.playground.windowhandling;

import org.apache.deltaspike.core.api.config.view.ViewConfig;
import org.apache.deltaspike.core.api.config.view.controller.ViewControllerRef;
import org.apache.deltaspike.jsf.api.config.view.Folder;
import org.apache.deltaspike.jsf.api.config.view.View;
import org.apache.deltaspike.jsf.api.config.view.View.NavigationMode;
import org.apache.deltaspike.jsf.api.config.view.View.ViewParameterMode;

@Folder(name = "views/windowhandling")
@View(navigation = NavigationMode.REDIRECT, viewParams = ViewParameterMode.INCLUDE)
public interface Pages extends ViewConfig {

	interface Clientwindow extends Pages {

		@View(name = "test")
		@ViewControllerRef(ViewActionController.class)
		public class ClientWindowClass implements Clientwindow { // br
		}
	}

}
