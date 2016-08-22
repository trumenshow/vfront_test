$("#insertB").click(function(){
	alert("insert worker");
	location.href="insertWorker";
});

$("#submitB").click(function(){
	var numValue = parseInt($("#numCheck").val());
	var numLength = $("#numCheck").val().length;
	
	alert(numValue);
	if(isNaN(numValue) || numLength>3){
		alert("3자리 이하의 번호를 입력해주세요");
		return;
	}else{
		alert("here");
	}
	
	
	document.getElementsByName("insertfrm")[0].submit();
});

