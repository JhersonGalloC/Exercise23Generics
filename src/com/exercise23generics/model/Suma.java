package com.exercise23generics.model;

public class Suma <T>
{

private T t;

	T miObjeto;
	public Suma(T miObjeto)
	{
		this.miObjeto = miObjeto;
	}
	public T getMiObjeto()
	{
		return this.miObjeto;
	}

}

