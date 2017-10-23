package io.github.dmi3coder.javafx_design_patterns.structural.bridge.export_type;

import com.oracle.javafx.jmx.json.JSONDocument;
import com.oracle.javafx.jmx.json.JSONDocument.Type;
import io.github.dmi3coder.javafx_design_patterns.structural.bridge.ExportType;
import io.github.dmi3coder.javafx_design_patterns.structural.bridge.ExportableElement;
import java.util.List;

/**
 * Created by dim3coder on 10/23/17.
 */
public class JsonExportType implements ExportType {

  @Override
  public String exportData(ExportableElement element) {
    JSONDocument jsonDocument = new JSONDocument(Type.OBJECT);
    List<String> keys = element.getKeys();
    List<String> values = element.getValues();

    for (int i = 0; i < keys.size(); i++) {
      jsonDocument.setString(keys.get(i), values.get(i));
    }
    return jsonDocument.toString();
  }

}
