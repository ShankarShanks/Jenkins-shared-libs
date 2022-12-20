def call(result) {
    string defaultValue: '10',description: 'Enter number one',name: 'VarOne'
    string defaultValue: '20',description: 'Enter number two',name: 'VarTwo'
     def varOne = params.VarOne as int
     def varTwo = params.VarTwo as int
        def result = VarOne + VarTwo
         echo "Result is ${result}"
