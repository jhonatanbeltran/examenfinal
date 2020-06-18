<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
            <title>Datos personales</title>
    </head>
    <body>
        
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Datos vistante</h4>
                </div>
                
                <div class="card-body">
                    <form method="POST">
                        <label>Documento</label>
                        <input type="text" name="doc" class="form-control">
                        <label>Nombres</label>
                        <input type="text" name="nom" class="form-control">
                         <label>Fecha nacim;</label>
                         <input type="date" name="fech" class="form-control" >
                         <label>Numero de telefono</label>
                        <input type="text" name="tel" class="form-control">
                         <label>EPS:</label>
                          <select name="eps">
                                <option value="value1" selected>fsghs</option>  <%---NO OLVIDAR CAMBIAR POR "${}"} --%>
                                <option value="value1" selected>adfb</option> 
                                <option value="value1" selected></option> 
                                <%---NO OLVIDAR ESTA VAINNNNNNAAA--COMPLETAR LA COSITA QUE SE DESLIZA--%>
                         </select>
                         <label>Genero:</label>
                          <select name="gen">
                                <option value="value1" selected>f</option>  <%---NO OLVIDAR CAMBIAR POR "${}"} --%>
                                <option value="value1" selected>m</option> 
                                <option value="value1" selected></option> <%------no olvidar acomdar---%>
                                <%---NO OLVIDAR ESTA VAINNNNNNAAA--COMPLETAR LA COSITA QUE SE DESLIZA--%>
                         </select>
                         <label>Temperatura:</label>
                         <input type="text" name="temp" class="form-control">
                         
         
                        <input type="submit" value="Ingresar" class="btn btn-success">
                        <a href="index.htm">Regresar</a>


                    </form>
                     
                </div>
                
            </div>
        </div>
    </body>
</html>

