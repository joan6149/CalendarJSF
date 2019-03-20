//jQUERY 

$(document).ready( function() {
	//$(".menuList").hide();
	$("#home").click( function() {
		var Element = $("#menuUserPrincipal");
		Element.html(	"<p class=\"Subtitulo\">Panel de adminstracion de proyectos</p>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\">Definiciones</button>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\" id=\"Inversiones\">Inversiones</button>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\">Homologaciones</button>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\">Información</button>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\">Personalizaciones</button>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\">Seguimiento</button>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\">Varios</button>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\">Acta</button>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\">Planos</button>" +
						"<button class=\"btn btn-outline-success menuButtons col-md-2\">Esquemas</button>");
		Element.fadeIn();
	});

	$(".menuButtons").click( function() {
		var Element = $("#mainSection");
		Element.html(	"<article class=\"row viewer text-center\">" +
						"<div class=\"col-md-1\" style=\"background-color: lightgreen\"></div>" +
						"<div class=\"col-md-5 text-center bordes\" id=\"Listados\">" +
						"</div>" +
						//<div class="col-md-5 text-center bordes" id="previsualizaciones"> /*ESTA PARTE SOLO SE DEBERIA VER SI SE PULSA A PREVISUALIZACION DENTRO DE 1 OBJETO*/
						//</div>
						//<div class="col-md-1" style="background-color: lightgreen"></div>
						"</article>");
	});
	$("#Inversiones").click(function() {
		//ver submenu inversiones
		var Element = $("#Listados");
		Element.html(	"<p class=\"Subtitulo\">Inversiones</p>" +
						"<button class=\"btn btn-outline-success ButtonsInversiones col-md-2\">Añadir</button>" +
						"<button class=\"btn btn-outline-success ButtonsInversiones col-md-2\">Borrar</button>" +
						"<button class=\"btn btn-outline-success ButtonsInversiones col-md-2\">Actualizar</button>" +
						"<button class=\"btn btn-outline-success ButtonsInversiones col-md-2\">Editar</button>" +
						"<button class=\"btn btn-outline-success ButtonsInversiones col-md-2\">Previsualizar</button>");
		//Carga de la BBDD todas les inversiones que pertenezcan al codigo de proyecto dado (servlet)

	});
	$("#GestionUsuarios").click( function() {
		var Element = $("#menuUserPrincipal");
		Element.addClass("bordes");
		Element.html(	"<p class=\"Subtitulo\">Panel de administración de usuarios</p>" +
						"<form name=\"Login\" action=\"ControllerIndex\" method=\"POST\">" +
							"<div class=\"form-group\">" +
								"<button class=\"btn btn-outline-success menuButtons col-md-2\" name=\"Listar\">Listar Usuarios</button>" +
								"<button class=\"btn btn-outline-success menuButtons col-md-2\" name=\"Add\">Añadir usuario</button>" +
							"</div>");
		Element.fadeIn();
	});
	$("#GestionHoras").click( function() {
		var Element = $("#menuUserPrincipal");
		Element.html("<p class=\"Subtitulo\">Panel administración de horas de trabajo.</p>" +
						"<div class=\"d-flex justify-content-center\">" +
							"<form name=\"Filter\" action=\"ControllerIndex\" method=\"POST\" class=\"bordes col-md-4\">" +
								"<div class=\"form-group row\">" +
									"<label for=\"Tipo\" class=\"col-md-6 \">Tipo:</label>" +
									"<select id=\"Tipo\" class=\"form-control col-md-6\">" +
										"<option value=\"PROYECTO PRINCIPAL\">Proyecto Principal</option>" +
										"<option value=\"VARIOS\">Varios</option>" +
										"<option value=\"TODOS\">Todos</option>" +
									"</select>" +
								"</div>" +
								"<div class=\"form-group row\">" +
									"<label for=\"idProyecto\" class=\"col-md-6\">id del Proyecto:</label>" +
									"<input class=\"form-control col-md-6\" type=\"text\" id=\"idProyecto\" placeholder=\"Id del proyecto\" /> " +
								"</div>" +
								"<div class=\"form-group row\">" +
									"<label for=\"Empleado\" class=\"col-md-6\">Empleado:</label>" +
									"<input class=\"form-control col-md-6\" type=\"text\" id=\"Empleado\" placeholder=\"Empleado\" /> " +
								"</div>" +
								"<div class=\"form-group row\">" +
									"<label for=\"Fini\" class=\"col-md-6\">Fecha inicio de corte:</label>" +
									"<input class=\"form-control col-md-6\" type=\"text\" id=\"Fini\" placeholder=\"AAAA/MM/DD\" /> " +
								"</div>" +
								"<div class=\"form-group row\">" +
									"<label for=\"Ffin\" class=\"col-md-6\">Fecha fin de corte:</label>" +
									"<input class=\"form-control col-md-6\" type=\"text\" id=\"Ffin\" placeholder=\"AAAA/MM/DD\" /> " +
								"</div>" +
								"<button class=\"btn btn-outline-success\" type=\"submit\">Listar Tareas</button>" +
							"</form>" +
						"</div>");
		Element.fadeIn();
	});
        $("#create").click( function() {
            var Element = $(".jqfrm");
            Element.attr("action", "CrearUsuario");
        });
        $("#create").click( function() {
            var Element = $(".jqfrm");
            Element.attr("action", "CrearUsuario");
        });
});

//Generar tabla listado inversiones

//Generar tabla listado Homologaciones

//Generar tabla listado Personalizaciones

//Generar tabla listado planos

//Generar Tabla listado Definiciones

//Generar Tabla listado Esquemas

//Genera listado de usuarios si el usuari esta logueado

