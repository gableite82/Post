package apllication;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("fazer boa viagem!");
        Comment c2 = new Comment("uau, isso é incrível");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viagem a New Zeland", "Vou visitar este país maravilhoso", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Boa noite!");
        Comment c4 = new Comment("que a força esteja com você");

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa Noite Pessoal", "vejo você amanhã", 15);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
    }
}