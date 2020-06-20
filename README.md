<h1>CAMBALACHE</h1>

<h3>Microservices</h3>
<ul>
  <li>eureka-service - Servicio de descubrimiento de Netflix. Permite que los microservicios se registren como clientes a el.</li> 
  <li>zuul-service - es un Gateway service que me permite facilitar el ruteo de las request a los distintos microservisios (entre otras cosas) </li>
  <li>auth-service - Maneja las operaciones de usuario y autenticacion. Recibe request de credenciales y emite tokens, la validacion de los tokens se hace en el gateway (zuul)</li>
  <li>image-service - No requiere explicacion maneja lo referido a las imagenes</li>
  <li>publication-service - No requiere explicacion maneja lo referido a las publicaciones</li>
  <li>common-service - Contiene las clases comunes a varios servicios para evitar mantener consistencia, ej: JwtConfig que se usa en auth y zuul service</li> 
</ul>
