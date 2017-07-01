package com.ismekveritabani;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.activeandroid.query.Select;
import com.ismekveritabani.model.Category;
import com.ismekveritabani.model.Product;
import com.ismekveritabani.util.Utils;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //new Delete().from(Product.class).execute();
        //new Delete().from(Category.class).execute();

        //Category category = new Category();
        //category.setName("Kırtasiye Malzemeleri");
        //category.save();

        Category category = new Select().from(Category.class).executeSingle();

        Product product = new Product();
        product.setName("Defter");
        product.setPrice(5.5);
        product.setCategory(category);
        product.save();

        product = new Product();
        product.setName("Kalem");
        product.setPrice(7);
        product.setCategory(category);
        product.save();

        product = new Product();
        product.setName("Silgi");
        product.setPrice(2);
        product.setCategory(category);
        product.save();

        List<Product> products = new Select().from(Product.class).where("name=?","Silgi").execute();
        if (products != null && products.size() > 0){
            for (int i = 0; i < products.size(); i++) {
                Log.e(Utils.TAG,products.get(i).toString());
            }
        }
    }
}
