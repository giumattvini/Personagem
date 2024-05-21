public class PlaceGirl {
	private String nome;
	private String dataNascimento;
	private int velocidade;
	private int nivel;
	private int vida;
	private boolean emMovimento;
	
	public void PlaceGirl(String nome, String dataNascimento, int velocidade, int nivel, int vida, boolean emMovimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.velocidade = velocidade;
		this.nivel = nivel;
		this.vida = vida;
		this.emMovimento = true;
	}
	
	public String nome() {
		return nome;
	}
	
	public String dataNascimento() {
		return dataNascimento;
	}
	
	public int velocidade() {
		return velocidade;
	}
	
	public int nivel() {
		return nivel;
	}
	
	public int vida() {
		return vida;
	}
	
	public boolean emMovimento() {
		return emMovimento;
	}
	
	public void StatusPersonagem() {
		System.out.println("Nome: " + nome);
		System.out.println("Nivel: " + nivel);
		System.out.println("Vida do seu personagem: " + vida);
	}
	
	public void correr() {
		if (emMovimento == true) {
			this.velocidade = 20;
			System.out.println("Você está correndo!");
		}
	}
	
	public void parar() {
		if (emMovimento == false) {
			this.velocidade = 0;
			System.out.println("Você parou!");
		}
	}
	
	public void andarNomalmente() {
		if (emMovimento == true) {
			this.velocidade = 10;
			System.out.println("Você está andando normalmente.");
		}
	}
	
	public void aumentarNivel() {
		nivel++;
		System.out.println("Você aumentou de nivel!! Seu nivel agora é: " + nivel);
	}
	
	public void receberDano(int dano) {
		vida -= dano;
		if (vida <= 0) {
			System.out.println("Você morreu! PRESS F CHAT");
		} else {
			System.out.println("Você recebeu um dano. Sua vida restante é:" + vida);
		}
	}
	
	public void darDano(int vidaDoPersonagemInimigo, int dano) {
		vidaDoPersonagemInimigo =- dano;
		if (vidaDoPersonagemInimigo <= dano) {
			System.out.println("Personagem inimigo foi visitar o infeno!");
		} else {
			System.out.println("Ele ainda está vivo, MATE-O!" + vidaDoPersonagemInimigo);
		}
	}
}
