package testePackage;

public class Televisor {
	
	Integer canal = 130;
	Integer volume = 20;
	
	void mudarCanal(Integer novoCanal) {
		if(canal.equals(novoCanal)) {
			System.out.println("Novo canal é também o canal atual");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}
	
	void mudarVolume(Integer novoVolume) {
		if(novoVolume.equals(volume)) {
			System.out.println("Novo volume é também o volume atual");
		} else{
			volume = novoVolume;
			System.out.println("Volume alterado para " + volume);
		}
		
	}
	
	public static void main(String[] args) {
		Televisor tv = new Televisor();
		
		tv.mudarVolume(20);
		tv.mudarCanal(130);
		
		tv.mudarVolume(300);
		tv.mudarCanal(10);
	
	}
	

}
