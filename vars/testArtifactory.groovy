def call(String serveruri, String username, String password) {

    def server = Artifactory.newServer url: '${serveruri}', username: '${username}', password: '${password}'
    echo "Theses are the values ${serveruri} ${username} ${password}"
}
