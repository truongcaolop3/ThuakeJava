/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuake;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PersonBai_1 {
    private String name;
	private char gender; // 0 is boy / 1 is girl
	private int birth_year;
	/**
	 * @param name
	 * @param gender
	 * @param birth_year
	 */
	
	
    public PersonBai_1() {
    }

    public PersonBai_1(String name, char gender, int birth_year) {
        this.name = name;
        this.gender = gender;
        this.birth_year = birth_year;
    }
        
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getBirth_year() {
        return birth_year;
    }
    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    void nhapPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        name = scanner.nextLine();
        System.out.print("gender(0 la nam / 1 la nu): ");
        gender = scanner.next().charAt(0);
        System.out.print("birth year: ");
        birth_year = scanner.nextInt();
    }

    void xuatPerson() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birth year: " + getBirth_year());
    }
    
}
