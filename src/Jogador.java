import java.util.Scanner;

class Jogador {
    private String nome;
    private int pts;
    private int hp;
    private static final int VIDA_MAXIMA=100;
    public Jogador(String nome){
        this.nome = nome;
        this.pts = 0;
        this.hp = VIDA_MAXIMA;
        Scanner s = new Scanner(System.in);

        System.out.println("Jogador "+ this.nome+" iniciou o jogo!!");


    }
    public void addpts(int pontos){
        if(pts>0){
            this.pts += pontos;
            System.out.println(this.nome+" ganhou "+pontos+" pontos!");
            System.out.println("Pontuação atual: "+this.pts);

        }
    }

    public void rcbdano(int dano) {
        if (dano>0){
        this.hp -= dano;
        if(this.hp < 0) this.hp = 0;
        System.out.println(this.nome+" recebeu "+dano+"!");
        }
        if (this.hp == 0){
            System.out.println(this.nome+" doi derrotado!");
        }
    }
    public void rcbcura(int cura){
        if(cura>0 && this.hp>0){
            this.hp+= cura;
            if (this.hp > VIDA_MAXIMA) this.hp = VIDA_MAXIMA;
            System.out.println(this.nome +" recuperou " + cura +" de vida");
            System.out.println("Vida atual: "+this.hp);
        }
    }
    public int getPts(){return this.pts;}

    public int getHp() {return hp;}
    public String getNome(){return this.nome;}
}
