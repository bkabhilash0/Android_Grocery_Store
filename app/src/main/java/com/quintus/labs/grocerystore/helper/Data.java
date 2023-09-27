package com.quintus.labs.grocerystore.helper;

import com.quintus.labs.grocerystore.model.Category;
import com.quintus.labs.grocerystore.model.Offer;
import com.quintus.labs.grocerystore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Grocery App
 * https://github.com/quintuslabs/GroceryStore
 * Created on 18-Feb-2019.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */
public class Data {
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    public List<Category> getCategoryList() {
        Category category = new Category("1", "Food", "https://image.flaticon.com/icons/png/512/262/262344.png");
        categoryList.add(category);
        category = new Category("2", "Home & Cleaning", "https://lisasnatural.com/wp-content/uploads/2018/05/housecleanicon-300x228.jpg");
        categoryList.add(category);
        category = new Category("3", "Baby Care", "https://tips4tots.files.wordpress.com/2015/08/medical-insurance-free-icon.png");
        categoryList.add(category);
        category = new Category("4", "sports & Nutrition", "https://kathleenhalme.com/images/nutrition-clipart-sport.jpg");
        categoryList.add(category);
        category = new Category("5", "Pet care", "http://kasperstromman.files.wordpress.com/2013/05/dog-cat-above-board.jpg");
        categoryList.add(category);
        category = new Category("6", "Health & Household", "https://thumbs.dreamstime.com/b/household-cleaning-products-accessories-basket-there-mop-detergents-rubber-gloves-glass-cleaner-sponges-89944820.jpg");
        categoryList.add(category);
        return categoryList;
    }

