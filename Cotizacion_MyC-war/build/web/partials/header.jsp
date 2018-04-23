<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <header class="main-header">
        <!-- Logo -->
        <a href="admin.jsp" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>A</b>LT</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Admin</b>LTE</span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <i class="fas fa-bars"></i>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="${pageContext.request.contextPath}/images/avatar.png" alt="" class="avatar_image">
                            <span class="hidden-xs">Jose Nuñez</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->

                            <li class="user-header">
                                <img src="${pageContext.request.contextPath}/images/avatar.png" alt="" class="avatar_image">
                                <p>
                                    Jose Nuñez - Web Developer
                                    <small></small>
                                </p>
                            </li>
                            <!-- Menu Body -->
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="float-left">
                                    <a href="#" class="btn btn-default btn-flat">Perfil</a>
                                </div>
                                <div class="float-right">
                                    <a href="#" class="btn btn-default btn-flat">Salir</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <!-- Control Sidebar Toggle Button -->
                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="float-left image">
                    <img src="${pageContext.request.contextPath}/images/avatar.png" alt="" class="avatar_image">
                </div>
                <div class="float-left info">
                    <p>Jose Nuñez</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>
            <!-- search form -->
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <%@include file="menu.jsp" %>
        </section>
        <!-- /.sidebar -->
    </aside>