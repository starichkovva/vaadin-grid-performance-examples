package org.starichkov.java.vaadin.v10.grid.ui;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Stream;
import org.starichkov.java.vaadin.data.HugeEntity;

/**
 * @author Vadim Starichkov
 * @since 12.03.2019 11:59
 */
@Route("")
public class HugeGridView extends VerticalLayout {

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
      }).setHeader(field.getName());
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

    add(grid);
  }
}