    public List<Product> getProductList() {
        Product product = new Product("1", "1", "Apple", "", "1 Kg", "Rs.", "20", "10% OFF", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("2", "1", "Banana", "", "1 Bounch", "Rs.", "10", "20% OFF", "https://images-na.ssl-images-amazon.com/images/I/21DejQuoT2L.jpg");
        productList.add(product);
        product = new Product("3", "2", "House Clean Liquid", "", "1 Lit.", "Rs.", "25", "", "http://sunsetcleaningcia.com/wp-content/uploads/2016/05/houseclean.png");
        productList.add(product);
        product = new Product("4", "2", "House Clean Brush", "", "1 Piece", "Rs.", "10", "", "https://www.clean-hoouse.com/wp-content/uploads/2017/09/13.png");
        productList.add(product);
        product = new Product("5", "3", "Pampers", "", "1 Piece", "Rs.", "20", "10% OFF", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        productList.add(product);
        product = new Product("6", "3", "Baby Oil", "", "500 Ml", "Rs.", "31", "", "https://www.fortunaonline.net/media/catalog/product/cache/1/small_image/295x/040ec09b1e35df139433887a97daa66f/n/k/nkbcp12_-_xia-shib-ao-baby-oil-200ml.png");
        productList.add(product);
        product = new Product("7", "4", "Apple", "", "1 Kg", "Rs.", "20", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("8", "4", "Mango", "", "1 Kg", "Rs.", "20", "", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwHN4d3WH9hlAIQlpdFzH7a4ty_kqaXOMIRI65eLHSAdkiMJP3b31LBQjE3ahwmyA59C4&usqp=CAU");
        productList.add(product);
        product = new Product("9", "5", "Orange", "", "1 Kg", "Rs.", "20", "", "https://tiimg.tistatic.com/fp/1/007/144/natural-fresh-orange-fruits-433.jpg");
        productList.add(product);
        product = new Product("10", "5", "Cucumber", "", "1 Kg", "Rs.", "20", "", "https://m.media-amazon.com/images/I/518dyGWBYUL._AC_UF1000,1000_QL80_.jpg");
        productList.add(product);
        product = new Product("11", "6", "Onion", "", "1 Kg", "Rs.", "20", "", "https://seed2plant.in/cdn/shop/products/carrotseeds.jpg?v=1604032858");
        productList.add(product);
        product = new Product("12", "6", "Carrot", "", "1 Kg", "Rs.", "20", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("13", "1", "Litche", "", "1 Kg", "Rs.", "20", "30%OFF", "https://www.jiomart.com/images/product/original/590002850/indian-litchi-pack-approx-450-g-500-g-product-images-o590002850-p590318011-0-202203151046.jpg?im=Resize=(1000,1000)");
        productList.add(product);
        return productList;
    }

    public List<Product> getNewList() {
        Product product = new Product("1", "1", "Apple", "", "1 Kg", "Rs.", "20", "10% OFF", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        newList.add(product);
        product = new Product("2", "1", "Banana", "", "1 Bounch", "Rs.", "10", "20% OFF", "https://images-na.ssl-images-amazon.com/images/I/21DejQuoT2L.jpg");
        newList.add(product);
        product = new Product("3", "2", "House Clean Liquid", "", "1 Lit.", "Rs.", "25", "", "http://sunsetcleaningcia.com/wp-content/uploads/2016/05/houseclean.png");
        newList.add(product);
        product = new Product("4", "2", "House Clean Brush", "", "1 Piece", "Rs.", "10", "", "https://www.clean-hoouse.com/wp-content/uploads/2017/09/13.png");
        newList.add(product);
        product = new Product("5", "3", "Pampers", "", "1 Piece", "20", "Rs.", "10% OFF", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        newList.add(product);
        return newList;
    }

    public List<Product> getPopularList() {
        Product product = new Product("6", "3", "Baby Oil", "", "500 Ml", "Rs.", "31", "", "https://www.fortunaonline.net/media/catalog/product/cache/1/small_image/295x/040ec09b1e35df139433887a97daa66f/n/k/nkbcp12_-_xia-shib-ao-baby-oil-200ml.png");
        popularList.add(product);
        product = new Product("7", "4", "Apple", "", "1 Kg", "Rs.", "20", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        popularList.add(product);
        product = new Product("8", "4", "Coconut", "", "1 Kg", "Rs.", "30", "", "https://chetana.mygreentrace.com/wp-content/uploads/2023/05/coconut-f25111b5-6f49-4b60-aaee-456471c2307b.jpg");
        popularList.add(product);
        product = new Product("9", "5", "Tomato", "", "1 Kg", "Rs.", "45", "", "https://img.etimg.com/thumb/width-640,height-480,imgsize-56196,resizemode-75,msid-95423731/magazines/panache/5-reasons-why-tomatoes-should-be-your-favourite-fruit-this-year/tomatoes-canva.jpg");
        popularList.add(product);
        product = new Product("10", "5", "Onion", "", "1 Kg", "Rs.", "40", "", "data:image/jpeg;base64,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");
        popularList.add(product);
        product = new Product("11", "6", "Carrot", "", "1 Kg", "Rs.", "15", "", "https://seed2plant.in/cdn/shop/products/carrotseeds.jpg?v=1604032858");
        popularList.add(product);
        product = new Product("12", "6", "Cucumber", "", "1 Kg", "Rs.", "35", "", "https://m.media-amazon.com/images/I/518dyGWBYUL._AC_UF1000,1000_QL80_.jpg");
        product = new Product("13", "1", "Litche", "", "1 Kg", "Rs.", "25", "30%OFF", "https://www.jiomart.com/images/product/original/590002850/indian-litchi-pack-approx-450-g-500-g-product-images-o590002850-p590318011-0-202203151046.jpg?im=Resize=(1000,1000)");
        popularList.add(product);
        return popularList;
    }

    public List<Offer> getOfferList() {
        Offer offer = new Offer("http://1.bp.blogspot.com/-MMt-60IWEdw/VqZsh45Dv8I/AAAAAAAAMHg/70D9tVowlyc/s1600/askmegrocery-republic-day-offer.jpg");
        offerList.add(offer);
        offer = new Offer("http://www.lootkaro.com/wp-content/uploads/2016/05/as1.jpg");
        offerList.add(offer);
        offer = new Offer("https://453xbcknr3t3ahr522mms518-wpengine.netdna-ssl.com/wp-content/themes/iga-west/images/banner-save-more.jpg");
        offerList.add(offer);
        offer = new Offer("https://images-eu.ssl-images-amazon.com/images/G/31/img16/Grocery/SVD/July18/750x375.png");
        offerList.add(offer);
        offer = new Offer("https://images-eu.ssl-images-amazon.com/images/G/31/img16/Grocery/BreakfastStore/kmande_2018-06-15T12-00_f010a5_1121973_grocery_750x375.jpg");
        offerList.add(offer);
        offer = new Offer("http://www.enjoygrocery.com/images/enjoygrocery-offer.jpg");
        offerList.add(offer);


        return offerList;
    }
}
