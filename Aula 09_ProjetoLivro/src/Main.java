public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("João", 23, "M");
        p[1] = new Pessoa("Joana", 22, "F");

        l[0] = new Livro("Harry Potter e o Prisioneiro de Askaban", "J.K. Rowling", 350, p[0]);
        l[1] = new Livro("Jogos Vorazes", "Suzanne Collins", 300, p[1]);
        l[2] = new Livro("Dragões de Éter", "Raphael Draccon", 450, p[1]);


        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());

        System.out.println(l[2].detalhes());
    }
}