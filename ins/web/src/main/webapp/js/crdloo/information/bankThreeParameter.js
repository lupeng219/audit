
function toVaild(){
		 var name = $("#name").val();
		 var  id= $("#id").val();
		 var bank_id = $("#bank_id").val();
         if (name == ""){
 		    alert("姓名不可为空");
 		    return false;
 		}
 		if (id == ""){
 		    alert("身份证号不能为空");
 		    return false;
 		}
 		if (bank_id == ""){
 			alert("银行卡号不能为空");
 			return false;
 		}
      }
