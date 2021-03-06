package android.eservices.webrequests.presentation.viewmodel;


import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelFactory implements ViewModelProvider.Factory {

    //private final BookDisplayRepository bookDisplayRepository;

    /*public ViewModelFactory(BookDisplayRepository bookDisplayRepository) {
        this.bookDisplayRepository = bookDisplayRepository;
    }*/

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(BookSearchViewModel.class)) {
            return null;//return (T) new BookSearchViewModel(bookDisplayRepository);
        }
        //Handle favorite view model case
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}