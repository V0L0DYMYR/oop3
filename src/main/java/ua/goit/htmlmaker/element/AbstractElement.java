package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ol on 20.08.2015.
 */
public abstract class AbstractElement<T> {

  protected List<String> cssClasses = new ArrayList<>();
  protected String text = "";
  protected List<Element> elements = new ArrayList<>();
  protected Map<String, String> attrs = new HashMap<>();

  public T add(Element el) {
    this.elements.add(el);
    return (T) this;
  }

  public T add(List<Element> elements) {
    this.elements.addAll(elements);
    return (T) this;
  }

  protected String getText() {
    if (!text.isEmpty()) {
      return text;
    } else {
      return "";
    }
  }

  protected String getAttributes() {
    StringBuilder res = new StringBuilder();

    for (String attrName : attrs.keySet()) {
      String attrValue = attrs.get(attrName);
      res.append(' ')
          .append(attrName)
          .append("=\"")
          .append(attrValue)
          .append("\" ");
    }
    return res.toString();
  }

  protected String getCssClass() {
    StringBuilder html = new StringBuilder();
    if (!cssClasses.isEmpty()) {
      html.append(" class=\"");
      for (String cssClass : cssClasses) {
        html.append(cssClass).append(" ");
      }
      html.append('"');
    }
    return html.toString();
  }

  public T addClass(String... cssClasses) {
    for (String cssClass : cssClasses) {
      this.cssClasses.add(cssClass);
    }
    return (T) this;
  }

  public T addText(String text) {
    this.text = text;
    return (T) this;

  }

  public T addAttr(String attrName, String attrValue) {
    attrs.put(attrName, attrValue);
    return (T) this;
  }
}
