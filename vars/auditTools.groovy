def call(){
    node{
        bat'''
            git --version
            mvn --version
            java --version
        '''
    }
}