/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    var idPedido;
    var valorTotalPedido = 0;
    $("#valorPedido").html('<h1>TOTAL: $'+valorTotalPedido+'</h1>');


    $.ajax({
        data: {total: -1},
        url: 'ControladorRegistrarPedido',
        type: 'post',
        success: function (response) {
            idPedido = response;
            $.ajax({
                data: {total: -2},
                url: 'ControladorRegistrarPedido',
                type: 'post',
                success: function (response) {
                    //alert(response);
                    $('#platosDisponibles').html(response);

                }
            });
        }
    });
    
    $("#adicionarAlPedido").click(function (){
        var nombrePlato = $("#cmbPlatos").val();
        var cantidad = $("#cantidad").val();
        $.ajax({
                data: {total: 0 ,idPerdido: idPedido, nombrePlato: nombrePlato, cantidad: cantidad},
                url: 'ControladorRegistrarPedido',
                type: 'post',
                success: function (response) {
                    var valor = parseInt(response);
                    var datos = nombrePlato+"   "+cantidad+"    $"+valor+"</br>";
                    $('#platosSeleccionados').append(datos);
                    valorTotalPedido = valorTotalPedido+valor;
                    $("#valorPedido").html('<h1>TOTAL: $'+valorTotalPedido+'</h1>');
                }
            });
    });
    
    $("#AceptarPedido").click(function (){
        $.ajax({
                data: {total: -3 ,idPedido: idPedido, valorTotalPedido: valorTotalPedido},
                url: 'ControladorRegistrarPedido',
                type: 'post',
                success: function () {
                    window.location = "index.jsp";
                }
            });
    });


});

