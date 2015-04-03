package at.downdrown.vaadinaddons.highchartsapi;

import at.downdrown.vaadinaddons.highchartsapi.exceptions.HighChartsException;
import at.downdrown.vaadinaddons.highchartsapi.model.Axis;
import at.downdrown.vaadinaddons.highchartsapi.model.ChartConfiguration;
import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.PieChartData;
import at.downdrown.vaadinaddons.highchartsapi.model.plotoptions.PieChartPlotOptions;
import at.downdrown.vaadinaddons.highchartsapi.model.series.PieChartSeries;
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.colorpicker.Color;
import junit.framework.Assert;
import org.junit.Test;

// JUnit tests here
public class HighChartsAPITest {

	@Test
	public void thisAlwaysPasses() {
		Assert.assertEquals(true, true);
	}

	@Test
	public void getTestHighchartAxis() throws HighChartsException {
		Axis testAxis = new Axis();
		testAxis.setAxisType(Axis.AxisType.xAxis);
		testAxis.setLineWidth(2);
		testAxis.setLineColor(Color.BLUE);
		testAxis.getCategories().add("Fruits");
		testAxis.getCategories().add("Sweets");
		System.out.println(testAxis.getHighChartValue());
	}

	@Test
	public void getTestPieChart() throws HighChartsException {
		ChartConfiguration pieConfiguration = new ChartConfiguration();
		pieConfiguration.setTitle("TestPie");
		pieConfiguration.setSubTitle("With some test configurations.");
		pieConfiguration.setChartType(ChartType.PIE);
		pieConfiguration.setBackgroundColor(Colors.WHITE);

		PieChartPlotOptions plotOptions = new PieChartPlotOptions();
		pieConfiguration.setPlotOptions(plotOptions);

		PieChartSeries pieFruits = new PieChartSeries("Fruits");
		PieChartData bananas = new PieChartData("Bananas", 33.2);
		PieChartData melons = new PieChartData("Melons", 6.21);
		PieChartData apples = new PieChartData("Apples", 3.44);

		pieFruits.getData().add(bananas);
		pieFruits.getData().add(melons);
		pieFruits.getData().add(apples);

		pieConfiguration.getSeriesList().add(pieFruits);

		HighChart pieChart = HighChartFactory.renderChart(pieConfiguration);
		pieChart.setHeight(80, Sizeable.Unit.PERCENTAGE);
		pieChart.setWidth(80, Sizeable.Unit.PERCENTAGE);
		System.out.println("PieChart Script : " + pieConfiguration.getHighChartValue());

	}
}
