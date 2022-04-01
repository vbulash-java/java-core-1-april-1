package ru.bulash;

/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */
public class Person {
	public String name;
	public String position;
	public String email;
	public String phone;
	public int salary;
	public int age;

	/**
	 * Конструктор класса Person
	 *
	 * @param name     Фамилия, имя и отчество
	 * @param position Должность
	 * @param email    Электронная почта
	 * @param phone    Телефон
	 * @param salary   Заработная плата
	 * @param age      Возраст
	 */
	public Person(String name, String position, String email, String phone, int salary, int age) {
		this.name = name;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}


	@Override
	public String toString() {
		return String.format(
				"""
						{
						\t- Фамилия, имя и отчество = '%s'
						\t- Должность = '%s'
						\t- Электронная почта = '%s'
						\t- Телефон = '%s'
						\t- Заработная плата = %d ₽
						\t- Возраст (в годах) = %d
						}
						""",
						name, position, email, phone, salary, age);
	}
}
