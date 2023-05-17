package com.autonoma.bootcamp.hello;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@Api(tags="SampleService")
@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @Value("${demo.test}")
    String demoTest;

    @Value("${demo.test1}")
    String demoTest1;

    @Value("${demo.test2}")
    String demoTest2;

    @RequestMapping(value = "/sayHello", method = PUT, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "The update call is Successful"),
            @ApiResponse(code = 500, message = "The update call Failed"),
            @ApiResponse(code = 404, message = "The API could not be found"),
            @ApiResponse(code = 400, message = "Invalid input")})
    public String sayHello(@RequestBody String toWhom) {
        return "Hello " + toWhom;
    }

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }



}
