package aula014;
public class Video implements AcoesVideo {
    
    //Atributos do vídeo
    private String titulo;
    private int views;
    private int curtidas;
    private int avaliacao;
    private boolean reproduzindo;
    
    //Método construtor
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 1;
        this.curtidas = 0;
        this.reproduzindo = false;
    
    }
    
    @Override
    public void playVideo() {
        this.reproduzindo = true;
    }

    @Override
    public void pauseVideo() {
        this.reproduzindo = false;
    }

    @Override
    public void likeVideo(String like) {
        this.curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getViews() {
        return views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", views=" + views + ", curtidas=" + curtidas + ", avaliacao=" + avaliacao + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}
