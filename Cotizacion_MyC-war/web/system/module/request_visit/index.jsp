<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../../../partials/master.jsp" %>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Solicitud de Visita
            <small>Encuentra y gestiona las solicitud de visita.</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fas fa-tachometer-alt"></i> Inicio</a></li>
            <li class="active">Solicitud de Visita</li>
        </ol>
    </section>


    <section class="content">
        <div class="row">
            <div class="col-sm-12">
                <div class="box box-primary">
                    <div class="box-header">
                        <h3 class="box-title">Inicio de Solicitud de Visita</h3>
                        <div class="box-tools pull-right">
                            <a href="${pageContext.request.contextPath}/RequestVisit/Create" class="btn btn-box-tool"><i
                                    class="fas fa-user-plus"></i></a>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">
                            <div class="col-sm-12">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Administrador</th>
                                        <th scope="col">Edificio</th>
                                        <th scope="col">F. Visita</th>
                                        <th scope="col">Observacion</th>
                                        <th scope="col">Acción</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach begin="1" end="30" varStatus="loop">
                                        <tr>
                                            <th scope="row">${loop.index}</th>
                                            <td>Otto</td>
                                            <td>Plaza Cochoa - Av. Siempre Viva 7171</td>
                                            <td>01/03/2017 12:15</td>
                                            <td>Se encuentra en mal estado la sala de caldera.</td>
                                            <td>
                                                <a href="${pageContext.request.contextPath}/RequestVisit/Edit"
                                                   class="btn btn-success btn-sm"><i class="fas fa-pen-square"></i></a>
                                                <button type="submit" class="btn btn-danger btn-sm" title="Eliminar"
                                                        onclick="delete_confirm('${pageContext.request.contextPath}/RequestVisit/Delete')">
                                                    <i
                                                            class="fa fa-minus-circle" aria-hidden="true"></i></button>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!-- /.box-body -->
                </div>
                <!-- /.box -->

            </div>
            <!-- /.col -->
        </div>
    </section>
    <!-- /.content -->
</div>
<%@include file="../../../partials/footer.jsp" %>