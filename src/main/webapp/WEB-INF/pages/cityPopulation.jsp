<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<script src="${ctx }/js/echarts.js"></script>
<div id="main" style="width: 600px;height:400px;"></div>
<script>
var myChart = echarts.init(document.getElementById('main'));
/* 
、黑龙江3799.2
、内蒙古2520.1
、西藏330.54 */
	var geoCoordMap = {
			"四川":[104.05,30.39],
			"江苏":[118.50,32.02],
			"宁夏":[106.16,38.20],
			"河南":[113.42,34.48],
			"湖南":[113,28.11],
			"天津":[117.11,39.09],
			"安徽":[117.18,31.51],
			"北京":[116.28,39.54],
			"浙江":[120.29,30.14],
			"广西":[108.20,22.48],
			"云南":[102.41,25],
			"河北":[114.28,38.02],
			"江西":[115.52,28.41],
			"陕西":[108.54,34.16],
			//"黑龙江":[113.15,23.08],
			"山东":[117,36.38],
			"山西":[112.34,37.52],
			"贵州":[106.42,26.35],
			"广东":[113.15,23.08],
			"重庆":[106.32,29.32],
			"吉林":[125.19,43.52],
			"辽宁":[123.24,41.50],
			"甘肃":[103.49,36.03],
			//"内蒙古":[113.15,23.08],
			"新疆":[87.36,43.48],
			"海南":[110.20,20.02],
			"湖北":[114.21,30.37],
			"青海":[101.45,36.38],
			//"西藏":[113.15,23.08],
			"福建":[119.18,26.05],
			"上海":[121.29,31.14],
	}
	
var data = [{
	name = "四川",
	value = 8262
},{
	name = "江苏",
	value = 7998.6
},{
	name = "宁夏",
	value = 674.9
},{
	name = "河南",
	value = 9532.42
},{
	name = "湖南",
	value = 6822
},{
	name = "天津",
	value = 1562.12
},{
	name = "安徽",
	value = 6195.5
},{
	name = "北京",
	value = 2172.9
},{
	name = "浙江",
	value = 5590
},{
	name = "广西",
	value = 4838
},{
	name = "云南",
	value = 4770.5
},{
	name = "河北",
	value = 7470.05
},{
	name = "江西",
	value = 4592.3
},{
	name = "陕西",
	value = 3812.62
},{
	name = "山东",
	value = 9946.64
},{
	name = "山西",
	value = 3681.64
},{
	name = "贵州",
	value = 3555
},{
	name = "广东",
	value = 10999
},{
	name = "重庆",
	value = 3048.43
},{
	name = "吉林",
	value = 2733.03
},{
	name = "辽宁",
	value = 4377.8
},{
	name = "甘肃",
	value = 2609.95
},{
	name = "新疆",
	value = 2398.08
},{
	name = "海南",
	value = 917.13
},{
	name = "湖北",
	value = 5885
},{
	name = "青海",
	value = 593.46
},{
	name = "福建",
	value = 3874
},{
	name = "上海",
	value = 2419.7
}]

var convertData = function(data){
	var res = [];
	for(var i = 0; i <data.length; i++){
		var geoCoord = geoCoordMap[data[i].name];
		if(geoCoord){
			res.push({
				name: data[i].name,
				value: geoCoord.concat(data[i].value)
			});
		}
	}
	return res;
}

var convertedData = [
	convertData(data),
	convertData(data.sort(function(a,b){
		return b.value - a.value;
	}).slice(0,6))
];

data.sort(function(a,b){
	return a.value - b.value
})


var selectedItems = [];
    var categoryData = [];
    var barData = [];
 //   var maxBar = 30;
    var sum = 0;
    var count = data.length;
    for(var i=0;i<data.length;i++){
    categoryData.push(data[i].name);
    barData.push(data[i].value);
    sum+=data[i].value;
    }
