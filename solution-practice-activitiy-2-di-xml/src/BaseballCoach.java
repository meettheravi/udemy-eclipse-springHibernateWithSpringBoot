

public class BaseballCoach implements Coach{

	// define a private field for the dependency
	private FortuneService fortuneService;
	private RandomFortuneService randomFortuneService;
	
	// define a constructor for dependency injection
	
	public BaseballCoach() {
		System.err.println("BaseballCoach: inside no-arg constructor");
	}
	
	public BaseballCoach(FortuneService theFortuneService) {
		System.err.println("BaseballCoach: inside single arg constructor (FortuneService)");
		fortuneService = theFortuneService;
	}

	public BaseballCoach(RandomFortuneService theRandomFortuneService) {
		System.err.println("BaseballCoach: inside single arg constructor (RandomFortuneService)");
		randomFortuneService = theRandomFortuneService;
	}

	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		System.err.println("BaseballCoach: inside setter method - setRandomFortuneService");
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		return randomFortuneService.getFortune();
	}
}
