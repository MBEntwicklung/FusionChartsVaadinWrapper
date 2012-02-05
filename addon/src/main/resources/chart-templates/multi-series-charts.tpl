<chart 
	caption='${chart.caption}' 
	subcaption='${chart.subcaption}' 
	xAxisName='${chart.xAxisName}' 
	yAxisName='${chart.yAxisName}' 
	numberPrefix='${chart.numberPrefix}'>
 
    <categories>
 
#foreach( $set in $categories )
	#if ($set.dataType == "CATEGORY")
	<category label='$set.label' />
	#end
	#if ($set.dataType == "VLINE")
	<vLine color='$set.color' thickness='$set.thickness'/>
	#end
#end

    </categories>
 
#foreach( $dataset in $datasets )
    <dataset seriesName='$dataset.seriesName'>
    #foreach( $set in $dataset.sets )
       <set value='$set.value' />
    #end
    </dataset>
#end
 
<trendlines>
#foreach( $line in $trendlines )
	<line startValue='$line.startValue' color='$line.color' displayValue='$line.displayValue' />
 #end
</trendlines>
 

 </chart> 