package ua.goit.htmlmaker.element;

public class Panel
    extends AbstractElement<Panel>
    implements Element {


  private String title = "";

  public Panel(String title) {
    this.title = title;
  }

  public Panel() {

  }


  @Override
  public String print() {
    Element panel = new El("div")
        .addClass("panel panel-default")
        .add(new El("div")
            .addClass("panel-heading")
            .addText(title))

        .add(new El("div")
            .addClass("panel-body")
            .add(elements)
        );
    return panel.print();
  }
}
