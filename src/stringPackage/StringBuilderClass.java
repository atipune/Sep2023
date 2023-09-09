package stringPackage;

public class StringBuilderClass {
	public static void main(String[] args) {
		StringBuilder sbd= new StringBuilder();
		System.out.println(sbd.capacity());
		sbd.append("Aspire ");
		System.out.println(sbd);
		System.out.println(sbd.capacity());
		sbd.append("Training ");
		sbd.append("Institute ");
		sbd.append("Pune");
		System.out.println(sbd);
		System.out.println(sbd.capacity());
		sbd.ensureCapacity(142);
		System.out.println(sbd.capacity());
		System.out.println(sbd.insert(2,"Pune"));
		sbd.delete(11,20);
		System.out.println(sbd);
		sbd.reverse();
		System.out.println(sbd);
	}
}
