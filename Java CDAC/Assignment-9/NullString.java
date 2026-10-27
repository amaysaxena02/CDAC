class NullString{
	public static void main(String[] args){
		String str = null;

		try{
			System.out.println(str.length());
		}
		catch(NullPointerException e){
			System.out.println("Cannot call a method on a null string.");
		}
		finally{
			System.out.parintln("Operation complete.");
		}
	}
}