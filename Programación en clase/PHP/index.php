<!DOCTYPE html>
<html>
    <head>
        <title>PHP Test</title>
        <!- la etiqueta de abajo es utilizada para aplicar css en nuestra página web >
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <?php 
        $autor="Carlos";
        echo "<p>Hola me llamo ".$autor."</p><br>";
        echo date('y-m-d');
        ?>
        
        <br>
        <table>
      <thead>
        <caption>
        <h1>
            PHP
        </h1>
        </caption>
        <th>SERVER_PORT&#8203; &#8203;&#8203; &#8203;  </th>
        <th>REMOTE_ADDR &#8203; &#8203;&#8203; &#8203; </th>
        <th>SERVER_ADDR &#8203; &#8203;&#8203; &#8203; </th>
        <th>SERVER_NAME  </th>
        <th>SERVER_SIGNATURE  </th>
        <th>&#8203; &#8203;</th>
        <th>SERVER_SOFTWARE  </th>
      </thead>
      <tbody>
        
       
        <tr>
          <td> <?php echo " ".$_SERVER['SERVER_PORT']; ?>&#8203; &#8203;</td>
          <td> <?php echo " ".$_SERVER['REMOTE_ADDR']; ?>&#8203; &#8203;</td>
          <td> <?php echo " ".$_SERVER['SERVER_ADDR']; ?>&#8203; &#8203;</td>
          <td> <?php echo " ".$_SERVER['SERVER_NAME']; ?>&#8203; &#8203; </td>
          
          <td> <?php echo " ".$_SERVER['SERVER_SIGNATURE']; ?></td>
          <td> &#8203; &#8203;&#8203; &#8203;&#8203; &#8203;&#8203; &#8203;&#8203; &#8203;</td>
          <td> <?php echo " ".$_SERVER['SERVER_SOFTWARE']; ?>&#8203; &#8203;</td>
        </tr>
      </tbody>
    </table>
    </body>
</html>
