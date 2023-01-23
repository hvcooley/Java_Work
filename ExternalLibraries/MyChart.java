package dev.cooley;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class MyChart {
    public static void main(String[] args){

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "Dogs", "Animals");
        dataset.addValue(42, "Cats", "Animals");
        dataset.addValue(25, "Lizards", "Animals");

        JFreeChart barChart = ChartFactory.createBarChart(
                "Animals Chart",
                "X Label",
                "Y Label",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);

        JFrame frame = new JFrame("Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
