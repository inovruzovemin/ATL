package PACKAGE_NAME.MadNews;

public class Category <C>{
    private C categoryName;

    public Category(C categoryName) {
        this.categoryName = categoryName;
    }

    public C getCategoryName() {
        return categoryName;
    }
}
