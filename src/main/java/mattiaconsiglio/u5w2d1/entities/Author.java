package mattiaconsiglio.u5w2d1.entities;

import java.time.LocalDate;

public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String avatar;

    public Author(String name, String surname, String email, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
        this.avatar = "https://ui-avatars.com/api/?name="+name+"+" + surname + "&size=100";
    }
}
