<#assign base=rc.contextPath />
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title> - 登录</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico"> 
    <link href="css/login/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/login/style.css?v=4.1.0" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
   <script>if(window.top != window.self){ window.top.location = window.location;}</script>
</head>

<body class="gray-bg">
<input type="hidden" id="base" value="${base}" />
    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">h</h1>

            </div>
            <h3>欢迎使用IT智能运维管理平台</h3>

            <div class="m-t" role="form" action="">
                <div class="validate_faqadd spa1"></div> 
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="用户名" name="nameOrEmail" id="nameOrEmail" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="密码" name="UserPassword" id="userPassword" required="">
                </div>
                
                <button  class="btn btn-primary block full-width m-b" id = "sub">登 录</button>


                <p class="text-muted text-center">  <a href="register.html">注册一个新账号</a></p>

            </div>
        </div>
    </div>

    <!-- 全局js -->
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/login/bootstrap.min.js?v=3.3.6"></script>

      <script>
    var base = $('#base').val();
	$("#sub").click(function(){
	var urlpath;	
	var  nameOrEmail = document.getElementById("nameOrEmail").value;
    var  userPassword = document.getElementById("userPassword").value;
         
        $.ajax({
            type: "POST",
            url: base+"/saveLogin",
            data: {
                "nameOrEmail":nameOrEmail,
                "userPassword": userPassword
            },
            async:false,
            dataType: "json",
            success: function(data) {
            	urlpath = data.urlPath;
            	if(data.value=="0"){
            	alert("用户名或密码有误！");
				self.location='login.html';
			}else if(data.value=="1"){	
				//window.open(base+data.urlPath);
				self.location.href = base+urlpath;
        	}                	
            }
           
        }) 

	})
  
  </script> 
    

</body>

</html>
