package userCrud.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.time.Month;

@NamedQueries({
        @NamedQuery(name = User.ALL, query = "SELECT u FROM User u ORDER BY u.name"),
        @NamedQuery(name = User.DELETE, query = "DELETE FROM User u WHERE u.id=:id"),
        @NamedQuery(name = User.GET, query = "SELECT u FROM User u WHERE u.id=:id")
})

@Entity
@Table(name = "users")
public class User {

    public static final String ALL = "User.getAll";
    public static final String DELETE = "User.delete";
    public static final String GET = "User.get";

    public static final int START_SEQ = 10000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private Integer id;

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 100)
    private String name;

    @Column(name = "last_name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 100)
    private String lastName;

    @Column(name = "birthday", nullable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime birthday;

    @Column(name = "gender", nullable = false)
    @NotBlank
    @Size(min = 2, max = 100)
    private String gender;

    public User() {
    }

    public User(Integer id, @NotBlank @Size(min = 2, max = 100) String name, @NotBlank @Size(min = 2, max = 100) String lastName, @NotBlank @Size(min = 2, max = 100) String gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        birthday = LocalDateTime.of(2018, Month.AUGUST, 20, 12, 0);
        this.gender = gender;

    }

    public User(Integer id, String name, String lastName, LocalDateTime birthday, String gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
    }

    public User(String name, String lastName, LocalDateTime birthday, String gender) {
        this.id = null;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public boolean isNew() {
        return id == null;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                '}';
    }

}
