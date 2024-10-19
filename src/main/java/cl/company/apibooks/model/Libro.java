package cl.company.apibooks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "titulo")
    @NotBlank(message = "No puede ingresar un titulo vacio")
    @NotNull(message = "No puede ingresar un titulo nulo")
    private String titulo;
    @Column(name = "autor")
    @NotBlank(message = "No puede ingresar un autor vacio")
    @NotNull(message = "No puede ingresar un autor nulo")
    private String autor;
    @Column(name = "ano_publicacion")

    private int ano;
    @Column(name = "genero")
    @NotBlank(message = "No puede ingresar un genero vacio")
    @NotNull(message = "No puede ingresar un genero nulo")
    private String genero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
