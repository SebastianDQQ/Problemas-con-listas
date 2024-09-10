import java.util.ArrayList;
import java.util.List;

public class MezclasListas {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Escriba dos listas");
            return;
        }
        List<Integer> listanum1 = CadenaAlista(args[0]);
        List<Integer> listanum2 = CadenaAlista(args[1]);
        List<Integer> Resultado = merge(listanum1, listanum2);
        System.out.println(Resultado);
    }
    public static List<Integer> merge(List<Integer> listanum1, List<Integer> listanum2) {
        List<Integer> Resultado = new ArrayList<>();
        int i = 0, j = 0;
        while (i < listanum1.size() && j < listanum2.size()) {
            if (listanum1.get(i) < listanum2.get(j)) {
                Resultado.add(listanum1.get(i));
                i++;
            } else {
                Resultado.add(listanum2.get(j));
                j++;
            }
        }

        while (i < listanum1.size()) {
            Resultado.add(listanum1.get(i));
            i++;
        }

        while (j < listanum2.size()) {
            Resultado.add(listanum2.get(j));
            j++;
        }

        return Resultado;
    }
    public static List<Integer> CadenaAlista(String cadena) {
        String[] Numeros = cadena.split(",");
        List<Integer> Lista = new ArrayList<>();
        for (String Numero : Numeros) {
            Lista.add(Integer.parseInt(Numero.trim()));
        }
        return Lista;
    }
}