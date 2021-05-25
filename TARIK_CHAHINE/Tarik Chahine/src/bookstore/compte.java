package bookstore;

public class compte {
	private String cne;
	private String nom;
	private String prenom;
    //Constructor 
    public compte()
    {
    	this.cne="R123456789";
    	this.nom="chahine";
    	this.prenom="tarik";
    }
	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

}


