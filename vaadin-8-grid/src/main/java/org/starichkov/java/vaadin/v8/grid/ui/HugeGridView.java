package org.starichkov.java.vaadin.v8.grid.ui;

import com.vaadin.data.ValueProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Stream;
import org.starichkov.java.vaadin.data.HugeEntity;

/**
 * @author Vadim Starichkov
 * @since 12.03.2019 11:52
 */
@SpringComponent
public class HugeGridView extends VerticalLayout implements View {

  public HugeGridView() {
    Grid<HugeEntity> grid = new Grid<>();
    Stream.of(HugeEntity.class.getDeclaredFields()).forEach(field -> {
      grid.addColumn((ValueProvider<HugeEntity, String>) HugeEntity -> {
        try {
          return String.valueOf(field.get(HugeEntity));
        } catch (IllegalAccessException e) {
          e.printStackTrace();
          return "";
        }
      }).setCaption(field.getName());
    });

    Collection<HugeEntity> characterEntities = new LinkedList<>();
    for (int i = 1; i <= 100; i++) {
      HugeEntity HugeEntity = new HugeEntity();
      int value = i;
      Stream.of(HugeEntity.class.getDeclaredFields()).forEach(field -> {
        try {
          field.set(HugeEntity, field.getName() + "_" + value);
        } catch (IllegalAccessException e) {
          e.printStackTrace();
        }
      });
      characterEntities.add(HugeEntity);
    }

    ListDataProvider<HugeEntity> dataProvider = DataProvider.ofCollection(characterEntities);

    grid.setDataProvider(dataProvider);

    addComponentAsFirst(grid);
  }
}
