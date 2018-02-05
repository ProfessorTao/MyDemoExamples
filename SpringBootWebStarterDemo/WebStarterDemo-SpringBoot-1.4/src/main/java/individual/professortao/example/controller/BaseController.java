package individual.professortao.example.controller;

import individual.professortao.example.model.response.RespAboutContent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BaseController {

    private final RespAboutContent aboutContent;

    @RequestMapping(method=RequestMethod.GET, value="/")
    @ResponseBody
    public String home() {
        return String.format("Welcome to visit the %s server!", aboutContent.getAppName());
    }

    @RequestMapping(method=RequestMethod.GET, value="/about")
    public RespAboutContent aboutPage() {
        return aboutContent;
    }
}
