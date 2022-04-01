package ru.bulash;

public class Main {
	public static void main(String[] args) {
		/*
		4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
		 */
		Person[] persons = {
				new Person("Семен Семенович Горбунков",
						"Главный бухгалтер",
						"ssgorbunkov@example.com",
						"+79011234567", 85000, 52),
				new Person("Иван Иванович Иванов",
						"Большой начальник",
						"iiivanov@example.com",
						"+79021234567", 200_000, 38),
				new Person("Петр Петрович Петров",
						"Так себе сошка",
						"pppetrov@example.com",
						"+79031234567", 52000, 43),
				new Person("Сидор Сидорович Сидоров",
						"Начальник транспортного цеха",
						"sssidorov@example.com",
						"+79041234567", 80000, 41),
				new Person("Остап Сулейманович Бендер",
						"Вообще не работник",
						"osbender@example.com",
						"+79051234567", 15000, 35)
		};

		System.out.println("Список сотрудников старше 40 лет:");
		for (Person person: persons) {
			if (person.age > 40) {
				System.out.println(person.toString());
			}
		}
	}
}
