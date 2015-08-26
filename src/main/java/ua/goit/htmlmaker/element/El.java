package ua.goit.htmlmaker.element;

import com.sun.tools.hat.internal.model.Snapshot;

public class El extends AbstractElement<El> implements Element {

  private final String name;

  public El(String name) {
    if (name == null) {
      throw new IllegalArgumentException("Element name shouldn't be NULL.");
    }
    this.name = name;
  }

  @Override
  public String print() {

    StringBuilder html = new StringBuilder()
        .append('<')
        .append(name)
        .append(getAttributes())
        .append(getCssClass())
        .append('>')
        .append(getText());

    for (Element el : elements) {
      html.append(el.print());
    }

    return html.append("</")
        .append(name)
        .append('>')
        .toString();
  }

  public static El from(String name) {
    return new El(name);
  }
}
