# HighChartsAPI Add-on for Vaadin 7

I've decided to implement a easy-to-use graphing tool since there were only expensive solutions for this.

Any feature request will be appreciated and i will try to implement it.

## Download release

Official releases of this add-on are available at Vaadin Directory. For Maven instructions, download and reviews, go to http://vaadin.com/addon/highchartsapi

## Building and running demo

git clone <url of the HighChartsAPI repository>
mvn clean install
cd highchartsapi-demo
mvn jetty:run

To see the demo, navigate to http://localhost:8080/
 
## Release notes

### Version 1.5 (Experminetal)
- Basic functionality is implemented. More updates will be uploaded soon.
 
### Version 1.6 (Experminetal)
- Different instantiation (!!!) - Take a look at the Code Samples for further info!
- Empty Title
- Default Background is now transparent
- LineChart
- BarChart
- Margin for Chart
- Colors interface
- Changing Chart Colors
- (JavaDoc)
- (Demo UI)
 
### Version 1.7 (Experminetal)
- Axis Component improvements
- PieChartPlotOptions (Will defaultly be used when none is set)
- Changed default chart look & feel
- Removed xAxis, yAxis components

### Version 1.7.1 (Experminetal)
- Axis Component improvements (Axis Title, GridLine Behavior)
- ChartConfiguration improvements

### Version 1.7.2 (Beta)
- Version problem solved (Addon was bound to Vaadin 7.4.2)
- Added AreaChartSeries
- Added AreaChartPlotOptions
- Added BarChartPlotOptions
- Added ColumnChartPlotOptions
- Added LineChartPlotOptions
- Changed default chartConfiguration behaviour
- Added 'default colors' to chartConfiguration

## Issue tracking

The issues for this add-on are tracked on its github.com page.
All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## Usage

Please take a look at the Project's wiki page for further information.

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

HighChartsAPI is written by Manfred Huber
