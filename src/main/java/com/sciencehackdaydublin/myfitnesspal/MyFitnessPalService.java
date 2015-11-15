package com.sciencehackdaydublin.myfitnesspal;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.gistlabs.mechanize.document.html.HtmlDocument;
import com.gistlabs.mechanize.document.html.form.Form;
import com.gistlabs.mechanize.document.json.JsonDocument;
import com.gistlabs.mechanize.impl.MechanizeAgent;
import com.google.gson.Gson;

@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MyFitnessPalService {

	private MechanizeAgent agent;
	
	public void login(String username, String password) {
		agent = new MechanizeAgent();
        HtmlDocument page = agent.get("https://www.myfitnesspal.com/account/login");
        Form form = page.forms().get(0);
        form.get("username").set(username);
        form.get("password").set(password);
        form.submit();
	}
	
	public DataDto getWeightReport() {
		JsonDocument weightReport = agent.get("http://www.myfitnesspal.com/reports/results/progress/1/20.json");
		return new Gson().fromJson(weightReport.asString(), DataDto.class);
	}
	
	public DataDto getCaloriesReport() {
		JsonDocument caloriesReport = agent.get("http://www.myfitnesspal.com/reports/results/nutrition/Calories/20.json");
		return new Gson().fromJson(caloriesReport.asString(), DataDto.class);
	}
}
