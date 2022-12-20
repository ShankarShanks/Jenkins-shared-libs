parameters {
  string defaultValue: '10', description: 'Enter value for x', name: 'VarOne'
  string defaultValue: '20', description: 'Enter value for y', name: 'VarTwo'
}
script{
  def varOne = params.varOne as int
  def varTwo = params.varTwo as int
  def result = varOne + varTwo
    echo "Result is ${result}" 
 }    
