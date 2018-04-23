<%@include file="../../../partials/master.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script>
    $(document).ready(function () {
        let inputName = $('#inputName');
        let inputPrice = $('#inputPrice');
        $('#form').submit(function (ev) {
            ev.preventDefault();
            let error = false;
            if (inputName.val().trim().length === 0) {
                toastr.error("Nombre vacio");
                error = true;
            }


            if (inputPrice.val().trim().length == 0) {
                toastr.error("El precio se encuentra vacio");
                error = true;
            }
            if (!error) {
                toastr.success("Se ha modificado el servicio exitosamente.");
                setTimeout(function () {
                    location.href = '${pageContext.request.contextPath}/Services';
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
            Servicios
            <small>Crear a Servicios dentro del sistema.</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fas fa-tachometer-alt"></i> Inicio</a></li>
            <li class="active">Crear Servicio</li>
        </ol>
    </section>


    <section class="content">
        <div class="row">
            <div class="col-sm-12">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">Modificar el Servicio - Mantención de Caldera</h3>
                    </div>
                    <form role="form" id="form">
                        <div class="box-body">
                            <div class="form-group">
                                <label>Nombre </label>
                                <input type="text" class="form-control" id="inputName"
                                       placeholder="Ingresa el nombre" value="Mantención de Calderas">
                            </div>
                            <div class="form-group">
                                <label>Precio </label>
                                <input type="number" class="form-control" id="inputPrice"
                                       placeholder="0" min="0" value="150000">
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