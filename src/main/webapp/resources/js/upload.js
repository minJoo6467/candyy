function checkImageType(fileName) {
	var pattern = /jpg$|gif$|png$|jpeg/i;
	return fileName.match(pattern);
}

function getFileInfo(fullName){
	
	var fileName,imgsrc,getLink;
	
	var fileLink;
	
	if(checkImageType(fullName)){
		imgsrc="/display?fileName="+fullName;
		fileLink=fullName.substr(14);
		
		var front = fullName.substr(0,12);
		var end = fullName.substr(14);
		getLink = "/display?fileName="+front+end;
	}
	else{
		imgsrc="/resources/images/fileiconicon.jpg";
		fileLink = fullName.substr(12);
		getLink = "/display?fileName="+fullName;
		
	}
	fileName=fileLink.substr(fileLink.indexOf("_")+1);
	return {fileName:fileName,imgsrc:imgsrc,getLink:getLink,fullName:fullName};
}