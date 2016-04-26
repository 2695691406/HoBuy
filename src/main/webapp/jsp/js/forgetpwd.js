/**
 * 
 */
var phoneok = false;
var checknumberok = false;
var pwdok = false;
var s = 30;
function startTime() {
	// add a zero in front of numbers<10
	s = checkTime(s);
	document.getElementById('sendnumber').innerHTML = "已经发送" + s;
	document.getElementById('sendnumber').setAttribute("disabled", "disabled");
	s--;
	if (s > 0) {
		t = setTimeout('startTime()', 1000);
	} else {
		document.getElementById('sendnumber').innerHTML = "再次发送验证码";
		document.getElementById('sendnumber').removeAttribute("disabled");
		s = 30;
	}
}
function checkTime(i) {
	if (i < 10) {
		i = "0" + i
	}
	return i
}

$(function() {
	$("#phone").change(function() {
		var phone = $("#phone").val();
		if (phone.match("^[1][358]{1}[0-9]{9}") == null) {
			$("#phonediv").removeClass("has-success");
			$("#phonediv").addClass("has-error");
			$("#phonemsg").empty();
			$("#phonemsg").removeClass("label-success");
			$("#phonemsg").addClass("label-danger");
			$("#phonemsg").append("手机格式错误");
			return false;
		}
		var option = {
			url : "checkphoneforpwd.do",
			type : "post",
			dataType : "text",
			data : {
				phone : phone
			},
			success : function(response) {
				if (response == "1") {
					$("#phonediv").removeClass("has-success");
					$("#phonediv").addClass("has-error");
					$("#phonemsg").empty();
					$("#phonemsg").removeClass("label-success");
					$("#phonemsg").addClass("label-danger");
					$("#phonemsg").append("账号不存在");
					phoneok = false;
				} else {
					$("#phonediv").removeClass("has-error");
					$("#phonediv").addClass("has-success");
					$("#phonemsg").empty();
					$("#phonemsg").removeClass("label-danger");
					$("#phonemsg").addClass("label-success");
					phoneok = true;
					
				}
			},
			error : function() {
				alert("系统错误");
			}
		};
		$.ajax(option);
	})
	$("#sendnumber").click(function() {
		if (!phoneok) {
			$("#phonemsg").empty();
			$("#phonemsg").removeClass("label-success");
			$("#phonemsg").addClass("label-danger");
			$("#phonemsg").append("请輸入正確的手机号");
			return false;
		}
		var phone = $("#phone").val();

		var option = {
			url : "phonemessage.do",
			type : "post",
			dataType : "text",
			data : {
				phone : phone
			},
			success : function(response) {
				if (response == "1") {
					startTime();
					$("#checknumbermsg").empty();
					$("#checknumbermsg").removeClass("label-danger");
					$("#checknumbermsg").addClass("label-success");
					$("#checknumbermsg").append("验证码发送成功");

				} else {
					$("#checknumbermsg").empty();
					$("#checknumbermsg").removeClass("label-success");
					$("#checknumbermsg").addClass("label-danger");
					$("#checknumbermsg").append("验证码发送失败");
				}
			},
			error : function() {
				alert("系统错误");

			}
		};

		$.ajax(option);
	})

	$("#pwd")
			.change(
					function() {
						var pwd = $("#pwd").val();
						if (pwd
								.match("(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{8,30}") != null) {
							$("#pwddiv").removeClass("has-error");
							$("#pwddiv").addClass("has-success");
							$("#pwdmsg").empty();
							$("#pwdmsg").removeClass("label-danger");
							$("#pwdmsg").addClass("label-success");
							$("#pwdmsg").append("密码格式正确");
							pwdok = true;
						} else {
							$("#pwddiv").removeClass("has-success");
							$("#pwddiv").addClass("has-error");
							$("#pwdmsg").empty();
							$("#pwdmsg").removeClass("label-success");
							$("#pwdmsg").addClass("label-danger");
							$("#pwdmsg").append("8-30位需要包含大写字母小写字母特殊符号");
							pwdok = false;
						}

					})
	$("#checknumber").change(function() {
		var checknumber = $("#checknumber").val();
		if (checknumber.match("[0-9]{4}") != null) {
			$("#checknumbermsg").empty();
			$("#checknumbermsg").removeClass("label-danger");
			$("#checknumbermsg").addClass("label-success");
			$("#checknumbermsg").append("格式正确");
			checknumberok = true;
		} else {
			$("#checknumbermsg").empty();
			$("#checknumbermsg").removeClass("label-success");
			$("#checknumbermsg").addClass("label-danger");
			$("#checknumbermsg").append("格式不正确");
			checknumberok = false;
		}

	})
	$("#usersubmit").click(function() {
		if (!phoneok) {
			// alert("phone")
			$("#phone").change()
			return false;
		}
		$("#checknumber").change();
		if (!checknumberok) {
			return false;
		}
		$("#pwd").change();
		if (!pwdok) {
			return false;
		}

		return true;

	})

})
