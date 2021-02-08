package fechahora;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.


    class fechahora {
    	
    	
    	static int year = 2021;
    	static int month= 02;
    	static int dayOfMonth= 09;
    	static int hour = 00;
    	static int minute = 35;
    
    public static void main(String[] args) {
        LocalDate diaf = LocalDate.of(year, month, dayOfMonth);
        LocalTime horaf = LocalTime.of(hour, minute);
        
        LocalDateTime fechaf = LocalDateTime.of(diaf, horaf);
        
        System.out.println(fechaf);
    }
}
