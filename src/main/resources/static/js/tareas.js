$(document).ready(function () {
    cargarTareas();
    $('#tareas').DataTable();
});

async function cargarTareas(){

    const request = await fetch('tareas/lista', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const tareas = await request.json();

    let listadoHtml = '';
    for (let tarea of tareas) {
        let tareaHtml = '<tr class=\"alert\" role=\"alert\"><td><button type=\"button\">Edit</button></td><td class=\"d-flex align-items-center\"><div class=\"pl-3 email\"><span>' + tarea.nombre + '</span><span>Added: 01/03/2020</span></div></td><td>' + tarea.id + '</td><td class=\"status\"><span class=\"active\">' + tarea.completado + '</span></td><td><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\"><i class=\"fa fa-close\"></i></span></button></td></tr>\n';
        listadoHtml += tareaHtml;
    }

    $('#tareas tbody').html(listadoHtml);

}