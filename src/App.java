public class App {
    public static void main(String[] args) throws Exception {
        

        System.out.printf("| %5s | %5s | %5s | %5s | %5s |%n",
         ut.CYAN + "Lunes" + ut.RESET,
         ut.CYAN + "Martes" + ut.RESET, 
         ut.CYAN + "Miérc." + ut.RESET, 
         ut.CYAN + "Jueves" + ut.RESET, 
         ut.CYAN + "Viernes" + ut.RESET);
        System.out.println("══════════════════════════════════════════════");
        System.out.printf("| %-6s  | %-6s   | %-6s   | %-6s   | %-7s |%n",
        ut.RED_BACKGROUND_BRIGHT + "PROG" + ut.RESET,
        ut.RED_BACKGROUND_BRIGHT + "PROG" + ut.RESET,
        ut.RED_BACKGROUND_BRIGHT + "PROG" + ut.RESET,
        ut.RED_BACKGROUND_BRIGHT + "PROG" + ut.RESET,
        "SIN");
        System.out.printf("| %-5s  | %-6s   | %-6s   | %-6s   | %-7s |%n",
        ut.RED_BACKGROUND_BRIGHT + "PROG" + ut.RESET,
        ut.RED_BACKGROUND_BRIGHT + "PROG" + ut.RESET, 
        ut.RED_BACKGROUND_BRIGHT + "PROG" + ut.RESET,
        ut.RED_BACKGROUND_BRIGHT + "PROG" + ut.RESET,
        "SIN");
        System.out.printf("| %-5s | %-6s | %-6s | %-6s | %-7s |%n",
        "ED", "SIN", "SIN", "LM", "BDATO");
        System.out.printf("| %-5s | %-6s | %-6s | %-6s | %-7s |%n",
        "FOL", "SIN", "SIN", "LM", "BDATO");
        System.out.printf("| %-5s | %-6s | %-6s | %-6s | %-7s |%n",
        "FOL", "BDATO", "ED", "BDATO", "ED");
        System.out.printf("| %-5s | %-6s | %-6s | %-6s | %-7s |%n",
        "FOL", "BDATO", "ED", "BDATO", "ED");
    }
}
