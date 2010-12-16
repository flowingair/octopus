package com.vaadin.demo.tutorial.addressbook.ui;

import com.vaadin.demo.tutorial.addressbook.AddressBookApplication;
import com.vaadin.demo.tutorial.addressbook.data.LxitClassContainer;
import com.vaadin.ui.Table;

@SuppressWarnings("serial")
public class LxitClassTable extends Table {
  public LxitClassTable(AddressBookApplication app) {
    setSizeFull();
    setContainerDataSource(app.getLxitClassDataSource());

    setVisibleColumns(LxitClassContainer.NATURAL_COL_ORDER);
    setColumnHeaders(LxitClassContainer.COL_HEADERS_ENGLISH);

    setColumnCollapsingAllowed(true);
    setColumnReorderingAllowed(true);

    /*
     * Make table selectable, react immediatedly to user events, and pass events
     * to the controller (our main application)
     */
    setSelectable(true);
    setImmediate(true);
    addListener((ValueChangeListener) app);
    /* We don't want to allow users to de-select a row */
    setNullSelectionAllowed(false);

    // customize email column to have mailto: links using column generator
    // FIXME
    // addGeneratedColumn("email", new ColumnGenerator() {
    // public Component generateCell(Table source, Object itemId, Object
    // columnId) {
    // Person p = (Person) itemId;
    // Link l = new Link();
    // l.setResource(new ExternalResource("mailto:" + p.getEmail()));
    // l.setCaption(p.getEmail());
    // return l;
    // }
    // });
  }

}