<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Admin MyC | Ingresar</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.7 -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="css/AdminLTE.css">
        <link rel="stylesheet" href="css/toastr.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="css/icheck/skins/square/blue.css">
        <!-- jQuery 3 -->
        <script src="js/admin.js"></script>

        <script>
            $(document).ready(function () {
                let btnIngresar = $('#btnIngresar');
                let txtEmail = $('#email');
                let txtPassword = $('#password');
                let email_save = "jos.nuneza@gmail.com";
                let password_save = sha512("123456").toString();

                btnIngresar.click(function () {
                    let email_input_save = txtEmail.val();
                    let password_input_save = sha512(txtPassword.val()).toString();
                    let error = false;
                    if (txtEmail.val().trim().length === 0) {
                        toastr.error("Correo vacio");
                        error = true;
                    }
                    if (txtPassword.val().trim().length === 0) {
                        toastr.error("Contraseña vacia");
                        error = true;
                    }
                    if (!validateEmail(document.getElementById('email')) && txtEmail.val().trim().length > 0) {
                        toastr.error("Correo no valido");
                        error = true;
                    }
                    if (email_input_save != email_save && txtEmail.val().trim().length > 0) {
                        toastr.error("No existe el correo");
                        error = true;
                    }
                    if (password_input_save != password_save && txtPassword.val().trim().length > 0) {
                        toastr.error("Contraseña incorrecta");
                        error = true;
                    }

                })
            });
            $(function () {
                $('input').iCheck({
                    checkboxClass: 'icheckbox_square-blue',
                    radioClass: 'iradio_square-blue',
                    increaseArea: '20%' // optional
                });
            });
        </script>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Google Font -->
        <link rel="stylesheet"
              href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
    </head>
    <body class="hold-transition login-page">
        <div class="login-box">
            <div class="login-logo">
                <a href="#"><b>Admin</b>MyC</a>
            </div>
            <!-- /.login-logo -->
            <div class="login-box-body">
                <p class="login-box-msg">Ingresa tus credenciales</p>

                <form action="${pageContext.request.contextPath}/Login" method="post">
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" placeholder="RUT" id="email" name="txtRut">
                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" placeholder="Contraseña" id="password" name="txtPassword">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>

                    <div class="form-group has-feedback">
                        <button type="submit" class="btn btn-primary">Ingresar</button>
                    </div>
                </form>

            </div>
            <!-- /.login-box-body -->
        </div>
        <!-- /.login-box -->


    </body>
</html>
