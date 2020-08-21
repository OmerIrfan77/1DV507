package oi222ay_assign3.ex4;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.PieSeries.PieSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;

public class PieBieChart {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		  CategoryChart bar = new CategoryChartBuilder().width(800).height(600).build();
		    bar.getStyler().setDefaultSeriesRenderStyle(CategorySeriesRenderStyle.Bar);
		    bar.getStyler().setChartTitleVisible(false);
		    bar.getStyler().setLegendPosition(LegendPosition.InsideSW);
		    bar.getStyler().setMarkerSize(5);
		    
		    File integers = new File("/Users/user/Downloads/integers.dat");
		    
		    Scanner sc = new Scanner (integers);
		    ArrayList<Double> y = new ArrayList<Double> ();
		    String s = "";
		    
		    ArrayList x = new ArrayList ();
		    
		    double l10 = 0;
		    double l20 = 0;
		    double l30 = 0;
		    double l40 = 0;
		    double l50 = 0;
		    double l60 = 0;
		    double l70 = 0;
		    double l80 = 0;
		    double l90 = 0;
		    double l100 = 0;
		    
		    
		    for(double t = 10; t <= 100; t+=10) {
		    	x.add("<" + t);
		    }
		    while(sc.hasNextLine()) {
		    	s = sc.nextLine();
		    	
		    	if(Double.parseDouble(s) < 10) {
		    		l10++;
		    	}
		    	else if(Double.parseDouble(s) < 20 ) {
		    		l20++;
		    	}
		    	else if(Double.parseDouble(s) < 30 ) {
		    		l30++;
		    	}
		    	else if(Double.parseDouble(s) < 40 ) {
		    		l40++;
		    	}
		    	else if(Double.parseDouble(s) < 50 ) {
		    		l50++;
		    	}
		    	else if(Double.parseDouble(s) < 60 ) {
		    		l60++;
		    	}
		    	else if(Double.parseDouble(s) < 70 ) {
		    		l70++;
		    	}
		    	else if(Double.parseDouble(s) < 80 ) {
		    		l80++;
		    	}
		    	else if(Double.parseDouble(s) < 90 ) {
		    		l90++;
		    	}
		    	else {
		    		l100++;
		    	}
		    }
		    	
		    y.add(l10);
		    y.add(l20);
		    y.add(l30);
		    y.add(l40);
		    y.add(l50);
		    y.add(l60);
		    y.add(l70);
		    y.add(l80);
		    y.add(l90);
		    y.add(l100);
		    	
		   
		    
		    bar.addSeries("Bar Chart", x, y);
		    new SwingWrapper(bar).displayChart();
		    
		    PieChart pie = new PieChartBuilder().width(800).height(600).build();
		    pie.getStyler().setDefaultSeriesRenderStyle(PieSeriesRenderStyle.Pie);
		    pie.getStyler().setChartTitleVisible(false);
		    pie.getStyler().setLegendPosition(LegendPosition.InsideSW);
		    pie.getStyler().setCursorSize(5);

		    pie.addSeries("<10", l10);
		    pie.addSeries("<20", l20);
		    pie.addSeries("<30", l30);
		    pie.addSeries("<40", l40);
		    pie.addSeries("<50", l50);
		    pie.addSeries("<60", l60);
		    pie.addSeries("<70", l70);
		    pie.addSeries("<80", l80);
		    pie.addSeries("<90", l90);
		    pie.addSeries("<100", l100);
		    
		    new SwingWrapper(pie).displayChart();

	}

}
