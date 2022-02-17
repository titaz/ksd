package com.example.kskapp.FirstFragment;

import androidx.lifecycle.ViewModel;

import com.example.kskapp.retrofit.GitHubService;

import retrofit2.Retrofit;

public class FirstFragmentViewModel extends ViewModel {
//    private MutableLiveData<List<Rep>> users;
//    public LiveData<List<User>> getUsers() {
//        if (users == null) {
//            users = new MutableLiveData<List<User>>();
//            loadUsers();
//        }
//        return users;
//    }

    private void loadUsers() {
        // Do an asynchronous operation to fetch users.
    }

    public void BuildRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
    }
}