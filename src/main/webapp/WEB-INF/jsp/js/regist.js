/**
 * 
 */
 var validator1;
    $(document).ready(function () {
        validator1 = $("#demoForm").validate({
            debug: true,
            rules: {
                email: {
                    email: true,
                    required: true
                },
               phone:{
            	   required: true,
            	   rangelength:[11,11],
            	   number:true
                },
                password: {
                    required: true,
                    minlength: 6,
                    maxlength: 16
                },
                "confirm-password": {
                    equalTo: "#password"
                },

            },
            messages: {
                email: {
                	required: '请输入邮箱',
                    email: '请检查邮箱格式',
                    remote: '用户不存在'
                },
                phone:{
                	required : "请输入手机号",
                	rangelength:"手机号码的长度为11位",
                    number:'请输入数字'
                },
                password: {
                    required: '请输入密码',
                    minlength: '密码不能小于6个字符',
                    maxlength: '密码不能超过16个字符'
                },
                "confirm-password": {
                    equalTo: "两次输入密码不一致"
                }

            },           
            highlight: function(element, errorClass, validClass) {
                $(element).addClass(errorClass).removeClass(validClass);
                $(element).fadeOut().fadeIn();
            },
            unhighlight: function(element, errorClass, validClass) {
                $(element).removeClass(errorClass).addClass(validClass);
            },
            submitHandler: function (form) {
                console.log($(form).serialize())
            }
        });

        $("#check").click(function () {
            console.log($("#demoForm").valid() ? "填写正确" : "填写不正确");
        });
    });