import java.util.LinkedList;

public class Examples {
	EventGuests guestsBST = new EventGuests(
			new DataBST("Michael", new DataBST("Tyrone", new EmptyBST(), new EmptyBST()),
					new DataBST("John", new EmptyBST(), new EmptyBST())));
	LinkedList<String> guestList = new LinkedList<String>();
	EventGuests guestLinkedList = new EventGuests(new DataLinkedList(guestList));
	EventGuests guestAVL = new EventGuests(new DataAVL("Michael", new DataAVL("John", new EmptyAVL(), new EmptyAVL()),
			new DataAVL("Tyrone", new EmptyAVL(), new EmptyAVL())));

	public Examples() {
		guestList.add("Michael");
		guestList.add("John");
		guestList.add("Tyrone");
	}
}
