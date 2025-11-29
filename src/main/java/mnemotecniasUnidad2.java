import java.util.Scanner;

public class mnemotecniasUnidad2 {

    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";


    public static void main(String[] args) {
        int opcion_marcado;
        Scanner sc = new Scanner(System.in);

        do {
            limpiarPantalla();

            System.out.println("========================================");
            System.out.println("|       MNEMOTECNIAS - UNIDAD 2        |");
            System.out.println("========================================");
            System.out.println("|1. CONFIGURACIÓN ELECTRÓNICA          |");
            System.out.println("|2. EL ÁTOMO                           |");
            System.out.println("|3. ELECTRÓN DIFERENCIAL               |");
            System.out.println("|4. MODELOS ATÓMICOS                   |");
            System.out.println("|5. NÚMEROS CUÁNTICOS                  |");
            System.out.println("|6. PRINCIPIO DE AUFBAU                |");
            System.out.println("|7. TABULACIÓN DE LOS NÚMEROS CUÁNTICOS|");
            System.out.println("|0. Regresar al menú principal         |");
            System.out.println("----------------------------------------");
            System.out.print("Elige una opción: ");

            opcion_marcado = sc.nextInt();
            sc.nextLine();  // limpiar buffer

            limpiarPantalla();

            switch (opcion_marcado) {

                case 1:
                    System.out.println("===========================================================================");
                    System.out.println("|                    === CONFIGURACIÓN ELECTRÓNICA ===                    |");
                    System.out.println("===========================================================================");
                    System.out.println(ROJO+"|- Frase:¿Sabes Para Donde Van los Electrones?                            |"+RESET);
                    System.out.println("|- Significado: S=subnivel s, P=subnivel p, D=subnivel d, F=subnivel f    |");
                    System.out.println("|- Recuerda el orden SPDF de llenado                                      |");
                    System.out.println("|- Orden diagonal: 1s² 2s² 2p 3s² 3p^6 4s² 3d^10 4p^6 5s² 4d^10 5p^6 ...  |");
                    System.out.println("|- Frase mnemotécnica: Súper Profesores De Física = s, p, d, f            |");
                    System.out.println("---------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 2:
                    System.out.println("====================================================================================");
                    System.out.println("|                             === EL ÁTOMO ===                                     |");
                    System.out.println("====================================================================================");
                    System.out.println(ROJO+"|- Acrónimo:NECRO                                                                  |"+RESET);
                    System.out.println("| N = Núcleo, E = Electrones, C = Corteza, R = Regiones de energía, O = Orbitales  |");
                    System.out.println("|- Así recuerdas la estructura del átomo                                           |");
                    System.out.println("------------------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 3:
                    System.out.println("==============================================================================================================");
                    System.out.println("|                                       === ELECTRÓN DIFERENCIAL ===                                         |");
                    System.out.println("==============================================================================================================");
                    System.out.println(ROJO+"|- Frase: El último en llegar define su hogar.                                                               |"+RESET);
                    System.out.println("|- Explicación: El electrón diferencial es el último que entra en la configuración y define grupo y periodo  |");
                    System.out.println("--------------------------------------------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 4:
                    System.out.println("============================================================================");
                    System.out.println("|                       === MODELOS ATÓMICOS ===                           |");
                    System.out.println("============================================================================");
                    System.out.println(ROJO+"|- Acrónimo cronológico: D-T-R-B-S-C                                       |"+RESET);
                    System.out.println("|- D=Dalton, T=Thomson, R=Rutherford, B=Bohr, S=Sommerfeld, C=Cuántico     |");
                    System.out.println("|- Frase para recordar: Deliciosas Tartas Rellenas Bien Suaves y Cremosas  |");
                    System.out.println("----------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 5:
                    System.out.println("===========================================================================");
                    System.out.println("|                        === NÚMEROS CUÁNTICOS ===                        |");
                    System.out.println("===========================================================================");
                    System.out.println(ROJO+"|- Frase: No Siempre Tiene Sentido                                        |"+RESET);
                    System.out.println("|- N = Nivel principal, S = Secundario/azimutal, T = Magnético, S = Spin  |");
                    System.out.println("|- Cada número cuántico describe una característica del electrón          |");
                    System.out.println("---------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 6:
                    System.out.println("==================================================================");
                    System.out.println("|                === PRINCIPIO DE AUFBAU ===                     |");
                    System.out.println("==================================================================");
                    System.out.println(ROJO+"|- Frase: Los electrones son flojos: llenan lo más bajo primero  |"+RESET);
                    System.out.println("|- Los orbitales se llenan desde el nivel más bajo al más alto   |");
                    System.out.println("|- Aufbau significa construcción                                 |");
                    System.out.println("------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 7:
                    System.out.println("=======================================================================================================");
                    System.out.println("|                         === TABULACIÓN DE LOS NÚMEROS CUÁNTICOS ===                                 |");
                    System.out.println("=======================================================================================================");
                    System.out.println(ROJO+"|- Mnemotecnia visual: usa tabla con encabezados (n, l, m, s) = (Nivel, Subnivel, Orientación, Giro)  |"+RESET);
                    System.out.println("|- Frase: Nadie Sabe Mover Sin práctica                                                               |");
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 0:
                    System.out.println("========================================");
                    System.out.println("|    Regresando al menú principal...   |");
                    System.out.println("========================================");
                    esperarEnter(sc);
                    break;

                default:
                    System.out.println("========================================");
                    System.out.println("| Opción no válida. Intenta de nuevo.  |");
                    System.out.println("========================================");
                    esperarEnter(sc);
                    break;
            }

        } while (opcion_marcado != 0);
    }


    private static void esperarEnter(Scanner sc) {
        System.out.println("\nPresiona ENTER para continuar...");
        try { System.in.read(); } catch (Exception e) {}
    }

    private static void limpiarPantalla() {
        for (int i = 0; i < 40; i++) System.out.println();
    }

}
