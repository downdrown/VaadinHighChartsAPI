package ru.skysoftlab.smarthome.heating.dto;

import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;

public class FloatChartData implements HighChartsBaseData {

	private float value;

	public FloatChartData(float value) {
		this.value = value;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Override
	public String getHighChartValue() {
		return String.valueOf(this.value);
	}

	@Override
	public String toString() {
		return this.getHighChartValue();
	}

}
