package com.example;

import com.google.gwt.core.client.EntryPoint;
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
                .appendChild(TreeItem.create(Icons.widgets(), "Menu 1 "))
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
