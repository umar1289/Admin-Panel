package com.test.adminpanel.Models

class Word {
    var wordUzb:String? = null
    var wordEng:String? = null
    var category:String? = null

    constructor(wordUzb: String?, wordEng: String?, category: String?) {
        this.wordUzb = wordUzb
        this.wordEng = wordEng
        this.category = category
    }

    override fun toString(): String {
        return "Word(wordUzb=$wordUzb, wordEng=$wordEng, category=$category)"
    }
}