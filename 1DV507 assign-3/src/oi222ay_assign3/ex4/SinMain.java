package oi222ay_assign3.ex4;

import java.util.ArrayList;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;

public class SinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 XYChart chart = new XYChartBuilder().width(800).height(600).build();
		    chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Line);
		    chart.getStyler().setChartTitleVisible(false);
		    chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
		    chart.getStyler().setMarkerSize(5);
		    
		   ArrayList  <Double> y = new ArrayList<Double> ();
		   for (double x = 0; x <= 2 * Math.PI; x+= 0.0001) {
			   y.add((1 + x/Math.PI)*Math.cos(x)*Math.cos(40*x));
		   }
		    
		   chart.addSeries("Curve", y);
		    new SwingWrapper(chart).displayChart();

	}

}
