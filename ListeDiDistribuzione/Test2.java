package ListeDiDistribuzione;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Map<String, Alias> aliasMap = new HashMap<>();
        Map<String, Liste> listeMap = new HashMap<>();

      try (final Scanner s = new Scanner(System.in)){
        while(s.hasNext()){
                    String[] linea = s.nextLine().split(" ");
                    switch (linea[1]) {
                        case "=":
                            if (linea[0].contains("@")){
                                List<Locale> elms = new ArrayList<>();
                                for (int i = 2; i<linea.length-1;i++)
                                    elms.add(new Locale(linea[i].replace(",", "")));
                                aliasMap.put(linea[0].split("@")[0] , (new Alias(linea[0].split("@")[0], new Dominio(linea[0].split("@")[1]), elms)));
                                } else {
                                if (linea.length == 3)
                                listeMap.put(linea[0],new ListaDistribuzioneSingola(linea[0], aliasMap.get(linea[2])));
                              else
                                if (linea[3].equals("+"))
                                    listeMap.put(linea[0], new ListaDistribuzioneSomma(linea[0],listeMap.get(linea[2]), listeMap.get(linea[4])));
                               else 
                                if (linea[3].equals("-"))
                                    listeMap.put(linea[0], new ListaDistribuzioneDifferenza(linea[0],listeMap.get(linea[2]), listeMap.get(linea[4]))); 
                                }     
                            break;
                        
                        default:
                            break;
                    }
                    
  //              }
   //         }
      }
    }

    for (String s : listeMap.keySet()) {
        System.out.println(listeMap.get(s).toString());
    }
}
}
