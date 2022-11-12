package br.com.backoriginal.original.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Entity
@Table()
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank
    private String title;

     @Lob
    @Column
    @NotEmpty
    private String content;

    @Column
    private Instant createdOn;

    @Column
    private Instant updatedOn;

    @Column
    @NotBlank
    private String userName;

}
