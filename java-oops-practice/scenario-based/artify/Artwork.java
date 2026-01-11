package artify;

public abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected String license;      // protected as required
    protected boolean preview;

    private int price;
    private boolean sold;

    // Base constructor (single source of truth)
    protected Artwork(String title, String artist, int price, String license, boolean preview) {
        this.title = title;
        this.artist = artist;
        setPrice(price);
        this.license = license;
        this.preview = preview;
        this.sold = false;
    }

    // Constructor without preview (constructor chaining)
    protected Artwork(String title, String artist, int price, String license) {
        this(title, artist, price, license, false);
    }

    // Preview behavior
    public void showPreview() {
        if (!preview) {
            System.out.println("Preview not available for this artwork.");
            return;
        }

        System.out.println("---- Artwork Preview ----");
        System.out.println("Title   : " + title);
        System.out.println("Artist  : " + artist);
        System.out.println("License : " + license);
        System.out.println("Price   : ₹" + price);
    }

    // Encapsulated state change
    protected void markAsSold() {
        this.sold = true;
    }

    public boolean isSold() {
        return sold;
    }

    public int getPrice() {
        return price;
    }

    // Validation included
    private void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.price = price;
    }

    // License behavior is polymorphic
    @Override
    public abstract void license();

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
}
