 document.addEventListener("DOMContentLoaded", function() {
     const form = document.getElementById('form-responder');
     const radios = document.querySelectorAll('input[type="radio"]');
     const btnResponder = document.getElementById('btn-responder');

     radios.forEach(function(radio) {
        radio.addEventListener('change', function() {
           btnResponder.disabled = false;
        });
     });
 });

 document.addEventListener("DOMContentLoaded", function() {
     const form = document.getElementById('form-responder');
     const opciones = form.querySelectorAll('input[type="radio"]');

     opciones.forEach(function(opcion) {
         opcion.addEventListener('change', function() {
             opciones.forEach(function(op) {
                 if (op !== opcion) {
                     op.disabled = true;
                 }
             });
         });
     });
 });

document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById('form-responder');
    const opciones = form.querySelectorAll('input[type="radio"]');
    const indiceRespuestaCorrecta = form.getAttribute('data-indice-respuesta');

    opciones.forEach(function(opcion) {
        opcion.removeEventListener('change', handleRadioChange);
    });

    opciones.forEach(function(opcion) {
        opcion.addEventListener('change', handleRadioChange);
    });

    function cambiarColorOpcion(indice, color) {
         const opcion = form.elements['indice'][indice];
         if (opcion) {
            const label = form.querySelector(`label[for="${opcion.id}"]`);
            label.style.color = color;
         } else {
            console.error(`No se encontró una opción en el índice ${indice}.`);
         }
    }

    function handleRadioChange() {
        opciones.forEach(function(op) {
            op.parentNode.classList.remove('respuesta-correcta', 'respuesta-incorrecta');
        });


        const opcionSeleccionada = this.value;
        if(opcionSeleccionada == indiceRespuestaCorrecta) {
            console.log("Le pegaste");
            cambiarColorOpcion(opcionSeleccionada, '#00CC00');
        } else {
            console.log("No le pegaste");
            cambiarColorOpcion(opcionSeleccionada, 'red');
            cambiarColorOpcion(indiceRespuestaCorrecta, '#00CC00');
        }
    }
});


