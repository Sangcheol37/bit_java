package day19;

@FunctionalInterface 
//추상 메소드가 하나 이면 Functional Interface
//Functional Interface는 람다 가능
public interface Command {
	void exec();
	//추상메소드
	default void print() {
		System.out.println("~~~~~~~~~~~~~~~~");
	}
}

class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}
	
}

class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
	}
	
}

class SelectCommand implements Command{
	@Override
	public void exec() {
		System.out.println("SelectCommand 수행");
	}
}

class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}
	
}