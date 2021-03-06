# Camino óptimo metro de Toshkent

El objeto de este proyecto es diseñar una aplicación para hallar el trayecto óptimo entre dos estaciones del metro de Taskent (solo se contemplaran las líneas y estaciones del mapa representado en este enunciado), teniendo en cuenta distintos parámetros como pueden ser el número de transbordos,longitud de los mismos, la hora a la que se realiza el trayecto, el número de tramos de escaleras que tenemos que utilizar, etc. Para el cálculo del mejor camino entre dos estaciones se utilizarán algoritmos de búsqueda en la optimización de caminos de coste mínimo en grafos de decisión. Utilice alguno de los
algoritmos _A\*_, _IDA\*_ o _BIDA\*_.

En nuestro caso, se ha usado **_A\*_**.

## Autores
- [Víctor Nieves Sánchez](https://twitter.com/VictorNS69)
- Daniel Morgera Pérez
- Alejandro Carmona Ayllón
- Raúl Prieto Acedo

## Nota
Bajo la carpeta [lib](/lib) se encuentran las librerias que hay que añadir al proyecto para que funcione adecuadamente. Esas librerias son:
```
hamcrest-core-1.3.jar
javabdd_repackaged-1.0b2.jar
junit-4.12.jar
net-datastructures-4-0.jar
```
En la carpeta [assets](/assets) se encuentra la [memoria](/assets/Memoria.pdf) del proyecto.

## Ejecutar

Hay dos maneras de ejecutar el codigo.

- Ejecutar el [MetroToshkent.jar](/MetroToshkent.jar)
```
java -jar MetroToshkent.jar
```
- Importar el repositorio en eclipse (o similar) y ejecutar el programa. (Clase Ventana.java)

## Mapa
![Mapa de Toshkent.](/assets/metro.png)

## Licencia
[Licencia](/LICENSE).
