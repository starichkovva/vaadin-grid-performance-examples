package org.starichkov.java.vaadin.v8.grid.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Vadim Starichkov
 * @since 12.03.2019 11:53
 */
@SpringUI
@Theme("valo")
public class ApplicationUI extends UI {

  private HugeGridView hugeGridView;

  public ApplicationUI(HugeGridView hugeGridView) {
    this.hugeGridView = hugeGridView;
  }

  @Override
  protected void init(VaadinRequest request) {
    VerticalLayout mainLayout = new VerticalLayout();
    mainLayout.addComponentsAndExpand(hugeGridView);
    mainLayout.setExpandRatio(hugeGridView, 1);
    setContent(mainLayout);
  }
}
