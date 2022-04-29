package zooAnimales;

public class Ave {
import java.util.ArrayList;


    public class Ave extends Animal {
        private static ArrayList<Ave> listado = new ArrayList<Ave>();
        public static int halcones;
        public static int aguilas;
        private String colorPlumas;

        public Ave(){
            super();
            Ave.listado.add(this);
        }
        public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
            // Atributos que son heredados
            super(nombre,edad,habitat,genero);
            // Atributos nuevos en la clase Mamifero
            this.colorPlumas = colorPlumas;
            // Cuando se crea el Mamifero se espera que se anada al listado
            Ave.listado.add(this);
        }

        // Metodos get y set para los atributos normales de Ave
        public String getColorPlumas() {
            return this.colorPlumas;
        }
        public void setColorPlumas(String colorPlumasNuevo) {
            this.colorPlumas = colorPlumasNuevo;
        }

        // Metodos

        //
        public static Ave crearHalcon(String nombre, int edad, String genero) {
            Ave nuevoHalcon = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
            halcones += 1;
            return nuevoHalcon;
        }

        public static Ave crearAguila(String nombre, int edad, String genero) {
            Ave nuevoAguila = new Ave(nombre,edad,"montanas",genero,"blanco");
            aguilas += 1;
            return nuevoAguila;
        }

        // Metodos get para la lista de Aves
        public static int cantidadAves(){
            return listado.size();
        }

        public String movimiento() {
            return "volar";
        }


    }
}
