/**
 * 
 */
function aTestMethod(){
	$.ajax({
		url:"adivTest",
        type:"POST",  
		contentType:"application/json;charset=utf-8",  
        data:'{"name":"tanny","age":"18"}',
		async:false,
		dataType: 'json', 
		success:function(data){
				$("#adiv").html(data.name+":"+data.sex);
			}	
		});
}
function bTestMethod(){
	$.ajax({
		url:"bdivTest",
        type:"POST",  
		contentType:"application/json;charset=utf-8",  
        data:'{"name":"tanny","age":"18"}',
		async:false,
		dataType: 'json', 
		success:function(data){
				$("#bdiv").html(data.name+":"+data.sex);
			}	
		});
}