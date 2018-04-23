<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../../../partials/master.jsp" %>
<script>
    $(document).ready(function () {
        let fecha = $('#fecha');
        let observacion = $('#observacion');

        $('#form').submit(function (ev) {
            ev.preventDefault();
            let error = false;
            if (fecha.val().trim().length === 0) {
                toastr.error("Fecha vacia");
                error = true;
            }
            if (observacion.val().trim().length === 0) {
                toastr.error("Observacion vacia");
                error = true;

            }

            if (!error) {
                toastr.success('Se ha creado la solicitud de visita.');
                setTimeout(function () {
                    location.href = '${pageContext.request.contextPath}/RequestVisit';
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
            Solicitud de visita
            <small>Solicita una visita.</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fas fa-tachometer-alt"></i> Inicio</a></li>
            <li class="active">Usuario</li>
            <li class="active">Solicitud</li>
        </ol>
    </section>


    <section class="content">
        <div class="row">
            <div class="col-sm-12">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">Solicitud de Visita</h3>
                    </div>
                    <!-- /.box-header -->
                    <!-- form start -->
                    <form role="form" id="form">
                        <div class="box-body">
                            <div class="form-group">
                                <label for="">Indique fecha y hora</label>
                                <input type="datetime-local" class="form-control" id="fecha"/>

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="observacion">Observación </label>
                            <textarea rows="3" class="form-control" id="observacion"
                                      placeholder="Ingresa una observación para la visita"></textarea>
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