/**
 * 
 */

option = {
	title : {
		text : '折线图堆叠'
	},
	tooltip : {
		trigger : 'axis'
	},
	legend : {
		// data:['邮件营销','联盟广告','视频广告','直接访问','搜索引擎']
		data : [ '黄敏', '马康康', '单昌亮', '范平平', '邬华龙', '董雨翔', '苑金东', '张余粮', '程伟伟',
				'姚远', '张辽', '姚夏', '许成林', '张文强', '王丰', '王俊', '刘磊', '夏超超', '胡小东' ]
	},
	grid : {
		left : '3%',
		right : '4%',
		bottom : '3%',
		containLabel : true
	},
	toolbox : {
		feature : {
			saveAsImage : {}
		}
	},
	xAxis : {
		type : 'category',
		boundaryGap : false,
		data : [ '第一次JavaBase', '第二次WebBase', '第三次JavaWeb', '第四次DataBase',
				'第五次' ]
	},
	yAxis : {
		type : 'value'
	},
	series : [ {
		name : '黄敏',
		type : 'line',
		stack : '总量',
		data : [ 70.83, 84, 78, 76.7, 85 ]
	}, {
		name : '马康康',
		type : 'line',
		stack : '总量',
		data : [ 56.67, 84, 95, 81.7, 80 ]
	}, {
		name : '单昌亮',
		type : 'line',
		stack : '总量',
		data : [ 90.83, 96.67, 92, 90, 80.8 ]
	}, {
		name : '范平平',
		type : 'line',
		stack : '总量',
		data : [ 85, 85, 89, 77.1, 80.8 ]
	}, {
		name : '邬华龙',
		type : 'line',
		stack : '总量',
		data : [ 71.67, 71.50, 79, 89.6, 87.5 ]
	}, {
		name : '董雨翔',
		type : 'line',
		stack : '总量',
		data : [ 76.25, 85, 77, 79, 80 ]
	}, {
		name : '苑金东',
		type : 'line',
		stack : '总量',
		data : [ 43.3, 54, 58, 71.7, 0 ]
	}, {
		name : '张余粮',
		type : 'line',
		stack : '总量',
		data : [ 72.5, 72.5, 86, 53.3, 65.8 ]
	}, {
		name : '程伟伟',
		type : 'line',
		stack : '总量',
		data : [ 56.67, 80, 90, 75.8, 85 ]
	}, {
		name : '姚远',
		type : 'line',
		stack : '总量',
		data : [ 70, 73.8, 86, 80.4, 71.7 ]
	}, {
		name : '张辽',
		type : 'line',
		stack : '总量',
		data : [ 80.83, 76, 84, 0, 0 ]
	}, {
		name : '姚夏',
		type : 'line',
		stack : '总量',
		data : [ 39.17, 65, 60, 80.8, 79.2 ]

	}, {
		name : '许成林',
		type : 'line',
		stack : '总量',
		data : [ 56.67, 60, 64, 0, 0 ]
	}, {
		name : '张文强',
		type : 'line',
		stack : '总量',
		data : [ 91.67, 93.33, 96, 82.1, 80 ]
	}, {
		name : 'xxx',
		type : 'line',
		stack : '总量',
		data : [ 71.67, 71.50, 79, 89.6, 87.5 ]
	}, {
		name : 'xxx',
		type : 'line',
		stack : '总量',
		data : [ 71.67, 71.50, 79, 89.6, 87.5 ]
	}, {
		name : 'xxx',
		type : 'line',
		stack : '总量',
		data : [ 71.67, 71.50, 79, 89.6, 87.5 ]
	}, {
		name : 'xxx',
		type : 'line',
		stack : '总量',
		data : [ 71.67, 71.50, 79, 89.6, 87.5 ]
	}, {
		name : 'xxx',
		type : 'line',
		stack : '总量',
		data : [ 71.67, 71.50, 79, 89.6, 87.5 ]
	}

	]
};
