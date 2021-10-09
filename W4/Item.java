package pboW4;

public class Item 
{
	private String name;
	private Item() {
		name = "Ipin";
	}
	
	//membuat getter agar bisa mengakses private
	public String getItem() {
		return this.name; //me-return kan nilai private
	}
	
	public Item(String name) {
		//membuat tipe baru bernama data
		Item data = new Item();
		//mengubah var name menjadi nilai private
		this.name = data.getItem();
		System.out.println(this.name);
	}
}