
public class Main {
    public static void main (String[] args) {
        int numeroIf = -40;
        int numeroWhile = 0;
        var estacion = "PRIMAVERA";

        if (numeroIf == 0){
            System.out.println("igual cero");
        } else if (numeroIf <= -1) {
            System.out.println("negativo");
        } else {
            System.out.println("positivo");
        }

        while ( numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while ( numeroWhile < 3 );

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTONO":
                System.out.println("Es otono");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("Debe haber una estacion");
        }
    }
    }
