public class Jeu {
    private final VueControleurGrille vue;

    public Jeu() {
        this.vue = new VueControleurGrille(6);
    }

    public void start() {
        this.vue.setVisible(true);
    }

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.start();
    }

}

