package com.dicoding.picodiploma.mydiabetespredict.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mydiabetespredict.model.QuestionDummy

class QuestionViewModel : ViewModel() {

    val bbQuestion = QuestionDummy.bbQuestion
    val botakQuestion = QuestionDummy.botakQuestion
    val gatalQuestion = QuestionDummy.gatalQuestion
    val jkQuestion = QuestionDummy.jkQuestion
    val laparQuestion = QuestionDummy.laparQuestion
    val lukaQuestion = QuestionDummy.lukaQuestion
    val marahQuestion = QuestionDummy.marahQuestion
    val pandanganKaburQuestion = QuestionDummy.pandanganKaburQuestion
    val genitalQuestion = QuestionDummy.genitalQuestion
    val partialQuestion = QuestionDummy.partialQuestion
    val pipisQuestion = QuestionDummy.pipisQuestion
    val hausQuestion = QuestionDummy.hausQuestion
    val usiaQuestion = QuestionDummy.usiaQuestion

    fun bb() = bbQuestion
    fun botak() = botakQuestion
    fun gatal() = gatalQuestion
    fun jk() = jkQuestion
    fun lapar() = laparQuestion
    fun luka() = lukaQuestion
    fun marah() = marahQuestion
    fun pandanganKabur() = pandanganKaburQuestion
    fun genital() = genitalQuestion
    fun partial() = partialQuestion
    fun pipis() = pipisQuestion
    fun haus() = hausQuestion
    fun usia() = usiaQuestion

}