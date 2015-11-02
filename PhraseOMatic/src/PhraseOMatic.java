
public class PhraseOMatic {

	public static void main(String[] args) {
		String[] wordListOne = {"Rural","Urban","Delicious","Ugly","Dramatic","Proper","English","Fijian","Dumb","Smart"};
		String[] wordListTwo = {"idiomatic","uruguayan","electic","farsian","systematic"};
		String[] wordListThree = {"Tank","Soldier","Player","God","Pesant","Pleb"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.print("What we need is a " + phrase);

	}

}
