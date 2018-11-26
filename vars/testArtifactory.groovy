def call(String server, String username, String password) {

    def server = Artifactory.newServer url: '${server}', username: '${username}', password: '${password}'

    echo '${server} ${username} ${password}'

    
    
}