package afisare_operatii_numere;

/**
 * 1. sa se afiseze toate numerele impare de la 0 la 50
 * 2. sa se calculeze suma primelor 5 numere divizibile cu 3 si cu 5
 * 3. sa se calculeze produsul primelor 50 de numere divizibile cu 9
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercitiul 1");
        afisareNumereImpare();
        System.out.println("Exercitiul 2");
        afisareNumereDivizibileCu3Si5();
        System.out.println("Exercitiul 3");
        produsulNumerelorDivizibileCu9();
    }

   public static void afisareNumereImpare () {
        for (int i = 0; i <= 50; i++) {
            if ( i % 2 != 0){
            System.out.println(i);
            }
        }

       // SAU
       // public static void afisareNumereImpare(){
           // for(int i =0; i<=50;i++){
               // if(i%2==1){
                   // System.out.println(i);
               // }
           // }

   }

   public static void afisareNumereDivizibileCu3Si5 () {
        int i = 1; // i ne ajuta sa luam toate numerele de la 1 la infinit
        int contor = 0; // contor ne ajuta sa tinem evidenta numerelor gasite ce indeplinesc conditia
        int suma = 0; // suma ne ajuta sa calculam suma numerelor gasite

        while (contor < 5) { // se executa cat timp variabila contor este mai mica decat 5
            if (i % 3 == 0 && i % 5 == 0) { // verificam daca numarul i se imparte exact la 3 si la 5
                suma = suma + i; // daca este indeplinita conditia adunam numarul gasit la suma existenta
                contor++; // contorul se incrementeaza atunci cand gasim numarul care indeplineste conditia
            }
         i ++; // i-ul incrementeaza indiferent daca conditia este indeplinita sau nu
        }
        System.out.println(suma); // afisam suma cu numerele gasite
   }

   public static void produsulNumerelorDivizibileCu9 () {
        int a = 1;
        int contor2 = 0;
        long produsl = 1;

        while (contor2 < 50 ) {
            if (a % 9 == 1) {
                produsl = produsl * a;
                contor2++;
            }
         a ++;
        }
       System.out.println(produsl);
    }
}
