<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../../../partials/master.jsp" %>
<script>
    $(document).ready(function () {
        let slcCotizacion = $('#slcCotizacion');

        $('#form').submit(function (ev) {
            ev.preventDefault();
            let error = false;
            if (slcCotizacion.find(":selected").index() === 0) {
                toastr.error("Tiempo de cotización vacio");
                error = true;
            }

            if (!error) {
                toastr.success('Se está generando el reporte, se notificará a su correo.');
                setTimeout(function () {
                    location.href = '${pageContext.request.contextPath}/ReportRequestPrice';
                }, 3000);
            }
        });


    });
</script>


<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Reporte de Cotizaciones
            <small>Genera un reporte a partir de una opción seleccionada.</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fas fa-tachometer-alt"></i> Inicio</a></li>
            <li class="active">Reportes</li>
            <li class="active">Cotizacion</li>
        </ol>
    </section>


    <section class="content">
        <div class="row">
            <div class="col-sm-12">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">Reportes de Cotizaciones</h3>
                    </div>
                    <!-- /.box-header -->
                    <!-- form start -->
                    <form role="form" id="form">
                        <div class="box-body">

                            <div class="form-group">
                                <label>Tiempo de Cotizacion</label>
                                <select class="form-control" name="slcCotizacion" id="slcCotizacion">
                                    <option value="0">Selecciona una opción</option>
                                    <option value="AL">Diario</option>
                                    <option value="">Semamanal</option>
                                    <option value="WY">Mensual</option>
                                    <option value="">Anual</option>
                                </select>
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <button type="submit" id="submit" class="btn btn-primary float-right">Enviar</button>
                        </div>
                    </form>
                </div>
                <!-- /.box -->

            </div>
            <!-- /.col -->
        </div>
    </section>
    <!-- /.content -->
</div>
<%@include file="../../../partials/footer.jsp" %>