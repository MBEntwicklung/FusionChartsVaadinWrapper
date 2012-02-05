<chart 
	caption='${chart.caption}' 
	subcaption='${chart.subcaption}' 
	xAxisName='${chart.xAxisName}' 
	yAxisName='${chart.yAxisName}' 
	numberPrefix='${chart.numberPrefix}'>
 
#foreach( $set in $sets )
	#if ($set.dataType == "SET")
	<set label='$set.label' value='$set.value' />
	#end
	#if ($set.dataType == "VLINE")
	<vLine color='$set.color' thickness='$set.thickness'/>
	#end
#end

<trendlines>
#foreach( $line in $trendlines )
	<line startValue='$line.startValue' color='$line.color' displayValue='$line.displayValue' />
 #end
</trendlines>
 

 </chart>