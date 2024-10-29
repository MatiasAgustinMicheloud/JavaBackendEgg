import java.util.Arrays;

public class Act2 {
    public static void main(String[] args) {

        String[] calificaciones = new String[20];
        Double nota = 0.0;
        int numDesaprobado = 0;
        int numAprobado = 0;
        int numExcelente = 0;
        Double promedioTotal = 0.0;
        Double promedioAprobados = 0.0;
        Double promedioDesaprobados = 0.0;
        Double promedioExcelentes = 0.0;

        for (int i = 0; i < calificaciones.length; i++) {
            nota = (double) Math.random() * 10 + 1;
            calificaciones[i] = nota.toString();
            if (nota < 4) {
                numDesaprobado++;
            }
            if (nota >= 4 && nota < 10) {
                numAprobado++;
            }
            if (nota >= 10) {
                numExcelente++;
            }
            promedioTotal = nota + promedioTotal;
        }

        Double[] desaprobados = new Double[numDesaprobado];
        Double[] aprobados = new Double[numAprobado];
        Double[] excelentes = new Double[numExcelente];
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println(Arrays.toString(calificaciones));

        for (int j = 0; j < calificaciones.length; j++) {
            Double valor = Double.valueOf(calificaciones[j]);
            if (valor < 4) {
                desaprobados[a] = valor;
                a++;
                promedioDesaprobados = valor + promedioDesaprobados;
            }
            if (valor >= 4 && valor < 10) {
                aprobados[b] = valor;
                b++;
                promedioAprobados = valor + promedioAprobados;

            }
            if (valor >= 10) {
                excelentes[c] = valor;
                c++;
                promedioExcelentes = valor + promedioExcelentes;
            }

        }
        System.out.printf("El promedio total es de: %.2f %n", (promedioTotal / calificaciones.length));
        System.out.printf("El promedio de desaprobados es de: %.2f %n", (promedioDesaprobados / desaprobados.length));
        System.out.printf("El promedio de aprobados es de: %.2f %n", (promedioAprobados / aprobados.length));
        System.out.printf("El promedio de excelentes es de: %.2f %n", (promedioExcelentes / excelentes.length));

    }
}
