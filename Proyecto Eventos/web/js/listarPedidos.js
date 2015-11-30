$(document).ready(function () {

    function cargarComponentes() {

        $.ajax({
            data: {operacion: 1},
            url: 'ControladorAprovarPedidos',
            type: 'post',
            success: function (response) {
                //alert(response);
                $('#tablaPendientes').html(response);
                $.ajax({
                    data: {total: -1},
                    url: 'ControladorRegistrarPedido',
                    type: 'post',
                    success: function (response) {
                        idPedido = response;
                        $.ajax({
                            
                            url: 'ControladorListarPedidos',
                            type: 'post',
                            success: function (response) {
                                //alert(response);
                                $('#pedidosPendientes').html(response);

                            }
                        });
                    }
                });

            }
        });

    }
});
