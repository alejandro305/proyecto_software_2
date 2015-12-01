$(document).ready(function () {

    function cargarComponentes() {

        $.ajax({
            data: {operacion: 1},
            url: 'ControladorAprovarPedidos',
            type: 'post',
            success: function (response) {
                //alert(response);
                $('#tablaPendientes').html(response);

            }
        });

    }
});
