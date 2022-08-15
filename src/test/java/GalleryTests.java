import org.testng.annotations.Test;

public class GalleryTests extends BaseUI{

    @Test
    public void testSortPictures1(){
        mainPage.clickGalleryLink();
        galleryPage.selectDropDownByText(Locators.SORT_DROP_DOWN, Data.registrationDate);
    }

    @Test
    public void testSortPictures2(){
        mainPage.clickGalleryLink();
        galleryPage.selectDropDownByIndex(Locators.SORT_DROP_DOWN, 3);
    }

    @Test
    public void testSortPictures3(){
        mainPage.clickGalleryLink();
        galleryPage.selectDropDownByValue(Locators.SORT_DROP_DOWN, Data.registrationDateValue);
    }
}
