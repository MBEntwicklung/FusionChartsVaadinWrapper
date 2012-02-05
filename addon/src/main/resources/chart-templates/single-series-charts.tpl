<chart 
	caption='${caption}' 
	subcaption='${subcaption}' 
	xAxisName='${xAxisName}' 
	yAxisName='${yAxisName}' 
	numberPrefix='${numberPrefix}'>
 
#foreach( $set in $sets )
     <set label='$set.label' value='$set.value' />
#end

 </chart>