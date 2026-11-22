public class Main {
    static void main() {
        Ordenador ordenador1= new Ordenador("HP","2",8); //Ordenador correcto.
        System.out.println(ordenador1);

        System.out.println("/////");

        Ordenador ordenador2= new Ordenador("HP","3"); //Pondrá automaticamente 4 nucleos.
        System.out.println(ordenador2);

        System.out.println("/////");

        Ordenador ordenador3= new Ordenador(" ","4", 8); //Pondrá desconocida la marca.
        System.out.println(ordenador3);

        System.out.println("/////");

        Ordenador ordenador4= new Ordenador("HP"," ", 8); //Pondrá desconocida el modelo.
        System.out.println(ordenador4);

        System.out.println("/////");

        Ordenador ordenador5= new Ordenador(" "," "); //Pondrá desconocida la marca y el modelo y pone 4 nucleos.
        System.out.println(ordenador5);

        System.out.println("/////");

        Ordenador ordenador6=new Ordenador(); //Imprime "Desconocido" en marca y modelo y 4 nucleos.
        System.out.println(ordenador6);
    }
}
