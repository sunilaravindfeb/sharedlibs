def code_build(x){
git url: 'https://github.com/prashanth-raj/cicdakshat/'
sh "mvn clean compile"
echo "The ${x} is build"
}
