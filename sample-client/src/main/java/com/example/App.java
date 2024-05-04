package com.example;


import com.google.gwt.core.client.EntryPoint;

/*
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
*/
import org.dominokit.domino.ui.utils.ElementsFactory;
import org.dominokit.domino.ui.style.DominoCss;
import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.elements.DivElement;
import org.dominokit.domino.ui.elements.SectionElement;
import org.dominokit.domino.ui.icons.lib.Icons;
import org.dominokit.domino.ui.layout.AppLayout;
import org.dominokit.domino.ui.tree.Tree;
import org.dominokit.domino.ui.tree.TreeItem;

public class App implements EntryPoint, ElementsFactory, DominoCss {

	public void onModuleLoad() {
    
    var layout = AppLayout.create("Domino-ui starter");
    
    layout.withLeftDrawer((parent, drawer) -> {
        drawer.appendChild(Tree.<String>create("Menu")
                .appendChild(TreeItem.create(Icons.widgets(), "Menu 1 qq"))
                .appendChild(TreeItem.create(Icons.widgets(), "Menu 2 "))
                .addSelectionListener((source, selection) -> {
                    layout.withContent((parent1, content) -> {
                        content.clearElement()
                                .appendChild(Card.create(source.get().getValue())
                                        .appendChild(p("Welcome to domino-ui , you are viewing "+source.get().getValue()+" content")));
                    });
  
                }));
    });
    body().appendChild(layout);    
	}
}
