
function toVaild(){
		 var name = $("#name").val();
		 var  id= $("#id").val();
         if (name == ""){
 		    alert("姓名不可为空");
 		    return false;
 		}
 		if (id == ""){
 		    alert("身份证号不能为空");
 		    return false;
 		}
      }
