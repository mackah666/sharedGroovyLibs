def call(String serveruri, String username, String password) {

    def server = Artifactory.newServer url: "${serveruri}", username: "${username}", password: "${password}"

    echo "${serveruri} ${username} ${password}"
}
