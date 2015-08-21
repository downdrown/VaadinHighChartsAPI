package at.downdrown.vaadinaddons.highchartsapi.test;

import at.downdrown.vaadinaddons.highchartsapi.model.data.AreaRangeChartData;
import at.downdrown.vaadinaddons.highchartsapi.model.data.base.*;
import at.downdrown.vaadinaddons.highchartsapi.model.series.*;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.test<br>
 * Klasse: Main.class<br>
 * Erstellt am 19. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class SeriesScriptGenerationTest {

    public static void main(String[] args) {
        AreaChartSeries areaChartSeries = new AreaChartSeries("areaScript");
        areaChartSeries.addData(2);
        areaChartSeries.addData(2.3);
        areaChartSeries.addData(new DoubleDoubleData(2.3, 45.2));
        areaChartSeries.addData(new DoubleIntData(2.3, 45));
        areaChartSeries.addData(new IntDoubleData(2, 45.2));
        areaChartSeries.addData(new IntIntData(2, 45));
        areaChartSeries.addData(new StringDoubleData("test", 45.2));
        areaChartSeries.addData(new StringIntData("test", 45));

        System.out.println(areaChartSeries.getHighChartValue());


        BarChartSeries barChartSeries = new BarChartSeries("barScript");
        barChartSeries.addData(2);
        barChartSeries.addData(2.3);
        barChartSeries.addData(new DoubleDoubleData(2.3, 45.2));
        barChartSeries.addData(new DoubleIntData(2.3, 45));
        barChartSeries.addData(new IntDoubleData(2, 45.2));
        barChartSeries.addData(new IntIntData(2, 45));
        barChartSeries.addData(new StringDoubleData("test", 45.2));
        barChartSeries.addData(new StringIntData("test", 45));

        System.out.println(barChartSeries.getHighChartValue());


        ColumnChartSeries columnChartSeries = new ColumnChartSeries("columnScript");
        columnChartSeries.addData(2);
        columnChartSeries.addData(2.3);
        columnChartSeries.addData(new DoubleDoubleData(2.3, 45.2));
        columnChartSeries.addData(new DoubleIntData(2.3, 45));
        columnChartSeries.addData(new IntDoubleData(2, 45.2));
        columnChartSeries.addData(new IntIntData(2, 45));
        columnChartSeries.addData(new StringDoubleData("test", 45.2));
        columnChartSeries.addData(new StringIntData("test", 45));

        System.out.println(columnChartSeries.getHighChartValue());


        LineChartSeries lineChartSeries = new LineChartSeries("lineScript");
        lineChartSeries.addData(2);
        lineChartSeries.addData(2.3);
        lineChartSeries.addData(new DoubleDoubleData(2.3, 45.2));
        lineChartSeries.addData(new DoubleIntData(2.3, 45));
        lineChartSeries.addData(new IntDoubleData(2, 45.2));
        lineChartSeries.addData(new IntIntData(2, 45));
        lineChartSeries.addData(new StringDoubleData("test", 45.2));
        lineChartSeries.addData(new StringIntData("test", 45));

        System.out.println(lineChartSeries.getHighChartValue());


        AreaRangeChartSeries areaRangeChartSeries = new AreaRangeChartSeries("areaRangeScript");
        areaRangeChartSeries.addData(new AreaRangeChartData(124640640, 14.3, 27.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124649280, 14.5, 27.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124657920, 15.5, 29.6));
        areaRangeChartSeries.addData(new AreaRangeChartData(124666560, 16.7, 30.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124675200, 16.5, 25.0));
        areaRangeChartSeries.addData(new AreaRangeChartData(124683840, 17.8, 25.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124692480, 13.5, 24.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124701120, 10.5, 21.4));
        areaRangeChartSeries.addData(new AreaRangeChartData(124709760, 9.2, 23.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124718400, 11.6, 21.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124727040, 10.7, 23.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124735680, 11.0, 23.3));
        areaRangeChartSeries.addData(new AreaRangeChartData(124744320, 11.6, 23.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124752960, 11.8, 20.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124761600, 12.6, 22.4));
        areaRangeChartSeries.addData(new AreaRangeChartData(124770240, 13.6, 19.6));
        areaRangeChartSeries.addData(new AreaRangeChartData(124778880, 11.4, 22.6));
        areaRangeChartSeries.addData(new AreaRangeChartData(124787520, 13.2, 25.0));
        areaRangeChartSeries.addData(new AreaRangeChartData(124796160, 14.2, 21.6));
        areaRangeChartSeries.addData(new AreaRangeChartData(124804800, 13.1, 17.1));
        areaRangeChartSeries.addData(new AreaRangeChartData(124813440, 12.2, 15.5));
        areaRangeChartSeries.addData(new AreaRangeChartData(124822080, 12.0, 20.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124830720, 12.0, 17.1));
        areaRangeChartSeries.addData(new AreaRangeChartData(124839360, 12.7, 18.3));
        areaRangeChartSeries.addData(new AreaRangeChartData(124848000, 12.4, 19.4));
        areaRangeChartSeries.addData(new AreaRangeChartData(124856640, 12.6, 19.9));
        areaRangeChartSeries.addData(new AreaRangeChartData(124865280, 11.9, 20.2));
        areaRangeChartSeries.addData(new AreaRangeChartData(124873920, 11.0, 19.3));
        areaRangeChartSeries.addData(new AreaRangeChartData(124882560, 10.8, 17.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124891200, 11.8, 18.5));
        areaRangeChartSeries.addData(new AreaRangeChartData(124899840, 10.8, 16.1));

        System.out.println(areaRangeChartSeries.getHighChartValue());

    }
}
