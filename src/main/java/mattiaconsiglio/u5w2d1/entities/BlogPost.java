package mattiaconsiglio.u5w2d1.entities;


import lombok.*;

import java.util.Random;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int readingTime;

}
