$(document).ready(function () {

    function cargarComponentes() {
        $.ajax({
            data: {operacion: 1},
            url: 'ControladorAprovarPedidos',
            type: 'post',
            success: function (response) {
                //alert(response);
                $('#tablaPedidos').html(response);
                $.ajax({
                    data: {operacion: 2},
                    url: 'ControladorModificarPedido',
                    type: 'post',
                    success: function (response) {
                        $('#idsPedidos').html(response);
                    }
                });

            }
        });

    }
    cargarComponentes();
    
    $('#modificarValor').click(function (){
        var nuevoValor = $('#txtNuevoValor').val();
        var identificador = $('#cmbIDpedidos').val();
        if(nuevoValor != "" && identificador != ""){
            var id = parseInt(identificador);
            $.ajax({
                data: {operacion: 3, id: id, valor: nuevoValor},
                url: 'ControladorModificarPedido',
                type: 'post',
                success: function (response) {
                    //alert(response);
                    cargarComponentes();
                }
            });
        }
    });
});

