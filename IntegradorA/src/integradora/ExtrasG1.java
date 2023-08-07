package integradora;

import java.util.Scanner;

public class ExtrasG1 {
    
/* Guía 2 Extras Problema 1:
1. Crear un método que dado un tiempo en minutos leído desde teclado, calcular su equivalente en
días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.6789
*/
        public static void convetirMinutos(){
            Scanner leer =new Scanner(System.in);
            int min, hs=0,dia=0;
            System.out.println("Ingrese el tiempo en minutos: ");
            min=leer.nextInt();
            if (min < 0){System.out.println("Dato INVALIDO"); convetirMinutos();}
            // Calculo los dia EQUIVALENCIA 1 DIA = 24 HS = 1440 MINUTOS

            while (min>=1440){
               min=min-1440;
               dia=dia+1; }

            while (min>=60){
               min=min-60;
               hs=hs+1;}   
         
        System.out.println("Equivalen a "+dia+ " días, "+hs+" horas, "+min+" min");}
 
/* Guía 2 Extras Problema 2:
2. Crear un método dentro del cual tendrá cuatro variables de tipo entero A, B, C y D y asignarle
un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B
tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/      
        public static void cambiarVariables(){
          int a, b, c, d, aux;
          a = (int)(Math.random() * 100);
          b = (int)(Math.random() * 100);
          c = (int)(Math.random() * 100);
          d = (int)(Math.random() * 100);
        
          System.out.println("A vale: "+a);
          System.out.println("B vale: "+b);
          System.out.println("C vale: "+c);
          System.out.println("D vale: "+d);
        
          aux=b;
          b=c;
          c=a;
          a=d;
          d=aux;
        
          System.out.println("Ahora:");
          System.out.println("A vale: "+a);
          System.out.println("B vale: "+b);
          System.out.println("C vale: "+c);
          System.out.println("D vale: "+d);
    }
        
/* Guía 2 Ejercicios Extras Problema 3:
3. Elaborar un método en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso
contrario mostrar un mensaje.
*/      
         public static void detectarVocales(){
            Scanner leerLetra = new Scanner(System.in);
            int longLetra;
            String letra;
            do {
                 System.out.println("Ingrese una letra: ");
                 letra=leerLetra.nextLine();
                 longLetra=letra.length();
                 letra=letra.toUpperCase();
        } while (longLetra>1);
            if (longLetra==1 && ( letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U"))){
                System.out.println("La letra ingresada es una vocal");
            }
            else {
                System.out.println("La letra ingresada NO es una vocal");
          }
    }   
         
/* Guia 2 Ejercicios Extras Problema 4:
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente
en romano.
*/         
        public static void nroRomanos(){
            Scanner leer = new Scanner(System.in);
            int nro;
            do {
                System.out.println("Ingrese un número del 1 al 10:");
                nro=leer.nextInt();
           }while (nro<0 || nro>10);
            switch(nro){
                case 1: System.out.println("El número ingresado es: "+nro+" en números Romano es: I "); break;
                case 2: System.out.println("El número ingresado es: "+nro+" en números Romano es: II ");break;
                case 3: System.out.println("El número ingresado es: "+nro+" en números Romano es: III ");break;
                case 4: System.out.println("El número ingresado es: "+nro+" en números Romano es: IV ");break;
                case 5: System.out.println("El número ingresado es: "+nro+" en números Romano es: V ");break;
                case 6: System.out.println("El número ingresado es: "+nro+" en números Romano es: VI ");break;
                case 7: System.out.println("El número ingresado es: "+nro+" en números Romano es: VII ");break;
                case 8: System.out.println("El número ingresado es: "+nro+" en números Romano es: VIII ");break;
                case 9: System.out.println("El número ingresado es: "+nro+" en números Romano es: IX ");break;
                case 10: System.out.println("El número ingresado es: "+nro+" en números Romano es: X ");break;
               default : System.out.println("Ingrese nro entre 1-10, intente nuevamente ");
            }
    }
        
/* Guia 2 Ejercicios Extras Problema 5:
5. Una obra social tiene tres clases de socios:
 Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos
los tipos de tratamientos.
 Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los
mismos tratamientos que los socios del tipo A.
 Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho
socio. Crear un método con el algoritmo para dar solución a lo propuesto.
 */     
        public static void obraSocial(){
           Scanner leer = new Scanner(System.in);
           String opc;
           int longOpc, nro;
           do {
               System.out.println("Ingrese su tipo de cobertura (A, B, o C)");
               opc=leer.nextLine();
               longOpc=opc.length();
               opc=opc.toUpperCase();
        } while (longOpc>1 && (!"A".equals(opc) || !"B".equals(opc) || !"C".equals(opc)));
               System.out.println("Ingrese el monto del tratamiento requerido");
               nro=leer.nextInt();
           switch (opc){
               case "A" : System.out.println("Socio tipo A: VALOR DEL TRATAMIENTO: "+(nro*0.50));break;
               case "B" : System.out.println("Socio tipo B: VALOR DEL TRATAMIENTO: "+(nro*0.65));break;
               case "C" : System.out.println("Socio tipo C: VALOR DEL TRATAMIENTO: "+nro);break;
               default : System.out.println("Tipo de socio incorrecto."); obraSocial();
           }

     }
        
/* Guia 2 Ejercicios Extras Priblema 6:
6. Crear un método dentro del cual permita la entrada desde teclado de la altura de N personas y
determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de
estaturas en general.
*/     
        public static void promedioAltura(){
            double sumaGeneral=0 ,sumaCond=0,altura;
            int contCond=0;
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese cantidad de personas : ");
            int n=leer.nextInt();
            if (n< 1){ System.out.println("Dato invalido, intente nuevamente ");promedioAltura();} 
            for (int i = 1; i <= n; i++) {
             do {
                 System.out.println("Ingrese altura : ");
                 altura =leer.nextDouble();
           } while(altura < 0 ); 
                sumaGeneral=sumaGeneral+altura;
                if (altura <= 1.60){ sumaCond=sumaCond+altura;contCond=contCond+1;}               
            }
            System.out.println("CANTIDAD DE ALUMNOS QUE MIDEN POR DEBAJO DE 1,60 m: "+contCond+"   ALTURA PROMEDIO DE ESTOS ALUMNOS: "+(sumaCond/contCond)+ " m");
            System.out.println("CANTIDAD DE ALUMNOS EN TOTAL: "+n+"   ALTURA PROMEDIO GENERAL: "+(sumaGeneral/n)+" m");
    }
        
/* Guía 2 Problemas Extras Ejercicio 7:
7. Realice un método que calcule y visualice el valor máximo, el valor mínimo y el promedio de
n números (n>0). El valor de n se solicitará al principio del programa y los números serán
introducidos por el usuario. Realice dos versiones del método, una usando el bucle “while” y otra
con el bucle “do - while”.
 */       
        public static void calcularMaxMinProm(){
            Scanner leer = new Scanner (System.in);
            int n;
            double num;
            double max=0;
            double min=999999999;
            double suma=0;
            double prom=0;
            do {
            System.out.println("Escriba cuántos números desea ingresar");
            n = leer.nextInt(); 
            } while (n<0);
            for (int i = 1; i <= n; i++) {
                System.out.println("Ingrese un número");
                num = leer.nextDouble();
                if (num>max) {
                    max=num;
                }
                if (num<min) {
                    min=num;
                }
                suma = suma + num;
                prom = suma/n;

            }
             System.out.println("El valor máximo ingresado es: "+max);
             System.out.println("El valor mínimo ingresado es: "+min);
             System.out.println("El valor promedio es: "+prom);
        }
        
 /* Guía 2 Ejercicios Extras Problema 8:
8. Escriba un método que lea números enteros. Si el número es múltiplo de cinco debe detener la
lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de
números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
Nota: recordar el uso de la sentencia break.
 */         
    public static void Calcular(){
        int num, pares=0, impares=0, cont=0;
        do {
        Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un número");
            num = leer.nextInt();
                cont++;
            if (num % 2 == 0) { 
                pares++;
            } else {
                impares++;
            }
        } while (num % 5 != 0);
        System.out.println("Se ingresaron "+cont+ " números.");
        System.out.println("La cantidad de números pares ingresados es de: "+pares);
        System.out.println("La cantidad de números impares ingresados es de: "+impares);
    } 
    
/* Guía 2 Problemas Extras Ejercicio 9:
9. Simular la división usando solamente restas. Dados dos números 
enteros mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta 
obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
Crear un método con el algoritmo necesario para dar solución a lo 
propuesto.
 */  
     public static void simularDivision() {
        int num1, num2, cont=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer número (entero mayor que 1)");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número (entero mayor que 1)");
        num2 = leer.nextInt();
        while (num1>num2){
            num1 = num1-num2;
            cont++;
        }
        System.out.println("El cociente entre ambos números es: "+cont);
        System.out.println("El resto de la división es: "+num1);
  } 
     
/* Guía 2 Problemas Extras Ejercicio 10:
10. Realice un método para que el usuario adivine el resultado de una multiplicación entre dos
números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta
es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su
respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función
Math.random() de Java.
 */    
     public static void adivinar(){
        int num1, num2, respuesta, producto;
        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        Scanner leer = new Scanner (System.in);
        do {
            System.out.println("Adivine el resutado de la multiplicación que estoy pensando");
            respuesta = leer.nextInt();
           // System.out.println("num 1 :"+num1+" num 2: "+num2);
            producto = num1*num2;
          if (respuesta==producto) {
            System.out.println("Correcto!! \nLos números que pensé eran el "+num1+" y el "+num2+ " y el producto es de: "+producto);
        } else { 
            System.out.println("Respuesta incorrecta!!");
               }
      } while (respuesta!=producto);
    }
     
/* Guía 2 Problemas Extras Ejercicio 11:
11. Escribir un método que lea un número entero y devuelva el número de dígitos que componen
ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar
que las variables de tipo entero truncan los números o resultados.
 */    
     public static void calcularDigitos(){
        int num, cont=1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        num = leer.nextInt();
        while (num/10>=1) {   
            num = num/10;
            cont++;  
        }
        System.out.println("El número ingresado tiene "+cont+" dígitos.");
    } 
     
/* Guía 2 Problemas Extras Ejercicio 12:
12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0
al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Crear un método que dé solución a lo propuesto en el enunciado.
 */     
        public static void cambiar3(){     
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                for (int k=0; k<10; k++){
                   String cadena = i + "-" + j + "-" + k;
                    cadena = cadena.replace('3', 'E');
                    System.out.println(cadena);
                }
            }
        }
    } 
        
/* Guía 2 Problemas Extras Ejercicio 13:
13. Crear un método que dibuje una escalera de números, donde cada línea de números comience
en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.
Ejemplo: si se ingresa el número 3:
1
12
123
*/
     public static void formarEscalera() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera de números (en enteros)");
        int altura = leer.nextInt();
        for (int i=1; i<=altura; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
                System.out.println();
        }  
    }             
}  
     

