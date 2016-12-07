package ru.samsung.itschool.game18;



public class Vector {
	float x, y;
	public void print()
	{
		System.out.print("("+x+ ", "+ y +")");
	}
	public String toString()
	{
		return "("+x+ "; "+ y +")";
	}
	public void mul(float k)
	{
		x *= k;
		y *= k;
	}
	
	public void sum(Vector v)
	{
		this.x += v.x;
		this.y += v.y;
	}
	
	public void set(float x, float y)
	{
		this.x = x;
		this.y = y;
		
	}
}
