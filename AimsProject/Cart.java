public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	// Add a DVD to the cart
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	        itemsOrdered[qtyOrdered] = disc;
	        qtyOrdered++;
	        System.out.println("The disc has been added.");
	    } else {
	        System.out.println("The cart is almost full.");
	    }
	}
<<<<<<< HEAD
=======
	
>>>>>>> feature/search-cart
	// Add a list of DVDs to the current cart. 
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
	    for (DigitalVideoDisc disc : dvdList) {
	        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	            itemsOrdered[qtyOrdered] = disc;
	            qtyOrdered++;
	            System.out.println("The disc " + disc.getTitle() + " has been added.");
	        } else {
<<<<<<< HEAD
	            System.out.println("The cart is full. Unable to add the disc " + disc.getTitle() + ".");
=======
	            System.out.println("The cart is full. Unable to add the disc " + disc.getTitle() + ".");
>>>>>>> feature/search-cart
	            break; 
	        }
	    }
	}
	// Add 2 DVDs to the current cart
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	        itemsOrdered[qtyOrdered] = dvd1;
	        qtyOrdered++;
	        System.out.println("The disc " + dvd1.getTitle() + " has been added.");
	    } else {
<<<<<<< HEAD
	        System.out.println("The cart is full. Unable to add the disc " + dvd1.getTitle() + ".");
=======
	        System.out.println("The cart is full. Unable to add the disc " + dvd1.getTitle() + ".");
>>>>>>> feature/search-cart
	        return; // Exit if no slots available for the first DVD
	    }

	    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	        itemsOrdered[qtyOrdered] = dvd2;
	        qtyOrdered++;
	        System.out.println("The disc " + dvd2.getTitle() + " has been added.");
	    } else {
<<<<<<< HEAD
	        System.out.println("The cart is full. Unable to add the disc " + dvd2.getTitle() + ".");
	    }
	}

=======
	        System.out.println("The cart is full. Unable to add the disc " + dvd2.getTitle() + ".");
	    }
	}

	
>>>>>>> feature/search-cart
	// Remove a DVD from the cart
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i] == disc) {
	            for (int j = i; j < qtyOrdered - 1; j++) {
	                itemsOrdered[j] = itemsOrdered[j + 1];
	            }
	            itemsOrdered[qtyOrdered - 1] = null;
	            qtyOrdered--;
	            System.out.println("The disc has been removed.");
	            return;
	        }
	    }
	    System.out.println("The disc is not in the cart.");
	}
	
	// Calculate total cost of the cart
	public float totalCost() {
	    float total = 0;
	    for (int i = 0; i < qtyOrdered; i++) {
	        total += itemsOrdered[i].getCost();
	    }
	    return total;
	}
	
	// Display the DVDs in the cart
	public void displayCart() {
        System.out.println("***************CART****************");
        System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc dvd = itemsOrdered[i];
            System.out.printf("%d. DVD - [%s] - [%s] - [%s] - [%d]: [%.2f] $\n", 
                i + 1,
                dvd.getTitle(),
                dvd.getCategory() == null ? "Unknown Category" : dvd.getCategory(),
                dvd.getDirector() == null ? "Unknown Director" : dvd.getDirector(),
                dvd.getLength(),
                dvd.getCost()
            );
        }

        System.out.printf("Total cost: [%.2f] $\n", totalCost());
        System.out.println("************************************");
    }
	// Search for a DVD by ID
    public void searchById(int id) {
        boolean found = false; // Flag to track if the DVD is found
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("DVD Found: " + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }
    // Search for a DVD by title
    public void searchByTitle(String title) {
        boolean found = false; // Flag to track if a match is found
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equalsIgnoreCase(title)) { // Case-insensitive comparison
                System.out.println("DVD Found: " + itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with the title: " + title);
        }
    }
}