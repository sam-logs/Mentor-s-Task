package com.array;

public class Books implements Comparable<Books>{
	private int bId;
	private String name;
	private String author;
	private String subject;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Books(int bId, String name, String author, String subject) {
		this.bId = bId;
		this.name = name;
		this.author = author;
		this.subject = subject;
		
	}
	
	public void display() {
		System.out.println(bId+ " "+ name+ " "+ author+ " "+ subject);
	}
	@Override
	public int compareTo(Books obj) {
		if(this.getbId()>obj.bId){
			return 1;
		}else if (this.bId<obj.bId){
			return -1;
		}else{
			return 0;
	}
	}

}
