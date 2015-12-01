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
                    data: {operacion: 2},
                    url: 'ControladorAprovarPedidos',
                    type: 'post',
                    success: function (response) {
                        idPedido = response;
                        $('#pedidosPendientes').html(response);
                    }
                });

            }
        });

    }

    cargarComponentes();
    $('#aprobarPedido').click(function () {
        var identificador = $('#cmbIDPlatos').val();
        if (identificador != "") {
            var id = parseInt(identificador);
            $.ajax({
                data: {operacion: 3, id: id, estado: "APROBADO"},
                url: 'ControladorAprovarPedidos',
                type: 'post',
                success: function (response) {
                    //alert(response);
                    cargarComponentes();
                }
            });
        } else {
            alert("Seleccione el identificador del pedido que desea aproobar o denegar");
        }
    });

    $('#denegarPedido').click(function () {
        var identificador = $('#cmbIDPlatos').val();
        if (identificador != "") {
            var id = parseInt(identificador);
            $.ajax({
                data: {operacion: 3, id: id, estado: "DENEGADO"},
                url: 'ControladorAprovarPedidos',
                type: 'post',
                success: function (response) {
                    //alert(response);
                    cargarComponentes();
                }
            });
        } else {
            alert("Seleccione el identificador del pedido que desea aproobar o denegar");
        }
    });
});


