package ua.goit.htmlmaker;


import org.junit.Assert;
import org.junit.Test;
import ua.goit.htmlmaker.element.Body;
import ua.goit.htmlmaker.element.Page;

/**
 * Created by ol on 18.08.2015.
 */
public class MakerTest {

    @Test
    public void test(){
        Page page = new Page().addBody(new Body());
        String actual = page.print();
        Assert.assertEquals("<html></html>", actual);
    }

}

