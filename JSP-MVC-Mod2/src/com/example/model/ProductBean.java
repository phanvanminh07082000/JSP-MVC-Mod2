package com.example.model;

import com.example.dataaccess.ProductDataAccess;

public class ProductBean {
    private String name, description;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getInsertProduct() throws SQLException, ClassNotFoundException {
        return new ProductDataAccess().getInsertProduct(name, description);
    }
}
