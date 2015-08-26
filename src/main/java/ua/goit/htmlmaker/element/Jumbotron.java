package ua.goit.htmlmaker.element;

public class Jumbotron extends AbstractElement<Jumbotron> implements Element {


  private String title;
  private String jtext;
  private String buttonText;
  private String buttonRef;

  public Jumbotron(String title, String jtext, String buttonText, String buttonRef) {

    this.title = title;
    this.jtext = jtext;
    this.buttonText = buttonText;
    this.buttonRef = buttonRef;
  }

  @Override
  public String print() {
    Element j = new El("div").addClass("jumbotron")
        .add(new El("h1").addText(title))
        .add(new El("p").addText(jtext))
        .add(new El("p")
            .add(new El("a")
                .addClass("btn btn-primary btn-lg")
                .addAttr("href", buttonRef)
                .addAttr("role", "button")
                .addText(buttonText)
            ));
    return j.print();
  }
}
