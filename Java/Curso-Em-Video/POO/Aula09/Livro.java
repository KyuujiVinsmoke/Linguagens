package Aula09;

public class Livro implements Publicacao
{
    private String titulo;
    private String autor;
    private int totpaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totpaginas, Pessoa leitor) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.totpaginas = totpaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    @Override
    public void abrir() 
    {
        this.aberto = true;
    }

    @Override
    public void fechar() 
    {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) 
    {
        if(p > this.totpaginas)
        {
            this.pagAtual = 0;
        }

        else
        {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() 
    {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() 
    {
        this.pagAtual--;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getAutor() 
    {
        return autor;
    }

    public void setAutor(String autor) 
    {
        this.autor = autor;
    }

    public int getTotpaginas() 
    {
        return totpaginas;
    }

    public void setTotpaginas(int totpaginas) 
    {
        this.totpaginas = totpaginas;
    }

    public int getPagAtual() 
    {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) 
    {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() 
    {
        return aberto;
    }

    public void setAberto(boolean aberto) 
    {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() 
    {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) 
    {
        this.leitor = leitor;
    }

    public String detalhes() 
    {
        return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totpaginas=" + totpaginas + "\n, pagAtual=" + pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade=" + leitor.getIdade() + "\n, sexo=" + leitor.getSexo() + "]";
    }
}