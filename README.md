10.	CONSTRUCTORES Y COMPOSICION

Crea un proyecto EjercicioComposicion. 

Crea la clase Procesador con el atributo privado nucleos (debe ser mayor que 0, si no lanza IllegalArgumentException) y la clase Ordenador con marca, modelo y un atributo procesador de tipo Procesador. Un ordenador tiene un procesador; no extiende de él. 

•	Constructor principal: Ordenador(String marca, String modelo, int nucleos), que crea el Procesador. 

•	Constructor Ordenador(String marca, String modelo), que usa this(...) con 4 núcleos por defecto. 

•	Constructor sin parámetros, que usa this(...) con la marca "Desconocida" y el modelo "Desconocido". 

•	toString() que muestre la marca, el modelo y los núcleos. 

Crea además la clase Monitor con un único constructor Monitor(int pulgadas). En Main, intenta escribir new Monitor(), anota en un comentario el error de compilación y explica por qué ocurre (Java solo crea el constructor por defecto si la clase no define ninguno). Después borra esa línea. 

Clase de prueba: Main. Crea un ordenador con cada constructor y muéstralos. 
