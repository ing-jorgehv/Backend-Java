package practicaHarry;

public class PruebaPersonaje {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Personaje Harry = new Personaje ("Gryffindor","Male", "Harry James Potter", "Dementor", "Stag");
        System.out.println("Name: "+Harry.getNombre());
        System.out.println("House: "+Harry.getCasa());
        System.out.println("Gender: "+Harry.getGenero());
        System.out.println("Boggart: "+Harry.getBoggart());
        System.out.println("Patronus: "+Harry.getPatronus()+"\n");

        Personaje Hermione = new Personaje ("Gryffindor","Female", "Hermione Jean Granger", "Failure", "Otter");
        System.out.println("Name: "+Hermione.getNombre());
        System.out.println("House: "+Hermione.getCasa());
        System.out.println("Gender: "+Hermione.getGenero());
        System.out.println("Boggart: "+Hermione.getBoggart());
        System.out.println("Patronus: "+Hermione.getPatronus()+"\n");

        Personaje Tom = new Personaje ("Slytherin","Male", "Tom Riddle", "His own corpse", "None");
        System.out.println("Name: "+Tom.getNombre());
        System.out.println("House: "+Tom.getCasa());
        System.out.println("Gender: "+Tom.getGenero());
        System.out.println("Boggart: "+Tom.getBoggart());
        System.out.println("Patronus: "+Tom.getPatronus()+"\n");

        Personaje Ron = new Personaje ("Gryffindor","Male", "Ronald Weasley", "Aragog", "Jack Russell terrier");
        System.out.println("Name: "+Ron.getNombre());
        System.out.println("House: "+Ron.getCasa());
        System.out.println("Gender: "+Ron.getGenero());
        System.out.println("Boggart: "+Ron.getBoggart());
        System.out.println("Patronus: "+Ron.getPatronus()+"\n");

        Personaje Draco = new Personaje ("Slytherin","Male", "Draco Malfoy", "Lord Voldemort", "None");
        System.out.println("Name: "+Draco.getNombre());
        System.out.println("House: "+Draco.getCasa());
        System.out.println("Gender: "+Draco.getGenero());
        System.out.println("Boggart: "+Draco.getBoggart());
        System.out.println("Patronus: "+Draco.getPatronus());
    }
}
