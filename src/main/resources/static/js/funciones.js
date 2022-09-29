const BASE_URL = 'http://150.136.83.249:81/'
//const BASE_URL = 'http://localhost:8080/'
function traerInformacionCategoria() {

    $.ajax({
                
                url:BASE_URL+"api/categoria/categoriacompleta",
                type:"GET",
                datatype:"JSON",
                success:function(respuesta){
                    pintarRespuestaCategoria(respuesta);
                            
                },
                error : function(xhr,status){
                        alert('Operacion no satisfactoria,'+ xhr.status );
                }
            
                    
            }
    );
}

function pintarRespuestaCategoria(items){

    $("#resultado").empty();

   //declarar variables js
   let myTable="<table>";
   myTable += "<tr><th>Codigo</th><th>Nombre</th></tr>";
   for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+ items[i].id+ "</td>";
       myTable+="<td>"+ items[i].name+"</td>";
       // myTable+="<td><button onclick='borrarCategoria("+items[i].id+")'>Borrar</button>";
       myTable+="</tr>";
   }
   myTable +="</table>";
   $("#resultado").append(myTable);
}


function guardarInformacionCategoria() {
    $("#resultado").empty();
    let myData={name : $("#nameCategoria").val()}
    let dataToSend = JSON.stringify(myData);


    $.ajax({

        url          : BASE_URL+'api/categoria/salvarcategoria',
        type         : 'POST',
        data         :  dataToSend,
        datatype     :  "JSON",
        contentType  : 'application/json',
        success      :  function(respuesta){
                        //console.log(respuesta);
                        alert("Inserción exitosa");
                        },
        error       :   function(xhr,status){
                            alert('Operacion no satisfactoria,'+ xhr.status );
                        }

    }
)

}