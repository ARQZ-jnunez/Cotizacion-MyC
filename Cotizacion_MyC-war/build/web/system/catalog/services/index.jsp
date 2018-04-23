<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../../../partials/master.jsp" %>
<script>
    $(document).ready(function () {
        $('#dataTableUsers').DataTable({
            order: [[0, "desc"]],
            sDom: '<"top"if>rt<"bottom"lp><"clear">',
            lengthMenu: [[10, 25, 50, -1], [10, 25, 50, "Todo"]],
            deferRender: true,
            pageLength: 25,
            stateSave: true,
            language: {
                "paginate": {
                    "first": "Primero",
                    "last": "Ultimo",
                    "next": "Siguiente",
                    "previous": "Anterior"
                },
                "search": "",
                "sZeroRecords": '<div id="error-noData">' +
                        '<div id="content-error-noData">' +
                        '<i class="fa fa-database"></i>' +
                        '<h1> No se han encontrado registros </h1>' +
                        '</div></div>',
                "emptyTable": '<div id="error-noData">' +
                        '<div id="content-error-noData">' +
                        '<i class="fa fa-database"></i>' +
                        '<h1> No se han encontrado registros</h1>' +
                        '</div></div>',
                "zeroRecords": '<div id="error-noData">' +
                        '<div id="content-error-noData">' +
                        '<i class="fa fa-database"></i>' +
                        '<h1> No se han encontrado registros</h1>' +
                        '</div></div>',
                "loadingRecords": '<div id="error-noData">' +
                        '<div id="content-error-noData">' +
                        '<i class="fa fa-circle-o-notch fa-spin fa-fw"></i>' +
                        '<h1> Buscando registros</h1>' +
                        '</div></div>',
                "processing": '<div id="error-noData">' +
                        '<div id="content-error-noData">' +
                        '<i class="fa fa-circle-o-notch fa-spin fa-fw"></i>' +
                        '<h1> Buscando registros</h1>' +
                        '</div></div>',
                "infoEmpty": "Mostrando 0 a 0 de 0 registros",
                "info": "Mostrando _START_ a _END_ de _TOTAL_ registros",
                "infoFiltered": "(Filtrado de _MAX_ total registros)",
                "lengthMenu": "Mostrar _MENU_ registros",
                searchPlaceholder: "Buscar..."
            }

        });
    });

</script>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Servicios
            <small>Encuentra y gestiona todos los servicios dentro de la empresa MyC.</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fas fa-tachometer-alt"></i> Inicio</a></li>
            <li class="active">Servicios</li>
        </ol>
    </section>


    <section class="content">
        <div class="row">
            <div class="col-sm-12">
                <div class="box box-primary">
                    <div class="box-header">
                        <h3 class="box-title">Inicio de Servicios</h3>
                        <div class="box-tools pull-right">
                            <a href="${pageContext.request.contextPath}/Services/Create" class="btn btn-box-tool"><i
                                    class="fas fa-plus-circle"></i></a>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">
                            <div class="col-sm-12">
                                <table id="dataTableUsers" class="display" style="width:100%">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Nombre Servicio</th>
                                            <th>Precio</th>
                                            <th>Acción</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${services}" var="service">
                                            <tr>
                                                <td>${service.getId()}</td>
                                                <td>${service.getName()}</td>
                                                <td>${service.getPrice()}</td>
                                                <td></td>
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