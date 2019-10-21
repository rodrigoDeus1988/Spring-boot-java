package com.br.netflix.springbootnetflix;

public class atributo {

    private final long id;
    private final String content;
   // private final String genero;
   // private final String Diretor;
  //  private final String Duração;
      private final String classificacao;
  //  private final String Elenco;
  //  private final String pais;
  //  private final String Distribuidora;

    public atributo (long id, String content , String classificacao) {
        this.id = id;
        this.content = content;
        this.classificacao = classificacao;
    }

    public long getId() {
        return id;  
    }  

    public String getContent() {
        return content;
    }
    
    public String getclassificacao() {
        return classificacao;
    }
    
   
}
