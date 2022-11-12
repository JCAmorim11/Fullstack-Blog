package br.com.backoriginal.original.model;


import javax.persistence.*;

@Entity
@Table()
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String email;

}
