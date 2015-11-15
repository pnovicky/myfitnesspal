package com.sciencehackdaydublin.myfitnesspal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFitnessPalController {

	@Autowired
	private MyFitnessPalService service;

    @RequestMapping(value = "/fitness", method = RequestMethod.POST,
    		consumes = {MediaType.APPLICATION_JSON_VALUE},
    		produces = {MediaType.APPLICATION_JSON_VALUE})
    public String fitness(@RequestBody LoginDataDto loginDataDto) {
        service.login(loginDataDto.getUsername(), loginDataDto.getPassword());
        return service.getSugarReport(30).getCategory();
    }
}
