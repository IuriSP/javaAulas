package aula014;
public class Aula014 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        //Pessoa p = new Pessoa("Jubileu", 22, "M");
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto ("Creuza", 12, "F", "Creuzita");
        
        
        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());
        
        Vizualizacao viz[] = new Vizualizacao[5];
        viz[0] = new Vizualizacao(g[0], v[2]);
        viz[0].avaliar();
        System.out.println(viz[0].toString());//Jubileu assiste Aula 10 html5
        
        viz[1] = new Vizualizacao(g[0], v[1]);//Jubileu assiste Aula 01 de POO
        viz[0].avaliar(35.0f);
        System.out.println(viz[1].toString());
        

    }
    
}
