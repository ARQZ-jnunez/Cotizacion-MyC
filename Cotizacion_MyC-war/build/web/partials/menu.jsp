<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<ul class="sidebar-menu" data-widget="tree">
    <li class="header">Navegación</li>
        <li class="treeview <%=request.getAttribute("javax.servlet.forward.request_uri").
            equals(request.getContextPath() + "/Users") || request.getAttribute("javax.servlet.forward.request_uri").
            equals(request.getContextPath() + "/Services") ||  request.getAttribute("javax.servlet.forward.request_uri").
                            equals(request.getContextPath() + "/PacksServices") ? "active" : ""%>">
        <a href="#">
            <i class="fas fa-info-circle"></i> <span>Catalogo</span>
            <span class="float-right-container">
                <i class="fa fa-angle-left float-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
            <li 
                <%=request.getAttribute("javax.servlet.forward.request_uri").
                    equals(request.getContextPath()+"/Users") ? "class='active'" : ""%>>
                <a href="${pageContext.request.contextPath}/Users"><i class="fas fa-circle-notch"></i> Usuarios</a></li>
            <li
                <%=request.getAttribute("javax.servlet.forward.request_uri").
                         equals(request.getContextPath() + "/Services") ? "class='active'" : ""%>>
                <a href="${pageContext.request.contextPath}/Services"><i class="fas fa-circle-notch"></i> Servicios</a></li>
            <li
                <%=request.getAttribute("javax.servlet.forward.request_uri").
                        equals(request.getContextPath() + "/PacksServices") ? "class='active'" : ""%>>
                <a href="${pageContext.request.contextPath}/PacksServices"><i class="fas fa-circle-notch"></i> Pack de Servicios</a></li>
        </ul>
    </li>
    <li class="treeview">
        <a href="#">
            <i class="fas fa-compress"></i> <span>Modulo</span>
            <span class="float-right-container">
                <i class="fa fa-angle-left float-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
            <li><a href="${pageContext.request.contextPath}/RequestPrice"><i class="fas fa-circle-notch"></i> Cotización</a></li>
            <li><a href="${pageContext.request.contextPath}/RequestVisit"><i class="fas fa-circle-notch"></i> Solicitud de Visita</a></li>
        </ul>
    </li>
    <li class="treeview">
        <a href="#">
            <i class="fas fa-book"></i> <span>Informes</span>
            <span class="float-right-container">
                <i class="fa fa-angle-left float-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
            <li><a href="${pageContext.request.contextPath}/Report/RequestPrice"><i class="fas fa-circle-notch"></i> Cotizaciones</a></li>
        </ul>
    </li>
</ul>