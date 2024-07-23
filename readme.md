<h1>Automóvil</h1>

<h2>Enunciado:</h2>
Se requiere un programa que modele el concepto de un automóvil. Un automóvil tiene los siguientes atributos:
<li>Marca: el nombre del fabricante.</li>
<li>Modelo: año de fabricación.</li>
<li>Motor: volumen en litros del cilindraje del motor de un automóvil.</li>
<li>Tipo de combustible: valor enumerado con los posibles valores de gasolina, bioetanol, diésel, biodiésel, gas natural.</li>
<li>Tipo de automóvil: valor enumerado con los posibles valores de carro de ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.</li>
<li>Número de puertas: cantidad de puertas.</li>
<li>Cantidad de asientos: número de asientos disponibles que tiene el</li>
vehículo.
<li>Velocidad máxima: velocidad máxima sostenida por el vehículo en km/h.</li>
<li>Color: valor enumerado con los posibles valores de blanco, negro, rojo, naranja, amarillo, verde, azul, violeta.</li>
<li>Velocidad actual: velocidad del vehículo en un momento dado.</li>

<h2>La clase debe incluir los siguientes métodos:</h2>
Un constructor para la clase Automóvil donde se le pasen como parámetros los valores de sus atributos.
<li>Métodos get y set para la clase Automóvil.</li>
<li>Métodos para acelerar una cierta velocidad, desacelerar y frenar (colocar la velocidad actual en cero). Es importante tener en cuenta que no se debe acelerar más allá de la velocidad máxima permitida para el automóvil. De igual manera, tampoco es posible desacelerar a una velocidad negativa. Si se cumplen estos casos, se debe mostrar por pantalla los mensajes correspondientes.</li>
<li>Un método para calcular el tiempo estimado de llegada, utilizando como parámetro la distancia a recorrer en kilómetros. El tiempo estimado se calcula como el cociente entre la distancia a recorrer y la velocidad actual.</li>
<li>Un método para mostrar los valores de los atributos de un Automóvil en pantalla.</li>
<li>Un método main donde se deben crear un automóvil, colocar su velocidad actual en 100 km/h, aumentar su velocidad en 20 km/h, luego decrementar su velocidad en 50 km/h, y después frenar. Con cada cambio de velocidad, se debe mostrar en pantalla la velocidad actual.</li>

<h2>Alto policia: :</h2>
<li>Agregar a la clase Automóvil, un atributo para determinar si el vehículo es automático o no. Agregar los métodos get y set para dicho atributo. Modificar el constructor para inicializar dicho atributo.</li>
<li>Modificar el método acelerar para que si la velocidad máxima se sobrepase se genere una multa. Dicha multa se puede incrementar cada vez que el vehículo intenta superar la velocidad máxima permitida.
Agregar un método para determinar si un vehículo tiene multas y otro método para determinar el valor total de multas de un vehículo.</li>



![77669690d68b36451166facad591fd01](https://github.com/user-attachments/assets/3bb250a5-518f-4358-ae95-bfae67c65599)
