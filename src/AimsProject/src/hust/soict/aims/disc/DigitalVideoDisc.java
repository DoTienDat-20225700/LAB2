package hust.soict.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDiscs = 0;
	
	//Getters
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;	
	}
	public int getId() { 
		return id;
	}
	public static int getNbDigitalVideoDiscs() { 
        return nbDigitalVideoDiscs;
    }
	
	// Constructors
    public DigitalVideoDisc(String title) {
       super();
       this.title = title;
       incrementAndSetId(); 
    }


   public DigitalVideoDisc(String category, String title, float cost) {
       super();
       this.title = title;
       this.category = category;
       this.cost = cost;
       incrementAndSetId(); 
   }

   public DigitalVideoDisc(String director, String category, String title, float cost){
       super();
       this.title = title;
       this.category = category;
       this.cost = cost;
       this.director = director;
       incrementAndSetId(); 
   }

   public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
       super();
       this.title = title;
       this.category = category;
       this.director = director;
       this.length = length;
       this.cost = cost;
       incrementAndSetId(); 
   }
   // Private method to increment the number of DVDs and set the unique ID
   private void incrementAndSetId() {
       nbDigitalVideoDiscs++;
       this.id = nbDigitalVideoDiscs;
   }
   //toString method to display DVD 
   @Override
	public String toString() {
		return "DigitalVideoDisc [id=" + id + ", title=" + title + ", category=" + category + ", director=" + director + ", length="
				+ length + ", cost=" + cost + "]";
	}

   //Setter for title
	public void setTitle(String title) {
    if (title != null && !title.trim().isEmpty()) {
        	this.title = title;
    	} else {
    		System.out.println("Invalid title. Title cannot be null or empty.");
    	}
	}
}



