<%@include file="../../../partials/master.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script>
    $(document).ready(function () {
        let inputName = $('#inputName');
        let inputRut = $('#inputRut');
        let inputBorn = $('#inputBorn');
        let slctCargo = $('#slctCargo');
        $('#form').submit(function (ev) {
            ev.preventDefault();
            let error = false;
            if (inputName.val().trim().length === 0) {
                toastr.error("Nombre vacio");
                error = true;
            }
            if (inputRut.val().trim().length === 0) {
                toastr.error("RUT  vacio");
                error = true;

            }
            if (inputBorn.val().trim().length === 0) {
                toastr.error("Fecha Nacimiento vacio");
                error = true;
            }
            if (slctCargo.find(":selected").index() === 0) {
                toastr.error("Cargo vacio");
                error = true;
            }

            if (!valid_rut(inputRut.val())) {
                toastr.error("RUT no valido");
                error = true;
            }

            if (!error) {
                toastr.success('Se ha creado el usuario');
                setTimeout(function () {
                    location.href = '${pageContext.request.contextPath}/Users';
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
            Usuarios
            <small>Crear a usuarios dentro del sistema.</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fas fa-tachometer-alt"></i> Inicio</a></li>
            <li class="active">Usuario</li>
        </ol>
    </section>


    <section class="content">
        <div class="row">
            <div class="col-sm-12">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">Creación de Usuario</h3>
                    </div>
                    <form role="form" id="form">
                        <div class="box-body">
                            <div class="form-group">
                                <label>Nombre </label>
                                <input type="text" class="form-control" id="inputName"
                                       placeholder="Ingresa el nombre">
                            </div>
                            <div class="form-group">
                                <label>RUT</label>
                                <input type="text" class="form-control" id="inputRut"
                                       placeholder="Ingresa el RUT">
                            </div>

                            <div class="form-group">
                                <label>Fecha Nacimiento</label>
                                <div class="input-group date" data-provide="datepicker">
                                    <input type="text" class="datepicker form-control" id="inputBorn"
                                           placeholder="dd/mm/yyyy">
                                    <div class="input-group-addon">
                                        <span class="far fa-calendar-alt"></span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label>Cargo</label>
                                    <select class="form-control" name="slctCargo" id="slctCargo">
                                        <option value="0">Selecciona una opción</option>
                                        <option value="AL">Administrador</option>
                                        <option value="WY">Ingeniero</option>
                                        <option value="">Técnico</option>
                                        <option value="">Cliente</option>
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