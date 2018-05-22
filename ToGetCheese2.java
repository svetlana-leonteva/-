//Покупатели. Сырный отдел в супермаркете непрерывно собирает голодных покупателями.
//2 типа покупателей: храбрые покупатели и смиренные покупатели
//Запрос на обслуживание обозначен действием “getCheese”
//Завершение обслуживания обозначено действием “Cheese”
//Всегда есть доступный сыр, и постоянное количество двух храбрых покупателей и двух смиренных
//Каждый покупатель должен быть создан в виде отдельной нити
//которая входит в очередь, обслуживается, и прекращает работу.

package ToGetCheese2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ToGetCheese2 {
		
	public int getCheese() {
		return Cheese;
	}
	private static final int Cheese = 10;
	public static void main(String[] args) {
		Buyer first = new Buyer("BraveBuyer");
		Buyer second = new Buyer("HumbleBuyer");
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(first);
		executorService.submit(second);
		executorService.submit(first);
		executorService.submit(second);
	}
}
