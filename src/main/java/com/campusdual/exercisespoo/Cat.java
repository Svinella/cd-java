package com.campusdual.exercisespoo;

public class Cat {

    public String name;
    public String breed;
    public String sex;
    public static int age;
    public String hair;
    public static String colour;
    public Boolean castrated;
    private String eyeColour = "green";


    public Cat (String luis, String siamés, String macho, String peloLargo, String aTrue){
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.hair = hair;
        this.castrated = castrated;



    }
    public static String changeColour(){
        colour= com.campusdual.util.Utils.string("Introducir color de pelo: " );
        return colour;
    }

    public void changeEyeColour(){
        this.eyeColour = com.campusdual.util.Utils.string("Introducir color de ojos: ");
    }

    public static void changeAge(){
        age = com.campusdual.util.Utils.integer("Introducir edad: ");

    }

    public int getAge(){
        return age;
    }

    public void changeCastrated(){
        this.castrated = true;
    }
    public void isCastrated(){
        if(this.castrated == true){
            System.out.println("Está castrado");
        } else {
            System.out.println("No está castrado");
        }
    }
    public void catDetails(){
        System.out.println("Nombre: "+ this.name + " Edad: "+ age + " Sexo" + this.sex + "Raza: "+ this.breed);
        System.out.println("Color de los ojos: " + this.eyeColour + "Tipo de pelo:" + this.hair);
        System.out.println("Color del pelo:" + colour);
        isCastrated();

    }
public static void main(String[] args){
        Cat catLuis = new Cat("Luis", "siamés", "macho", "pelo largo", "true");
        Cat catAlfredo = new Cat("Alfredo", "persa", "macho", "pelo largo", "false");
        Cat catTuvi = new Cat("Tuvi", "esfinge", "hembra", "pelo corto", "false");

        catLuis.changeCastrated();
        catAlfredo.changeCastrated();
        Cat.changeColour();
        Cat.changeColour();
        Cat.changeAge();
        Cat.changeAge();

        catTuvi.changeEyeColour();

        catLuis.catDetails();
        catAlfredo.catDetails();
        catTuvi.catDetails();


}



    }




    /*
 Crea una clase llamada Cat


 La clase debe tener las siguientes propiedades sin inicializar:
 - nombre (name)
 - raza (breed)
 - sexo (sex)
 - edad en meses (age) (estática)
 - tamaño del pelo (hair)
 - color del pelo (colour) (estática)
 - un booleano que indique si está castrado/a o no (castrated)I

 La clase debe tener las siguientes propiedades con los valores inicializados
 - el color de los ojos (eyeColour): "green"

 Crea un constructor que incluya todos los atributos no inicializados

 Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

 Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

 Crea un método no estático que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

 Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)

 Crea un main()

 Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

 Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

 Cámbiale el color del pelo a los dos primeros gatos

 Cámbiale el color de los ojos al último gato

 Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

 Muestra los detalles de cada gato (fijaros qué dato muestra en la edad y el color del pelo)

 Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático, getters y setters)
  Verás cómo afecta a los métodos estáticos
*/

