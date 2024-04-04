def code_build(x){
git url: 'https://github.com/prashanth-raj/cicdakshat/'
sh "mvn clean compile"
sh "mvn pmd:pmd, checkstyle:checkstyle"
echo "The ${x} is build"
}
