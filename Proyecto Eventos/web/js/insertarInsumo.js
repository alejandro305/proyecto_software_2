/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(
        function () {
            $('#ingresar').click(function () {
                nombre = $('#nombre').val();
                medida = $('#medida').val();
                //alert(nombre+" "+ medida);
                $.ajax({
                    data: {nombre: nombre, medida: medida},
                    url: 'PruebaControladorInsertarInsumo',
                    type: 'post',
                    success: function (response) {
                        location.reload();
                    }
                });
            });
        }
);