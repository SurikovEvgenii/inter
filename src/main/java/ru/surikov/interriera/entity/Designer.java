package ru.surikov.interriera.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Designer implements UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phone;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "designer")
    private List<Project> projectList;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Designer designer = (Designer) o;
        return Objects.equals(firstname, designer.firstname) && Objects.equals(lastname, designer.lastname) && Objects.equals(email, designer.email) && Objects.equals(phone, designer.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, email, phone);
    }
}
