package Algebretta;

public abstract class AbsMatrice implements Matrice {
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[" );
        for (int i=0; i<dim(); i++){
            for (int j=0; j<dim() /*forse  meglio dim()-1 ?*/; j++)
                s.append(val(i, j) + (j<dim()? "," : "" ));
            s.append(i<dim()-1? "; " : "");
        }
        s.append("]");
        return s.toString();
    }
}
