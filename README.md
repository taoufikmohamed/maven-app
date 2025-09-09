# simple-java-maven-app

When Maven builds your project in the GitHub Actions workflow, the compiled artifact (JAR/WAR/etc.) is stored in the project’s target/ directory.
For example, if your project is named my-app with version 1.0-SNAPSHOT, after mvn clean install, the artifact will typically be at:

target/my-app-1.0-SNAPSHOT.jar

# GitHub Actions workflow: #

GitHub runner checks out the code.

Maven executes (mvn clean install).

    clean removes any old build outputs.

    install compiles, runs tests, and packages your app.

Maven automatically creates the target/ directory inside the repo’s workspace (on the runner).

So during the workflow execution, the file structure looks like this:

## /home/runner/work/<your-repo>/<your-repo>/ ##
├── pom.xml
├── src/
├── target/        <-- created after mvn build
│   ├── classes/
│   ├── test-classes/
│   └── my-app-1.0-SNAPSHOT.jar


That target/ folder only exists inside the GitHub Actions runner

To access it after the build, upload the artifact using the action below

    - name: Upload build artifact
      uses: actions/upload-artifact@v4
      with:
        name: java-artifact
        path: target/*.jar