console.log(categoryData);
console.log(sum+"   "+count)
option = {
    backgroundColor: '#404a59',
    animation: true,
    animationDuration: 1000,
    animationEasing: 'cubicInOut',
    animationDurationUpdate: 1000,
    animationEasingUpdate: 'cubicInOut',
    title: [{
        text: '2016全国各省份直辖市 人口总量',
        subtext: '内部数据请勿外传',
        left: 'center',
        textStyle: {
            color: '#fff'
        }
    }, {
        id: 'statistic',
        text: count ? '平均: ' +parseInt((sum / count).toFixed(4)) : '',
        right: 120,
        top: 40,
        width: 100,
        textStyle: {
            color: '#fff',
            fontSize: 16
        }
    }],
    toolbox: {
        iconStyle: {
            normal: {
                borderColor: '#fff'
            },
            emphasis: {
                borderColor: '#b1e4ff'
            }
        },
        feature: {
            dataZoom: {},
            brush: {
                type: ['rect', 'polygon', 'clear']
            },
            saveAsImage: {
                show: true
            }
        }
    },
    brush: {
        outOfBrush: {
            color: '#abc'
        },
        brushStyle: {
            borderWidth: 2,
            color: 'rgba(0,0,0,0.2)',
            borderColor: 'rgba(0,0,0,0.5)',
        },
        seriesIndex: [0, 1],
        throttleType: 'debounce',
        throttleDelay: 300,
        geoIndex: 0
    },
    geo: {
        map: 'china',
        left: '10',
        right: '35%',
        center: [117.98561551896913, 31.205000490896193],
        zoom: 1.5,
        label: {
            emphasis: {
                show: false
            }
        },
        roam: true,
        itemStyle: {
            normal: {
                areaColor: '#323c48',
                borderColor: '#111'
            },
            emphasis: {
                areaColor: '#2a333d'
            }
        }
    },
    tooltip: {
        trigger: 'item'
    },
    grid: {
        right: 40,
        top: 100,
        bottom: 40,
        width: '30%'
    },
    xAxis: {
        type: 'value',
        scale: true,
        position: 'top',
        boundaryGap: false,
        splitLine: {
            show: false
        },
        axisLine: {
            show: false
        },
        axisTick: {
            show: false
        },
        axisLabel: {
            margin: 2,
            textStyle: {
                color: '#aaa'
            }
        },
    },
    yAxis: {
        type: 'category',
        //  name: 'TOP 20',
        nameGap: 16,
        axisLine: {
            show: true,
            lineStyle: {
                color: '#ddd'
            }
        },
        axisTick: {
            show: false,
            lineStyle: {
                color: '#ddd'
            }
        },
        axisLabel: {
            interval: 0,
            textStyle: {
                color: '#ddd'
            }
        },
        data: categoryData
    },
    series: [{
        // name: 'pm2.5',
        type: 'scatter',
        coordinateSystem: 'geo',
        data: convertedData[0],
        symbolSize: function(val) {
            return Math.max(val[2] / 10, 8);
        },
        label: {
            normal: {
                formatter: '{b}',
                position: 'right',
                show: false
            },
            emphasis: {
                show: true
            }
        },
        itemStyle: {
            normal: {
                color: '#ddb926',
                position: 'right',
                show: true
            }
        }
    }, {
        //  name: 'Top 5',
        type: 'effectScatter',
        coordinateSystem: 'geo',
        data: convertedData[0],
        symbolSize: function(val) {
            return Math.max(val[2] / 10, 8);
        },
        showEffectOn: 'emphasis',
        rippleEffect: {
            brushType: 'stroke'
        },
        hoverAnimation: true,
        label: {
            normal: {
                formatter: '{b}',
                position: 'right',
                show: true
            }
        },
        itemStyle: {
            normal: {
                color: '#f4e925',
                shadowBlur: 10,
                shadowColor: '#333'
            }
        },
        zlevel: 1
    }, {
        id: 'bar',
        zlevel: 2,
        type: 'bar',
        symbol: 'none',
        itemStyle: {
            normal: {
                color: '#ddb926'
            }
        },

        data: data
    }]
};


function renderBrushed(params) {
    var mainSeries = params.batch[0].selected[0];

    var selectedItems = [];
    var categoryData = [];
    var barData = [];
    var maxBar = 30;
    var sum = 0;
    var count = 0;

    for (var i = 0; i < mainSeries.dataIndex.length; i++) {
        var rawIndex = mainSeries.dataIndex[i];
        var dataItem = convertedData[0][rawIndex];
        var pmValue = dataItem.value[2];

        sum += pmValue;
        count++;

        selectedItems.push(dataItem);
    }

       selectedItems.sort(function (a, b) {
        //   return b.value[2] - a.value[2];
        return a.value-b.value;
       });

    for (var i = 0; i < Math.min(selectedItems.length, maxBar); i++) {
        categoryData.push(selectedItems[i].name);
        barData.push(selectedItems[i].value[2]);
    }

    this.setOption({
        yAxis: {
            data: categoryData
        },
        xAxis: {
            axisLabel: {
                show: !!count
            }
        },
        title: {
            id: 'statistic',
            text: count ? '平均: ' + (sum / count).toFixed(4) : ''
        },
        series: {
            id: 'bar',
            //        sort:'descending',
            data: barData
        }
    });
}
myChart.setOption(option);
</script>