//package com.example.potter.ui.Info
//
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.potter.data.api.model.Character
//import com.example.potter.data.repository.CharacterRepo
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//@HiltViewModel
//class InfoViewModel @Inject constructor(
//    private val characterRepo: CharacterRepo
//) : ViewModel() {
//
//    private val _state = MutableStateFlow(emptyList<Character>())
//    val state: StateFlow<List<Character>>
//        get() = _state
//
//
//    init {
//
//        viewModelScope.launch {
//            val characters = characterRepo.getCharacters()
//            _state.value = characters
//        }
//
//
//    }
//
//
//}