package ljava;

public enum Enumeration44 {
	
	c("23days","stillLearning"),
	css("100Plus","almostThere"),
	java("100Plus","almostThere");
	
	private final String days; private final String expert;
	
	
        Enumeration44(String days, String expert){
		this.days = days;
		this.expert = expert;
		
	}
        
        public String getDays() {
        	return days;
        }
        public String getExpert() {
        	return expert;
        }
        public static void main(String[] args) {
			
        	for(Enumeration44 g: Enumeration44.values())
        		System.out.printf("%s\t%s\t%s\t\n",g,g.getDays(),g.getExpert());
		}
}
