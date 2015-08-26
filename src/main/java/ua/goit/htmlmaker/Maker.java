package ua.goit.htmlmaker;

import ua.goit.htmlmaker.element.El;
import ua.goit.htmlmaker.element.Jumbotron;
import ua.goit.htmlmaker.element.Panel;

import java.io.FileWriter;
import java.io.IOException;

public class Maker {
  public static void main(String[] args) throws IOException {

    El page = El.from("html")
        .add(El.from("head")
            .add(El.from("link")
                .addAttr("rel", "stylesheet")
                .addAttr("href", "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css")))
        .add(
            El.from("body").addClass("bg-success")
                .add(El.from("div").addClass("container")
                    .add(El.from("div").addClass("row")
                        .add(El.from("div").addClass("col-md-12")

                            .add(new Jumbotron("Hello AQA_3", "...", "Learn More", "http://google.com"))
                            .add(
                                new Panel()
                                    .add(El.from("button")
                                        .addClass("btn")
                                        .addClass("btn-success")
                                        .addText("Submit")
                                    )
                                    .add(El.from("button")
                                        .addClass("btn")
                                        .addClass("btn-primary")
                                        .addText("Cancel")))))

                ));

    new FileWriter("/Users/volodymyrderkach/repo/git/oop3/goit_website/aqa.html")
        .append(page.print()).close();

    //System.out.println(page.print());
  }
}
