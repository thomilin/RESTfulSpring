$(document).ready(function () {
    cargarTareas();
    $('#tareas').DataTable();
});

async function cargarTareas(){

        const request = await fetch('tarea/1111', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        });
        const tareas = await request.json();

        console.log(tareas);

}