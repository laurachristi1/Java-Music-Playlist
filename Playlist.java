import java.util.ArrayList;
public class Playlist{
    public static  void main (String[]args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("After Last Night");
        listaParaIlhaDeserta.add("Stay");
        listaParaIlhaDeserta.add("That's Hilarious");
        listaParaIlhaDeserta.add("Trap Queen");
        listaParaIlhaDeserta.add("Cinnamon Girl");
        listaParaIlhaDeserta.add("Sólo Quédate En Silencio");
        listaParaIlhaDeserta.add("Touch My Body");
        listaParaIlhaDeserta.add( "Baby Come Back");
        listaParaIlhaDeserta.add("Bang Bang");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());

        listaParaIlhaDeserta.remove("Bang Bang");
        listaParaIlhaDeserta.remove("Trap Queen");
        listaParaIlhaDeserta.remove("Baby Come Back");
        listaParaIlhaDeserta.remove("Touch My Body");
        System.out.println(listaParaIlhaDeserta.size());

        int a = 2;
        int b = 0;

        String temp = listaParaIlhaDeserta.get(a);

        listaParaIlhaDeserta.set(a, listaParaIlhaDeserta.get(b));
        listaParaIlhaDeserta.set(b, temp);
        System.out.println(listaParaIlhaDeserta);
    }

}
