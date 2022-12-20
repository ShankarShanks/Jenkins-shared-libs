script{
    def varOne = params.varOne as int
    def varTwo = params.varTwo as int
    def result = varOne + varTwo
    echo "${result}"
}    
