package org.example.springbootdemo.entity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "app-users")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // @Column(unique = true)
    private String username;
    private String password;
    private String fullname;


    public AppUser(String username, String password, String fullname) {
        super();
        this.username = username;
        this.password = password;
        this.fullname = fullname;
    }

}