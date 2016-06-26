package at.downdrown.vaadinaddons.highchartsapi.model.data.base;

public class FloatData implements HighChartsBaseData {

	private float value;

	public FloatData(float value) {
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
