<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../../../partials/master.jsp" %>
<script>
    $(document).ready(function () {
        let inputAntecedentes = $('#inputAntecedentes');
        let inputFecha = $('#inputFecha');
        let inputPrice = $('#inputPrice');
        let inputObservacion = $('#inputObservacion');
        let slctEstado = $('#slctEstado');
        $('#form').submit(function (ev) {
            ev.preventDefault();
            let inputFileAntecedentesLength = $('#inputFileAntecedentes')[0].files.length;
            console.log(inputFileAntecedentes);
            let error = false;
            if (inputAntecedentes.val().trim().length === 0) {
                toastr.error("Antecedentes vacio");
                error = true;
            }
            if (inputFecha.val().trim().length === 0) {
                toastr.error("Fecha vacia");
                error = true;
            }
            if (inputPrice.val().trim().length === 0) {
                toastr.error("Valor de cotización vacia");
                error = true;
            }
            if (inputObservacion.val().trim().length === 0) {
                toastr.error("Observación vacia");
                error = true;
            }
            if (inputFileAntecedentesLength === 0) {
                toastr.error("Adjunto de Antecedentes vacio");
                error = true;
            }
            if (slctEstado.find(":selected").index() === 0) {
                toastr.error("Estado vacio");
                error = true;
            }
            if (!error) {
                toastr.success('Se ha creado la solicitud de cotización.');
                setTimeout(function () {
                    location.href = '${pageContext.request.contextPath}/RequestPrice';
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
            Cotizaciones
            <small>Crea una cotización.</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fas fa-tachometer-alt"></i> Inicio</a></li>
            <li class="active">Usuario</li>
            <li class="active">Cotización</li>
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
                    <form role="form" id="form" enctype="multipart/form-data">
                        <div class="box-body">
                            <div class="form-group">
                                <label>Antecedentes del problema </label>
                                <textarea rows="3" class="form-control" id="inputAntecedentes"
                                          placeholder="Ingresa los antecedentes de cotización"></textarea>
                            </div>
                            <div class="form-group">
                                <label>Indique fecha y hora</label>
                                <div class='input-group date' id='datetimepicker'>
                                    <input type='datetime-local' class="form-control" id="inputFecha"/>
                                    <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                </div>
                                <div class="form-group">
                                    <label>Valor cotización</label>
                                    <input id="inputPrice" type='number' class="form-control" min="0"/>
                                </div>
                                <div class="form-group">
                                    <label>Observación </label>
                                    <textarea rows="3" class="form-control" id="inputObservacion"
                                              placeholder="Ingresa una observación para la cotización"></textarea>
                                </div>
                                <div class="form-group">
                                    <label>Estado</label>
                                    <select id="slctEstado" class="form-control">
                                        <option value="0">Selecciona un estado</option>
                                        <option value="1">Visita en terreno</option>
                                        <option value="2">Generada por técnico</option>
                                        <option value="3">Revisada por ingeniero</option>
                                        <option value="4">Confirmada por administrador</option>
                                        <option value="5">Pospuesta</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>Antecedentes</label>
                                    <input type="file" name="antecedentes" id="inputFileAntecedentes" multiple>
                                </div>
                            </div>
                            <!-- /.box-body -->
                            <div class="box-footer">
                                <button type="submit" id="submit" class="btn btn-primary float-right">Crear</button>
                            </div>
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