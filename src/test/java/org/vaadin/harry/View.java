package org.vaadin.harry;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends Div {

    public View() {
        ProgressBar progressBar = new ProgressBar(200, 1000,5, 15, 180);
        add(progressBar);
    }
}
