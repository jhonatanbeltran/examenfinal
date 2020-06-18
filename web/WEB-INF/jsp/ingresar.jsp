<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
            <title>Ingreso</title>
    </head>
    <body>
        
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Ingresar</h4>
                </div>
                
                <div class="card-body">
                    <form method="POST">
                        <label>Usuario</label>
                        <input type="text" name="id" class="form-control">
                        <label>Password</label>
                        <input type="text" name="nom" class="form-control">
                        <input type="submit" value="Ingresar" class="btn btn-success">
                        <a href="index.htm">Regresar</a>


                    </form>
                     
                </div>
                
            </div>
        </div>
    </body>
</html>
