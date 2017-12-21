package test.springapp.web;

import org.springframework.web.servlet.ModelAndView;
import springapp.web.HelloController;

import static org.junit.Assert.*;

/**
 * Created by GODFATHER.
 */
public class HelloControllerTest {
    @org.junit.Test
    public void handleRequest() throws Exception {
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}