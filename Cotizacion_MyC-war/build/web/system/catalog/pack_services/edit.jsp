<%@include file="../../../partials/master.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script>
    $(document).ready(function () {
        let inputName = $('#inputName');
        let slcServicio = $('#slcServicio');

        $('#form').submit(function (ev) {
            ev.preventDefault();
            let error = false;
            if (inputName.val().trim().length === 0) {
                toastr.error("Nombre vacio");
                error = true;
            }
            if (!error) {
                toastr.success('Se ha editado el pack de servicios');
                setTimeout(function () {
                    location.href = '${pageContext.request.contextPath}/PacksServices';
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
            Packs de Servicio
            <small>Crear a packs de servicios dentro del sistema.</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fas fa-tachometer-alt"></i> Inicio</a></li>
            <li class="active">Packs de Servicios</li>
        </ol>
    </section>


    <section class="content">
        <div class="row">
            <div class="col-sm-12">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">Packs de Servicios</h3>
                    </div>
                    <form role="form" id="form">
                        <div class="box-body">
                            <div class="form-group">
                                <label>Nombre </label>
                                <input type="text" class="form-control" id="inputName"
                                       placeholder="Ingresa el nombre" value="Mantenciones">
                            </div>
                            <div class="form-group">
                                <label>Tipo de Servicio</label>
                                <select class="form-control" name="slcServicio" id="slcServicio" multiple>
                                    <option value="" selected>Mantencion Calderas</option>
                                    <option value="" selected>Mantencion Gas</option>
                                    <option value="" selected>Mantencion Agua</option>
                                    <option value="" selected>Mantencion Tejado</option>
                                    <option value="">Mantencion Industrial</option>
                                </select>
                            </div>
                        </div>
                        <!-- /.box-body -->

                        <div class="box-footer">
                            <button type="submit" class="btn btn-primary">Crear</button>
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