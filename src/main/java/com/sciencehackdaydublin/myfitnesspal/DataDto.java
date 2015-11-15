package com.sciencehackdaydublin.myfitnesspal;

import java.util.List;

public class DataDto {
	
	private String goal;
	private List<DataPointDto> data;
	private String chartType;
	private String title;
	private String category;
	private String label;
	private String ordinate_axis_min;
	private String ordinate_axis_max;
	
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public List<DataPointDto> getData() {
		return data;
	}
	public void setData(List<DataPointDto> data) {
		this.data = data;
	}
	public String getChartType() {
		return chartType;
	}
	public void setChartType(String chartType) {
		this.chartType = chartType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getOrdinate_axis_min() {
		return ordinate_axis_min;
	}
	public void setOrdinate_axis_min(String ordinate_axis_min) {
		this.ordinate_axis_min = ordinate_axis_min;
	}
	public String getOrdinate_axis_max() {
		return ordinate_axis_max;
	}
	public void setOrdinate_axis_max(String ordinate_axis_max) {
		this.ordinate_axis_max = ordinate_axis_max;
	}
}
