package com.orm.androrm.impl;

import java.util.List;

import android.content.Context;

import com.orm.androrm.CharField;
import com.orm.androrm.FilterSet;
import com.orm.androrm.ForeignKeyField;
import com.orm.androrm.Model;

public class Branch extends Model {

	public static final List<Branch> filter(Context context, FilterSet filter) {
		return filter(context, Branch.class, filter);
	}
	
	protected CharField mName;
	protected ForeignKeyField<Product> mProduct;
	
	public Branch() {
		super();

		mName = new CharField(50);
		mProduct = new ForeignKeyField<Product>(Product.class);
	}

	public void setName(String name) {
		mName.set(name);
	}
	
	public Product getProduct(Context context) {
		return mProduct.get(context);
	}
}
